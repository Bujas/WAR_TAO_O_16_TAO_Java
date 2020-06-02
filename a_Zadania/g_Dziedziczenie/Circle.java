package a_Zadania.g_Dziedziczenie;

public class Circle extends Shape {
    public double radius;

    public Circle(double x, double y, String color, double radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public String getDescription(){
        return "Ta figura to koło o środku w następującej pozycji: x: " + this.x + " y: " + getY() + " o kolorze " + getColor() + " oraz promieniu: " + radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getCircuit(){
      return   2 *Math.PI * this.radius;
    }
}
