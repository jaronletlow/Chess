import game.Game;

import game.Components.Player;

public class App {
    public static void main(String[] args) throws Exception {
        
        Game game = new Game(new Player("White"), new Player("Black"));

        game.play();
        
    }
}
