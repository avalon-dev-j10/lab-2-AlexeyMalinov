package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

import java.util.Random;

public class Main {

    public static void main(String[] args){
        Random random = new Random();
        Shape[] shapes = new Shape[10];
        shapes[0] = new Circle(random.nextInt(10));
        shapes[1] = new Circle(new PointOnPlane(random.nextInt(10), random.nextInt(10)),
                new PointOnPlane(random.nextInt(10), random.nextInt(10)));
        shapes[2] = new Circle(new PointOnPlane(random.nextInt(10), random.nextInt(10)),
                new PointOnPlane(random.nextInt(10), random.nextInt(10)));
        shapes[3] = new Triangle(new PointOnPlane(random.nextInt(10), random.nextInt(10)),
                new PointOnPlane(random.nextInt(10), random.nextInt(10)),
                new PointOnPlane(random.nextInt(10), random.nextInt(10)));
        shapes[4] = new Triangle(new PointOnPlane(random.nextInt(10), random.nextInt(10)),
                new PointOnPlane(random.nextInt(10), random.nextInt(10)),
                new PointOnPlane(random.nextInt(10), random.nextInt(10)));
        shapes[5] = new Triangle(new PointOnPlane(random.nextInt(10), random.nextInt(10)),
                new PointOnPlane(random.nextInt(10), random.nextInt(10)),
                new PointOnPlane(random.nextInt(10), random.nextInt(10)));
        shapes[6] = new Rectangle(new PointOnPlane(random.nextInt(10), random.nextInt(10)),
                new PointOnPlane(random.nextInt(10), random.nextInt(10)));
        shapes[7] = new Rectangle(new PointOnPlane(random.nextInt(10), random.nextInt(10)),
                new PointOnPlane(random.nextInt(10), random.nextInt(10)));
        shapes[8] = new Rectangle(new PointOnPlane(random.nextInt(10), random.nextInt(10)),
                new PointOnPlane(random.nextInt(10), random.nextInt(10)));
        shapes[9] = new Rectangle(new PointOnPlane(random.nextInt(10), random.nextInt(10)),
                new PointOnPlane(random.nextInt(10), random.nextInt(10)));

        Shape shapeWithMaxArea = getShapeWithMaxArea(shapes);
    }

    public static Shape getShapeWithMaxArea(Shape[] shapes) {
        if (shapes.length == 1){
            return shapes[0];
        }
        float maxArea = 0;
        Shape shapeWithMaxArea = shapes[0];
        for (int i = 0; i <shapes.length; i++){
            if (maxArea < shapes[i].getArea()){
                maxArea = shapes[i].getArea();
                shapeWithMaxArea = shapes[i];
            }
        }
        return shapeWithMaxArea;
    }
}
