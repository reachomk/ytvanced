package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: ovw */
public final class ovw extends ouz {
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;

    public ovw() {
        super(false);
    }

    public final long a(ovm ovm) {
        try {
            this.b = ovm.a;
            b(ovm);
            this.a = new RandomAccessFile(ovm.a.getPath(), "r");
            this.a.seek(ovm.e);
            long j = ovm.f;
            if (j == -1) {
                j = this.a.length() - ovm.e;
            }
            this.c = j;
            if (j >= 0) {
                this.d = true;
                c(ovm);
                return this.c;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new ovv(e);
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.c;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.a.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.c -= (long) read;
                a(read);
            }
            return read;
        } catch (IOException e) {
            throw new ovv(e);
        }
    }

    public final Uri b() {
        return this.b;
    }

    public final void a() {
        this.b = null;
        try {
            RandomAccessFile randomAccessFile = this.a;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.a = null;
            if (this.d) {
                this.d = false;
                f();
            }
        } catch (IOException e) {
            throw new ovv(e);
        } catch (Throwable th) {
            this.a = null;
            if (this.d) {
                this.d = false;
                f();
            }
        }
    }
}
