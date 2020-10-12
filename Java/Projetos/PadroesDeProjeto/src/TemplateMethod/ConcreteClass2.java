package TemplateMethod;

/**
 *
 * @author edivan
 */
public class ConcreteClass2 extends AbstractClass {

    @Override
    public void primitiveOperacao1() {
        double x1 = 5;
        double x2 = 8;
        double resultado = 0;
        resultado = 0;
        System.out.println(resultado = x1 * x2);
    }

    @Override
    public void primitiveOperacao2() {
        System.out.println("Operação 2 em classe2");
    }
}
