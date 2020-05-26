package a_Zadania.d_Konstruktor;

public class Main1 {
    public static void main(String[] args) {
        Burger burger = new Burger();

        Calculator calculator = new Calculator();
        calculator.add(1, 2);
        calculator.printOperations();
        calculator.multiply(2, 5);
        calculator.printOperations();
        calculator.subtract(10, 5);
        calculator.printOperations();
        calculator.clearOperations();
        calculator.divide(20, 4);
        calculator.printOperations();

        Person person1 = new Person("Jan", "Jeżyna");
        System.out.println(person1.getSurname()+" "+ person1.getSurname());
        Person person2 = new Person("Jan", 21);
        System.out.println(person2.getName() + " " + person2.getAge());
        Person person3 = new Person("Krzysztof", "Jeżyna", 35, 'M');
        System.out.println(person3.getName() + " " + person3.getSurname() + " " + person3.getAge() + " " + person3.getGender());
    }
}
