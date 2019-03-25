package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о точке на плоскости.
 * <p>
 * В выбранной системе координат любую точку двумерного евклидова пространства
 * можно представить как упорядоченную пару (x; y) действительных чисел.
 * <ol>
 * <li>x - Абсцисса точки;
 * <li>y - Ордината точки;
 * </ol>
 */

public class PointOnPlane implements Point {
    private final float x;
    private final float y;

    public PointOnPlane(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public float getX() {
        return x;
    }

    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public float getY() {
        return y;
    }

    /**
     * {@inheritDoc}
     *
     * @param other
     * @return
     */
    @Override
    public float distanceTo(Point other) {
        float a = this.x - other.getX();
        float b = this.y - other.getY();
        return (float) Math.sqrt(a * a + b * b);
    }
}
