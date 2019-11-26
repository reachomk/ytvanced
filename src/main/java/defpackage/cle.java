package defpackage;

import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: cle */
public final class cle extends ckv implements civ {
    public int b;
    public int c;
    private double d;
    private double m;
    private int n;
    private String o;
    private int p;
    private final long[] q;

    public cle() {
        super("avc1");
        this.d = 72.0d;
        this.m = 72.0d;
        this.n = 1;
        this.o = "";
        this.p = 24;
        this.q = new long[3];
    }

    public cle(String str) {
        super(str);
        this.d = 72.0d;
        this.m = 72.0d;
        this.n = 1;
        this.o = "";
        this.p = 24;
        this.q = new long[3];
    }

    public final void a(bakq bakq, ByteBuffer byteBuffer, long j, cij cij) {
        long b = bakq.b() + j;
        byteBuffer = ByteBuffer.allocate(78);
        bakq.a(byteBuffer);
        byteBuffer.position(6);
        this.a = cio.c(byteBuffer);
        cio.c(byteBuffer);
        cio.c(byteBuffer);
        this.q[0] = cio.a(byteBuffer);
        this.q[1] = cio.a(byteBuffer);
        this.q[2] = cio.a(byteBuffer);
        this.b = cio.c(byteBuffer);
        this.c = cio.c(byteBuffer);
        this.d = cio.g(byteBuffer);
        this.m = cio.g(byteBuffer);
        cio.a(byteBuffer);
        this.n = cio.c(byteBuffer);
        int d = cio.d(byteBuffer);
        if (d > 31) {
            PrintStream printStream = System.out;
            StringBuilder stringBuilder = new StringBuilder(53);
            stringBuilder.append("invalid compressor name displayable data: ");
            stringBuilder.append(d);
            printStream.println(stringBuilder.toString());
            d = 31;
        }
        byte[] bArr = new byte[d];
        byteBuffer.get(bArr);
        this.o = ciq.a(bArr);
        if (d < 31) {
            byteBuffer.get(new byte[(31 - d)]);
        }
        this.p = cio.c(byteBuffer);
        cio.c(byteBuffer);
        a(new cld(b, bakq), j - 78, cij);
    }

    public final void a(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(m());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        cin.b(allocate, this.a);
        cin.b(allocate, 0);
        cin.b(allocate, 0);
        cin.a(allocate, this.q[0]);
        cin.a(allocate, this.q[1]);
        cin.a(allocate, this.q[2]);
        cin.b(allocate, this.b);
        cin.b(allocate, this.c);
        cin.a(allocate, this.d);
        cin.a(allocate, this.m);
        cin.a(allocate, 0);
        cin.b(allocate, this.n);
        cin.c(allocate, ciq.b(this.o));
        allocate.put(ciq.a(this.o));
        int b = ciq.b(this.o);
        while (b < 31) {
            b++;
            allocate.put((byte) 0);
        }
        cin.b(allocate, this.p);
        cin.b(allocate, 65535);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        b(writableByteChannel);
    }

    public final long d() {
        long n = n();
        long j = 78 + n;
        int i = 16;
        if (!this.g && n + 86 < 4294967296L) {
            i = 8;
        }
        return j + ((long) i);
    }
}
