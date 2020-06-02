package a_Zadania.g_Dziedziczenie;


public class Employee {
    public int id;
    public String firstName;
    public String lastName;
    public double wage;

    public Employee(int id, String firstName, String lastName, double wage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wage = wage;
    }

    public void raiseWage(double percent) {
        if(percent <= 0.){
            throw new RaiseWageException("Czy Ty masz godność i rozum żeby dawać 0 % podwyżki");
        }else {
            this.wage = this.wage + this.wage * (percent / 100);
        }

    }
}
