package my.home.jonline.module05.task04.controller;

import my.home.jonline.module05.task04.command.Command;

public class CaveController {

	private final static CaveController instance = new CaveController();
	
	private CaveController() {
		
	}	
	
	private CommandProvider commandProvider = CommandProvider.getInstance();
	
	public static CaveController getInstance() {
		return instance;
	}
	
	public String doAction(String request) {
		String[] params;
		String commandName;
		
		params = request.split("\\s+");
		commandName = params[0];
		
		Command currentCommand = commandProvider.getCommand(commandName);
		String response;
		
		response = currentCommand.execute(params);		
		
		return response;
	}

}
