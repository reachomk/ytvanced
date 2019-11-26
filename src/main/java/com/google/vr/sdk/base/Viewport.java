package com.google.vr.sdk.base;

import android.opengl.GLES20;

public class Viewport {
    public int height;
    public int width;
    public int x;
    public int y;

    public void setViewport(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }

    public void setGLViewport() {
        GLES20.glViewport(this.x, this.y, this.width, this.height);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n");
        int i = this.x;
        StringBuilder stringBuilder2 = new StringBuilder(18);
        stringBuilder2.append("  x: ");
        stringBuilder2.append(i);
        String str = ",\n";
        stringBuilder2.append(str);
        stringBuilder.append(stringBuilder2.toString());
        int i2 = this.y;
        StringBuilder stringBuilder3 = new StringBuilder(18);
        stringBuilder3.append("  y: ");
        stringBuilder3.append(i2);
        stringBuilder3.append(str);
        stringBuilder.append(stringBuilder3.toString());
        i2 = this.width;
        StringBuilder stringBuilder4 = new StringBuilder(22);
        stringBuilder4.append("  width: ");
        stringBuilder4.append(i2);
        stringBuilder4.append(str);
        stringBuilder.append(stringBuilder4.toString());
        i2 = this.height;
        stringBuilder4 = new StringBuilder(23);
        stringBuilder4.append("  height: ");
        stringBuilder4.append(i2);
        stringBuilder4.append(str);
        stringBuilder.append(stringBuilder4.toString());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Viewport) {
            Viewport viewport = (Viewport) obj;
            return this.x == viewport.x && this.y == viewport.y && this.width == viewport.width && this.height == viewport.height;
        }
    }

    public int hashCode() {
        return ((Integer.valueOf(this.x).hashCode() ^ Integer.valueOf(this.y).hashCode()) ^ Integer.valueOf(this.width).hashCode()) ^ Integer.valueOf(this.height).hashCode();
    }
}
