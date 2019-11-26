package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: baoj */
public final class baoj extends anrc {
    public static baoj a(ByteBuffer byteBuffer) {
        baoj baoj = new baoj();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        baoj.a = i;
        baoj.b = byteBuffer;
        i -= baoj.b.getInt(i);
        baoj.c = i;
        baoj.d = baoj.b.getShort(i);
        return baoj;
    }

    public final float a() {
        int a = a(8);
        return a != 0 ? this.b.getFloat(a + this.a) : 0.0f;
    }

    public final boolean b() {
        int a = a(10);
        return (a == 0 || this.b.get(a + this.a) == (byte) 0) ? false : true;
    }
}
