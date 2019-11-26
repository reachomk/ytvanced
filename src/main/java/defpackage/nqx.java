package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* renamed from: nqx */
public final class nqx implements nrb {
    public final byte[] a = new byte[4096];
    public final long b;
    public long c;
    private final nvo d;
    private byte[] e = new byte[8192];
    private int f;
    private int g;

    public nqx(nvo nvo, long j, long j2) {
        this.d = nvo;
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

    private final boolean a(int i, boolean z) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        int length = bArr.length;
        if (i2 > length) {
            this.e = Arrays.copyOf(bArr, Math.max(length + length, i2));
        }
        int min = Math.min(this.g - this.f, i);
        while (min < i) {
            min = a(this.e, this.f, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int i3 = this.f + i;
        this.f = i3;
        this.g = Math.max(this.g, i3);
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
        byte[] bArr = this.e;
        System.arraycopy(bArr, i, bArr, 0, i2);
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
