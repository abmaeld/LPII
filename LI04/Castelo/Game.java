
import java.util.*;

public class Game {

	Map gameMap;

	public Game(int width, int height) {
		
		gameMap = new Map(width, height);
		spawn(new Samurai(100, 5, 5, 2), 3, 3);
		spawn(new Paladin(200, 3, 3, 7), 9, 2);		
		gameMap.print();
		
	}

	public void spawn(Entity entity, int x, int y) {

		if ((x >= 0 && x < gameMap.getWidth()) && (y >= 0 && y < gameMap.getHeight())) {

			if (gameMap.getEntity(x, y).getGrapheme() != 0) {

				gameMap.setEntity(entity, x, y);
				gameMap.getEntity(x, y).setPosition(x, y);


			}

		}

	}


}
