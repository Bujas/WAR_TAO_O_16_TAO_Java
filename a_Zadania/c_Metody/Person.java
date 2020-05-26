package a_Zadania.c_Metody;

public class Person {
    private String name = "Jan";
    private String surname = "Kowalski";
    private int age = 15;
    private char gender = 'M';

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public Person setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public Person setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getFullName(){
        return this.name + ' ' + this.surname;
    }
    public void increaseAge(){
        this.age = ++this.age;
    }
}
