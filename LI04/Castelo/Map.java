
import java.util.*;

public class Map {

	private int width;
	private int height;

	Character Board[][];

	public Map(int width, int height) {

		this.width = width;
		this.height = height;

		Board = new Character[height][width];

		for (int i = 0; i < height; i++) {

			for (int j = 0; j < width; j++) {
				

				Board[i][j] = '0';				 
		
			}

		}

	
	}

	public void print() {

		for (int i = 0; i < height; i++) {

				for (int j = 0; j < width; j++) {
				

					System.out.print(Board[i][j]);
					System.out.print(" ");			 
		
				}

				System.out.println();

			}

	}



}
