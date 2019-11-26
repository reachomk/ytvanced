package com.google.vr.sdk.base;

import android.util.DisplayMetrics;
import android.view.Display;
import com.google.vr.sdk.proto.Display$DisplayParams;
import defpackage.bafh;

public class ScreenParams {
    public float borderSizeMeters;
    public int height;
    public int width;
    public float xMetersPerPixel;
    public float yMetersPerPixel;

    public ScreenParams(Display display) {
        DisplayMetrics a = bafh.a(display);
        this.xMetersPerPixel = bafh.a(a.xdpi);
        this.yMetersPerPixel = bafh.a(a.ydpi);
        this.width = a.widthPixels;
        this.height = a.heightPixels;
        this.borderSizeMeters = bafh.a(null);
        int i = this.height;
        int i2 = this.width;
        if (i > i2) {
            this.width = i;
            this.height = i2;
            float f = this.xMetersPerPixel;
            this.xMetersPerPixel = this.yMetersPerPixel;
            this.yMetersPerPixel = f;
        }
    }

    public static ScreenParams fromProto(Display display, Display$DisplayParams display$DisplayParams) {
        if (display$DisplayParams == null) {
            return null;
        }
        ScreenParams screenParams = new ScreenParams(display);
        if (display$DisplayParams.hasXPpi()) {
            screenParams.xMetersPerPixel = bafh.a(display$DisplayParams.getXPpi());
        }
        if (display$DisplayParams.hasYPpi()) {
            screenParams.yMetersPerPixel = bafh.a(display$DisplayParams.getYPpi());
        }
        screenParams.borderSizeMeters = bafh.a(display$DisplayParams);
        return screenParams;
    }

    public ScreenParams(ScreenParams screenParams) {
        this.width = screenParams.width;
        this.height = screenParams.height;
        this.xMetersPerPixel = screenParams.xMetersPerPixel;
        this.yMetersPerPixel = screenParams.yMetersPerPixel;
        this.borderSizeMeters = screenParams.borderSizeMeters;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public float getWidthMeters() {
        return ((float) this.width) * this.xMetersPerPixel;
    }

    public float getHeightMeters() {
        return ((float) this.height) * this.yMetersPerPixel;
    }

    public float getBorderSizeMeters() {
        return this.borderSizeMeters;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof ScreenParams) {
            ScreenParams screenParams = (ScreenParams) obj;
            return this.width == screenParams.width && this.height == screenParams.height && this.xMetersPerPixel == screenParams.xMetersPerPixel && this.yMetersPerPixel == screenParams.yMetersPerPixel && this.borderSizeMeters == screenParams.borderSizeMeters;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n");
        int i = this.width;
        StringBuilder stringBuilder2 = new StringBuilder(22);
        stringBuilder2.append("  width: ");
        stringBuilder2.append(i);
        String str = ",\n";
        stringBuilder2.append(str);
        stringBuilder.append(stringBuilder2.toString());
        int i2 = this.height;
        StringBuilder stringBuilder3 = new StringBuilder(23);
        stringBuilder3.append("  height: ");
        stringBuilder3.append(i2);
        stringBuilder3.append(str);
        stringBuilder.append(stringBuilder3.toString());
        float f = this.xMetersPerPixel;
        stringBuilder3 = new StringBuilder(39);
        stringBuilder3.append("  x_meters_per_pixel: ");
        stringBuilder3.append(f);
        stringBuilder3.append(str);
        stringBuilder.append(stringBuilder3.toString());
        f = this.yMetersPerPixel;
        stringBuilder3 = new StringBuilder(39);
        stringBuilder3.append("  y_meters_per_pixel: ");
        stringBuilder3.append(f);
        stringBuilder3.append(str);
        stringBuilder.append(stringBuilder3.toString());
        f = this.borderSizeMeters;
        stringBuilder3 = new StringBuilder(39);
        stringBuilder3.append("  border_size_meters: ");
        stringBuilder3.append(f);
        stringBuilder3.append(str);
        stringBuilder.append(stringBuilder3.toString());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
