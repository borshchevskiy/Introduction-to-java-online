package my.home.jonline.module05.task05.entity;

public abstract class Flower {

	String color;

	public Flower() {

	}

	public Flower( String color) {
		this.color = color;
	}


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Flower other = (Flower) obj;
		if (color == null) {
			if (other.getColor() != null) {
				return false;
			}
		} else if (!color.equals(other.getColor())) {
			return false;
		}
	
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " color=" + color + "]";
	}
	
	
}
