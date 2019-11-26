package defpackage;

import android.graphics.PathEffect;
import java.util.Arrays;

/* renamed from: cvm */
public final class cvm {
    public float a;
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PathEffect i;
    public float[] j;

    cvm() {
    }

    public final int hashCode() {
        int i = ((((((((((((((((int) this.a) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
        PathEffect pathEffect = this.i;
        return ((i + (pathEffect != null ? pathEffect.hashCode() : 0)) * 31) + Arrays.hashCode(this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cvm cvm = (cvm) obj;
            return cvm.a == this.a && cvm.b == this.b && cvm.c == this.c && cvm.d == this.d && this.e == cvm.e && this.f == cvm.f && this.g == cvm.g && this.h == cvm.h && clx.a(this.i, cvm.i) && Arrays.equals(this.j, cvm.j);
        }
    }
}
