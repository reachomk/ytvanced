package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: bakm */
public class bakm extends bako implements cis {
    private long a;
    public civ e;
    public final String f;
    public boolean g;

    public bakm(String str) {
        this.f = str;
    }

    public final civ c() {
        return this.e;
    }

    public final long e() {
        return this.a;
    }

    public final void a(civ civ) {
        this.e = civ;
    }

    public long d() {
        long n = n();
        int i = 16;
        if (!this.g && 8 + n < 4294967296L) {
            i = 8;
        }
        return n + ((long) i);
    }

    public final String f() {
        return this.f;
    }

    /* Access modifiers changed, original: protected|final */
    public final ByteBuffer m() {
        ByteBuffer wrap;
        if (this.g || d() >= 4294967296L) {
            wrap = ByteBuffer.wrap(new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1, this.f.getBytes()[0], this.f.getBytes()[1], this.f.getBytes()[2], this.f.getBytes()[3], (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0});
            wrap.position(8);
            wrap.putLong(d());
        } else {
            wrap = ByteBuffer.wrap(new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, this.f.getBytes()[0], this.f.getBytes()[1], this.f.getBytes()[2], this.f.getBytes()[3]});
            cin.a(wrap, d());
        }
        wrap.rewind();
        return wrap;
    }

    public void a(bakq bakq, ByteBuffer byteBuffer, long j, cij cij) {
        this.a = bakq.b() - ((long) byteBuffer.remaining());
        this.g = byteBuffer.remaining() == 16;
        a(bakq, j, cij);
    }

    public void a(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(m());
        b(writableByteChannel);
    }

    public final void a(bakq bakq, long j, cij cij) {
        this.i = bakq;
        long b = bakq.b();
        this.j = b;
        int i = 16;
        if (!this.g && 8 + j < 4294967296L) {
            i = 8;
        }
        this.k = b - ((long) i);
        bakq.a(bakq.b() + j);
        this.l = bakq.b();
        this.h = cij;
    }
}
