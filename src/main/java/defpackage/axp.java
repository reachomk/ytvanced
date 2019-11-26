package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: axp */
final class axp implements axr {
    public final ByteBuffer a;

    axp(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.a.order(ByteOrder.BIG_ENDIAN);
    }

    public final long a() {
        return ((long) this.a.getInt()) & 4294967295L;
    }

    public final int b() {
        return this.a.getInt();
    }

    public final void a(int i) {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(byteBuffer.position() + i);
    }
}
