package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* renamed from: band */
public final class band {
    public static void a(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer) {
        int read;
        int remaining = byteBuffer.remaining();
        int i = 0;
        do {
            read = readableByteChannel.read(byteBuffer);
            if (read == -1) {
                break;
            }
            i += read;
        } while (i != remaining);
        if (read != -1) {
            return;
        }
        throw new EOFException("End of file. No more boxes.");
    }

    static {
        ByteBuffer.allocate(0).asReadOnlyBuffer();
    }
}
