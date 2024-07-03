package game.Components.Pieces;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import game.utils.Position;

public class Piece extends JLabel{
    
    public String name = null;
    public String color = null;
    public String symbol = null;
    public Boolean isAlive = true;

    public Position pos = new Position(-1, -1);

    public Piece(){
        this.draw();
    }

    public Piece(String color) {

        this.color = color;
        this.draw();
    }

    public Piece(Piece piece) {
        this.name = piece.name;
        this.color = piece.color;
        this.symbol = piece.symbol;
        this.isAlive = piece.isAlive;
        this.pos = piece.pos;
        this.draw();
    }


    public Position[] getMoves() {
        Position[] moves = new Position[0];
        return moves;
    }

    void draw(){
        this.setText(symbol);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setFont(new Font("Serif", Font.BOLD, 50));
        this.setForeground(new Color(120, 50, 200));
    }

    // public void move(Position newPos) {
    //     System.out.println(this.name + " moved");
    //     Game.board.Tiles(newPos).piece = this;
    //     Game.board.Tiles(this.pos.x, this.pos.y).piece = null;

    // }

    public void kill() {
        this.isAlive = false;
        System.out.println(this.name + " killed");
    }

}