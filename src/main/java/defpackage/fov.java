package defpackage;

import android.graphics.Color;

/* renamed from: fov */
public final class fov {
    public static foy a(bdm bdm, int i, int i2, int i3, int i4, int i5, int i6) {
        i5 = (int) (((float) (i5 * i6)) * 0.015f);
        if (bdm != null) {
            foy a = fox.a(bdm.a(bdr.b), i5, i, i2, i4);
            foy a2 = fox.a(bdm.a(bdr.e), i5, i, i2, i4);
            foy foy = !a.c ? a2.c ? a2 : null : a;
            if (foy != null) {
                return foy;
            }
            boolean z = a.a;
            foy foy2 = (z && a2.a) ? ((float) a.b) * 2.5f >= ((float) a2.b) ? a : a2 : null;
            if (foy2 != null) {
                return foy2;
            }
            if (z) {
                a2 = a;
            } else if (!a2.a) {
                a2 = null;
            }
            if (a2 != null) {
                return a2;
            }
        }
        return new foy(fov.a(i), i, i3, i2);
    }

    static int a(int i) {
        int alpha = Color.alpha(i);
        float max = Math.max(0.0f, Math.min(1.0f, 0.1f));
        if (max == 0.0f) {
            return i;
        }
        if (max == 1.0f) {
            return xnq.a(-16777216, alpha);
        }
        int round;
        int round2;
        int round3;
        float[] fArr = new float[3];
        float red = ((float) Color.red(i)) / 255.0f;
        float green = ((float) Color.green(i)) / 255.0f;
        float blue = ((float) Color.blue(i)) / 255.0f;
        float max2 = Math.max(red, Math.max(green, blue));
        float min = Math.min(red, Math.min(green, blue));
        float f = max2 - min;
        float f2 = (max2 + min) / 2.0f;
        if (max2 == min) {
            blue = 0.0f;
            red = 0.0f;
        } else {
            blue = max2 == red ? ((green - blue) / f) % 6.0f : max2 != green ? ((red - green) / f) + 4.0f : ((blue - red) / f) + 2.0f;
            red = f / (1.0f - Math.abs((f2 + f2) - 4.0f));
        }
        fArr[0] = (blue * 60.0f) % 360.0f;
        fArr[1] = red;
        fArr[2] = f2;
        max = Math.max(0.0f, Math.min(1.0f, f2 - max));
        fArr[2] = max;
        float f3 = fArr[0];
        float abs = (1.0f - Math.abs((max + max) - 4.0f)) * fArr[1];
        max -= 0.5f * abs;
        float abs2 = (1.0f - Math.abs(((f3 / 60.0f) % 2.0f) - 4.0f)) * abs;
        switch (((int) f3) / 60) {
            case 0:
                i = Math.round((abs + max) * 255.0f);
                round = Math.round((abs2 + max) * 255.0f);
                round2 = Math.round(max * 255.0f);
                break;
            case 1:
                i = Math.round((abs2 + max) * 255.0f);
                round = Math.round((abs + max) * 255.0f);
                round2 = Math.round(max * 255.0f);
                break;
            case 2:
                i = Math.round(max * 255.0f);
                round3 = Math.round((abs + max) * 255.0f);
                round = Math.round((abs2 + max) * 255.0f);
                break;
            case 3:
                i = Math.round(max * 255.0f);
                round = Math.round((abs2 + max) * 255.0f);
                round2 = Math.round((abs + max) * 255.0f);
                break;
            case 4:
                i = Math.round((abs2 + max) * 255.0f);
                round = Math.round(max * 255.0f);
                round2 = Math.round((abs + max) * 255.0f);
                break;
            case 5:
            case 6:
                i = Math.round((abs + max) * 255.0f);
                round3 = Math.round(max * 255.0f);
                round = Math.round((abs2 + max) * 255.0f);
                break;
            default:
                i = 0;
                round = 0;
                round2 = 0;
                break;
        }
        round2 = round;
        round = round3;
        return Color.argb(alpha, Math.max(0, Math.min(255, i)), Math.max(0, Math.min(255, round)), Math.max(0, Math.min(255, round2)));
    }
}
