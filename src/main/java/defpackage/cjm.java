package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: cjm */
public final class cjm extends bakm {
    private int a;
    private int b;

    public cjm() {
        super("meta");
    }

    public final void a(bakq bakq, ByteBuffer byteBuffer, long j, cij cij) {
        byteBuffer = ByteBuffer.allocate(4);
        bakq.a(byteBuffer);
        byteBuffer = (ByteBuffer) byteBuffer.rewind();
        this.a = cio.d(byteBuffer);
        this.b = cio.b(byteBuffer);
        a(bakq, j - 4, cij);
    }

    public final void a(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(m());
        ByteBuffer allocate = ByteBuffer.allocate(4);
        cin.c(allocate, this.a);
        cin.a(allocate, this.b);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        b(writableByteChannel);
    }

    public final long d() {
        long n = n() + 4;
        int i = 16;
        if (!this.g && n < 4294967296L) {
            i = 8;
        }
        return n + ((long) i);
    }
}
