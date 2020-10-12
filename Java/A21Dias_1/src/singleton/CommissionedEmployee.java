package singleton;

/**
 *
 * @author edivan
 */
public class CommissionedEmployee extends Employee{
    
    private double commission;   // o custo por unidade
    private int units;          // controla o número de unidades vendidas
    
    public CommissionedEmployee(String first_name, String last_name, double wage, double commission){
        super(first_name, last_name, wage);        
        // chama o construtor original para inicializar corretamente
        this.commission = commission;
    }
    
    public double calculatePay(){
        return getWage() + (commission * units);
    }
    
    public void addSales( int units){
        this.units = this.units + units;
    }
    
    public int getSales(){
        return units;
    }
    
    public void resetSales(){
        units = 0;
    }
}
