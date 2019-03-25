package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon {

    private final Point a;
    private final Point b;
    private final Point c;
    private final int rotation;

    public Triangle(Point a, Point b, Point c, int rotation) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.rotation = rotation;
    }

    public Triangle(Point a, Point b, Point c) {
        this(a, b, c, 0);
    }

    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public float getPerimeter() {
        return a.distanceTo(b) + b.distanceTo(c) + c.distanceTo(a);
    }

    /**
     * {@inheritDoc}
     * Площадь вычисляется по формуле Герона
     *
     * @return
     */
    @Override
    public float getArea() {
        float halfPerimeter = getPerimeter() / 2;
        return (float) Math.sqrt(halfPerimeter *
                (halfPerimeter - a.distanceTo(b)) *
                (halfPerimeter - b.distanceTo(c)) *
                (halfPerimeter - c.distanceTo(a)));
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
