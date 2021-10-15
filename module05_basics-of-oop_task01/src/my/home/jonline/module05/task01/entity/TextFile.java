package my.home.jonline.module05.task01.entity;

public class TextFile extends File {

	private StringBuilder content;

	{
		content = new StringBuilder();
	}

	public TextFile() {
		super("New Text File", ".txt", false, false, false);
	}

	public TextFile(String name) {
		super(name, ".txt", false, false, false);
	}

	public TextFile(String name, String extension) {
		super(name, extension, false, false, false);
	}

	public void setContent(String content) {
		this.content = new StringBuilder(content);
	}

	public String getContent() {
		return content.toString();
	}
	
	public void addContent(String content) {
		this.content.append(content);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		TextFile other = (TextFile) obj;
		if (content == null) {
			if (other.content != null) {
				return false;
			}
		} else if (!content.equals(other.content)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return getName() + getExtension();
	}
	
}
