package my.home.jonline.module04.task01.view;



import my.home.jonline.module04.task01.entity.Test1;
import my.home.jonline.module04.task01.logic.Test1Logic;

public class Test1View {

	Test1Logic logic = new Test1Logic();
	
	
	public void show(Test1 test) {
		System.out.println("������ ���������� = " + test.getFirstInt() + "\n" + "������ ���������� = " + test.getSecondInt());
	}
	
	
	public void showMax(Test1 test) {
		int max;
		
		max = logic.getMax(test);
		
		System.out.println("���������� �� ���� ���������� = " + max);
	}
	
	
	public void showSum(Test1 test) {
		int sum;
		
		sum = logic.getSum(test);
		
		System.out.println("����� ���������� = " + sum);
	}
}
