package a_Zadania.g_Dziedziczenie;

public class Main {
    public static void main(String[] args) {
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        advancedCalculator.pow(5., 2.);
        advancedCalculator.printOperations();
        System.out.println();
        advancedCalculator.root(100, 2);
        advancedCalculator.printOperations();

        Shape shape1 = new Shape(0, 0, "blue");
        Shape shape2 = new Shape(0, 5, "black");


        Circle circle1 = new Circle(0, 4, "yellow", 3);
        Circle circle2 = new Circle(0, 8, "purple", 3);

        System.out.println(circle1.getDistance(circle2));

        shape1.getDescription();
        String descriptionShape2 = shape2.getDescription();
        System.out.println(shape1.getDescription());
        double distance1 = shape1.getDistance(shape2);
        double distance2 = shape2.getDistance(shape1);
        double distance3 = shape1.getDistance(shape1);
        System.out.println(distance1);
        System.out.println(distance2);
        System.out.println(distance3);

        Employee employee = new Employee(1, "Krzysztof", "Jeżyna", 10);
        employee.calculatePayment(160);
        System.out.println(employee.wage);
        employee.raiseWage(10);
        System.out.println(employee.wage);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(2, "Krzysztof", "Krawczyk", 10);
        System.out.println(hourlyEmployee.calculatePayment(160));
        hourlyEmployee.raiseWage(10);
        System.out.println(hourlyEmployee.calculatePayment(160));
        SalariedEmployee.workingHours = 160;


    }
}
