package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: oxc */
public final class oxc implements ovi {
    private final oww a;
    private final ovi b;
    private final ovi c;
    private final ovi d;
    private final oxg e;
    private final oxb f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private ovi j;
    private boolean k;
    private Uri l;
    private Uri m;
    private int n;
    private int o;
    private String p;
    private long q;
    private long r;
    private oxf s;
    private boolean t;
    private boolean u;
    private long v;
    private long w;

    public oxc(oww oww, ovi ovi, ovi ovi2, ovg ovg, int i, oxb oxb) {
        this(oww, ovi, ovi2, ovg, i, oxb, (byte) 0);
    }

    public oxc(oww oww, ovi ovi, ovi ovi2, ovg ovg, int i, oxb oxb, byte b) {
        this.a = oww;
        this.b = ovi2;
        this.e = oxi.a;
        boolean z = false;
        this.g = (i & 1) != 0;
        this.h = (i & 2) != 0;
        if ((i & 4) != 0) {
            z = true;
        }
        this.i = z;
        this.d = ovi;
        if (ovg != null) {
            this.c = new owu(ovi, ovg);
        } else {
            this.c = null;
        }
        this.f = oxb;
    }

    public final void a(owt owt) {
        this.b.a(owt);
        this.d.a(owt);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056 A:{Catch:{ IOException -> 0x009a }} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055 A:{Catch:{ IOException -> 0x009a }} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c A:{Catch:{ IOException -> 0x009a }} */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A:{Catch:{ IOException -> 0x009a }} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069 A:{Catch:{ IOException -> 0x009a }} */
    public final long a(defpackage.ovm r9) {
        /*
        r8 = this;
        r0 = r8.e;	 Catch:{ IOException -> 0x009a }
        r0 = r0.a(r9);	 Catch:{ IOException -> 0x009a }
        r8.p = r0;	 Catch:{ IOException -> 0x009a }
        r0 = r9.a;	 Catch:{ IOException -> 0x009a }
        r8.l = r0;	 Catch:{ IOException -> 0x009a }
        r0 = r8.a;	 Catch:{ IOException -> 0x009a }
        r1 = r8.p;	 Catch:{ IOException -> 0x009a }
        r2 = r8.l;	 Catch:{ IOException -> 0x009a }
        r0 = r0.b(r1);	 Catch:{ IOException -> 0x009a }
        r1 = "exo_redir";
        r0 = r0.a(r1);	 Catch:{ IOException -> 0x009a }
        if (r0 == 0) goto L_0x0023;
    L_0x001e:
        r0 = android.net.Uri.parse(r0);	 Catch:{ IOException -> 0x009a }
        goto L_0x0024;
    L_0x0023:
        r0 = 0;
    L_0x0024:
        if (r0 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0028;
    L_0x0027:
        r0 = r2;
    L_0x0028:
        r8.m = r0;	 Catch:{ IOException -> 0x009a }
        r0 = r9.b;	 Catch:{ IOException -> 0x009a }
        r8.n = r0;	 Catch:{ IOException -> 0x009a }
        r0 = r9.h;	 Catch:{ IOException -> 0x009a }
        r8.o = r0;	 Catch:{ IOException -> 0x009a }
        r0 = r9.e;	 Catch:{ IOException -> 0x009a }
        r8.q = r0;	 Catch:{ IOException -> 0x009a }
        r0 = r8.h;	 Catch:{ IOException -> 0x009a }
        r1 = 1;
        r2 = -1;
        r4 = 0;
        r5 = -1;
        if (r0 == 0) goto L_0x0046;
    L_0x003f:
        r0 = r8.t;	 Catch:{ IOException -> 0x009a }
        if (r0 != 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0046;
    L_0x0044:
        r0 = 0;
        goto L_0x0053;
    L_0x0046:
        r0 = r8.i;	 Catch:{ IOException -> 0x009a }
        if (r0 == 0) goto L_0x0052;
    L_0x004a:
        r6 = r9.f;	 Catch:{ IOException -> 0x009a }
        r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x0052;
    L_0x0050:
        r0 = 1;
        goto L_0x0053;
    L_0x0052:
        r0 = -1;
    L_0x0053:
        if (r0 == r5) goto L_0x0056;
    L_0x0055:
        goto L_0x0057;
    L_0x0056:
        r1 = 0;
    L_0x0057:
        r8.u = r1;	 Catch:{ IOException -> 0x009a }
        if (r1 != 0) goto L_0x005c;
    L_0x005b:
        goto L_0x0063;
    L_0x005c:
        r1 = r8.f;	 Catch:{ IOException -> 0x009a }
        if (r1 == 0) goto L_0x0063;
    L_0x0060:
        r1.a(r0);	 Catch:{ IOException -> 0x009a }
    L_0x0063:
        r0 = r9.f;	 Catch:{ IOException -> 0x009a }
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 != 0) goto L_0x0092;
    L_0x0069:
        r5 = r8.u;	 Catch:{ IOException -> 0x009a }
        if (r5 == 0) goto L_0x006e;
    L_0x006d:
        goto L_0x0092;
    L_0x006e:
        r0 = r8.a;	 Catch:{ IOException -> 0x009a }
        r1 = r8.p;	 Catch:{ IOException -> 0x009a }
        r0 = r0.b(r1);	 Catch:{ IOException -> 0x009a }
        r0 = defpackage.oxn.a(r0);	 Catch:{ IOException -> 0x009a }
        r8.r = r0;	 Catch:{ IOException -> 0x009a }
        r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r5 == 0) goto L_0x0094;
    L_0x0080:
        r2 = r9.e;	 Catch:{ IOException -> 0x009a }
        r0 = r0 - r2;
        r8.r = r0;	 Catch:{ IOException -> 0x009a }
        r2 = 0;
        r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r9 <= 0) goto L_0x008c;
    L_0x008b:
        goto L_0x0094;
    L_0x008c:
        r9 = new ovk;	 Catch:{ IOException -> 0x009a }
        r9.<init>();	 Catch:{ IOException -> 0x009a }
        throw r9;	 Catch:{ IOException -> 0x009a }
    L_0x0092:
        r8.r = r0;	 Catch:{ IOException -> 0x009a }
    L_0x0094:
        r8.a(r4);	 Catch:{ IOException -> 0x009a }
        r0 = r8.r;	 Catch:{ IOException -> 0x009a }
        return r0;
    L_0x009a:
        r9 = move-exception;
        r8.a(r9);
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxc.a(ovm):long");
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.r == 0) {
            return -1;
        }
        try {
            if (this.q >= this.w) {
                a(true);
            }
            int a = this.j.a(bArr, i, i2);
            if (a != -1) {
                if (f()) {
                    this.v += (long) a;
                }
                long j = (long) a;
                this.q += j;
                long j2 = this.r;
                if (j2 != -1) {
                    this.r = j2 - j;
                }
            } else if (this.k) {
                d();
            } else {
                long j3 = this.r;
                if (j3 <= 0) {
                    if (j3 == -1) {
                    }
                }
                h();
                a(false);
                return a(bArr, i, i2);
            }
            return a;
        } catch (IOException e) {
            if (this.k) {
                for (Throwable th = e; th != null; th = th.getCause()) {
                    if (th instanceof ovk) {
                        d();
                        return -1;
                    }
                }
            }
            a(e);
            throw e;
        }
    }

    public final Uri b() {
        return this.m;
    }

    public final Map c() {
        if (e()) {
            return this.d.c();
        }
        return Collections.emptyMap();
    }

    public final void a() {
        this.l = null;
        this.m = null;
        this.n = 1;
        oxb oxb = this.f;
        if (oxb != null && this.v > 0) {
            oxb.a(this.a.d(), this.v);
            this.v = 0;
        }
        try {
            h();
        } catch (IOException e) {
            a(e);
            throw e;
        }
    }

    private final void a(boolean z) {
        oxf oxf;
        oxf oxf2;
        ovi ovi;
        ovm ovm;
        long j;
        long j2;
        Uri uri = null;
        if (this.u) {
            oxf = null;
        } else if (this.g) {
            try {
                oxf = this.a.b(this.p, this.q);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            oxf = this.a.a(this.p, this.q);
        }
        Uri uri2;
        ovm ovm2;
        if (oxf == null) {
            ovi ovi2 = this.d;
            uri2 = this.l;
            int i = this.n;
            long j3 = this.q;
            ovm2 = new ovm(uri2, i, null, j3, j3, this.r, this.p, this.o);
            oxf2 = oxf;
            ovi = ovi2;
            ovm = ovm2;
        } else {
            if (oxf.d) {
                uri2 = Uri.fromFile(oxf.e);
                long j4 = this.q - oxf.b;
                j = oxf.c - j4;
                j2 = this.r;
                if (j2 != -1) {
                    j = Math.min(j, j2);
                }
                ovm2 = new ovm(uri2, this.q, j4, j, this.p, this.o);
                ovi = this.b;
            } else {
                if (oxf.a()) {
                    j = this.r;
                } else {
                    j = oxf.c;
                    long j5 = this.r;
                    if (j5 != -1) {
                        j = Math.min(j, j5);
                    }
                }
                long j6 = j;
                Uri uri3 = this.l;
                int i2 = this.n;
                long j7 = this.q;
                ovm ovm3 = new ovm(uri3, i2, null, j7, j7, j6, this.p, this.o);
                ovi = this.c;
                if (ovi == null) {
                    ovi = this.d;
                    this.a.a(oxf);
                    oxf2 = null;
                }
            }
            oxf2 = oxf;
        }
        j2 = Long.MAX_VALUE;
        if (!this.u && ovi == this.d) {
            j2 = this.q + 102400;
        }
        this.w = j2;
        boolean z2 = false;
        if (z) {
            oxz.b(this.j == this.d);
            if (ovi != this.d) {
                try {
                    h();
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (oxf2.b()) {
                        this.a.a(oxf2);
                    }
                }
            } else {
                return;
            }
        }
        if (oxf2 != null && oxf2.b()) {
            this.s = oxf2;
        }
        this.j = ovi;
        if (ovm.f == -1) {
            z2 = true;
        }
        this.k = z2;
        j = ovi.a(ovm);
        oxq oxq = new oxq();
        if (this.k && j != -1) {
            this.r = j;
            oxq.a(oxq, this.q + j);
        }
        if (e()) {
            this.m = this.j.b();
            if ((this.l.equals(this.m) ^ 1) != 0) {
                uri = this.m;
            }
            String str = "exo_redir";
            if (uri == null) {
                oxq.b.add(str);
                oxq.a.remove(str);
            } else {
                oxq.a(str, uri.toString());
            }
        }
        if (g()) {
            this.a.a(this.p, oxq);
        }
    }

    private final void d() {
        this.r = 0;
        if (g()) {
            oxq oxq = new oxq();
            oxq.a(oxq, this.q);
            this.a.a(this.p, oxq);
        }
    }

    private final boolean e() {
        return f() ^ 1;
    }

    private final boolean f() {
        return this.j == this.b;
    }

    private final boolean g() {
        return this.j == this.c;
    }

    private final void h() {
        ovi ovi = this.j;
        if (ovi != null) {
            try {
                ovi.a();
                this.j = null;
                this.k = false;
                oxf oxf = this.s;
                if (oxf != null) {
                    this.a.a(oxf);
                    this.s = null;
                }
            } catch (Throwable th) {
                this.j = null;
                this.k = false;
                oxf oxf2 = this.s;
                if (oxf2 != null) {
                    this.a.a(oxf2);
                    this.s = null;
                }
            }
        }
    }

    private final void a(IOException iOException) {
        if (f() || (iOException instanceof owv)) {
            this.t = true;
        }
    }
}
