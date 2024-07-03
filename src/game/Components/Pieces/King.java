package game.Components.Pieces;

public class King extends Piece {
    
    public King(String color) {
        super(color);
        this.name = "King";
        if (color == "Black"){
            this.symbol = "♚";
        } else {
            this.symbol = "♔";
        }

        this.draw();
    }
    
}
