package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: baks */
public final class baks implements bakq {
    private final ByteBuffer a;

    public baks(byte[] bArr) {
        this.a = ByteBuffer.wrap(bArr);
    }

    public final void close() {
    }

    public final int a(ByteBuffer byteBuffer) {
        if (this.a.remaining() == 0 && byteBuffer.remaining() != 0) {
            return -1;
        }
        byte[] bArr = new byte[Math.min(byteBuffer.remaining(), this.a.remaining())];
        this.a.get(bArr);
        byteBuffer.put(bArr);
        return bArr.length;
    }

    public final long a() {
        return (long) this.a.capacity();
    }

    public final long b() {
        return (long) this.a.position();
    }

    public final void a(long j) {
        this.a.position(bana.a(j));
    }

    public final long a(long j, long j2, WritableByteChannel writableByteChannel) {
        return (long) writableByteChannel.write((ByteBuffer) ((ByteBuffer) this.a.position(bana.a(j))).slice().limit(bana.a(j2)));
    }

    public final ByteBuffer a(long j, long j2) {
        int position = this.a.position();
        this.a.position(bana.a(j));
        ByteBuffer slice = this.a.slice();
        slice.limit(bana.a(j2));
        this.a.position(position);
        return slice;
    }
}
