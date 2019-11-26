package defpackage;

import java.nio.ByteBuffer;

/* renamed from: baoz */
public final class baoz extends anrc {
    public final void a(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
        i -= this.b.getInt(i);
        this.c = i;
        this.d = this.b.getShort(i);
    }

    public final int a() {
        int a = a(4);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public final int b() {
        int a = a(6);
        return a != 0 ? d(a) : 0;
    }

    public final ByteBuffer c() {
        return f(6);
    }

    public final int d() {
        int a = a(8);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public static int a(anqy anqy, int i, int i2, int i3) {
        anqy.b(3);
        anqy.a(2, i3);
        anqy.b(1, i2);
        anqy.a(0, i);
        return anqy.b();
    }
}
