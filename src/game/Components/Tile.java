package game.Components;
import javax.swing.JPanel; // Add this import statement

import game.Game;
import game.Components.Pieces.Piece;
import game.utils.Position;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Tile extends JPanel implements MouseListener{
    
    public static Position selectedPos;

    public Piece piece;
    public Position pos;
    public Boolean selected = false;
    public Boolean valid = false;
    
    public Tile(int x, int y) {
        super(new BorderLayout());
        this.pos = new Position(x, y);

        if ((pos.x + pos.y) % 2 == 0) {
            this.setBackground(new Color(255, 255, 255));
        } else {
            this.setBackground(new Color(0, 0, 0));
        }

        this.addMouseListener(this);
        
    }

    

    public Boolean hasPiece() {
        return piece != null;
    }

    public void switchValid(){
        if (valid){
            valid = false;
            if ((this.pos.x + this.pos.y) % 2 == 0) {
                this.setBackground(new Color(255, 255, 255));
            } else {
                this.setBackground(new Color(0, 0, 0));
            }
        } else {
            valid = true;
            this.setBackground(new Color(0, 255, 0));
        }
    }

    public void select() {
        if (hasPiece()) {
            if (selected) {
                selected = false;
                if ((this.pos.x + this.pos.y) % 2 == 0) {
                    this.setBackground(new Color(255, 255, 255));
                } else {
                    this.setBackground(new Color(0, 0, 0));
                }
            } else {
                selected = true;
                this.setBackground(new Color(255, 0, 0));
                Game.board.displayValidMoves(this.piece);
            }
        } else {
            if (selected) {
                selected = false;
                if ((this.pos.x + this.pos.y) % 2 == 0) {
                    this.setBackground(new Color(255, 255, 255));
                } else {
                    this.setBackground(new Color(0, 0, 0));
                }
            } else {
                selected = true;
                this.setBackground(new Color(0, 255, 0));
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if (hasPiece()) {
            if (selectedPos == null){
                selectedPos = this.pos;
                Game.board.getTile(selectedPos).select();
            } else {
                Game.board.getTile(selectedPos).select();
                selectedPos = this.pos;
            }
        } else {
            if (selectedPos != null) {
                Game.board.addPiece(pos, new Piece(Game.board.getPiece(selectedPos)));
                Game.board.removePiece(selectedPos);
                Game.board.getTile(selectedPos).select();
                selectedPos = null;
            }
        }
        //throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }
}
