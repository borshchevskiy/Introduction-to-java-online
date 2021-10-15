package my.home.jonline.module05.task04.dao;

import my.home.jonline.module05.task04.dao.impl.CaveDAOImpl;

public class DAOProvider {
	private static final DAOProvider instance = new DAOProvider();
	
	private CaveDAO caveDAO = new CaveDAOImpl();
	
	private DAOProvider() {};
	
	public static DAOProvider getInstance() {
		return instance;
	}

	public CaveDAO getCaveDAO() {
		return caveDAO;
	}

	public void setCaveDAO(CaveDAO caveDAO) {
		this.caveDAO = caveDAO;
	}
	
	
}
