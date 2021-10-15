package my.home.jonline.module05.task04.service;

import my.home.jonline.module05.task04.service.exception.ServiceException;

public interface CaveService {
	TreasureResponse getMostValuableTreasure() throws ServiceException;

	TreasureListResponse getTreasuresByTotalValue(int totalValue) throws ServiceException;
	
	TreasureListResponse getAllTreasures() throws ServiceException;

}
