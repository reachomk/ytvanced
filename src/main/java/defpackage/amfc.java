package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InterruptedIOException;

/* renamed from: amfc */
public final class amfc extends amey {
    private boolean a = false;
    private final File b;
    private final xsc c;
    private volatile long d = -1;

    public amfc(File file, File file2, xsc xsc) {
        super(new FileInputStream(file));
        this.b = file2;
        this.c = xsc;
        d();
    }

    private final void d() {
        if (this.b.exists()) {
            this.d = this.b.length();
            this.a = true;
        }
    }

    private final int a(amfd amfd) {
        long a = this.c.a();
        while (!this.a) {
            int a2 = amfd.a();
            if (a2 >= 0) {
                return a2;
            }
            if (this.c.a() - a >= 20000) {
                return amfd.a();
            }
            try {
                Thread.sleep(30);
                d();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException(e.getMessage() == null ? "" : e.getMessage());
            }
        }
        return amfd.a();
    }

    public final int read(byte[] bArr, int i, int i2) {
        return a(new amfb(this, bArr, i, i2));
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read() {
        return a(new amfe(this));
    }

    public final long b() {
        return this.d;
    }

    public final boolean a() {
        if (!this.a) {
            d();
        }
        return this.d != -1;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ int c() {
        return super.read();
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ int a(byte[] bArr, int i, int i2) {
        return super.read(bArr, i, i2);
    }
}
