package defpackage;

import java.nio.ByteBuffer;

/* renamed from: rdv */
final class rdv extends rdw {
    private final ByteBuffer e;
    private final int f;

    rdv(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
        this.e = byteBuffer;
        this.f = byteBuffer.position();
    }

    public final void h() {
        this.e.position(this.f + (this.d - this.c));
    }
}
