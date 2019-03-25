package ru.avalon.java.dev.j10.labs.shapes;

import java.lang.Math;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse {

    private final float radius;

    /**
     * Создаем окружность через ее радиус.
     *
     * @param radius
     */
    public Circle(float radius) {
        this.radius = radius;
    }

    /**
     * Создаем окружность через ее радиус.
     * Радиус задаем двумя точками:
     * центром окружности (center) и любой из точек на окружности (any)
     *
     * @param center
     * @param any
     */
    public Circle(Point center, Point any) {
        radius = center.distanceTo(any);
    }

    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public float getLength() {
        return (float) (2 * radius * Math.PI);
    }

    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public float getArea() {
        return (float) (radius * radius * Math.PI);
    }
}
