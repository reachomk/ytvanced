package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: baov */
public final class baov extends anrc {
    public static baov a(ByteBuffer byteBuffer, baov baov) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        baov.a(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return baov;
    }

    public final void a(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
        i -= this.b.getInt(i);
        this.c = i;
        this.d = this.b.getShort(i);
    }

    public final bapc a() {
        bapc bapc = new bapc();
        int a = a(6);
        if (a == 0) {
            return null;
        }
        bapc.a(b(a + this.a), this.b);
        return bapc;
    }

    public final String b() {
        int a = a(10);
        return a != 0 ? c(a + this.a) : null;
    }
}
