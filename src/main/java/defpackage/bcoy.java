package defpackage;

import java.net.ProtocolException;
import java.nio.ByteBuffer;

/* renamed from: bcoy */
final class bcoy extends bcpi {
    public final int a;
    public ByteBuffer b;
    public boolean c;
    private final bcks f;

    bcoy(long j) {
        this.f = new bcox(this);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        } else if (j >= 0) {
            int i = (int) j;
            this.a = i;
            this.b = ByteBuffer.allocate(i);
        } else {
            throw new IllegalArgumentException("Content length < 0.");
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
    }

    bcoy() {
        this.f = new bcox(this);
        this.a = -1;
        this.b = ByteBuffer.allocate(16384);
    }

    public final void write(int i) {
        d();
        a(1);
        this.b.put((byte) i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        d();
        a(i2);
        this.b.put(bArr, i, i2);
    }

    private final void a(int i) {
        if (this.a != -1 && this.b.position() + i > this.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("exceeded content-length limit of ");
            stringBuilder.append(this.a);
            stringBuilder.append(" bytes");
            throw new ProtocolException(stringBuilder.toString());
        } else if (this.c) {
            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        } else if (this.a == -1 && this.b.limit() - this.b.position() <= i) {
            int capacity = this.b.capacity();
            ByteBuffer allocate = ByteBuffer.allocate(Math.max(capacity + capacity, this.b.capacity() + i));
            this.b.flip();
            allocate.put(this.b);
            this.b = allocate;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.c = true;
        if (this.b.position() >= this.a) {
            this.b.flip();
            return;
        }
        throw new ProtocolException("Content received is less than Content-Length");
    }

    /* Access modifiers changed, original: final */
    public final bcks c() {
        return this.f;
    }
}
