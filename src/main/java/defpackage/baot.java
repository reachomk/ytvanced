package defpackage;

import java.nio.ByteBuffer;

/* renamed from: baot */
public final class baot extends anrc {
    public final void a(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
        i -= this.b.getInt(i);
        this.c = i;
        this.d = this.b.getShort(i);
    }

    public final baou a() {
        return a(new baou());
    }

    public final baou a(baou baou) {
        int a = a(4);
        if (a == 0) {
            return null;
        }
        baou.a(a + this.a, this.b);
        return baou;
    }

    public final baou b() {
        return b(new baou());
    }

    public final baou b(baou baou) {
        int a = a(6);
        if (a == 0) {
            return null;
        }
        baou.a(a + this.a, this.b);
        return baou;
    }

    public final baou c() {
        return c(new baou());
    }

    public final baou c(baou baou) {
        int a = a(8);
        if (a == 0) {
            return null;
        }
        baou.a(a + this.a, this.b);
        return baou;
    }

    public final baou d() {
        return d(new baou());
    }

    public final baou d(baou baou) {
        int a = a(10);
        if (a == 0) {
            return null;
        }
        baou.a(a + this.a, this.b);
        return baou;
    }

    public final baou e() {
        return e(new baou());
    }

    public final baou e(baou baou) {
        int a = a(16);
        if (a == 0) {
            return null;
        }
        baou.a(a + this.a, this.b);
        return baou;
    }

    public final baou f() {
        return f(new baou());
    }

    public final baou f(baou baou) {
        int a = a(18);
        if (a == 0) {
            return null;
        }
        baou.a(a + this.a, this.b);
        return baou;
    }
}
