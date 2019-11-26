package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bcns */
final class bcns implements bcnw {
    private final /* synthetic */ bclb a;
    private final /* synthetic */ ByteBuffer b;
    private final /* synthetic */ bcno c;

    bcns(bcno bcno, bclb bclb, ByteBuffer byteBuffer) {
        this.c = bcno;
        this.a = bclb;
        this.b = byteBuffer;
    }

    public final void a() {
        if (this.c.d.g.compareAndSet(Integer.valueOf(5), Integer.valueOf(4))) {
            bcno bcno = this.c;
            bcno.a.a(bcno.d, this.a, this.b);
        }
    }
}
