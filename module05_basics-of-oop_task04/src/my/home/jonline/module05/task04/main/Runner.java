package my.home.jonline.module05.task04.main;

import my.home.jonline.module05.task04.controller.CaveController;


public class Runner {

	private CaveController caveController = CaveController.getInstance();
	
	
	
	public void run() {
		String response;
		String request;
		response = "";
		request = "viewMenu";

		
		while(!("exit").equals(response)) {
			
			response = caveController.doAction(request);
			request = response;
		}
	}
}
