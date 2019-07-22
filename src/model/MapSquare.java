package model;

import javafx.scene.image.Image;

public class MapSquare {
	// title and content will refer to a HashMap which will have the graphics
	private Item item;
	private String tile;
	private Image tileImage;
	private String content;
	private boolean obstacle;
	
	public MapSquare(Item item, String tile, Image tileImage, String content, boolean obstacle) {
		this.item = item;
		this.tile = tile;
		this.tileImage = tileImage;
		this.content = content;
		this.obstacle = obstacle;
	}
	// getters
	public Item getItem() {
		return item;
	}
	public String getTile() {
		return tile;
	}
	public Image getTileImage() {
		return tileImage;
	}
	public String getContent() {
		return content;
	}
	public boolean getObstacle() {
		return obstacle;
	}
	// setters, necessary for item and obstacle
	public void setItem(Item item) {
		this.item = item;
	}
	public void setObstacle(boolean obstacle) {
		this.obstacle = obstacle;
	}
}
