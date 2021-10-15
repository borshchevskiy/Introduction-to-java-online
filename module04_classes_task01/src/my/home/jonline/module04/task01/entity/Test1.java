package my.home.jonline.module04.task01.entity;

public class Test1 {
	
	private int firstInt;
	private int secondInt;
	
		
	
	public Test1() {
	
	}


	public Test1(int firstInt, int secondInt) {
		
		this.firstInt = firstInt;
		this.secondInt = secondInt;
	}


	public int getFirstInt() {
		return firstInt;
	}


	public void setFirstInt(int firstInt) {
		this.firstInt = firstInt;
	}


	public int getSecondInt() {
		return secondInt;
	}


	public void setSecondInt(int secondInt) {
		this.secondInt = secondInt;
	}


	@Override
	public String toString() {
		return getClass().getSimpleName() + " [firstInt=" + firstInt + ", secondInt=" + secondInt + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + firstInt;
		result = prime * result + secondInt;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test1 other = (Test1) obj;
		if (firstInt != other.firstInt)
			return false;
		if (secondInt != other.secondInt)
			return false;
		return true;
	}
	
	
	
	
	
	
}
