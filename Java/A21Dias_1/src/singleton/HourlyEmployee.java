package singleton;

/**
 *
 * @author edivan
 */
public class HourlyEmployee extends Employee{
    
    private int hours; // controla o numero de horas trabalhadas
    
    public HourlyEmployee(String first_name, String last_name, double wage){
        super(first_name, last_name, wage);
        // chama o consturo original para inicializar corretamente
    }
    
    public double calculatePay(){
        return getWage()* hours;
    }
    
    public void addHours( int hours){
        this.hours = this.hours + hours;
    }
    
    public int getHours(){
        return hours;
    }
    
    public void resetHours(){
        hours = 0;
    }
    
}
