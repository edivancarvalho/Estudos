package TemplateMethod;

/**
 *
 * @author edivan
 */
public abstract class AbstractClass {

    public void templateMethod() {

        // o templateMethod usar os metodos ↓ operacao1 e 2;
        primitiveOperacao1();
        primitiveOperacao2();
    }
// operação

    public abstract void primitiveOperacao1();

   public abstract void primitiveOperacao2();
}
