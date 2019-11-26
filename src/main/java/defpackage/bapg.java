package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bapg */
public final class bapg extends anrc {
    public static bapg a(ByteBuffer byteBuffer) {
        return bapg.a(byteBuffer, new bapg());
    }

    public static bapg a(ByteBuffer byteBuffer, bapg bapg) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        bapg.a = i;
        bapg.b = byteBuffer;
        i -= bapg.b.getInt(i);
        bapg.c = i;
        bapg.d = bapg.b.getShort(i);
        return bapg;
    }

    public final baot a(baot baot) {
        int a = a(20);
        if (a == 0) {
            return null;
        }
        baot.a(b(a + this.a), this.b);
        return baot;
    }

    public final int a() {
        int a = a(22);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public final int b() {
        int a = a(26);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }

    public final baou c() {
        baou baou = new baou();
        int a = a(32);
        if (a == 0) {
            return null;
        }
        baou.a(a + this.a, this.b);
        return baou;
    }
}
