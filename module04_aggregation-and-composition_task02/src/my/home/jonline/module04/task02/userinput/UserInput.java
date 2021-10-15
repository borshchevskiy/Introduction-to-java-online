package my.home.jonline.module04.task02.userinput;

import java.util.Scanner;

import my.home.jonline.module04.task02.entity.Wheel;
import my.home.jonline.module04.task02.view.View;

public class UserInput {
	Scanner scanner = new Scanner(System.in);
	View view = new View();

	
	public int getWheelNumber(Wheel[] wheels) {
		int wheelNumber;
		boolean isInputOK;
		
		wheelNumber = 0;
		isInputOK = false;

		view.showMessage("Введите номер колеса от 1 до " + wheels.length + "! >>");
		
		while (!isInputOK) {
						
			String str;
			if (scanner.hasNextInt()) {
				wheelNumber = scanner.nextInt();
				str = scanner.nextLine();
				
				if (wheelNumber < 1 || wheelNumber > wheels.length) {
					view.showMessage("Введите номер колеса от 1 до " + wheels.length + "! >>");
				} else {
					isInputOK = true;
				}
			} else {
				str = scanner.nextLine();
				view.showMessage("Введите номер колеса от 1 до " + wheels.length + "! >>");
			}
		}

		return wheelNumber;
	}
}
