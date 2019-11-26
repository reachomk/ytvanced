package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.WritableByteChannel;

/* renamed from: bakt */
public final class bakt implements bakq {
    private final FileChannel a;
    private final String b = "unknown";

    public bakt(FileChannel fileChannel) {
        this.a = fileChannel;
    }

    public final int a(ByteBuffer byteBuffer) {
        return this.a.read(byteBuffer);
    }

    public final long a() {
        return this.a.size();
    }

    public final long b() {
        return this.a.position();
    }

    public final void a(long j) {
        this.a.position(j);
    }

    public final long a(long j, long j2, WritableByteChannel writableByteChannel) {
        return this.a.transferTo(j, j2, writableByteChannel);
    }

    public final ByteBuffer a(long j, long j2) {
        return this.a.map(MapMode.READ_ONLY, j, j2);
    }

    public final void close() {
        this.a.close();
    }

    public final String toString() {
        return this.b;
    }
}
