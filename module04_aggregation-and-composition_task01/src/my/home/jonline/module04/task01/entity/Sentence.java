package my.home.jonline.module04.task01.entity;

public class Sentence {

	private String sentence;

	public Sentence() {
		this.sentence = "";
	}

	public Sentence(String sentence) {
		this.sentence = sentence;
	}

	public Sentence(Word... words) {
		this.sentence = "";
		for (Word word : words) {
			addWord(word);
		}
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public void removeSentence() {
		this.sentence = "";
	}

	public void addWord(Word word) {
		if (sentence.equals("")) {
			sentence += word.getWord();
		} else if (word.getWord().matches("[\\p{Punct}]")) {
			sentence += word.getWord();
		} else {
			sentence += " " + word.getWord();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
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
		Sentence other = (Sentence) obj;
		if (sentence == null) {
			if (other.sentence != null)
				return false;
		} else if (!sentence.equals(other.sentence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sentence [sentence=" + sentence + "]";
	}

}
