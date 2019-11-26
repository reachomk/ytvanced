package defpackage;

import java.nio.ByteBuffer;

/* renamed from: cir */
public final class cir extends ciu {
    private long[] a;

    public cir() {
        super("co64");
    }

    public final long[] a() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (long) ((this.a.length << 3) + 8);
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        int a = bana.a(cio.a(byteBuffer));
        this.a = new long[a];
        for (int i = 0; i < a; i++) {
            this.a[i] = cio.f(byteBuffer);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.a(byteBuffer, (long) this.a.length);
        for (long putLong : this.a) {
            byteBuffer.putLong(putLong);
        }
    }
}
