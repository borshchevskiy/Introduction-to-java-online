package my.home.jonline.module05.task01.entity;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File{
	
	private List<Directory> subDirectories;
	private List<File> files;

	{
		subDirectories = new ArrayList<>();
		files = new ArrayList<>();
	}
	
	public Directory() {
		super("New Directory", "", false, false, true);
	}
	
	public Directory(String name) {
		super(name, "", false, false, true);
	}
	
	
	public List<Directory> getSubDirectories() {
		return subDirectories;
	}

	public void setSubDirectories(List<Directory> subDirectories) {
		this.subDirectories = subDirectories;
	}


	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		result = prime * result + ((subDirectories == null) ? 0 : subDirectories.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		if (subDirectories == null) {
			if (other.subDirectories != null)
				return false;
		} else if (!subDirectories.equals(other.subDirectories))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getName();
	}
	
	
}
