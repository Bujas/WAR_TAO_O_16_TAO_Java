package a_Zadania.f_Wyjatki;


public class Main1 {

    public static void main(String[] args) {
        try {
            System.out.println(factorial(-2));
        } catch (IllegalArgumentException e) {
            System.out.println("Podaj proszę argument funkcji większy bądź równy 0");
        }
    }

    static int factorial(int number) {
        if(number <0 ){
            throw new IllegalArgumentException();
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
