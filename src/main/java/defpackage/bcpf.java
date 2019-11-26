package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: bcpf */
final class bcpf extends InputStream {
    public boolean a;
    public ByteBuffer b;
    public IOException c;
    private final bcpe d;

    public bcpf(bcpe bcpe) {
        this.d = bcpe;
    }

    public final int read() {
        a();
        return b() ? this.b.get() & 255 : -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            a();
            if (!b()) {
                return -1;
            }
            i2 = Math.min(this.b.limit() - this.b.position(), i2);
            this.b.get(bArr, i, i2);
            return i2;
        }
    }

    private final void a() {
        IOException iOException;
        if (this.a) {
            iOException = this.c;
            if (iOException != null) {
                throw iOException;
            }
            return;
        }
        if (!b()) {
            if (this.b == null) {
                this.b = ByteBuffer.allocateDirect(32768);
            }
            this.b.clear();
            bcpe bcpe = this.d;
            bcpe.b.a(this.b);
            bcpe.a.a(bcpe.getReadTimeout());
            iOException = this.c;
            if (iOException == null) {
                ByteBuffer byteBuffer = this.b;
                if (byteBuffer != null) {
                    byteBuffer.flip();
                    return;
                }
            }
            throw iOException;
        }
    }

    private final boolean b() {
        ByteBuffer byteBuffer = this.b;
        return byteBuffer != null && byteBuffer.hasRemaining();
    }
}
