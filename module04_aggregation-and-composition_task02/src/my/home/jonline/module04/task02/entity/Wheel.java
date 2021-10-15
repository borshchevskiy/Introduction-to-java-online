package my.home.jonline.module04.task02.entity;

public class Wheel {

	private int size;

		
	public Wheel() {
		
	}
	
	

	public Wheel(int size) {
		this.size = size;
	}



	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + size;
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
		Wheel other = (Wheel) obj;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wheel [size=" + size + "]";
	}

	
	
	
}
