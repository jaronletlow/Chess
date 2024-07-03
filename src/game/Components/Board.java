package game.Components;
import javax.swing.JFrame;

import game.Components.Pieces.Piece;
import game.utils.Position;

import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Board {
    
    public Tile[][] tiles = new Tile[8][8];

    public Board() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tiles[i][j] = new Tile(i, j);
            }
        }
    }

    public Tile getTile(Position pos){
        return tiles[pos.x][pos.y];
    }

    public Piece getPiece(Position pos){
        return tiles[pos.x][pos.y].piece;
    }

    public void addPiece(Position newPos, Piece piece){;
        Piece p = new Piece(piece);
        getTile(newPos).piece = p;
        getTile(newPos).add(p, BorderLayout.CENTER);
        getTile(newPos).validate();
    }

    public void removePiece(Position pos){
        // tiles[x][y].remove(tiles[x][y].piece);
        // tiles[x][y].piece = null;
        // tiles[x][y].validate();
        getTile(pos).remove(getPiece(pos));
        getTile(pos).validate();
        getTile(pos).piece = null;
        
    }

    public void displayValidMoves(Piece p){
        Position[] validMoves = p.getMoves();
        for (Position pos : validMoves){
            getTile(pos).switchValid();
        }
    }

    public void draw(){
        JFrame board = new JFrame();
        board.setSize(800, 800);
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board.setLayout(new GridLayout(8, 8));
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board.add(tiles[i][j]); // Instantiate JPanel
            }
        }
        board.setResizable(false);
        board.setVisible(true);
    }



    


    
}
