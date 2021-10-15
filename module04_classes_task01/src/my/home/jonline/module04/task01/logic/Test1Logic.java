package my.home.jonline.module04.task01.logic;

import my.home.jonline.module04.task01.entity.Test1;

public class Test1Logic {

	public int getSum(Test1 test) {
		return test.getFirstInt() + test.getSecondInt();
	}
	
	public int getMax(Test1 test) {
		return Math.max(test.getFirstInt(), test.getSecondInt());
	}
	
	
	
}
