package defpackage;

import java.io.Closeable;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;

/* renamed from: bbcd */
public final class bbcd implements Closeable {
    public final bazr a = new bazr();
    public final CRC32 b = new CRC32();
    public final bbcg c = new bbcg(this);
    public final byte[] d = new byte[512];
    public int e;
    public int f;
    public Inflater g;
    public boolean h = false;
    public int i;
    public int j;
    public int k = 0;
    public int l = 0;
    public boolean m = true;
    public int n = 1;
    private long o;

    public final void close() {
        if (!this.h) {
            this.h = true;
            this.a.close();
            Inflater inflater = this.g;
            if (inflater != null) {
                inflater.end();
                this.g = null;
            }
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        amqw.b(this.g != null, (Object) "inflater is null");
        try {
            int totalIn = this.g.getTotalIn();
            i2 = this.g.inflate(bArr, i, i2);
            int totalIn2 = this.g.getTotalIn() - totalIn;
            this.k += totalIn2;
            this.l += totalIn2;
            this.e += totalIn2;
            this.b.update(bArr, i, i2);
            if (this.g.finished()) {
                this.o = this.g.getBytesWritten() & 4294967295L;
                this.n = 10;
            } else if (this.g.needsInput()) {
                this.n = 9;
            }
            return i2;
        } catch (DataFormatException e) {
            String valueOf = String.valueOf(e.getMessage());
            String str = "Inflater data format exception: ";
            throw new DataFormatException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        }
    }

    public final boolean a() {
        if (this.g != null && this.c.b() <= 18) {
            this.g.end();
            this.g = null;
        }
        if (this.c.b() < 8) {
            return false;
        }
        if (this.b.getValue() == this.c.e() && this.o == this.c.e()) {
            this.b.reset();
            this.n = 1;
            return true;
        }
        throw new ZipException("Corrupt GZIP trailer");
    }

    static /* synthetic */ int a(bbcd bbcd, int i) {
        int i2 = bbcd.e + i;
        bbcd.e = i2;
        return i2;
    }

    static /* synthetic */ int b(bbcd bbcd, int i) {
        int i2 = bbcd.k + i;
        bbcd.k = i2;
        return i2;
    }
}
