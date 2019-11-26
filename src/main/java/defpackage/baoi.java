package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: baoi */
public final class baoi extends anrc {
    public static baoi a(ByteBuffer byteBuffer, baoi baoi) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        baoi.a = i;
        baoi.b = byteBuffer;
        i -= baoi.b.getInt(i);
        baoi.c = i;
        baoi.d = baoi.b.getShort(i);
        return baoi;
    }

    public final String a() {
        int a = a(10);
        return a != 0 ? c(a + this.a) : null;
    }

    public final boolean b() {
        int a = a(14);
        return (a == 0 || this.b.get(a + this.a) == (byte) 0) ? false : true;
    }
}
