package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: xis */
final class xis extends bcks {
    private final xhb a;
    private InputStream b;
    private int c;

    xis(xhb xhb) {
        this.a = xhb;
    }

    public final long a() {
        return this.a.b;
    }

    public final void a(bcku bcku, ByteBuffer byteBuffer) {
        int a;
        if (this.b == null) {
            b();
        }
        int remaining = byteBuffer.remaining();
        long j = this.a.b;
        if (j != -1) {
            remaining = (int) Math.min((long) remaining, j - ((long) this.c));
        }
        InputStream inputStream = this.b;
        boolean z = false;
        if (inputStream instanceof xll) {
            a = ((xll) inputStream).a(byteBuffer, remaining);
        } else if (byteBuffer.hasArray()) {
            remaining = inputStream.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), remaining);
            if (remaining > 0) {
                byteBuffer.position(byteBuffer.position() + remaining);
            }
            a = remaining;
        } else {
            byte[] bArr = new byte[Math.min(2048, remaining)];
            int read = inputStream.read(bArr);
            if (read > 0) {
                byteBuffer.put(bArr, 0, read);
            }
            a = read;
        }
        if (a != -1) {
            this.c += a;
        }
        if (this.a.a() && a == -1) {
            z = true;
        }
        bcku.a(z);
    }

    private final void b() {
        c();
        this.b = this.a.b();
        this.c = 0;
    }

    public final void a(bcku bcku) {
        if (this.a.a) {
            b();
            bcku.a();
            return;
        }
        bcku.a(xjg.a);
    }

    public final void close() {
        c();
        this.a.c();
    }

    private final void c() {
        try {
            InputStream inputStream = this.b;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        this.b = null;
    }
}
