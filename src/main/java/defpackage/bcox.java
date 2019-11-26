package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bcox */
final class bcox extends bcks {
    private final /* synthetic */ bcoy a;

    public final long a() {
        bcoy bcoy = this.a;
        int i = bcoy.a;
        if (i != -1) {
            return (long) i;
        }
        int limit;
        if (bcoy.c) {
            limit = bcoy.b.limit();
        } else {
            limit = bcoy.b.position();
        }
        return (long) limit;
    }

    public final void a(bcku bcku, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < this.a.b.remaining()) {
            byteBuffer.put(this.a.b.array(), this.a.b.position(), remaining);
            byteBuffer = this.a.b;
            byteBuffer.position(byteBuffer.position() + remaining);
        } else {
            byteBuffer.put(this.a.b);
        }
        bcku.a(false);
    }

    public final void a(bcku bcku) {
        this.a.b.position(0);
        bcku.a();
    }

    /* synthetic */ bcox(bcoy bcoy) {
        this.a = bcoy;
    }
}
