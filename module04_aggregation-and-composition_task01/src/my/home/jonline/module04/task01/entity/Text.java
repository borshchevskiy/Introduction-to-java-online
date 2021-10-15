package my.home.jonline.module04.task01.entity;

public class Text {

	private String header;
	private String body;
	
	public Text() {
		this.header = "";
		this.body = "";		
	}

	public Text(String header, String body) {
		this.header = header;
		this.body = body;
	}
	
	public Text(Sentence header, Sentence body) {
		this(header.getSentence(), body.getSentence());
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	public void removeHeader() {
		this.header = "";
	}
	
	public void removeBody() {
		this.body = "";
	}
	
	public void addSentence(Sentence sentence) {
		body += " " + sentence.getSentence();
	}
	
	public void addText(Text text) {
		body += " " + text.getBody();
		
	}
	
	public void viewHeader() {
		System.out.println(header);
	}
	
	public void viewBody() {
		System.out.println(body);
	}
	
	public void viewText() {
		viewHeader();
		System.out.println();
		viewBody();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((body == null) ? 0 : body.hashCode());
		result = prime * result + ((header == null) ? 0 : header.hashCode());
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
		Text other = (Text) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Text [header=" + header + ", body=" + body + "]";
	}
	
	
}
