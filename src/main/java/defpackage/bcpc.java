package defpackage;

import java.net.ProtocolException;
import java.nio.ByteBuffer;

/* renamed from: bcpc */
final class bcpc extends bcpi {
    private static int f = 16384;
    public final bcpj a;
    public final long b;
    public final ByteBuffer c;
    private final bcks g = new bcpb(this);
    private long h;

    bcpc(long j, bcpj bcpj) {
        if (j >= 0) {
            this.b = j;
            this.c = ByteBuffer.allocate((int) Math.min(j, (long) f));
            this.a = bcpj;
            this.h = 0;
            return;
        }
        throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
    }

    /* Access modifiers changed, original: final */
    public final void a() {
    }

    public final void write(int i) {
        d();
        a(1);
        f();
        this.c.put((byte) i);
        this.h++;
        g();
    }

    public final void write(byte[] bArr, int i, int i2) {
        d();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        a(i2);
        int i3 = i2;
        while (i3 > 0) {
            f();
            int min = Math.min(i3, this.c.remaining());
            this.c.put(bArr, (i + i2) - i3, min);
            i3 -= min;
        }
        this.h += (long) i2;
        g();
    }

    private final void f() {
        if (!this.c.hasRemaining()) {
            h();
        }
    }

    private final void g() {
        if (this.h == this.b) {
            h();
        }
    }

    private final void h() {
        d();
        this.c.flip();
        this.a.a();
        e();
    }

    private final void a(int i) {
        if (this.h + ((long) i) > this.b) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected ");
            stringBuilder.append(this.b - this.h);
            stringBuilder.append(" bytes but received ");
            stringBuilder.append(i);
            throw new ProtocolException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (this.h < this.b) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    /* Access modifiers changed, original: final */
    public final bcks c() {
        return this.g;
    }
}
