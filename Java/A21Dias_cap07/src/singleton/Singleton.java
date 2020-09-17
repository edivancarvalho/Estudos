
package singleton;

/**
 * pagina 293
 * @author edivan
 */
public class Singleton {
    // uma referencia de classe para a instancia singleton
    public static Singleton instance;
    
    // o contrutor deve ser oculto para que os objetos nao possam instanciar 
    // protected perimite que outas classes herdem de singleton
    protected Singleton(){}
    
    // um metodo de classe usado para recupera a instancia singleton
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    
    
}
