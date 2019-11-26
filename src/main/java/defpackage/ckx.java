package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: ckx */
final class ckx implements cis {
    private final /* synthetic */ long a;
    private final /* synthetic */ ByteBuffer b;
    private final /* synthetic */ cky c;

    ckx(cky cky, long j, ByteBuffer byteBuffer) {
        this.c = cky;
        this.a = j;
        this.b = byteBuffer;
    }

    public final void a(civ civ) {
    }

    public final long e() {
        return 0;
    }

    public final String f() {
        return "----";
    }

    public final civ c() {
        return this.c;
    }

    public final long d() {
        return this.a;
    }

    public final void a(WritableByteChannel writableByteChannel) {
        this.b.rewind();
        writableByteChannel.write(this.b);
    }

    public final void a(bakq bakq, ByteBuffer byteBuffer, long j, cij cij) {
        throw new RuntimeException("NotImplemented");
    }
}
