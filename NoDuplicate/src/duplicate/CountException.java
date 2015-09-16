package duplicate;
//user defined exception class for the number of words
public class CountException extends Exception {
	private int count;

	public CountException(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

}