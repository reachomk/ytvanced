package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: cbr */
final class cbr {
    public final ByteBuffer a;

    cbr(byte[] bArr, int i) {
        this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        return this.a.remaining();
    }

    /* Access modifiers changed, original: final */
    public final int a(int i) {
        return a(i, 4) ? this.a.getInt(i) : -1;
    }

    /* Access modifiers changed, original: final */
    public final short b(int i) {
        return a(i, 2) ? this.a.getShort(i) : (short) -1;
    }

    private final boolean a(int i, int i2) {
        return this.a.remaining() - i >= i2;
    }
}
