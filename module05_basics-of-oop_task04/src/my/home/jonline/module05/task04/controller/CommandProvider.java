package my.home.jonline.module05.task04.controller;

import java.util.HashMap;
import java.util.Map;

import my.home.jonline.module05.task04.command.impl.FindMostValuableCommand;
import my.home.jonline.module05.task04.command.impl.FindTreasureByTotalValueCommand;
import my.home.jonline.module05.task04.command.impl.ViewMenuCommand;
import my.home.jonline.module05.task04.command.impl.ViewSubMenuCommand;
import my.home.jonline.module05.task04.command.Command;
import my.home.jonline.module05.task04.command.impl.FindAllTreasureCommand;

public class CommandProvider {

	private Map<String, Command> commands = new HashMap<>();

	private final static CommandProvider instance = new CommandProvider();

	private CommandProvider() {
		commands.put("viewSubMenu", new ViewSubMenuCommand());
		commands.put("viewMenu", new ViewMenuCommand());
		commands.put("", new ViewMenuCommand());
		commands.put("viewAllTreasures", new FindAllTreasureCommand());
		commands.put("findMostValuableTreasure", new FindMostValuableCommand());
		commands.put("findTreasureByTotalValue", new FindTreasureByTotalValueCommand());
	}

	public Command getCommand(String commandName) {
		Command command;
		command = commands.get(commandName);

		return command;
	}

	public static CommandProvider getInstance() {
		return instance;
	}

}
