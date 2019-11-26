package defpackage;

import java.io.OutputStream;

/* renamed from: anwp */
final class anwp extends anwl {
    private final OutputStream h;

    anwp(OutputStream outputStream, int i) {
        super(i);
        if (outputStream != null) {
            this.h = outputStream;
            return;
        }
        throw new NullPointerException("out");
    }

    public final void b(int i, int i2) {
        e(aobj.a(i, i2));
    }

    public final void c(int i, int i2) {
        t(20);
        a(i, 0);
        if (i2 < 0) {
            a((long) i2);
        } else {
            a(i2);
        }
    }

    public final void d(int i, int i2) {
        t(20);
        a(i, 0);
        a(i2);
    }

    public final void f(int i, int i2) {
        t(14);
        a(i, 5);
        b(i2);
    }

    public final void a(int i, long j) {
        t(20);
        a(i, 0);
        a(j);
    }

    public final void c(int i, long j) {
        t(18);
        a(i, 1);
        b(j);
    }

    public final void a(int i, boolean z) {
        t(11);
        a(i, 0);
        a((byte) z);
    }

    public final void a(int i, String str) {
        b(i, 2);
        a(str);
    }

    public final void a(int i, anvu anvu) {
        b(i, 2);
        a(anvu);
    }

    public final void a(int i, byte[] bArr) {
        int length = bArr.length;
        b(i, 2);
        a(bArr, length);
    }

    public final void a(anvu anvu) {
        e(anvu.b());
        anvu.a((anvr) this);
    }

    public final void a(byte[] bArr, int i) {
        e(i);
        c(bArr, 0, i);
    }

    public final void a(int i, anze anze) {
        b(i, 2);
        a(anze);
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, anze anze, anzz anzz) {
        b(i, 2);
        e(((anvf) anze).getSerializedSize(anzz));
        anzz.a((Object) anze, this.f);
    }

    public final void b(int i, anze anze) {
        b(1, 3);
        d(2, i);
        a(3, anze);
        b(1, 4);
    }

    public final void b(int i, anvu anvu) {
        b(1, 3);
        d(2, i);
        a(3, anvu);
        b(1, 4);
    }

    public final void a(anze anze) {
        e(anze.getSerializedSize());
        anze.writeTo((anwm) this);
    }

    public final void b(byte b) {
        if (this.c == this.b) {
            k();
        }
        a(b);
    }

    public final void d(int i) {
        if (i < 0) {
            c((long) i);
        } else {
            e(i);
        }
    }

    public final void e(int i) {
        t(5);
        a(i);
    }

    public final void g(int i) {
        t(4);
        b(i);
    }

    public final void c(long j) {
        t(10);
        a(j);
    }

    public final void e(long j) {
        t(8);
        b(j);
    }

    public final void a(String str) {
        int i;
        try {
            int length = str.length() * 3;
            int q = anwm.q(length);
            i = q + length;
            int i2 = this.b;
            if (i > i2) {
                byte[] bArr = new byte[length];
                length = aobd.a(str, bArr, 0, length);
                e(length);
                c(bArr, 0, length);
                return;
            }
            if (i > i2 - this.c) {
                k();
            }
            length = anwm.q(str.length());
            i = this.c;
            if (length == q) {
                q = i + length;
                this.c = q;
                q = aobd.a(str, this.a, q, this.b - q);
                this.c = i;
                i2 = (q - i) - length;
                a(i2);
                this.c = q;
            } else {
                i2 = aobd.a((CharSequence) str);
                a(i2);
                this.c = aobd.a(str, this.a, this.c, i2);
            }
            this.d += i2;
        } catch (aobh e) {
            this.d -= this.c - i;
            this.c = i;
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw new anwq(e2);
        } catch (aobh e3) {
            a(str, e3);
        }
    }

    public final void i() {
        if (this.c > 0) {
            k();
        }
    }

    public final void c(byte[] bArr, int i, int i2) {
        int i3 = this.b;
        int i4 = this.c;
        i3 -= i4;
        if (i3 >= i2) {
            System.arraycopy(bArr, i, this.a, i4, i2);
            this.c += i2;
            this.d += i2;
            return;
        }
        System.arraycopy(bArr, i, this.a, i4, i3);
        i += i3;
        i2 -= i3;
        this.c = this.b;
        this.d += i3;
        k();
        if (i2 <= this.b) {
            System.arraycopy(bArr, i, this.a, 0, i2);
            this.c = i2;
        } else {
            this.h.write(bArr, i, i2);
        }
        this.d += i2;
    }

    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    private final void t(int i) {
        if (this.b - this.c < i) {
            k();
        }
    }

    private final void k() {
        this.h.write(this.a, 0, this.c);
        this.c = 0;
    }
}
