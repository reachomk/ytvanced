package defpackage;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;

/* renamed from: bcoz */
final class bcoz extends bcks {
    private final /* synthetic */ bcpa a;

    public final long a() {
        return -1;
    }

    public final void a(bcku bcku, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.a.b.remaining()) {
            byteBuffer.put(this.a.b);
            this.a.b.clear();
            bcku.a(this.a.c);
            bcpa bcpa = this.a;
            if (!bcpa.c) {
                bcpa.a.b();
            }
            return;
        }
        int limit = this.a.b.limit();
        ByteBuffer byteBuffer2 = this.a.b;
        byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
        byteBuffer.put(this.a.b);
        this.a.b.limit(limit);
        bcku.a(false);
    }

    public final void a(bcku bcku) {
        bcku.a(new HttpRetryException("Cannot retry streamed Http body", -1));
    }

    /* synthetic */ bcoz(bcpa bcpa) {
        this.a = bcpa;
    }
}
