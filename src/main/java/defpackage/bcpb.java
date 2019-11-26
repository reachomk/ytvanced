package defpackage;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;

/* renamed from: bcpb */
final class bcpb extends bcks {
    private final /* synthetic */ bcpc a;

    public final long a() {
        return this.a.b;
    }

    public final void a(bcku bcku, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.a.c.remaining()) {
            byteBuffer.put(this.a.c);
            this.a.c.clear();
            bcku.a(false);
            this.a.a.b();
            return;
        }
        int limit = this.a.c.limit();
        ByteBuffer byteBuffer2 = this.a.c;
        byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
        byteBuffer.put(this.a.c);
        this.a.c.limit(limit);
        bcku.a(false);
    }

    public final void a(bcku bcku) {
        bcku.a(new HttpRetryException("Cannot retry streamed Http body", -1));
    }

    /* synthetic */ bcpb(bcpc bcpc) {
        this.a = bcpc;
    }
}
