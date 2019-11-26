package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: bakq */
public interface bakq extends Closeable {
    int a(ByteBuffer byteBuffer);

    long a();

    long a(long j, long j2, WritableByteChannel writableByteChannel);

    ByteBuffer a(long j, long j2);

    void a(long j);

    long b();

    void close();
}
