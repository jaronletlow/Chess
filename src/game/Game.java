package game;

import game.Components.Board;
import game.Components.Player;
import game.utils.Position;

public class Game {

    public static Board board = new Board();
    public Player player1;
    public Player player2;
    
    public Game(Player player1, Player player2) {

        this.player1 = player1;
        this.player2 = player2;
        
    }

    public void play() {
        board.draw();
            for (int i = 0; i < 8; i++) {
                board.addPiece(new Position(0, i), player1.pieces[i]);
                board.addPiece(new Position(7, i), player2.pieces[i]);
            }
            for (int i = 8; i < 16; i++) {
                board.addPiece(new Position(1, i-8), player1.pieces[i]);
                board.addPiece(new Position(6, i-8), player2.pieces[i]);
            }
    }

    
}
