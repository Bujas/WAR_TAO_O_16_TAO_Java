package a_Zadania.g_Dziedziczenie;

import a_Zadania.d_Konstruktor.Calculator;

public class AdvancedCalculator extends Calculator {

    public double pow(double num1, double num2) {
        double result = Math.pow(num1, num2);
        //dodanie do historii
        addHistory(num1 + " ^ " + num2 + " equals " + result);
        return result;
    }

    public double root(double num1,double num2) {
        double result = Math.pow(num1, 1 / num2);
        //dodanie do historii
        addHistory(num2 + " root of " + num1 + " equals " + result);
        return result;
    }

}
