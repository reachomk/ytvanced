package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: balg */
final class balg implements bakz {
    private final /* synthetic */ long a;
    private final /* synthetic */ ByteBuffer b;
    private final /* synthetic */ long c;

    balg(long j, ByteBuffer byteBuffer, long j2) {
        this.a = j;
        this.b = byteBuffer;
        this.c = j2;
    }

    public final void a(WritableByteChannel writableByteChannel) {
        writableByteChannel.write((ByteBuffer) ((ByteBuffer) this.b.position(bana.a(this.c))).slice().limit(bana.a(this.a)));
    }

    public final long a() {
        return this.a;
    }

    public final String toString() {
        long j = this.a;
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append("DefaultMp4Sample(size:");
        stringBuilder.append(j);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
