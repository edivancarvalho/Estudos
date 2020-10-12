package singleton;

/**
 *
 * @author edivan
 */
public class PayrollDriver {
    public static void main(String[] args) {
        
        // criar o sistema de folha de pagamento
        Payroll payroll = new Payroll();
        
        // criar e atualiza alguns funcionarios
        CommissionedEmployee emp1 = new CommissionedEmployee("Mr.", "Sales ", 25000.00, 1000.00);
        CommissionedEmployee emp2 = new CommissionedEmployee("Ms.", "Sales ", 25000.00, 100.00);
        
        emp1.addSales(7);
        emp2.addSales(5);
        
        HourlyEmployee emp3 = new HourlyEmployee("Mr.", "Mininum Wage", 6.50);
        HourlyEmployee emp4 = new HourlyEmployee("Mr.", "Mininum Wage", 6.50);
        emp3.addHours(40);
        emp4.addHours(46);
        
        // usa os metodos sobrecarregados
        payroll.recordEmployeeInfo(emp2);
        payroll.recordEmployeeInfo(emp1);
        payroll.recordEmployeeInfo(emp3);
        payroll.recordEmployeeInfo(emp4);
        
        // coloca os funcionarios em um array
        Employee[] emps = new Employee[4];
        emps[0] = emp1; emps[1] = emp2; emps[2] = emp3; emps[3] = emp4;
        
       payroll.payEmployees(emps);
       payroll.printreport();
    }
    
}
