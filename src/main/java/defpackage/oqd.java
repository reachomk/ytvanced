package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: oqd */
public final class oqd {
    public final int a = -1;
    public final int[] b;
    public final long[] c;
    private final Uri[] d;

    public oqd() {
        int[] iArr = new int[0];
        Uri[] uriArr = new Uri[0];
        long[] jArr = new long[0];
        oxz.a(true);
        this.b = iArr;
        this.d = uriArr;
        this.c = jArr;
    }

    public final int a() {
        return a(-1);
    }

    public final int a(int i) {
        i++;
        while (true) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                break;
            }
            int i2 = iArr[i];
            if (i2 == 0 || i2 == 1) {
                break;
            }
            i++;
        }
        return i;
    }

    public final boolean b() {
        return this.a == -1 || a() < this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oqd oqd = (oqd) obj;
            return this.a == oqd.a && Arrays.equals(this.d, oqd.d) && Arrays.equals(this.b, oqd.b) && Arrays.equals(this.c, oqd.c);
        }
    }

    public final int hashCode() {
        return (((((this.a * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }
}
