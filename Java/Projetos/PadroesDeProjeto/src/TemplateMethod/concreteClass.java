package TemplateMethod;

import javax.swing.JOptionPane;

/**
 *
 * @author edivan
 */
public class concreteClass extends  AbstractClass{

    @Override
    public void primitiveOperacao1() {
        
        double x1 = 2;
        double x2 = 8;
        double resultado = 0;
        resultado = (x1 + x2) /2;
        JOptionPane.showMessageDialog(null, "Valor: "+resultado);
    }

    @Override
    public void primitiveOperacao2() {
        System.out.println("9 8 7 6 5 4 3 2 1 ");
    }
    

}
