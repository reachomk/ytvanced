package defpackage;

import java.nio.ByteBuffer;

/* renamed from: anwn */
final class anwn extends anwo {
    private final ByteBuffer c;
    private final int d;

    anwn(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        this.c = byteBuffer;
        this.d = byteBuffer.position();
    }

    public final void i() {
        this.c.position(this.d + (this.b - this.a));
    }
}
