package controller;

import java.util.Observer;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Map;
import model.PokemonGame;
import model.Trainer;
import views.TextView;

public class PokemonGUI extends Application {

	private Observer textView;
	private Trainer player;
	private Map map;
	private PokemonGame game;

	public static void main(String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane window = new BorderPane();
		Scene scene = new Scene(window, 1000, 500);
		stage.setTitle("Pokemon Hot Damn");

		player = new Trainer(13,15);
		//map = new Map(25, 75);
		//map.createSmallMap();
		map = new Map(25, 35);
		map.createTown();
		game = new PokemonGame(map, player);

		KeyListener keyHandler = new KeyListener();
		scene.setOnKeyPressed(keyHandler);
		textView = new TextView(game);
		game.addObserver(textView);
		window.setCenter((Node) textView);

		stage.setScene(scene);
		stage.show();
	}
	// Class to handle when the player uses the arrows to move
	private class KeyListener implements EventHandler<KeyEvent>  {
		// Returns void and is the handler for the player to use the keyboard arrows to move
		@Override
		public void handle(KeyEvent event) {
			if(KeyCode.UP == event.getCode())
				game.moveTrainer('n');
			if(KeyCode.RIGHT == event.getCode()) 
				game.moveTrainer('e');
			if(KeyCode.DOWN == event.getCode())
				game.moveTrainer('s');
			if(KeyCode.LEFT== event.getCode())
				game.moveTrainer('w');
		}  
	}
}
