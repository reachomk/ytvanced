package defpackage;

import com.facebook.yoga.YogaEdge;

/* renamed from: cog */
public final class cog {
    private static final int[] a = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256};
    private final float[] b = new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    private int c = 0;
    private boolean d;

    public final boolean a(YogaEdge yogaEdge, float f) {
        float f2 = this.b[yogaEdge.j];
        boolean z = false;
        if (!(Float.isNaN(f2) || Float.isNaN(f)) ? Math.abs(f - f2) >= 1.0E-5f : !(Float.isNaN(f2) && Float.isNaN(f))) {
            return false;
        }
        int i;
        this.b[yogaEdge.j] = f;
        if (ddl.a(f)) {
            i = (a[yogaEdge.j] ^ -1) & this.c;
            this.c = i;
        } else {
            i = a[yogaEdge.j] | this.c;
            this.c = i;
        }
        if (!((i & a[YogaEdge.ALL.j]) == 0 && (this.c & a[YogaEdge.VERTICAL.j]) == 0 && (this.c & a[YogaEdge.HORIZONTAL.j]) == 0)) {
            z = true;
        }
        this.d = z;
        return true;
    }

    public final float a(YogaEdge yogaEdge) {
        float f = Float.NaN;
        if (!(yogaEdge == YogaEdge.START || yogaEdge == YogaEdge.END)) {
            f = 0.0f;
        }
        int i = this.c;
        if (i != 0) {
            int[] iArr = a;
            int i2 = yogaEdge.j;
            if ((i & iArr[i2]) != 0) {
                return this.b[i2];
            }
            if (this.d) {
                if (yogaEdge == YogaEdge.TOP || yogaEdge == YogaEdge.BOTTOM) {
                    yogaEdge = YogaEdge.VERTICAL;
                } else {
                    yogaEdge = YogaEdge.HORIZONTAL;
                }
                i = this.c;
                iArr = a;
                int i3 = yogaEdge.j;
                if ((i & iArr[i3]) != 0) {
                    return this.b[i3];
                }
                if ((this.c & a[YogaEdge.ALL.j]) != 0) {
                    return this.b[YogaEdge.ALL.j];
                }
            }
        }
        return f;
    }

    public final float b(YogaEdge yogaEdge) {
        return this.b[yogaEdge.j];
    }
}
