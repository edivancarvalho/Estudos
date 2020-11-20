package singleton;

/**
 *
 * @author edivan
 */
public class ChessBoard {

    private static ChessBoard instance = new ChessBoard();

    private ChessBoard() {
    }

    static ChessBoard getinstance() {
        return instance;
    }
    
    public static void main(String[] args) {
        ChessBoard tabuleiro = ChessBoard.getinstance();
    }
}
