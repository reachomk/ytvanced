package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ckq */
public final class ckq extends bakp {
    public long a;
    public long b;
    public long c;
    public ckn d;
    private long e;

    public ckq() {
        super("trex");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return 24;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.a(byteBuffer, this.a);
        cin.a(byteBuffer, this.e);
        cin.a(byteBuffer, this.b);
        cin.a(byteBuffer, this.c);
        this.d.a(byteBuffer);
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        this.a = cio.a(byteBuffer);
        this.e = cio.a(byteBuffer);
        this.b = cio.a(byteBuffer);
        this.c = cio.a(byteBuffer);
        this.d = new ckn(byteBuffer);
    }
}
