package a_Zadania.f_Wyjatki;


public class Main6 {

    public static void main(String[] args) {
        try {
            System.out.println(divide(10, -2));
        }catch (IllegalArgumentException ex){
            System.out.println("Pamiętaj cholero nie dziel przez 0");
        }
    }

    static int divide(int a, int b) {
        if(b==0){
            throw new IllegalArgumentException();
        }
        return a / b;
    }

}
