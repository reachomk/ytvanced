package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: cbs */
final class cbs implements cbu {
    private final ByteBuffer a;

    cbs(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    public final short b() {
        throw null;
    }

    public final int a() {
        return ((c() << 8) & 65280) | (c() & 255);
    }

    public final long a(long j) {
        int min = (int) Math.min((long) this.a.remaining(), j);
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + min);
        return (long) min;
    }

    public final int c() {
        return this.a.remaining() > 0 ? this.a.get() : -1;
    }
}
