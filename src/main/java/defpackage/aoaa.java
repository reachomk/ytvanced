package defpackage;

import java.io.InputStream;

/* renamed from: aoaa */
final class aoaa extends InputStream {
    private anzx a;
    private anwb b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final /* synthetic */ anzw g;

    public aoaa(anzw anzw) {
        this.g = anzw;
        a();
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException();
        } else if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
            return a(bArr, i, i2);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public final long skip(long j) {
        if (j >= 0) {
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return (long) a(null, 0, (int) j);
        }
        throw new IndexOutOfBoundsException();
    }

    private final int a(byte[] bArr, int i, int i2) {
        int i3 = i;
        i = i2;
        while (i > 0) {
            b();
            if (this.b != null) {
                int min = Math.min(this.c - this.d, i);
                if (bArr != null) {
                    this.b.a(bArr, this.d, i3, min);
                    i3 += min;
                }
                this.d += min;
                i -= min;
            } else {
                if (i == i2) {
                    return -1;
                }
                return i2 - i;
            }
        }
        return i2 - i;
    }

    public final int read() {
        b();
        anwb anwb = this.b;
        if (anwb == null) {
            return -1;
        }
        int i = this.d;
        this.d = i + 1;
        return anwb.a(i) & 255;
    }

    public final int available() {
        return this.g.d - (this.e + this.d);
    }

    public final void mark(int i) {
        this.f = this.e + this.d;
    }

    public final synchronized void reset() {
        a();
        a(null, 0, this.f);
    }

    private final void a() {
        this.a = new anzx(this.g);
        this.b = (anwb) this.a.next();
        this.c = this.b.b();
        this.d = 0;
        this.e = 0;
    }

    private final void b() {
        if (this.b != null) {
            int i = this.d;
            int i2 = this.c;
            if (i == i2) {
                this.e += i2;
                this.d = 0;
                if (this.a.hasNext()) {
                    this.b = (anwb) this.a.next();
                    this.c = this.b.b();
                    return;
                }
                this.b = null;
                this.c = 0;
            }
        }
    }
}
