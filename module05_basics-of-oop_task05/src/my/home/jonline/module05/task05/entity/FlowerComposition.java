package my.home.jonline.module05.task05.entity;

import java.util.ArrayList;
import java.util.List;

public class FlowerComposition {
	private List<Flower> flowers;
	private FlowerWrapping wrapping;
	
	public FlowerComposition() {
		flowers = new ArrayList<>();
		wrapping = new FlowerWrapping("none", "none");
	}
	
	public FlowerComposition(List<Flower> flowers, FlowerWrapping wrapping) {
		this.flowers = flowers;
		this.wrapping = wrapping;
	}
	
	public List<Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<Flower> flowers) {
		this.flowers = flowers;
	}

	public FlowerWrapping getWrapping() {
		return wrapping;
	}

	public void setWrapping(FlowerWrapping wrapping) {
		this.wrapping = wrapping;
	}	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flowers == null) ? 0 : flowers.hashCode());
		result = prime * result + ((wrapping == null) ? 0 : wrapping.hashCode());
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
		FlowerComposition other = (FlowerComposition) obj;
		if (flowers == null) {
			if (other.flowers != null)
				return false;
		} else if (!flowers.equals(other.flowers))
			return false;
		if (wrapping == null) {
			if (other.wrapping != null)
				return false;
		} else if (!wrapping.equals(other.wrapping))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [flowers=" + flowers + ", wrapping=" + wrapping + "]";
	}
	
	
}
