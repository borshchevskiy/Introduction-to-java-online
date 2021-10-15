package my.home.jonline.module04.task04.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import my.home.jonline.module04.task04.entity.Train;
import my.home.jonline.module04.task04.view.View;

public class UserInput {

	public void inputTrainNumber(List<Train> trains) {
		int input;
		String inputString;
		boolean isTrainFound;
		View userView;
		String notFoundMessage;
		String wrongNumberMessage;
		String inputErrorMessage;
		BufferedReader reader;

		isTrainFound = false;
		userView = new View();
		notFoundMessage = "Поезд с таким номером не найден!";
		wrongNumberMessage = "Введен некорректный номер!";
		inputErrorMessage = "Ошибка ввода!";
		reader = new BufferedReader(new InputStreamReader(System.in));

		while (!isTrainFound) {

			System.out.print("Введите номер поезда>> ");

			try {
						
				inputString = reader.readLine();

				input = Integer.parseInt(inputString);

				for (Train train : trains) {
					if (train.getNumber() == input) {
						isTrainFound = true;
						System.out.println();
						userView.showTrain(train);
					}
				}

				if (!isTrainFound) {
					userView.showMessage(notFoundMessage);
				}

				
			}

			catch (NumberFormatException e) {
				isTrainFound = false;
				userView.showMessage(wrongNumberMessage);
			}

			catch (IOException e) {
				isTrainFound = false;
				userView.showMessage(inputErrorMessage);
			}
			
		}
		

	}
}