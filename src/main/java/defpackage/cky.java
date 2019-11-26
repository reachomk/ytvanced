package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: cky */
public final class cky extends ckv {
    public int b;
    public int c;
    public long d;
    private int m;
    private int n;
    private int o;
    private long p;
    private long q;
    private long r;
    private long s;
    private int t;
    private long u;
    private byte[] v;

    public cky(String str) {
        super(str);
    }

    public final void a(bakq bakq, ByteBuffer byteBuffer, long j, cij cij) {
        byteBuffer = ByteBuffer.allocate(28);
        bakq.a(byteBuffer);
        byteBuffer.position(6);
        this.a = cio.c(byteBuffer);
        this.m = cio.c(byteBuffer);
        this.t = cio.c(byteBuffer);
        this.u = cio.a(byteBuffer);
        this.b = cio.c(byteBuffer);
        this.c = cio.c(byteBuffer);
        this.n = cio.c(byteBuffer);
        this.o = cio.c(byteBuffer);
        this.d = cio.a(byteBuffer);
        int i = 16;
        if (!this.f.equals("mlpa")) {
            this.d >>>= 16;
        }
        if (this.m == 1) {
            byteBuffer = ByteBuffer.allocate(16);
            bakq.a(byteBuffer);
            byteBuffer.rewind();
            this.p = cio.a(byteBuffer);
            this.q = cio.a(byteBuffer);
            this.r = cio.a(byteBuffer);
            this.s = cio.a(byteBuffer);
        }
        int i2 = 36;
        if (this.m == 2) {
            byteBuffer = ByteBuffer.allocate(36);
            bakq.a(byteBuffer);
            byteBuffer.rewind();
            this.p = cio.a(byteBuffer);
            this.q = cio.a(byteBuffer);
            this.r = cio.a(byteBuffer);
            this.s = cio.a(byteBuffer);
            this.v = new byte[20];
            byteBuffer.get(this.v);
        }
        String str = "owma";
        int i3;
        if (str.equals(this.f)) {
            System.err.println(str);
            j -= 28;
            i3 = this.m;
            if (i3 != 1) {
                i = 0;
            }
            j -= (long) i;
            if (i3 != 2) {
                i2 = 0;
            }
            j -= (long) i2;
            byteBuffer = ByteBuffer.allocate(bana.a(j));
            bakq.a(byteBuffer);
            a(new ckx(this, j, byteBuffer));
            return;
        }
        j -= 28;
        i3 = this.m;
        if (i3 != 1) {
            i = 0;
        }
        j -= (long) i;
        if (i3 != 2) {
            i2 = 0;
        }
        a(bakq, j - ((long) i2), cij);
    }

    public final void a(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(m());
        int i = this.m;
        int i2 = 0;
        int i3 = (i == 1 ? 16 : 0) + 28;
        if (i == 2) {
            i2 = 36;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i3 + i2);
        allocate.position(6);
        cin.b(allocate, this.a);
        cin.b(allocate, this.m);
        cin.b(allocate, this.t);
        cin.a(allocate, this.u);
        cin.b(allocate, this.b);
        cin.b(allocate, this.c);
        cin.b(allocate, this.n);
        cin.b(allocate, this.o);
        if (this.f.equals("mlpa")) {
            cin.a(allocate, this.d);
        } else {
            cin.a(allocate, this.d << 16);
        }
        if (this.m == 1) {
            cin.a(allocate, this.p);
            cin.a(allocate, this.q);
            cin.a(allocate, this.r);
            cin.a(allocate, this.s);
        }
        if (this.m == 2) {
            cin.a(allocate, this.p);
            cin.a(allocate, this.q);
            cin.a(allocate, this.r);
            cin.a(allocate, this.s);
            allocate.put(this.v);
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        b(writableByteChannel);
    }

    public final long d() {
        int i = this.m;
        int i2 = 0;
        int i3 = 16;
        int i4 = (i == 1 ? 16 : 0) + 28;
        if (i == 2) {
            i2 = 36;
        }
        long n = ((long) (i4 + i2)) + n();
        if (!this.g && 8 + n < 4294967296L) {
            i3 = 8;
        }
        return n + ((long) i3);
    }

    public final String toString() {
        long j = this.s;
        long j2 = this.r;
        long j3 = this.q;
        long j4 = this.p;
        int i = this.o;
        int i2 = this.n;
        int i3 = this.m;
        long j5 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        String valueOf = String.valueOf(b());
        int i6 = i5;
        String str = valueOf;
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 333);
        stringBuilder.append("AudioSampleEntry{bytesPerSample=");
        stringBuilder.append(j);
        stringBuilder.append(", bytesPerFrame=");
        stringBuilder.append(j2);
        stringBuilder.append(", bytesPerPacket=");
        stringBuilder.append(j3);
        stringBuilder.append(", samplesPerPacket=");
        stringBuilder.append(j4);
        stringBuilder.append(", packetSize=");
        stringBuilder.append(i);
        stringBuilder.append(", compressionId=");
        stringBuilder.append(i2);
        stringBuilder.append(", soundVersion=");
        stringBuilder.append(i3);
        stringBuilder.append(", sampleRate=");
        stringBuilder.append(j5);
        stringBuilder.append(", sampleSize=");
        stringBuilder.append(i4);
        stringBuilder.append(", channelCount=");
        stringBuilder.append(i6);
        stringBuilder.append(", boxes=");
        stringBuilder.append(str);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
