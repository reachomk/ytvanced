package defpackage;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: bds */
public final class bds {
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private boolean f;
    private int g;
    private int h;
    private float[] i;

    public bds(int i, int i2) {
        this.c = Color.red(i);
        this.d = Color.green(i);
        this.e = Color.blue(i);
        this.a = i;
        this.b = i2;
    }

    public final float[] a() {
        if (this.i == null) {
            this.i = new float[3];
        }
        sc.a(this.c, this.d, this.e, this.i);
        return this.i;
    }

    public final int b() {
        d();
        return this.g;
    }

    public final int c() {
        d();
        return this.h;
    }

    private final void d() {
        if (!this.f) {
            int a = sc.a(-1, this.a, 4.5f);
            int a2 = sc.a(-1, this.a, 3.0f);
            if (a == -1 || a2 == -1) {
                int a3 = sc.a(-16777216, this.a, 4.5f);
                int a4 = sc.a(-16777216, this.a, 3.0f);
                if (a3 == -1 || a4 == -1) {
                    if (a != -1) {
                        a = sc.c(-1, a);
                    } else {
                        a = sc.c(-16777216, a3);
                    }
                    this.h = a;
                    if (a2 != -1) {
                        a = sc.c(-1, a2);
                    } else {
                        a = sc.c(-16777216, a4);
                    }
                    this.g = a;
                    this.f = true;
                } else {
                    this.h = sc.c(-16777216, a3);
                    this.g = sc.c(-16777216, a4);
                    this.f = true;
                    return;
                }
            }
            this.h = sc.c(-1, a);
            this.g = sc.c(-1, a2);
            this.f = true;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(getClass().getSimpleName());
        stringBuilder.append(" [RGB: #");
        stringBuilder.append(Integer.toHexString(this.a));
        stringBuilder.append("] [HSL: ");
        stringBuilder.append(Arrays.toString(a()));
        stringBuilder.append("] [Population: ");
        stringBuilder.append(this.b);
        stringBuilder.append("] [Title Text: #");
        stringBuilder.append(Integer.toHexString(b()));
        stringBuilder.append("] [Body Text: #");
        stringBuilder.append(Integer.toHexString(c()));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bds bds = (bds) obj;
            return this.b == bds.b && this.a == bds.a;
        }
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
