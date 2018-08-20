package me.mrCookieSlime.Slimefun.Objects.SlimefunItem.container;

/**
 * @author Narcissu14
 */
public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public static double getDistance(Vector3D point1, Vector3D point2) {
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY() - point2.getY(), 2) + Math.pow(point1.getZ() - point2.getZ(), 2));
    }

    public static Vector3D getInnerCircleCenter(Vector3D point1, Vector3D point2, Vector3D point3) {
        double a = getDistance(point2, point3);
        double b = getDistance(point1, point3);
        double c = getDistance(point1, point2);
        double x = (a*point1.getX() + b*point2.getX() + b*point3.getX()) / (a + b + c);
        double y = (a*point1.getY() + b*point2.getY() + b*point3.getY()) / (a + b + c);
        double z = (a*point1.getZ() + b*point2.getZ() + b*point3.getZ()) / (a + b + c);
        return new Vector3D(x, y, z);
    }
}
