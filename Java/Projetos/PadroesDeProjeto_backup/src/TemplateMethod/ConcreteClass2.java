package TemplateMethod;

/**
 *
 * @author edivan
 */
public class ConcreteClass2 extends AbstractClass{

    
    @Override
    public void primitiveOperacao1() {
        double x1 = 0;
        double x2 = 0;
        double resultado = 0;
        resultado = (x1 + x2) /2;
    }

    @Override
    public void primitiveOperacao2() {
        System.out.println("Operação 2 em classe2");
    }
    
}
