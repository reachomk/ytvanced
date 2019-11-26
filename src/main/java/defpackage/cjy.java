package defpackage;

import java.nio.ByteBuffer;

/* renamed from: cjy */
public final class cjy extends ciu {
    public long[] a = new long[0];

    public cjy() {
        super("stco");
    }

    public final long[] a() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        return (long) ((this.a.length << 2) + 8);
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        int a = bana.a(cio.a(byteBuffer));
        this.a = new long[a];
        for (int i = 0; i < a; i++) {
            this.a[i] = cio.a(byteBuffer);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        cin.a(byteBuffer, (long) this.a.length);
        for (long a : this.a) {
            cin.a(byteBuffer, a);
        }
    }
}
