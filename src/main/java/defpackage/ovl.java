package defpackage;

import java.util.Arrays;

/* renamed from: ovl */
public final class ovl implements ouw {
    private final boolean a;
    private final int b;
    private final out[] c;
    private int d;
    private int e;
    private int f;
    private out[] g;

    public ovl(boolean z, int i) {
        oxz.a(i > 0);
        oxz.a(true);
        this.a = z;
        this.b = i;
        this.f = 0;
        this.g = new out[100];
        this.c = new out[1];
    }

    public final synchronized void d() {
        if (this.a) {
            a(0);
        }
    }

    public final synchronized void a(int i) {
        int i2 = this.d;
        this.d = i;
        if (i < i2) {
            b();
        }
    }

    public final synchronized out a() {
        out out;
        this.e++;
        int i = this.f;
        if (i > 0) {
            out[] outArr = this.g;
            i--;
            this.f = i;
            out = outArr[i];
            outArr[i] = null;
        } else {
            out = new out(new byte[this.b]);
        }
        return out;
    }

    public final synchronized void a(out out) {
        out[] outArr = this.c;
        outArr[0] = out;
        a(outArr);
    }

    public final synchronized void a(out[] outArr) {
        int i = this.f;
        int length = outArr.length;
        i += length;
        out[] outArr2 = this.g;
        int length2 = outArr2.length;
        int i2 = 0;
        if (i >= length2) {
            this.g = (out[]) Arrays.copyOf(outArr2, Math.max(length2 + length2, i));
        }
        while (i2 < length) {
            out out = outArr[i2];
            outArr2 = this.g;
            length2 = this.f;
            this.f = length2 + 1;
            outArr2[length2] = out;
            i2++;
        }
        this.e -= outArr.length;
        notifyAll();
    }

    public final synchronized void b() {
        int max = Math.max(0, ozp.a(this.d, this.b) - this.e);
        int i = this.f;
        if (max < i) {
            Arrays.fill(this.g, max, i, null);
            this.f = max;
        }
    }

    public final synchronized int e() {
        return this.e * this.b;
    }

    public final int c() {
        return this.b;
    }
}
