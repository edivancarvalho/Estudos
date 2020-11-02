
package animais;

/**
 *
 * @author edivan
 */
public class PeruAustraliano implements Peru{

    @Override
    public void soar() {
        System.out.print( "Brulu, brulu, brulu." );
    }

    @Override
    public void voar() {
        System.out.print( "Voar," );
    }
    
}
