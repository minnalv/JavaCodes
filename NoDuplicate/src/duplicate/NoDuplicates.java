package duplicate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;

public class NoDuplicates {
	public static void main(String[] args) throws IOException, CountException,
			LengthException {
		BufferedReader br = null;
		try {
			TreeSet<String> tree = new TreeSet<String>();
			String line;
			int count;
			if (args.length !=1){
				System.out.println("Usage: <input_filename> should be passed an argument");
				System.exit(0);
			}
			br = new BufferedReader(new FileReader(args[0]));
			count = Integer.parseInt(br.readLine());
			if (!(1 <= count && count <= 5000)) {
				throw new CountException(count);
			}
			//Reading line by line from file and adding Each line into TreeSet utility.
			//TreeSet doesn't allow duplicate entries and maintains sorted order of elements 
			for (int i = 0; i < count; i++) {
				line = br.readLine();
				if (line.length() > 10) {
					throw new LengthException(line);
				}
				tree.add(line);
			}

			Iterator<String> it = tree.iterator();

			while (it.hasNext()) {
				System.out.println(it.next());

			}

		} catch (CountException e) {
			System.out.println(e.getCount() + " is out of range!!");
			System.out.println("Count should be with in the range 1 ~ 5000");
		} catch (LengthException e) {
			System.out.println("length of \"" + e.getWord() + "\" is "
					+ e.getWord().length() + " which exceeds the limit  1~10");
		} catch (Exception e) {
			System.out.print(e);
		} finally {
			br.close();
		}
	}
}
