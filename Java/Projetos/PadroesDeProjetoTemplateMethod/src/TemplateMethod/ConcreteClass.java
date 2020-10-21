package TemplateMethod;

/**
 *
 * @author edivan
 */
public class ConcreteClass extends AbstractClass {

    double x1 = 2;
    double x2 = 8;
    double resultado = 0;

    public ConcreteClass() {
    }
    
    
    @Override
    public void primitiveOperacao1() {

        System.out.println(resultado = x1 + x2);
//        JOptionPane.showMessageDialog(null, "Valor: " + resultado);
    }

    @Override
    public void primitiveOperacao2() {
        System.out.println("Operação 1 em classe1\n");
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    
}
