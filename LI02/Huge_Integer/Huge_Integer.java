
import java.util.*;

public class Huge_Integer {

	private ArrayList<Integer> array;
	
	public Huge_Integer(String input) {

		array = new ArrayList<Integer>();

		for (int i = 0; i < input.length() / 10; i++) {

			array.add(Integer.parseInt(input.substring(i * 10, i * 10 + 10))); 

		}

		if (input.length() % 10 != 0) {

			array.add(Integer.parseInt(input.substring(10 * (input.length()/10), input.length())));

		}
		
	}

	public void print() {

		for (int i = 0; i < array.size(); i++) {

			System.out.print(array.get(i));

		}

	}

}
