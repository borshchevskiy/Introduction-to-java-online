package my.home.jonline.module05.task04.service;

import my.home.jonline.module05.task04.service.impl.CaveServiceImpl;

public class ServiceProvider {
	private static final ServiceProvider instance = new ServiceProvider();

	private CaveService caveService = new CaveServiceImpl();
	
	private ServiceProvider() {
	};

	public static ServiceProvider getInstance() {
		return instance;
	}

	public CaveService getCaveService() {
		return caveService;
	}

	public void setCaveService(CaveService caveService) {
		this.caveService = caveService;
	}
	
	
}
