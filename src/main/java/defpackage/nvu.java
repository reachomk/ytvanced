package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: nvu */
public final class nvu implements nwb {
    private RandomAccessFile a;
    private String b;
    private long c;
    private boolean d;

    public nvu() {
        this((byte) 0);
    }

    public nvu(byte b) {
    }

    public final long a(nvq nvq) {
        try {
            this.b = nvq.a.toString();
            this.a = new RandomAccessFile(nvq.a.getPath(), "r");
            this.a.seek(nvq.d);
            long j = nvq.e;
            if (j == -1) {
                j = this.a.length() - nvq.d;
            }
            this.c = j;
            if (j >= 0) {
                this.d = true;
                return j;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new nvt(e);
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        long j = this.c;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.a.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.c -= (long) read;
            }
            return read;
        } catch (IOException e) {
            throw new nvt(e);
        }
    }

    public final String a() {
        return this.b;
    }

    public final void b() {
        this.b = null;
        RandomAccessFile randomAccessFile = this.a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.a = null;
                if (this.d) {
                    this.d = false;
                }
            } catch (IOException e) {
                throw new nvt(e);
            } catch (Throwable th) {
                this.a = null;
                if (this.d) {
                    this.d = false;
                }
            }
        }
    }
}
