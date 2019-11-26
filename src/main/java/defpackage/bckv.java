package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bckv */
public final class bckv extends bcks {
    private final ByteBuffer a;

    public final long a() {
        return (long) this.a.limit();
    }

    public final void a(bcku bcku, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            if (byteBuffer.remaining() >= this.a.remaining()) {
                byteBuffer.put(this.a);
            } else {
                int limit = this.a.limit();
                ByteBuffer byteBuffer2 = this.a;
                byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                byteBuffer.put(this.a);
                this.a.limit(limit);
            }
            bcku.a(false);
            return;
        }
        throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
    }

    public final void a(bcku bcku) {
        this.a.position(0);
        bcku.a();
    }

    public /* synthetic */ bckv(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }
}
