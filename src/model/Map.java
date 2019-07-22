package model;

public class Map {
	private final int WIDTH;
	private final int HEIGHT;
	private MapSquare[][] map;

	public Map(int width, int height) {
		WIDTH = width;
		HEIGHT = height;
		map = new MapSquare[WIDTH][HEIGHT];
	}

	public void createSmallMap() {
		MapSquare tree = new MapSquare(null, "T", null, "N", true);
		MapSquare grass = new MapSquare(null, "G", null, "N", false);
		MapSquare sidewalk = new MapSquare(null, "S", null, "N", false);
		MapSquare road = new MapSquare(null, "R", null, "N", false);
		
		for(int i = 0 ; i < 25; i++) {
			for(int j = 0; j < 75; j++) {
				if((j > 19 && j < 25) || (j == 46) || (j == 56) || (j == 66) || (i == 20))
					map[i][j] = sidewalk;
				else if (i == 19 && j % 2 == 0)
					map[i][j] = tree;
				else if(i > 20) 
					map[i][j] = road;
				else 
					map[i][j] = grass;
			}
		}
	}
	
	public void createTown() {
		MapSquare tree = new MapSquare(null, "T", null, "N", true);
		MapSquare grass = new MapSquare(null, "G", null, "N", false);
		MapSquare sidewalk = new MapSquare(null, "S", null, "N", false);
		MapSquare road = new MapSquare(null, "R", null, "N", false);
		MapSquare building = new MapSquare(null, "B", null, "N", true);
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				map[i][j] = building;
			}
			for(int j = 5; j < 15; j++) {
				map[i][j] = sidewalk;
			}	
		}
		for(int i = 5; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				map[i][j] = building;
			}
			for(int j = 10; j < 15; j++) {
				map[i][j] = sidewalk;
			}
		}
		for(int i = 0; i < 10; i++) {
			for(int j = 15; j < 25; j++) {
				map[i][j] = building;
			}
		}
		for(int i = 10; i < 15; i++) {
			for(int j = 0; j < 25; j++) {
				map[i][j] = road;
			}
		}
		for(int i = 15; i < 25; i++) {
			for(int j = 0; j < 25; j++) {
				map[i][j] = building;
			}
		}
		for(int i = 0; i < 25; i++) {
			for(int j = 25; j < 30; j++) {
				map[i][j] = road;
			}
			for(int j = 30; j < 35; j++) {
				map[i][j] = grass;
			}
		}
		
	}

	// getters
	public MapSquare[][] getMap() {
		return map;
	}

	public int getHEIGHT() {
		return HEIGHT;
	}

	public int getWIDTH() {
		return WIDTH;
	}

	// setters
	public void setMapSquare(int row, int col, MapSquare square) {
		map[row][col] = square;
	}
}
