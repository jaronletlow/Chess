package game.Components.Pieces;

public class Rook extends Piece{
    
    public Rook(String color) {
        super(color);
        this.name = "Rook";
        if (color == "Black"){
            this.symbol = "♜";
        } else {
            this.symbol = "♖";
        }

        this.draw();
    }
}
