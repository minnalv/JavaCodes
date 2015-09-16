package duplicate;
//user defined exception class for length of each word
public class LengthException extends Exception {
	private String word;

	public LengthException(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

}