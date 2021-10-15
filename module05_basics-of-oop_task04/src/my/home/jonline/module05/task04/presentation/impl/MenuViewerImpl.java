package my.home.jonline.module05.task04.presentation.impl;


import my.home.jonline.module05.task04.presentation.MenuViewer;

public class MenuViewerImpl implements MenuViewer {
	
	@Override
	public void viewMenu() {
		System.out.print("Welcome to the Dragon's Cave!\n" +
				"Choose an action:\n" + 
				"1. View all treasures in cave.\n" +
				"2. View most valuable treasure.\n" +
				"3. View treasures by total value (input total value).\n" + 
				"4. Leave cave.\n" +
				"=> ");	
		
	}

}
