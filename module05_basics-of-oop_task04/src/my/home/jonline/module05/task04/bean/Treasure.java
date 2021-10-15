package my.home.jonline.module05.task04.bean;

public class Treasure {
	private String type;
	private int value;
	
	public Treasure() {
	}

	public Treasure(String type, int value) {
		this.type = type;
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + value;
		
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
		Treasure other = (Treasure) obj; 
		if (this.type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!this.type.equals(other.type)) {
			return false;
		}
		if (this.value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [type=" + type + ", value=" + value + "]";
	}
	
	
}
