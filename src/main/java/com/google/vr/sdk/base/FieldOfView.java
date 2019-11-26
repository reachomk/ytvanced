package com.google.vr.sdk.base;

import android.opengl.Matrix;

public class FieldOfView {
    public float bottom;
    public float left;
    public float right;
    public float top;

    public FieldOfView() {
        this.left = 60.0f;
        this.right = 60.0f;
        this.bottom = 60.0f;
        this.top = 60.0f;
    }

    public FieldOfView(float f, float f2, float f3, float f4) {
        setAngles(f, f2, f3, f4);
    }

    public FieldOfView(FieldOfView fieldOfView) {
        copy(fieldOfView);
    }

    public static FieldOfView parseFromProtobuf(float[] fArr) {
        return fArr.length == 4 ? new FieldOfView(fArr[0], fArr[1], fArr[2], fArr[3]) : null;
    }

    public float[] toProtobuf() {
        return new float[]{this.left, this.right, this.bottom, this.top};
    }

    public void copy(FieldOfView fieldOfView) {
        this.left = fieldOfView.left;
        this.right = fieldOfView.right;
        this.bottom = fieldOfView.bottom;
        this.top = fieldOfView.top;
    }

    public void setAngles(float f, float f2, float f3, float f4) {
        this.left = f;
        this.right = f2;
        this.bottom = f3;
        this.top = f4;
    }

    public float getLeft() {
        return this.left;
    }

    public float getRight() {
        return this.right;
    }

    public float getBottom() {
        return this.bottom;
    }

    public float getTop() {
        return this.top;
    }

    public void toPerspectiveMatrix(float f, float f2, float[] fArr, int i) {
        if (fArr.length >= 16) {
            Matrix.frustumM(fArr, 0, ((float) (-Math.tan(Math.toRadians((double) this.left)))) * 0.1f, ((float) Math.tan(Math.toRadians((double) this.right))) * 0.1f, ((float) (-Math.tan(Math.toRadians((double) this.bottom)))) * 0.1f, ((float) Math.tan(Math.toRadians((double) this.top))) * 0.1f, 0.1f, 20000.0f);
            return;
        }
        throw new IllegalArgumentException("Not enough space to write the result");
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof FieldOfView) {
            FieldOfView fieldOfView = (FieldOfView) obj;
            return this.left == fieldOfView.left && this.right == fieldOfView.right && this.bottom == fieldOfView.bottom && this.top == fieldOfView.top;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n");
        float f = this.left;
        StringBuilder stringBuilder2 = new StringBuilder(25);
        stringBuilder2.append("  left: ");
        stringBuilder2.append(f);
        String str = ",\n";
        stringBuilder2.append(str);
        stringBuilder.append(stringBuilder2.toString());
        float f2 = this.right;
        StringBuilder stringBuilder3 = new StringBuilder(26);
        stringBuilder3.append("  right: ");
        stringBuilder3.append(f2);
        stringBuilder3.append(str);
        stringBuilder.append(stringBuilder3.toString());
        f2 = this.bottom;
        stringBuilder3 = new StringBuilder(27);
        stringBuilder3.append("  bottom: ");
        stringBuilder3.append(f2);
        stringBuilder3.append(str);
        stringBuilder.append(stringBuilder3.toString());
        f2 = this.top;
        stringBuilder3 = new StringBuilder(24);
        stringBuilder3.append("  top: ");
        stringBuilder3.append(f2);
        stringBuilder3.append(str);
        stringBuilder.append(stringBuilder3.toString());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
