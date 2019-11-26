package defpackage;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bcmr */
final class bcmr implements ReadableByteChannel {
    private final InputStream a;
    private final AtomicBoolean b = new AtomicBoolean(true);

    private bcmr(InputStream inputStream) {
        this.a = inputStream;
    }

    static ReadableByteChannel a(InputStream inputStream) {
        if (inputStream instanceof FileInputStream) {
            return ((FileInputStream) inputStream).getChannel();
        }
        return new bcmr(inputStream);
    }

    public final int read(ByteBuffer byteBuffer) {
        int read;
        if (byteBuffer.hasArray()) {
            read = this.a.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            if (read > 0) {
                byteBuffer.position(byteBuffer.position() + read);
                return read;
            }
        }
        byte[] bArr = new byte[Math.min(16384, Math.min(Math.max(this.a.available(), 4096), byteBuffer.remaining()))];
        int read2 = this.a.read(bArr);
        if (read2 <= 0) {
            read = read2;
        } else {
            byteBuffer.put(bArr, 0, read2);
            return read2;
        }
        return read;
    }

    public final boolean isOpen() {
        return this.b.get();
    }

    public final void close() {
        if (this.b.compareAndSet(true, false)) {
            this.a.close();
        }
    }
}
