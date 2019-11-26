package com.google.vr.sdk.base.sensors.internal;

public class Vector3d {
    public double x;
    public double y;
    public double z;

    public void set(double d, double d2, double d3) {
        this.x = d;
        this.y = d2;
        this.z = d3;
    }

    public void setZero() {
        this.z = 0.0d;
        this.y = 0.0d;
        this.x = 0.0d;
    }

    public void set(Vector3d vector3d) {
        this.x = vector3d.x;
        this.y = vector3d.y;
        this.z = vector3d.z;
    }

    public void scale(double d) {
        this.x *= d;
        this.y *= d;
        this.z *= d;
    }

    public double length() {
        double d = this.x;
        double d2 = this.y;
        double d3 = this.z;
        return Math.sqrt(((d * d) + (d2 * d2)) + (d3 * d3));
    }

    public static void add(Vector3d vector3d, Vector3d vector3d2, Vector3d vector3d3) {
        vector3d3.set(vector3d.x + vector3d2.x, vector3d.y + vector3d2.y, vector3d.z + vector3d2.z);
    }

    public static void sub(Vector3d vector3d, Vector3d vector3d2, Vector3d vector3d3) {
        vector3d3.set(vector3d.x - vector3d2.x, vector3d.y - vector3d2.y, vector3d.z - vector3d2.z);
    }

    public String toString() {
        return String.format("%+05f %+05f %+05f", new Object[]{Double.valueOf(this.x), Double.valueOf(this.y), Double.valueOf(this.z)});
    }
}
