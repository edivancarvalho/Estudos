package TemplateMethod;

/**
 *
 * @author edivan
 */
public class concreteClass extends  AbstractClass{

    @Override
    public void primitiveOperacao1() {
        
        System.out.println(" " + (1 + 1));
    }

    @Override
    public void primitiveOperacao2() {
        System.out.println("9 8 7 6 5 4 3 2 1 ");
    }
    

}
