package chess;


public class ChessException extends RuntimeException{
    
    private static final long serialVersionUI = 10;

    public ChessException(String msg){
        super(msg);
    }
}
