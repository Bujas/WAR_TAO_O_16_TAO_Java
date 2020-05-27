package a_Zadania.f_Wyjatki;

public class Main2 {

    public static void main(String[] args) {
        int[] tab = {  5, 1, 6, 7, 8 } ;
        try {
            System.out.println(tab[21]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
            System.out.println("Podajesz za duży indeks do tej tabeli");
        }
    }
}
