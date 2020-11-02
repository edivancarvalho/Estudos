package animais;

/**
 *
 * @author edivan
 */
public class PatoMarreco implements Pato{

    @Override
    public void grasnar() {
         System.out.print( "Quack, quack, quack." );
    }

    @Override
    public void voar() {
        System.out.print( "Voar, voar, voar, voar, voar" );
    }

//    @Override
//    public void mergulho() {
//        System.out.print( "Tibum, tibum, tibum, tibum" );
//    }
//    
}
