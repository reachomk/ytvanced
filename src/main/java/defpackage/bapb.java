package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bapb */
public final class bapb extends anrc {
    public final void a(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
        i -= this.b.getInt(i);
        this.c = i;
        this.d = this.b.getShort(i);
    }

    public final bape g(int i) {
        bape bape = new bape();
        int a = a(4);
        if (a == 0) {
            return null;
        }
        i = b(e(a) + (i << 2));
        ByteBuffer byteBuffer = this.b;
        bape.a = i;
        bape.b = byteBuffer;
        i -= bape.b.getInt(i);
        bape.c = i;
        bape.d = bape.b.getShort(i);
        return bape;
    }

    public final int a() {
        int a = a(4);
        return a != 0 ? d(a) : 0;
    }

    public final int b() {
        int a = a(6);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public final baoz a(baoz baoz) {
        int a = a(8);
        if (a == 0) {
            return null;
        }
        baoz.a(b(a + this.a), this.b);
        return baoz;
    }
}
