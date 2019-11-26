package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: amjk */
final class amjk implements azyl {
    private final amjj a;
    private final long b;
    private InputStream c;
    private boolean d;
    private long e;
    private long f;

    amjk(amjj amjj, amey amey) {
        this.a = amjj;
        amqw.a(amey.b() != -1);
        this.c = amjk.a(amey);
        this.b = amey.b();
    }

    public final long e() {
        return Long.MAX_VALUE;
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        h();
        int read = this.c.read(bArr, i, i2);
        if (read != -1) {
            long j = this.e + ((long) read);
            this.e = j;
            if (j <= this.b) {
                return read;
            }
            throw new IOException("Stream continues beyond expected size.");
        } else if (this.e >= this.b) {
            return 0;
        } else {
            throw new IOException("The stream ended before all expected bytes were read");
        }
    }

    public final void b() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            if (this.f != this.e) {
                inputStream.mark(131072);
            }
            this.f = this.e;
        }
    }

    public final long c() {
        return this.f;
    }

    public final long d() {
        return this.e;
    }

    public final void f() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.reset();
            } catch (IOException unused) {
                this.d = true;
            }
            this.e = this.f;
        }
    }

    public final long a(long j) {
        h();
        anaz.b(this.c, j);
        this.e += j;
        return j;
    }

    public final long a() {
        return this.b;
    }

    public final boolean g() {
        return this.b - this.e > 0;
    }

    public final void close() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            inputStream.close();
            this.c = null;
        }
    }

    private final void h() {
        if (this.d) {
            close();
            this.d = false;
        }
        if (this.c == null) {
            this.c = amjk.a(this.a.a());
            anaz.b(this.c, this.f);
        }
    }

    private static InputStream a(amey amey) {
        return new BufferedInputStream(amey, 131072);
    }
}
