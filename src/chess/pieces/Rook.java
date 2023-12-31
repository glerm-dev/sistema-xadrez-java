package chess.pieces;

import chess.Color;
import boardgame.Board;
import chess.ChessPiece;

public class Rook extends ChessPiece {
    
    public Rook(Board board, Color color){
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
