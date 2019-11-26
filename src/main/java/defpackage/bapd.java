package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bapd */
public final class bapd extends anrc {
    public static bapd a(ByteBuffer byteBuffer) {
        bapd bapd = new bapd();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        bapd.a = i;
        bapd.b = byteBuffer;
        i -= bapd.b.getInt(i);
        bapd.c = i;
        bapd.d = bapd.b.getShort(i);
        return bapd;
    }

    public final bapb a() {
        bapb bapb = new bapb();
        int a = a(4);
        if (a == 0) {
            return null;
        }
        bapb.a(b(a + this.a), this.b);
        return bapb;
    }

    public final bapb b() {
        return a(new bapb());
    }

    public final bapb a(bapb bapb) {
        int a = a(6);
        if (a == 0) {
            return null;
        }
        bapb.a(b(a + this.a), this.b);
        return bapb;
    }

    public final bapb c() {
        bapb bapb = new bapb();
        int a = a(8);
        if (a == 0) {
            return null;
        }
        bapb.a(b(a + this.a), this.b);
        return bapb;
    }

    public final int d() {
        int a = a(10);
        return a != 0 ? this.b.getInt(a + this.a) : 0;
    }
}
