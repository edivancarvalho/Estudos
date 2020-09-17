package singleton;

/**
 * pagina 294 Implementando o singleton
 *
 * @author edivan
 */
public class Payroll {

    // uma rederencoa de classe para a instancia singleton unica
    private static Payroll instance;
    private int total_hours;
    private int total_sales;
    private double total_pay;

    // oculta o construtor para que outros objetos não possam instanciar
    protected Payroll() {}
    // observer o uso de static; voce nao tem uma instancia, quando recuper
    // uma instancia; portanto, o metodo dever ser um metodo de classe; dai,    // static
    public static Payroll getInstance() {
        if (instance == null) {
            instance = new Payroll();
        }
        return instance;
    }
    
    public void payEmployees(Employee[] emps) {
        for (int i = 0; i < emps.length; i++) {
            Employee emp = emps[i];
            total_pay += emp.calculatePay();
            emp.printPaycheck();
        }
    }

    public void calculateBonus(Employee [] emps ){
        for (int i = 0; i < emps.length; i++) {
            Employee emp = emps [i];
            System.out.println("Pay bonus to " + emp.getLastName() + ", " +
                    emp.getFirstName() + " $" + emp.calculateBonus() );
        }
    }
    public void recordEmployeeInfo(CommissionedEmployee emp) {
        total_sales += emp.getSales();
    }
    
    public void recordEmployeeInfo(HourlyEmployee emp){
        total_hours += emp.getHours();
    }

    public void printReport() {
        System.out.println("Playroll report:");
        System.out.println("Total Hours: " + total_hours);
        System.out.println("total Sales:" + total_sales);
        System.out.println("Total Paid: $" + total_pay);

        // pagina 296
    }

}
