package defpackage;

import java.nio.ByteBuffer;

/* renamed from: banl */
public final class banl extends bakp {
    public long[] a = new long[0];
    private String b;
    private String c;

    public banl() {
        super("saio");
    }

    /* Access modifiers changed, original: protected|final */
    public final long b() {
        int i = 8;
        int length = (m() == 0 ? this.a.length << 2 : this.a.length << 3) + 8;
        if ((n() & 1) == 0) {
            i = 0;
        }
        return (long) (length + i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(ByteBuffer byteBuffer) {
        d(byteBuffer);
        if ((n() & 1) == 1) {
            byteBuffer.put(cil.a(this.b));
            byteBuffer.put(cil.a(this.c));
        }
        cin.a(byteBuffer, (long) this.a.length);
        for (long valueOf : this.a) {
            Long valueOf2 = Long.valueOf(valueOf);
            if (m() == 0) {
                cin.a(byteBuffer, valueOf2.longValue());
            } else {
                byteBuffer.putLong(valueOf2.longValue());
            }
        }
    }

    public final void a(ByteBuffer byteBuffer) {
        c(byteBuffer);
        if ((n() & 1) == 1) {
            this.b = cio.j(byteBuffer);
            this.c = cio.j(byteBuffer);
        }
        int a = bana.a(cio.a(byteBuffer));
        this.a = new long[a];
        for (int i = 0; i < a; i++) {
            if (m() == 0) {
                this.a[i] = cio.a(byteBuffer);
            } else {
                this.a[i] = cio.f(byteBuffer);
            }
        }
    }
}
