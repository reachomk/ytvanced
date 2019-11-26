package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bapq */
public final class bapq extends anrc {
    public static bapq a(ByteBuffer byteBuffer) {
        bapq bapq = new bapq();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position();
        bapq.a = i;
        bapq.b = byteBuffer;
        i -= bapq.b.getInt(i);
        bapq.c = i;
        bapq.d = bapq.b.getShort(i);
        return bapq;
    }

    public final baoh a() {
        baoh baoh = new baoh();
        int a = a(4);
        if (a == 0) {
            return null;
        }
        baoh.a(b(a + this.a), this.b);
        return baoh;
    }

    public final long b() {
        int a = a(6);
        return a != 0 ? ((long) this.b.getInt(a + this.a)) & 4294967295L : 0;
    }

    public final baoh c() {
        baoh baoh = new baoh();
        int a = a(8);
        if (a == 0) {
            return null;
        }
        baoh.a(b(a + this.a), this.b);
        return baoh;
    }

    public static int a(anqy anqy, int i, long j, int i2, int i3) {
        anqy.b(4);
        anqy.b(3, i3);
        anqy.b(2, i2);
        anqy.a(1, (int) j);
        anqy.b(0, i);
        return anqy.b();
    }
}
