package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: ckz */
public final class ckz extends ckv {
    private long b;
    private int c;
    private int d;
    private int[] m;
    private clc n;
    private clb o;

    public ckz() {
        super("tx3g");
        this.m = new int[4];
        this.n = new clc();
        this.o = new clb();
    }

    public final String toString() {
        return "TextSampleEntry";
    }

    public ckz(String str) {
        super(str);
        this.m = new int[4];
        this.n = new clc();
        this.o = new clb();
    }

    public final void a(bakq bakq, ByteBuffer byteBuffer, long j, cij cij) {
        byteBuffer = ByteBuffer.allocate(38);
        bakq.a(byteBuffer);
        byteBuffer.position(6);
        this.a = cio.c(byteBuffer);
        this.b = cio.a(byteBuffer);
        this.c = cio.d(byteBuffer);
        this.d = cio.d(byteBuffer);
        this.m = new int[4];
        this.m[0] = cio.d(byteBuffer);
        this.m[1] = cio.d(byteBuffer);
        this.m[2] = cio.d(byteBuffer);
        this.m[3] = cio.d(byteBuffer);
        this.n = new clc();
        clc clc = this.n;
        clc.a = cio.c(byteBuffer);
        clc.b = cio.c(byteBuffer);
        clc.c = cio.c(byteBuffer);
        clc.d = cio.c(byteBuffer);
        this.o = new clb();
        clb clb = this.o;
        clb.a = cio.c(byteBuffer);
        clb.b = cio.c(byteBuffer);
        clb.c = cio.c(byteBuffer);
        clb.d = cio.d(byteBuffer);
        clb.e = cio.d(byteBuffer);
        clb.f = new int[4];
        clb.f[0] = cio.d(byteBuffer);
        clb.f[1] = cio.d(byteBuffer);
        clb.f[2] = cio.d(byteBuffer);
        clb.f[3] = cio.d(byteBuffer);
        a(bakq, j - 38, cij);
    }

    public final void a(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(m());
        ByteBuffer allocate = ByteBuffer.allocate(38);
        allocate.position(6);
        cin.b(allocate, this.a);
        cin.a(allocate, this.b);
        cin.c(allocate, this.c);
        cin.c(allocate, this.d);
        cin.c(allocate, this.m[0]);
        cin.c(allocate, this.m[1]);
        cin.c(allocate, this.m[2]);
        cin.c(allocate, this.m[3]);
        clc clc = this.n;
        cin.b(allocate, clc.a);
        cin.b(allocate, clc.b);
        cin.b(allocate, clc.c);
        cin.b(allocate, clc.d);
        clb clb = this.o;
        cin.b(allocate, clb.a);
        cin.b(allocate, clb.b);
        cin.b(allocate, clb.c);
        cin.c(allocate, clb.d);
        cin.c(allocate, clb.e);
        cin.c(allocate, clb.f[0]);
        cin.c(allocate, clb.f[1]);
        cin.c(allocate, clb.f[2]);
        cin.c(allocate, clb.f[3]);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        b(writableByteChannel);
    }

    public final long d() {
        long n = n() + 38;
        int i = 16;
        if (!this.g && n < 4294967296L) {
            i = 8;
        }
        return n + ((long) i);
    }
}
