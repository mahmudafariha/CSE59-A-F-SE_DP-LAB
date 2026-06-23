interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;

        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }

        return totalArea;
    }
}


public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(5, 4),
            new Circle(3)
        };

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total Area = " + calculator.calculateTotalArea(shapes));
    }
}
