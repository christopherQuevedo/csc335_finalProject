package views;

import java.util.Observable;
import java.util.Observer;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import model.PokemonGame;

public class TextView extends BorderPane implements Observer {
	private PokemonGame game;
	private Label gameArea;
	
	public TextView(PokemonGame game) {
		this.game = game;
		gameArea = new Label(game.printMap());
		gameArea.setFont(new Font("Courier New", 12));
		this.setTop(gameArea);
	}
	@Override
	public void update(Observable o, Object arg) {
		game = (PokemonGame) o;
		gameArea = new Label(game.printMap());
		gameArea.setFont(new Font("Courier New", 12));
		this.setTop(gameArea);
	}
}
