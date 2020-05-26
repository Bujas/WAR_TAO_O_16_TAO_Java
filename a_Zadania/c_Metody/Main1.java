package a_Zadania.c_Metody;


public class Main1 {

    public static void main(String[] args) {
        Person person = new Person().setAge(18).setGender('F').setName("Janina").setSurname("Ze szczecina");
        System.out.println(person.getFullName());
        person.increaseAge();
        System.out.println(person.getFullName());
        Car car = new Car();
        car.setBrand("Audi");
        car.setModel("A6");
        car.setPrice(320000.32);
        System.out.println(car.toString());
    }
}
