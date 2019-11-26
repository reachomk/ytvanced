package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: bali */
final class bali implements bakz {
    private final /* synthetic */ long a;
    private final /* synthetic */ ByteBuffer b;
    private final /* synthetic */ int c;

    bali(long j, ByteBuffer byteBuffer, int i) {
        this.a = j;
        this.b = byteBuffer;
        this.c = i;
    }

    public final void a(WritableByteChannel writableByteChannel) {
        writableByteChannel.write((ByteBuffer) ((ByteBuffer) this.b.position(this.c)).slice().limit(bana.a(this.a)));
    }

    public final long a() {
        return this.a;
    }
}
