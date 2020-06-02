package a_Zadania.g_Dziedziczenie;

public class Shape {
    public double x;
    private double y;
    private String color;

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription() {
        String description = "X: " + this.x + " Y: " + this.y + " and color: " + this.color;
        System.out.println(description);
        return description;
    }
    public double getDistance(Shape shape){
        double distanceX = Math.pow(this.x - shape.x, 2);
        double distanceY = Math.pow(this.y - shape.y, 2);
        return Math.sqrt(distanceX + distanceY);
    }

    public double getX(){
        return this.x;
    }

    public double getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

}
