package my.home.jonline.module05.task01.entity;

public abstract class File {

	private String name;
	private String extension;
	private boolean isReadOnly;
	private boolean isSystem;
	private boolean isDirectory;

	public File() {

	}

	public File(String name, String extension, boolean isReadonly, boolean isSystem, boolean isDirectory) {
		this.name = name;
		this.extension = extension;
		this.isReadOnly = isReadonly;
		this.isSystem = isSystem;
		this.isDirectory = isDirectory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public boolean isReadOnly() {
		return isReadOnly;
	}

	public void setReadOnly(boolean isReadOnly) {
		this.isReadOnly = isReadOnly;
	}

	public boolean isSystem() {
		return isSystem;
	}

	public void setSystem(boolean isSystem) {
		this.isSystem = isSystem;
	}

	public boolean isDirectory() {
		return isDirectory;
	}

	public void setDirectory(boolean isDirectory) {
		this.isDirectory = isDirectory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((extension == null) ? 0 : extension.hashCode());
		result = prime * result + (isDirectory ? 1231 : 1237);
		result = prime * result + (isReadOnly ? 1231 : 1237);
		result = prime * result + (isSystem ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		File other = (File) obj;
		if (extension == null) {
			if (other.extension != null)
				return false;
		} else if (!extension.equals(other.extension))
			return false;
		if (isDirectory != other.isDirectory)
			return false;
		if (isReadOnly != other.isReadOnly)
			return false;
		if (isSystem != other.isSystem)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "File [name=" + name + ", extension=" + extension + ", isReadOnly=" + isReadOnly + ", isSystem="
				+ isSystem + ", isDirectory=" + isDirectory + "]";
	}

}
