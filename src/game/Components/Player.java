package game.Components;
import game.Components.Pieces.Bishop;
import game.Components.Pieces.King;
import game.Components.Pieces.Knight;
import game.Components.Pieces.Pawn;
import game.Components.Pieces.Piece;
import game.Components.Pieces.Queen;
import game.Components.Pieces.Rook;

public class Player {
    
    public String color;
    public Piece[] pieces = new Piece[16];
    public Piece[] capturedPieces = new Piece[16];

    public Player(String color) {
        
        this.color = color;
        
        if (this.color == "White") {
            pieces[0] = new Rook("White");
            pieces[1] = new Knight("White");
            pieces[2] = new Bishop("White");
            pieces[3] = new Queen("White");
            pieces[4] = new King("White");
            pieces[5] = new Bishop("White");
            pieces[6] = new Knight("White");
            pieces[7] = new Rook("White");
            for (int i = 8; i < 16; i++) {
                pieces[i] = new Pawn("White");
            }
        } else {
            pieces[0] = new Rook("Black");
            pieces[1] = new Knight("Black");
            pieces[2] = new Bishop("Black");
            pieces[3] = new Queen("Black");
            pieces[4] = new King("Black");
            pieces[5] = new Bishop("Black");
            pieces[6] = new Knight("Black");
            pieces[7] = new Rook("Black");
            for (int i = 8; i < 16; i++) {
                pieces[i] = new Pawn("Black");
            }
        }
    }
}
