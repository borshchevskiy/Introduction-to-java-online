package my.home.jonline.module05.task04.presentation;

import java.util.List;

import my.home.jonline.module05.task04.bean.Treasure;

public interface UserActionViewer {
	void viewActionResult(Treasure treasure);

	void viewActionResult(List<Treasure> treasures);
}
