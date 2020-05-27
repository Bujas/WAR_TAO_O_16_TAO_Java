package a_Zadania.f_Wyjatki;

public class Main3 {

    public static void main(String[] args) {
        showLength("null");
    }

    static void showLength(String s) {
        try {
            if (s == null) {
                System.out.println(s.length());
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e){
            System.out.println("Nasz napis nie możę być nullem");
        } catch (NullPointerException e) {
            System.out.println("Kurcze nie ten wyjątek");
        }


    }
}
