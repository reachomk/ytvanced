package defpackage;

import java.nio.ByteBuffer;

/* renamed from: baoh */
public final class baoh extends anrc {
    public final void a(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
        i -= this.b.getInt(i);
        this.c = i;
        this.d = this.b.getShort(i);
    }

    public final String a() {
        int a = a(4);
        return a != 0 ? c(a + this.a) : null;
    }

    public final float b() {
        int a = a(6);
        return a != 0 ? this.b.getFloat(a + this.a) : 0.0f;
    }

    public final int c() {
        int a = a(8);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public final int d() {
        int a = a(10);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public final baop g(int i) {
        baop baop = new baop();
        int a = a(12);
        if (a == 0) {
            return null;
        }
        i = b(e(a) + (i << 2));
        ByteBuffer byteBuffer = this.b;
        baop.a = i;
        baop.b = byteBuffer;
        i -= baop.b.getInt(i);
        baop.c = i;
        baop.d = baop.b.getShort(i);
        return baop;
    }

    public final int e() {
        int a = a(12);
        return a != 0 ? d(a) : 0;
    }

    public final bapn h(int i) {
        bapn bapn = new bapn();
        int a = a(14);
        if (a == 0) {
            return null;
        }
        i = b(e(a) + (i << 2));
        ByteBuffer byteBuffer = this.b;
        bapn.a = i;
        bapn.b = byteBuffer;
        i -= bapn.b.getInt(i);
        bapn.c = i;
        bapn.d = bapn.b.getShort(i);
        return bapn;
    }

    public final int f() {
        int a = a(14);
        return a != 0 ? d(a) : 0;
    }

    public final boolean g() {
        int a = a(16);
        return (a == 0 || this.b.get(a + this.a) == (byte) 0) ? false : true;
    }

    public static int a(anqy anqy, int i, float f, int i2, int i3, int i4, int i5, boolean z) {
        anqy.b(7);
        anqy.b(5, i5);
        anqy.b(4, i4);
        anqy.a(3, i3);
        anqy.a(2, i2);
        anqy.a(1, f);
        anqy.b(0, i);
        anqy.a(6, z);
        return anqy.b();
    }
}
