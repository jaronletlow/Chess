package game.Components.Pieces;

public class Queen extends Piece {

    public Queen(String color) {
        super(color);
        this.name = "Queen";
        if (color == "Black"){
            this.symbol = "♛";
        } else {
            this.symbol = "♕";
        }

        this.draw();
    }
}
