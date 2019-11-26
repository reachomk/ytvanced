package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bapj */
public final class bapj extends anrc {
    public final baph a() {
        baph baph = new baph();
        int a = a(6);
        if (a == 0) {
            return null;
        }
        int i = this.a;
        ByteBuffer byteBuffer = this.b;
        baph.a = a + i;
        baph.b = byteBuffer;
        return baph;
    }

    public final bapm b() {
        bapm bapm = new bapm();
        int a = a(8);
        if (a == 0) {
            return null;
        }
        int i = this.a;
        ByteBuffer byteBuffer = this.b;
        bapm.a = a + i;
        bapm.b = byteBuffer;
        return bapm;
    }

    public final baoz c() {
        baoz baoz = new baoz();
        int a = a(14);
        if (a == 0) {
            return null;
        }
        baoz.a(b(a + this.a), this.b);
        return baoz;
    }
}
