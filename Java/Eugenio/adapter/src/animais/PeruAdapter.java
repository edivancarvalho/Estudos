package animais;

/**
 *
 * @author edivan
 */
public class PeruAdapter implements Pato {

    private Peru peru;

    public PeruAdapter(Peru peru) {
        this.peru = peru;
    }

    @Override
    public void grasnar() {
        peru.soar();
        /* MÉTODO DE PERU SENDO UTILIZADO DE FORMA ADAPTADA */
    }

    @Override
    public void voar() {

        peru.voar();
        System.out.print( "," );
        /* IGUALMENTE AQUI */
    }

//    @Override
//    public void mergulho() {
//        System.out.println("Método mergulho() não suportado por Perus" );
//    }
    
}
