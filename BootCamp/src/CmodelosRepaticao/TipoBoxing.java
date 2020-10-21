package CmodelosRepaticao;

/**
 *
 * @author edivan
 */
public class TipoBoxing {

    public static void main(String[] args) {
        Integer valorWrapper = new Integer(8);
        int valorPrimitivo = 9;
        autoBoxing(valorPrimitivo);
        unBoxing(valorWrapper);
    }

    static void autoBoxing(Integer val) {
        System.out.println(val);
    }

    static void unBoxing(int val) {
        System.out.println(val);
    }
}
