package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: banr */
public final class banr extends ckv {
    private String b;
    private String c;
    private String d;

    public banr() {
        super("stpp");
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
    }

    public final long d() {
        long n = n() + ((long) ((((this.b.length() + 8) + this.c.length()) + this.d.length()) + 3));
        int i = 16;
        if (!this.g && 8 + n < 4294967296L) {
            i = 8;
        }
        return n + ((long) i);
    }

    public final void a(bakq bakq, ByteBuffer byteBuffer, long j, cij cij) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        bakq.a((ByteBuffer) allocate.rewind());
        allocate.position(6);
        this.a = cio.c(allocate);
        long b = bakq.b();
        ByteBuffer allocate2 = ByteBuffer.allocate(1024);
        bakq.a((ByteBuffer) allocate2.rewind());
        this.b = cio.e((ByteBuffer) allocate2.rewind());
        bakq.a((((long) this.b.length()) + b) + 1);
        bakq.a((ByteBuffer) allocate2.rewind());
        this.c = cio.e((ByteBuffer) allocate2.rewind());
        bakq.a(((((long) this.b.length()) + b) + ((long) this.c.length())) + 2);
        bakq.a((ByteBuffer) allocate2.rewind());
        this.d = cio.e((ByteBuffer) allocate2.rewind());
        bakq.a((((b + ((long) this.b.length())) + ((long) this.c.length())) + ((long) this.d.length())) + 3);
        a(bakq, j - ((long) ((((byteBuffer.remaining() + this.b.length()) + this.c.length()) + this.d.length()) + 3)), cij);
    }

    public final void a(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(m());
        ByteBuffer allocate = ByteBuffer.allocate((((this.b.length() + 8) + this.c.length()) + this.d.length()) + 3);
        allocate.position(6);
        cin.b(allocate, this.a);
        cin.a(allocate, this.b);
        cin.a(allocate, this.c);
        cin.a(allocate, this.d);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        b(writableByteChannel);
    }
}
