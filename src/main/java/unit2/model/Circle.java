package unit2.model;

public class Circle implements Figure {
    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("The radius should be greater than 0.");
        }
        this.radius = radius;
    }

    private double radius;

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("The radius should be greater than 0.");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double calculateArea() {
        double square = (Math.PI * Math.pow(this.radius, 2));
        return square;
    }
}

