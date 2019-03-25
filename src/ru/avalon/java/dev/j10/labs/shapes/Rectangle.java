package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {

    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;
    private final int rotation;

    /**
     * Конструктор создающий прямоугольник по двум точкам.
     * Дополнительные точки создаются внутри конструктора таким образом,
     * чтобы выполнялось условие: "все углы прямоугольника прямые (90 градусов)"
     * Задается угол поворота фигуры
     * @param a
     * @param b
     * @param rotation
     */
    public Rectangle(Point a, Point b, int rotation) {
        this.a = a;
        this.b = b;
        c = new PointOnPlane(a.getX(), b.getY());
        d = new PointOnPlane(b.getX(), a.getY());
        this.rotation = rotation;
    }

    public Rectangle(Point a, Point b) {
        this(a, b, 0);
    }

    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public float getPerimeter() {
        return (a.distanceTo(c) +
                c.distanceTo(b) +
                b.distanceTo(d) +
                d.distanceTo(a));
    }

    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public float getArea() {
        return a.distanceTo(c) * d.distanceTo(a);
    }

    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public int getRotation() {
        return rotation;
    }

}
