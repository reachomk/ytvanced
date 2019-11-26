package defpackage;

import java.nio.ByteBuffer;

/* renamed from: baos */
public final class baos extends anrc {
    public final ByteBuffer a() {
        return f(6);
    }

    public final bapl b() {
        bapl bapl = new bapl();
        int a = a(8);
        if (a == 0) {
            return null;
        }
        a = b(a + this.a);
        ByteBuffer byteBuffer = this.b;
        bapl.a = a;
        bapl.b = byteBuffer;
        a -= bapl.b.getInt(a);
        bapl.c = a;
        bapl.d = bapl.b.getShort(a);
        return bapl;
    }

    public final int c() {
        int a = a(10);
        return a != 0 ? d(a) : 0;
    }

    public final ByteBuffer d() {
        return f(10);
    }

    public final bapc e() {
        bapc bapc = new bapc();
        int a = a(12);
        if (a == 0) {
            return null;
        }
        bapc.a(b(a + this.a), this.b);
        return bapc;
    }
}
