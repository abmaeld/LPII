
import java.util.*;

public class Map {

	private int width;
	private int height;
	private Entity board[][];

	public Map(int width, int height) {

		this.width = width;
		this.height = height;

		board = new Entity[height][width];

		for (int i = 0; i < height; i++) {

			for (int j = 0; j < width; j++) {
				
				board[i][j] = new Entity('0');				 
		
			}

		}

	}

	public void print() {

		for (int i = 0; i < height; i++) {

			for (int j = 0; j < width; j++) {
				

				System.out.print(board[i][j].getGrapheme());
				System.out.print(" ");			 
		
			}

			System.out.println();

		}

	}

	public Entity getEntity(int x, int y) {

		return board[y][x];

	}

	public void setEntity(Entity entity, int x, int y) {

		board[y][x] = entity;
		 
	}

	public int getHeight() {

		return height;

	}

	public int getWidth() {

		return width;

	}

}
