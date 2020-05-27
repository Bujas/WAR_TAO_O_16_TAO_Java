package a_Zadania.f_Wyjatki;


public class Main5 {

    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("5215");
            System.out.println(num);
        }catch (NumberFormatException ex){
            System.out.println("Nasz napis nie jest liczbą");
        }finally {
            System.out.println("Lubię placki");
        }
    }

}
