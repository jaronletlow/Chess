package game.Components.Pieces;

public class Knight extends Piece{
    
    public Knight(String color) {
        super(color);
        this.name = "Knight";
        if (color == "Black"){
            this.symbol = "♞";
        } else {
            this.symbol = "♘";
        }

        this.draw();
    }
}
