package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.zip.Adler32;

/* renamed from: unt */
public final class unt extends InputStream {
    public final long a;
    private final Adler32 b = new Adler32();
    private final ArrayList c;
    private final unu d;
    private final ReadableByteChannel e;
    private final ByteBuffer f;
    private long g;
    private boolean h;

    public unt(unu unu) {
        uhy.a((Object) unu);
        this.d = unu;
        this.f = ByteBuffer.allocate(10485760);
        this.f.limit(0);
        this.c = new ArrayList();
        this.h = false;
        unv unv = new unv(this.c);
        try {
            unu.a().b(unv);
            uhy.b(unv.b);
            this.a = unv.a;
            try {
                Pipe open = Pipe.open();
                new uns(unu, open.sink()).start();
                this.e = open.source();
                this.g = 0;
            } catch (IOException e) {
                unu.close();
                throw e;
            }
        } finally {
            unv.close();
        }
    }

    public final synchronized void close() {
        this.d.close();
    }

    public final synchronized int available() {
        if (this.h && !this.f.hasRemaining()) {
            return 0;
        }
        return (int) ((this.a - this.g) + ((long) this.f.remaining()));
    }

    private final int a(ByteBuffer byteBuffer) {
        uhy.a(this.e);
        if (this.h) {
            return -1;
        }
        byteBuffer.clear();
        if (byteBuffer.remaining() >= 10485760) {
            int i = (int) (this.g / 10485760);
            while (byteBuffer.hasRemaining()) {
                if (this.e.read(byteBuffer) == -1) {
                    this.h = true;
                    this.d.close();
                    break;
                }
            }
            byteBuffer.flip();
            if (byteBuffer.hasRemaining()) {
                byte[] array = byteBuffer.array();
                int arrayOffset = byteBuffer.arrayOffset();
                int position = byteBuffer.position();
                int remaining = byteBuffer.remaining();
                this.b.reset();
                this.b.update(array, arrayOffset + position, remaining);
                if (this.b.getValue() == ((Long) this.c.get(i)).longValue()) {
                    this.g += (long) byteBuffer.remaining();
                    return byteBuffer.remaining();
                }
                byteBuffer.limit(0);
                long j = this.g;
                StringBuilder stringBuilder = new StringBuilder(99);
                stringBuilder.append("CRC mismatch from MP4Parser stream at buffer index: ");
                stringBuilder.append(i);
                stringBuilder.append(" bufferPosition:");
                stringBuilder.append(j);
                throw new IOException(stringBuilder.toString());
            } else if (!this.h) {
                throw new IOException("MovieInputStream had issue fetching more data");
            } else if (this.g + 1 >= this.a) {
                return -1;
            } else {
                throw new IOException("End of file found without reaching full data size");
            }
        }
        throw new IOException("Insufficient buffer size");
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        if (!this.f.hasRemaining() && a(this.f) == -1) {
            return -1;
        }
        if (this.f.remaining() < i2) {
            i2 = this.f.remaining();
        }
        this.f.get(bArr, i, i2);
        return i2;
    }

    public final synchronized int read() {
        if (!this.f.hasRemaining() && a(this.f) == -1) {
            return -1;
        }
        return this.f.get() & 255;
    }
}
