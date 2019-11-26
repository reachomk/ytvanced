package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* renamed from: ofl */
public final class ofl implements ofp {
    public final byte[] a = new byte[4096];
    public final long b;
    public long c;
    private final ovi d;
    private byte[] e = new byte[65536];
    private int f;
    private int g;

    public ofl(ovi ovi, long j, long j2) {
        this.d = ovi;
        this.c = j;
        this.b = j2;
    }

    public final int a(byte[] bArr, int i, int i2) {
        int d = d(bArr, i, i2);
        if (d == 0) {
            d = a(bArr, i, i2, 0, true);
        }
        d(d);
        return d;
    }

    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        int d = d(bArr, i, i2);
        while (d < i2 && d != -1) {
            d = a(bArr, i, i2, d, z);
        }
        d(d);
        return d != -1;
    }

    public final void b(byte[] bArr, int i, int i2) {
        a(bArr, i, i2, false);
    }

    public final void a(int i) {
        int c = c(i);
        while (c < i && c != -1) {
            c = a(this.a, -c, Math.min(i, this.a.length + c), c, false);
        }
        d(c);
    }

    public final boolean b(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    public final void c(byte[] bArr, int i, int i2) {
        b(bArr, i, i2, false);
    }

    public final boolean a(int i, boolean z) {
        int i2 = this.f + i;
        int length = this.e.length;
        if (i2 > length) {
            this.e = Arrays.copyOf(this.e, ozp.a(length + length, 65536 + i2, i2 + 524288));
        }
        int i3 = this.g - this.f;
        while (i3 < i) {
            i3 = a(this.e, this.f, i, i3, z);
            if (i3 == -1) {
                return false;
            }
            this.g = this.f + i3;
        }
        this.f += i;
        return true;
    }

    public final void b(int i) {
        a(i, false);
    }

    public final void a() {
        this.f = 0;
    }

    public final long b() {
        return this.c + ((long) this.f);
    }

    public final int c(int i) {
        i = Math.min(this.g, i);
        e(i);
        return i;
    }

    private final int d(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        i2 = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, i2);
        e(i2);
        return i2;
    }

    private final void e(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        Object obj = this.e;
        Object obj2 = i2 < obj.length + -524288 ? new byte[(65536 + i2)] : obj;
        System.arraycopy(obj, i, obj2, 0, i2);
        this.e = obj2;
    }

    public final int a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int a = this.d.a(bArr, i + i3, i2 - i3);
        if (a != -1) {
            return i3 + a;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void d(int i) {
        if (i != -1) {
            this.c += (long) i;
        }
    }
}
