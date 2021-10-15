package my.home.jonline.module05.task04.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import my.home.jonline.module05.task04.bean.Treasure;
import my.home.jonline.module05.task04.dao.CaveDAO;
import my.home.jonline.module05.task04.dao.exception.DAOException;

public class CaveDAOImpl implements CaveDAO {

	@Override
	public Treasure findTreasureByValue(int value) throws DAOException {
		List<Treasure> treasures = findAllTreasure();

		for (Treasure treasure : treasures) {
			if (treasure.getValue() == value) {
				return treasure;
			}
		}		
		return new Treasure("NoValue", 0);
	}
	
	@Override
	public Treasure findTreasureByType(String type) throws DAOException {
		List<Treasure> treasures = findAllTreasure();

		for (Treasure treasure : treasures) {
			if (treasure.getType().equals(type)) {
				return treasure;
			}
		}		
		return new Treasure("NoType", 0);
	}
	
	@Override
	public List<Treasure> findAllTreasureByType(String type) throws DAOException {
		List<Treasure> treasures = findAllTreasure();
		List<Treasure> treasuresByType = findAllTreasure();

		for (Treasure treasure : treasures) {
			if (treasure.getType().equals(type)) {
				treasuresByType.add(treasure);
			}
		}
		return treasuresByType;
	}

	@Override
	public List<Treasure> findAllTreasureByValue(int value) throws DAOException {
		List<Treasure> treasures = findAllTreasure();
		List<Treasure> treasuresByValue = findAllTreasure();

		for (Treasure treasure : treasures) {
			if (treasure.getValue() == value) {
				treasuresByValue.add(treasure);
			}
		}
		return treasuresByValue;
	}

	@Override
	public List<Treasure> findAllTreasure() throws DAOException{
		List<Treasure> treasures = new ArrayList<>();		
		List<String> treasureStrings = getDataFromFile();
		String[] treasure;
		String treasureType;
		Integer treasureValue;
		for (String treasureString : treasureStrings) {
			treasure = treasureString.split(";");
			treasureType = treasure[0];
			treasureValue = Integer.parseInt(treasure[1]);
			treasures.add(new Treasure(treasureType, treasureValue));
		}			
		return treasures;
	}
	
	private List<String> getDataFromFile() throws DAOException {
		List<String> records = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("resources/Treasures.csv"))) {
			String line;
			while ((line = br.readLine()) != null) {
				records.add(line);
			}

		} catch (Exception e) {
			throw new DAOException(e);
		}
		return records;
	}

	


	
}