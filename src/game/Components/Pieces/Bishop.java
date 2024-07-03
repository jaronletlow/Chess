package game.Components.Pieces;

public class Bishop extends Piece{

    public Bishop(String color) {
        super(color);
        this.name = "Bishop";
        if (color == "Black"){
            this.symbol = "♝";
        } else {
            this.symbol = "♗";
        }

        this.draw();
    }
}
