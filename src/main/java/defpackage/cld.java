package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: cld */
final class cld implements bakq {
    private final /* synthetic */ long a;
    private final /* synthetic */ bakq b;

    cld(long j, bakq bakq) {
        this.a = j;
        this.b = bakq;
    }

    public final int a(ByteBuffer byteBuffer) {
        if (this.a == this.b.b()) {
            return -1;
        }
        if (((long) byteBuffer.remaining()) <= this.a - this.b.b()) {
            return this.b.a(byteBuffer);
        }
        ByteBuffer allocate = ByteBuffer.allocate(bana.a(this.a - this.b.b()));
        this.b.a(allocate);
        byteBuffer.put((ByteBuffer) allocate.rewind());
        return allocate.capacity();
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b.b();
    }

    public final void a(long j) {
        this.b.a(j);
    }

    public final long a(long j, long j2, WritableByteChannel writableByteChannel) {
        return this.b.a(j, j2, writableByteChannel);
    }

    public final ByteBuffer a(long j, long j2) {
        return this.b.a(j, j2);
    }

    public final void close() {
        this.b.close();
    }
}
