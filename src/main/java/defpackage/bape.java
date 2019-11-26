package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bape */
public final class bape extends anrc {
    public final String a() {
        int a = a(4);
        return a != 0 ? c(a + this.a) : null;
    }

    public final baol b() {
        baol baol = new baol();
        int a = a(8);
        if (a == 0) {
            return null;
        }
        a = b(a + this.a);
        ByteBuffer byteBuffer = this.b;
        baol.a = a;
        baol.b = byteBuffer;
        a -= baol.b.getInt(a);
        baol.c = a;
        baol.d = baol.b.getShort(a);
        return baol;
    }

    public final long c() {
        int a = a(10);
        return a != 0 ? ((long) this.b.getInt(a + this.a)) & 4294967295L : 0;
    }

    public final long d() {
        int a = a(12);
        return a != 0 ? ((long) this.b.getInt(a + this.a)) & 4294967295L : 0;
    }
}
