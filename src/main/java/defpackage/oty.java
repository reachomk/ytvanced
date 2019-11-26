package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* renamed from: oty */
public abstract class oty implements oum {
    private final nzw[] a;
    private final long[] b;
    public final opx c;
    public final int d;
    public final int[] e;
    private int f;

    public oty(opx opx, int... iArr) {
        int length = iArr.length;
        oxz.b(length > 0);
        this.c = (opx) oxz.a((Object) opx);
        this.d = length;
        this.a = new nzw[length];
        for (length = 0; length < iArr.length; length++) {
            this.a[length] = opx.a(iArr[length]);
        }
        Arrays.sort(this.a, new otx());
        this.e = new int[this.d];
        int i = 0;
        while (true) {
            length = this.d;
            if (i < length) {
                int[] iArr2 = this.e;
                nzw nzw = this.a[i];
                int i2 = 0;
                while (true) {
                    nzw[] nzwArr = opx.b;
                    if (i2 < nzwArr.length) {
                        if (nzw == nzwArr[i2]) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                iArr2[i] = i2;
                i++;
            } else {
                this.b = new long[length];
                return;
            }
        }
    }

    public void a() {
    }

    public void a(float f) {
    }

    public void a(long j, long j2, long j3, List list) {
        throw null;
    }

    public final void e() {
    }

    public final void i() {
    }

    public final opx f() {
        return this.c;
    }

    public final int g() {
        return this.e.length;
    }

    public final nzw a(int i) {
        return this.a[i];
    }

    public final int b(int i) {
        return this.e[i];
    }

    public final int a(nzw nzw) {
        for (int i = 0; i < this.d; i++) {
            if (this.a[i] == nzw) {
                return i;
            }
        }
        return -1;
    }

    public final nzw h() {
        return this.a[b()];
    }

    public int a(long j, List list) {
        return list.size();
    }

    public final boolean a(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b = b(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.d) {
            if (b) {
                break;
            }
            b = (i2 == i || b(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!b) {
            return false;
        }
        long[] jArr = this.b;
        jArr[i] = Math.max(jArr[i], ozp.a(elapsedRealtime, j));
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(int i, long j) {
        return this.b[i] > j;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        i = (System.identityHashCode(this.c) * 31) + Arrays.hashCode(this.e);
        this.f = i;
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oty oty = (oty) obj;
            return this.c == oty.c && Arrays.equals(this.e, oty.e);
        }
    }
}
