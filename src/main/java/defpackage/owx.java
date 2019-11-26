package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: owx */
public final class owx implements ovg {
    public boolean a;
    private final oww b;
    private final long c;
    private final int d;
    private ovm e;
    private long f;
    private File g;
    private OutputStream h;
    private FileOutputStream i;
    private long j;
    private long k;
    private ozd l;

    public owx(oww oww) {
        this(oww, 5242880, 20480);
    }

    public owx(oww oww, long j, int i) {
        boolean z = j > 0 || j == -1;
        oxz.b(z, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j != -1 && j < 2097152) {
            oyp.a("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        this.b = (oww) oxz.a((Object) oww);
        if (j == -1) {
            j = Long.MAX_VALUE;
        }
        this.c = j;
        this.d = i;
        this.a = true;
    }

    public final void a(ovm ovm) {
        if (ovm.f == -1 && ovm.a(4)) {
            this.e = null;
            return;
        }
        this.e = ovm;
        this.f = ovm.a(16) ? this.c : Long.MAX_VALUE;
        this.k = 0;
        try {
            b();
        } catch (IOException e) {
            throw new oxa(e);
        }
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.e != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.j == this.f) {
                        c();
                        b();
                    }
                    int min = (int) Math.min((long) (i2 - i3), this.f - this.j);
                    this.h.write(bArr, i + i3, min);
                    i3 += min;
                    long j = (long) min;
                    this.j += j;
                    this.k += j;
                } catch (IOException e) {
                    throw new oxa(e);
                }
            }
        }
    }

    public final void a() {
        if (this.e != null) {
            try {
                c();
            } catch (IOException e) {
                throw new oxa(e);
            }
        }
    }

    private final void b() {
        long j = this.e.f;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.k, this.f);
        }
        long j3 = j2;
        oww oww = this.b;
        ovm ovm = this.e;
        this.g = oww.a(ovm.g, ovm.d + this.k, j3);
        this.i = new FileOutputStream(this.g);
        int i = this.d;
        if (i > 0) {
            ozd ozd = this.l;
            if (ozd == null) {
                this.l = new ozd(this.i, i);
            } else {
                ozd.a(this.i);
            }
            this.h = this.l;
        } else {
            this.h = this.i;
        }
        this.j = 0;
    }

    private final void c() {
        OutputStream outputStream = this.h;
        if (outputStream != null) {
            try {
                outputStream.flush();
                if (this.a) {
                    this.i.getFD().sync();
                }
                ozp.a(this.h);
                this.h = null;
                File file = this.g;
                this.g = null;
                this.b.a(file, this.j);
            } catch (Throwable th) {
                ozp.a(this.h);
                this.h = null;
                File file2 = this.g;
                this.g = null;
                file2.delete();
            }
        }
    }
}
