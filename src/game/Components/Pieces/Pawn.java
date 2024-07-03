package game.Components.Pieces;

import game.Game;
import game.utils.Position;

public class Pawn extends Piece{
    
    public Boolean hasMoved = false;

    public Pawn(String color) {
        super(color);
        this.name = "Pawn";
        if (color == "Black"){
            this.symbol = "♟";
        } else {
            this.symbol = "♙";
        }

        this.draw();
    }

    public void move(Position newPos) {
        this.pos = newPos;
    }

    @Override
    public Position[] getMoves(){

        Position[] moves = new Position[2];
        
        if (this.color == "Black"){
            moves[0] = new Position(this.pos.x-1, this.pos.y);
            if (!this.hasMoved){
                moves[1] = new Position(this.pos.x-2, this.pos.y);
            }
        } else {
            moves[0] = new Position(this.pos.x+1, this.pos.y);
            if (!this.hasMoved){
                moves[1] = new Position(this.pos.x+2, this.pos.y);
            }
        }

        return moves;
    }
}
