package my.home.jonline.module04.task03.view;

import java.util.List;

import my.home.jonline.module04.task03.entity.TerritorialUnit;

public class View {

	public void viewMessage(String message) {
		System.out.println(message);
		System.out.println();
	}
	
	public void viewUnitName(String message, TerritorialUnit unit) {
		System.out.println(message);
		System.out.println(unit.getName());
		System.out.println();
	}
	
	public void viewUnitName(TerritorialUnit unit) {
		System.out.println(unit.getName());
		System.out.println();
	}
	
	public void viewUnitNames(String message, List<? extends TerritorialUnit> units) {
		System.out.println(message);
		for (TerritorialUnit territorialUnit : units) {
			System.out.println(territorialUnit.getName());
		}
		System.out.println();
	}
	
	public void viewUnitNames(List<? extends TerritorialUnit> units) {
		for (TerritorialUnit territorialUnit : units) {
			System.out.println(territorialUnit.getName());
		}
		System.out.println();
	}
	
	public void viewUnitArea(String message, TerritorialUnit unit) {
		System.out.println(message);
		System.out.println(unit.getArea());
		System.out.println();
	}
	
	public void viewUnitArea(TerritorialUnit unit) {
		System.out.println(unit.getArea());
		System.out.println();
	}
	
	public void viewNumber(String message, int number) {
		System.out.println(message);
		System.out.println(number);
		System.out.println();
	}
	
	public void viewNumber(int number) {
		System.out.println(number);
		System.out.println();
	}
	
	public void viewNumber(String message, double number) {
		System.out.println(message);
		System.out.printf("%.2f \n", number);
		System.out.println();
	}
	
	public void viewNumber(double number) {
		System.out.printf("%.2f \n", number);
		System.out.println();
	}
}
