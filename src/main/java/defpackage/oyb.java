package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: oyb */
final class oyb extends OutputStream {
    private final FileOutputStream a;
    private boolean b = false;

    public oyb(File file) {
        this.a = new FileOutputStream(file);
    }

    public final void close() {
        if (!this.b) {
            this.b = true;
            flush();
            try {
                this.a.getFD().sync();
            } catch (IOException e) {
                oyp.a("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.a.close();
        }
    }

    public final void flush() {
        this.a.flush();
    }

    public final void write(int i) {
        this.a.write(i);
    }

    public final void write(byte[] bArr) {
        this.a.write(bArr);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
    }
}
