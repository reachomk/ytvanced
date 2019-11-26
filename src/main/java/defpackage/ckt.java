package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.logging.Logger;

/* renamed from: ckt */
public final class ckt implements cis {
    private civ a;
    private bakq b;
    private long c;
    private long d;

    public final String f() {
        return "mdat";
    }

    public final civ c() {
        return this.a;
    }

    public final void a(civ civ) {
        this.a = civ;
    }

    public final void a(WritableByteChannel writableByteChannel) {
        bakq bakq = this.b;
        long j = this.c;
        long j2 = this.d;
        long j3 = 0;
        while (j3 < j2) {
            j3 += bakq.a(j + j3, Math.min(67076096, j2 - j3), writableByteChannel);
        }
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.c;
    }

    public final void a(bakq bakq, ByteBuffer byteBuffer, long j, cij cij) {
        this.c = bakq.b() - ((long) byteBuffer.remaining());
        this.b = bakq;
        this.d = ((long) byteBuffer.remaining()) + j;
        bakq.a(bakq.b() + j);
    }

    public final String toString() {
        long j = this.d;
        StringBuilder stringBuilder = new StringBuilder(39);
        stringBuilder.append("MediaDataBox{size=");
        stringBuilder.append(j);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static {
        Logger.getLogger(ckt.class.getName());
    }
}
