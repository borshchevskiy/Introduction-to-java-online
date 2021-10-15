package my.home.jonline.module05.task04.presentation.impl;

import java.util.List;

import my.home.jonline.module05.task04.bean.Treasure;
import my.home.jonline.module05.task04.presentation.UserActionViewer;

public class UserActionViewerImpl implements UserActionViewer{

	@Override
	public void viewActionResult(Treasure treasure) {
		System.out.println(treasure.getType() + " with value " + treasure.getValue());
				System.out.println();
	}
		

	@Override
	public void viewActionResult(List<Treasure> treasures) {
		for (Treasure treasure : treasures) {
			System.out.println(treasure.getType() + " with value " + treasure.getValue());
		}	
		System.out.println();
	}

}
