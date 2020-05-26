package a_Zadania.d_Konstruktor;

public class Calculator {
    String[] history;

    public Calculator() {
        history = new String[0];
    }

    // add(num1, num2)``` – metoda ma dodać do siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście operacji
    // ma zapamiętać napis: "added ```num1``` to ```num2``` got ```result```".
    public double add(double num1, double num2) {
        double result = num1 + num2;
        //dodanie do history
        addHistory("added " + num1 + " to " + num2 + " got " + result);
        return result;
    }

    //multiply(num1, num2)``` – metoda ma pomnożyć przez siebie dwie zmienne i zwrócić wynik.
    // Dodatkowo na liście operacji ma zapamiętać napis: "multiplied ```num1``` with ```num2``` got ```result```"
    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        //dodanie do history
        addHistory("multiplied " + num1 + " with " + num2 + " got " + result);
        return result;
    }

    //subtract(num1, num2)``` – metoda ma odjąć od siebie dwie zmienne i zwrócić wynik.
    // Dodatkowo na liście operacji ma zapamiętać napis: "subtracted ```num1``` from ```num2``` got ```result```".
    public double subtract(double num1, double num2) {
        double result = num1 - num2;
        //dodanie do history
        addHistory("ubtracted " + num1 + " from " + num2 + " got " + result);
        return result;
    }

    //divide(num1, num2)``` – metoda ma podzielić przez siebie dwie zmienne i zwrócić wynik. Dodatkowo na liście
    // operacji ma zapamiętać napis: "divided ```num1``` by ```num2``` got ```result```". Pamiętaj, że nie można dzielić przez zero.
    public double divide(double num1, double num2) {
        double result = num1 / num2;
        //dodanie do history
        addHistory("divided " + num1 + " by " + num2 + " got " + result);
        return result;
    }

    //printOperations()``` – metoda ma wypisać wszystkie zapamiętane operacje.
    public void printOperations() {
        for (int i = 0; i < this.history.length; i++) {
            System.out.println(this.history[i]);
        }
    }

    //clearOperations()``` – metoda ma wyczyścić wszystkie zapamiętane operacje.
    public void clearOperations() {
        this.history = new String[0];
    }

    protected void addHistory(String operationResult) {
        String[] newHistory = new String[this.history.length + 1];

        for (int i = 0; i < this.history.length; i++) {
            newHistory[i] = this.history[i];
        }
        newHistory[newHistory.length - 1] = operationResult;
        this.history = newHistory;
    }

}
