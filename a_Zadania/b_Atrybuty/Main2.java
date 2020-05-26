package a_Zadania.b_Atrybuty;


public class Main2 {

    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        testAttribute.publicAttribute = "public attribute";
        testAttribute.protectedAttribute = "protected attribute";
        System.out.println(testAttribute.publicAttribute);
        System.out.println(testAttribute.protectedAttribute);
    }
}
