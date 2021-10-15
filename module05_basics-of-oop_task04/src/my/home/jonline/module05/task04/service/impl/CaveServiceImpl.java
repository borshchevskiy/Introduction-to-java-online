package my.home.jonline.module05.task04.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import my.home.jonline.module05.task04.bean.Treasure;
import my.home.jonline.module05.task04.dao.CaveDAO;
import my.home.jonline.module05.task04.dao.DAOProvider;
import my.home.jonline.module05.task04.dao.exception.DAOException;
import my.home.jonline.module05.task04.service.CaveService;
import my.home.jonline.module05.task04.service.TreasureListResponse;
import my.home.jonline.module05.task04.service.TreasureResponse;
import my.home.jonline.module05.task04.service.exception.ServiceException;

public class CaveServiceImpl implements CaveService {

	private DAOProvider provider = DAOProvider.getInstance();

	@Override
	public TreasureResponse getMostValuableTreasure() throws ServiceException {
		List<Treasure> treasures;
		Treasure mostValuableTreasure;
		TreasureResponse response;

		treasures = getAllTreasures().getTreasure();

		mostValuableTreasure = treasures.get(0);

		for (Treasure treasure : treasures) {
			if (treasure.getValue() > mostValuableTreasure.getValue()) {
				mostValuableTreasure = treasure;
			}
		}

		response = new TreasureResponse("", "", mostValuableTreasure);

		return response;
	}

	@Override
	public TreasureListResponse getTreasuresByTotalValue(int totalValue) throws ServiceException {

		List<Treasure> treasuresByTotalValue = new ArrayList<>();
		TreasureListResponse response;

		// if required treasure value < 0, return blank list
		if (totalValue < 0) {
			response = new TreasureListResponse("Total treasure value is negative.", "0", treasuresByTotalValue);
			return response;
		}

		// if required treasure value = 0, return blank list
		if (totalValue == 0) {
			response = new TreasureListResponse("Total treasure value is zero.", "0", treasuresByTotalValue);
			return response;
		}

		// get all treasures from DAO
		List<Treasure> treasures;
		treasures = getAllTreasures().getTreasure();

		// check if there is a single treasure which fits the total value
		for (Treasure treasure : treasures) {
			if (treasure.getValue() == totalValue) {
				treasuresByTotalValue.add(treasure);
				response = new TreasureListResponse("", "1", treasuresByTotalValue);
				return response;
			}
		}

		int[] values;
		values = treasures.stream().map(t -> t.getValue()).mapToInt(x -> x).toArray();
		Arrays.sort(values);

		boolean[][] memo = new boolean[values.length][totalValue + 1];
		createMemoTable(memo, values, totalValue);

		if (memo[values.length - 1][totalValue] == false) {
			response = new TreasureListResponse("There are no subsets of treasure with required sum.", "0",
					treasuresByTotalValue);
			return response;
		}

		List<Integer> valuesList = new ArrayList<>();
		List<List<Integer>> listOfValueLists = new ArrayList<>();

		listOfValueLists = chooseValues(values, values.length - 1, totalValue, valuesList, listOfValueLists, memo);
		valuesList = listOfValueLists.get(0);

		for (Integer index : valuesList) {
			for (int i = 0; i < treasures.size(); i++) {
				if (treasures.get(i).getValue() == index.intValue()) {
					treasuresByTotalValue.add(treasures.get(i));
					treasures.remove(i);
					break;
				}
			}
		}

		response = new TreasureListResponse("", "1", treasuresByTotalValue);
		return response;
	}

	@Override
	public TreasureListResponse getAllTreasures() throws ServiceException {
		CaveDAO caveDAO = provider.getCaveDAO();
		List<Treasure> treasures;
		TreasureListResponse response;

		try {
			treasures = caveDAO.findAllTreasure();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

		response = new TreasureListResponse("", "", treasures);

		return response;
	}

	private void createMemoTable(boolean[][] memo, int values[], int totalValue) {

		// Sum 0 can always be achieved with 0 elements, so fill first column with
		// "true", all the rest with "false"
		for (int i = 0; i < memo.length; i++) {
			Arrays.fill(memo[i], false);
			memo[i][0] = true;
		}

		// fill the first line
		if (values[0] <= totalValue)
			memo[0][values[0]] = true;

		// Fill rest of the entries in memo[][]
		for (int i = 1; i < memo.length; i++) {
			for (int j = 1; j < totalValue + 1; j++) {
				if (values[i] <= j) {
					memo[i][j] = memo[i - 1][j] || memo[i - 1][j - values[i]];
				} else {
					memo[i][j] = memo[i - 1][j];
				}
			}
		}
	}

	private List<List<Integer>> chooseValues(int values[], int valuesIndex, int totalValue, List<Integer> subSet,
			List<List<Integer>> listOfSubsets, boolean[][] memo) {
		// If we reached end and remaining sum is != zero, we print subSet[] only if
		// values[0] is equal to remaining sum (in other words if memo[0][sum] is true).
		if (valuesIndex == 0 && totalValue != 0 && memo[0][totalValue]) {
			subSet.add(values[valuesIndex]);
			listOfSubsets.add(subSet);

			return listOfSubsets;
		}
		// If sum becomes 0
		if (valuesIndex == 0 && totalValue == 0) {
			// listOfSubsets.add(subSet);

			return listOfSubsets;
		}

		// we need only 1 subset of treasures. Remove this if to find all subsets
		if (!listOfSubsets.isEmpty()) {
			return listOfSubsets;
		}
		// If given sum can be achieved after ignoring
		// current element.
		if (memo[valuesIndex - 1][totalValue]) {
			// Create a new vector to store path
			List<Integer> b = new ArrayList<>();
			b.addAll(subSet);
			chooseValues(values, valuesIndex - 1, totalValue, b, listOfSubsets, memo);
		}
		// If given sum can be achieved after considering
		// current element.
		if (totalValue >= values[valuesIndex] && memo[valuesIndex - 1][totalValue - values[valuesIndex]]) {
			subSet.add(values[valuesIndex]);
			chooseValues(values, valuesIndex - 1, totalValue - values[valuesIndex], subSet, listOfSubsets, memo);
		}

		return listOfSubsets;
	}

}
