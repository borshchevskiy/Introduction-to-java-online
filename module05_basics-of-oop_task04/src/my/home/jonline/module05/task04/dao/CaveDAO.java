package my.home.jonline.module05.task04.dao;

import java.util.List;

import my.home.jonline.module05.task04.bean.Treasure;
import my.home.jonline.module05.task04.dao.exception.DAOException;

public interface CaveDAO {

	Treasure findTreasureByType(String type) throws DAOException;
	Treasure findTreasureByValue(int value) throws DAOException;
	List<Treasure> findAllTreasureByType(String type) throws DAOException;
	List<Treasure> findAllTreasureByValue(int value) throws DAOException;
	List<Treasure> findAllTreasure() throws DAOException;

}
