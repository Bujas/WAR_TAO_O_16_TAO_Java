package a_Zadania.g_Dziedziczenie;

public class HourlyEmployee extends Employee {

    public HourlyEmployee(int id, String firstName, String lastName, double wage) {
        super(id, firstName, lastName, wage);
    }

    public double calculatePayment(double hours) {
        return hours * this.wage;
    }
}
