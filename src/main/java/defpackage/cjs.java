package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;

/* renamed from: cjs */
public final class cjs extends bakm implements cis {
    private int a;
    private int b;

    public cjs() {
        super("stsd");
    }

    public final void a(bakq bakq, ByteBuffer byteBuffer, long j, cij cij) {
        byteBuffer = ByteBuffer.allocate(8);
        bakq.a(byteBuffer);
        byteBuffer.rewind();
        this.a = cio.d(byteBuffer);
        this.b = cio.b(byteBuffer);
        a(bakq, j - 8, cij);
    }

    public final void a(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(m());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        cin.c(allocate, this.a);
        cin.a(allocate, this.b);
        cin.a(allocate, (long) b().size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        b(writableByteChannel);
    }

    public final ckv a() {
        Iterator it = a(ckv.class).iterator();
        return it.hasNext() ? (ckv) it.next() : null;
    }

    public final long d() {
        long n = n();
        long j = 8 + n;
        int i = 16;
        if (!this.g && n + 16 < 4294967296L) {
            i = 8;
        }
        return j + ((long) i);
    }
}
