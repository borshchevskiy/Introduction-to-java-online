package my.home.jonline.module04.task03.entity;

import java.util.Arrays;

public class Student {

	private final int numberOfDisciplines = 5;

	private String name;
	private int groupNumber;
	private double[] grades;

	{
		grades = new double[numberOfDisciplines];
	}

	public Student() {
		
	}

	public Student(String name, int groupNumber, double[] academicPerformance) {
		this.name = name;
		this.groupNumber = groupNumber;
		this.grades = academicPerformance;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(grades);
		result = prime * result + groupNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfDisciplines;
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
		Student other = (Student) obj;
		if (!Arrays.equals(grades, other.grades))
			return false;
		if (groupNumber != other.groupNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfDisciplines != other.numberOfDisciplines)
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " [numberOfDisciplines=" + numberOfDisciplines + ", name=" + name + ", groupNumber=" + groupNumber
				+ ", grades=" + Arrays.toString(grades) + "]";
	}

	
	
	
}
