package singleton;

/**
 * usando a instaciação tardia
 *
 * @author edivan
 */
public class ChessBoard1 {

    private static ChessBoard1 instance = null;

    private ChessBoard1() {
    }

    static ChessBoard1 getinstance() {
        if (instance == null) {
            instance = new ChessBoard1();
        }
        return instance;
    }

    public static void main(String[] args) {
        ChessBoard1 tabuleiro01= ChessBoard1.getinstance();
        ChessBoard1 tabuleiro02 = ChessBoard1.getinstance();
        
        System.out.println(tabuleiro01);
        System.out.println(tabuleiro02);
    }
}
