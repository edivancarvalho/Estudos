package TemplateMethod;

/**
 *
 * @author edivan
 */
public class Formula {
    double x1;
    double x2;
    double soma;

    public void soma(){
        soma = x1 + x2;
    }

    public Formula(double x1, double x2, double soma) {
        this.x1 = x1;
        this.x2 = x2;
        this.soma = soma;
    }

    public Formula() {
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

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    void setX1(String string) {
        
    }
    
    
}
