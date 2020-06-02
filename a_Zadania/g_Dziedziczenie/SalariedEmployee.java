package a_Zadania.g_Dziedziczenie;


public class SalariedEmployee extends Employee {
    public final static int workingHours = 190;

    public SalariedEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public double calculatePayment(){
        return workingHours * wage;
    }

}
