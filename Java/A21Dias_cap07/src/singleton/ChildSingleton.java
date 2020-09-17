package singleton;

/**
 *
 * @author edivan
 */
public class ChildSingleton extends Singleton{
    
    protected ChildSingleton(){}
    
    public String toString(){
        return " I am the child singleton ";
    }
    
//    public class Singleton {
//        
//        // uma referencia de classe para a instancia singleton
//        private static Singleton instance;
//        
//        // o contrutor dever ser oculto para que os objetos nao possam instaciar
//        // protected permite que outras classes herdem de Singleton
//        protected ParentSingleton(){}
//        
//        // um metoodo de classe usado para recuperar a instancia singleton
//        public static Singleton getInstance(){
//            if (instance == null){
//                instance = new ChildSingleton();
//            }
//            return instance;
//        }
//        public String toString(){
//            return " I am the singleton";
//        }
//        
    }
    

