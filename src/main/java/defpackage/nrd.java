package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nrd */
public final class nrd implements nnd, nne, nre, nvx {
    private static final List c = new ArrayList();
    private nvy A;
    private nrf B;
    private IOException C;
    private int D;
    private long E;
    private boolean F;
    private int G;
    public final nri a;
    public int b;
    private final nvi d;
    private final int e;
    private final SparseArray f;
    private final int g;
    private final Uri h;
    private final nvo i;
    private volatile boolean j;
    private volatile nrq k;
    private volatile npv l;
    private boolean m;
    private int n;
    private nmx[] o;
    private long p;
    private boolean[] q;
    private boolean[] r;
    private boolean[] s;
    private int t;
    private long u;
    private long v;
    private long w;
    private boolean x;
    private long y;
    private long z;

    public nrd(Uri uri, nvo nvo, nvi nvi, int i, nrc... nrcArr) {
        this(uri, nvo, nvi, i, nrcArr, (byte) 0);
    }

    private nrd(Uri uri, nvo nvo, nvi nvi, int i, nrc[] nrcArr, byte b) {
        String str = "Unexpected error creating default extractor";
        this.h = uri;
        this.i = nvo;
        this.d = nvi;
        this.e = i;
        this.g = -1;
        if (nrcArr.length == 0) {
            nrcArr = new nrc[c.size()];
            int i2 = 0;
            while (i2 < nrcArr.length) {
                try {
                    nrcArr[i2] = (nrc) ((Class) c.get(i2)).newInstance();
                    i2++;
                } catch (InstantiationException e) {
                    throw new IllegalStateException(str, e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalStateException(str, e2);
                }
            }
        }
        this.a = new nri(nrcArr, this);
        this.f = new SparseArray();
        this.w = Long.MIN_VALUE;
    }

    public final nnd aP_() {
        this.t++;
        return this;
    }

    public final boolean b() {
        if (this.m) {
            return true;
        }
        if (this.A == null) {
            this.A = new nvy("Loader:ExtractorSampleSource");
        }
        h();
        int i = 0;
        if (this.k != null && this.j) {
            int i2 = 0;
            while (i2 < this.f.size()) {
                if (((nrh) this.f.valueAt(i2)).e != null) {
                    i2++;
                }
            }
            i2 = this.f.size();
            this.s = new boolean[i2];
            this.r = new boolean[i2];
            this.q = new boolean[i2];
            this.o = new nmx[i2];
            this.p = -1;
            while (i < i2) {
                nmx nmx = ((nrh) this.f.valueAt(i)).e;
                this.o[i] = nmx;
                long j = nmx.e;
                if (j != -1 && j > this.p) {
                    this.p = j;
                }
                i++;
            }
            this.m = true;
            return true;
        }
        return false;
    }

    public final int c() {
        return this.f.size();
    }

    public final nmx a(int i) {
        nwf.b(this.m);
        return this.o[i];
    }

    public final void a(int i, long j) {
        nwf.b(this.m);
        nwf.b(this.s[i] ^ 1);
        int i2 = this.n + 1;
        this.n = i2;
        this.s[i] = true;
        this.q[i] = true;
        this.r[i] = false;
        if (i2 == 1) {
            if (!this.k.a()) {
                j = 0;
            }
            this.u = j;
            this.v = j;
            b(j);
        }
    }

    public final void c(int i) {
        nwf.b(this.m);
        nwf.b(this.s[i]);
        int i2 = this.n - 1;
        this.n = i2;
        this.s[i] = false;
        if (i2 == 0) {
            this.u = Long.MIN_VALUE;
            nvy nvy = this.A;
            if (nvy.b) {
                nvy.a();
                return;
            }
            j();
            this.d.a(0);
        }
    }

    public final boolean b(int i, long j) {
        nwf.b(this.m);
        nwf.b(this.s[i]);
        this.u = j;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.s;
            if (i2 >= zArr.length) {
                break;
            }
            if (!zArr[i2]) {
                nrh nrh = (nrh) this.f.valueAt(i2);
                while (nrh.a.a(nrh.b) && nrh.b.e < j) {
                    nrh.a.a();
                    nrh.c = true;
                }
            }
            i2++;
        }
        if (this.F) {
            return true;
        }
        h();
        if (k()) {
            return false;
        }
        return ((nrh) this.f.valueAt(i)).c() ^ 1;
    }

    public final long b(int i) {
        boolean[] zArr = this.r;
        if (!zArr[i]) {
            return Long.MIN_VALUE;
        }
        zArr[i] = false;
        return this.v;
    }

    public final int a(int i, long j, nmz nmz, nnb nnb) {
        this.u = j;
        if (this.r[i] || k()) {
            return -2;
        }
        nrh nrh = (nrh) this.f.valueAt(i);
        if (this.q[i]) {
            nmz.a = nrh.e;
            nmz.b = this.l;
            this.q[i] = false;
            return -4;
        } else if (nrh.a(nnb)) {
            long j2 = nnb.e;
            long j3 = this.v;
            nnb.d = (j2 < j3 ? 134217728 : 0) | nnb.d;
            if (this.x) {
                this.z = this.y - j2;
                this.x = false;
            }
            nnb.e = j2 + this.z;
            return -3;
        } else if (this.F) {
            return -1;
        } else {
            return -2;
        }
    }

    public final void d() {
        if (this.C == null) {
            return;
        }
        if (l()) {
            throw this.C;
        }
        int i = this.g;
        if (i == -1) {
            i = (this.k == null || this.k.a()) ? 3 : 6;
        }
        if (this.D > i) {
            throw this.C;
        }
    }

    public final void a(long j) {
        nwf.b(this.m);
        int i = 0;
        nwf.b(this.n > 0);
        if (!this.k.a()) {
            j = 0;
        }
        long j2 = !k() ? this.u : this.w;
        this.u = j;
        this.v = j;
        if (j2 != j) {
            int k = k() ^ 1;
            int i2 = 0;
            while (k != 0) {
                if (i2 >= this.f.size()) {
                    break;
                }
                k = ((nrh) this.f.valueAt(i2)).a(j);
                i2++;
            }
            b(j);
            while (true) {
                boolean[] zArr = this.r;
                if (i < zArr.length) {
                    zArr[i] = true;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final long e() {
        if (this.F) {
            return -3;
        }
        if (k()) {
            return this.w;
        }
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.f.size(); i++) {
            j = Math.max(j, ((nrh) this.f.valueAt(i)).d);
        }
        return j == Long.MIN_VALUE ? this.u : j;
    }

    public final void f() {
        nwf.b(this.t > 0);
        int i = this.t - 1;
        this.t = i;
        if (i == 0) {
            nvy nvy = this.A;
            if (nvy != null) {
                nvy.a(new nrg(this));
                this.A = null;
            }
        }
    }

    public final void a(nvz nvz) {
        this.F = true;
    }

    public final void g() {
        if (this.n > 0) {
            b(this.w);
            return;
        }
        j();
        this.d.a(0);
    }

    public final void a(nvz nvz, IOException iOException) {
        this.C = iOException;
        int i = 1;
        if (this.b <= this.G) {
            i = 1 + this.D;
        }
        this.D = i;
        this.E = SystemClock.elapsedRealtime();
        h();
    }

    public final nrs d_(int i) {
        nrh nrh = (nrh) this.f.get(i);
        if (nrh != null) {
            return nrh;
        }
        nrh = new nrh(this, this.d);
        this.f.put(i, nrh);
        return nrh;
    }

    public final void a() {
        this.j = true;
    }

    public final void a(nrq nrq) {
        this.k = nrq;
    }

    public final void a(npv npv) {
        this.l = npv;
    }

    private final void b(long j) {
        this.w = j;
        this.F = false;
        nvy nvy = this.A;
        if (nvy.b) {
            nvy.a();
            return;
        }
        j();
        h();
    }

    private final void h() {
        if (!(this.F || this.A.b)) {
            int i = 0;
            if (this.C != null) {
                if (!l()) {
                    nwf.b(this.B != null);
                    if (SystemClock.elapsedRealtime() - this.E >= Math.min((((long) this.D) - 1) * 1000, 5000)) {
                        this.C = null;
                        if (!this.m) {
                            while (i < this.f.size()) {
                                ((nrh) this.f.valueAt(i)).a();
                                i++;
                            }
                            this.B = i();
                        } else if (!this.k.a() && this.p == -1) {
                            while (i < this.f.size()) {
                                ((nrh) this.f.valueAt(i)).a();
                                i++;
                            }
                            this.B = i();
                            this.y = this.u;
                            this.x = true;
                        }
                        this.G = this.b;
                        this.A.a(this.B, this);
                    }
                }
                return;
            }
            this.z = 0;
            this.x = false;
            if (this.m) {
                nwf.b(k());
                long j = this.p;
                if (j == -1 || this.w < j) {
                    this.B = new nrf(this.h, this.i, this.a, this.d, this.e, this.k.b(this.w));
                    this.w = Long.MIN_VALUE;
                } else {
                    this.F = true;
                    this.w = Long.MIN_VALUE;
                    return;
                }
            }
            this.B = i();
            this.G = this.b;
            this.A.a(this.B, this);
        }
    }

    private final nrf i() {
        return new nrf(this.h, this.i, this.a, this.d, this.e, 0);
    }

    private final void j() {
        for (int i = 0; i < this.f.size(); i++) {
            ((nrh) this.f.valueAt(i)).a();
        }
        this.B = null;
        this.C = null;
        this.D = 0;
    }

    private final boolean k() {
        return this.w != Long.MIN_VALUE;
    }

    private final boolean l() {
        return this.C instanceof nrk;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0029 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00a0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00b1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x005c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x006d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x007e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x008f */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
    static {
        /*
        r0 = new java.util.ArrayList;
        r0.<init>();
        c = r0;
        r0 = c;	 Catch:{ ClassNotFoundException -> 0x0018 }
        r1 = "nuz";
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0018 }
        r2 = defpackage.nrc.class;
        r1 = r1.asSubclass(r2);	 Catch:{ ClassNotFoundException -> 0x0018 }
        r0.add(r1);	 Catch:{ ClassNotFoundException -> 0x0018 }
    L_0x0018:
        r0 = c;	 Catch:{ ClassNotFoundException -> 0x0029 }
        r1 = "nsr";
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0029 }
        r2 = defpackage.nrc.class;
        r1 = r1.asSubclass(r2);	 Catch:{ ClassNotFoundException -> 0x0029 }
        r0.add(r1);	 Catch:{ ClassNotFoundException -> 0x0029 }
    L_0x0029:
        r0 = c;	 Catch:{ ClassNotFoundException -> 0x003a }
        r1 = "nst";
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x003a }
        r2 = defpackage.nrc.class;
        r1 = r1.asSubclass(r2);	 Catch:{ ClassNotFoundException -> 0x003a }
        r0.add(r1);	 Catch:{ ClassNotFoundException -> 0x003a }
    L_0x003a:
        r0 = c;	 Catch:{ ClassNotFoundException -> 0x004b }
        r1 = "nsc";
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x004b }
        r2 = defpackage.nrc.class;
        r1 = r1.asSubclass(r2);	 Catch:{ ClassNotFoundException -> 0x004b }
        r0.add(r1);	 Catch:{ ClassNotFoundException -> 0x004b }
    L_0x004b:
        r0 = c;	 Catch:{ ClassNotFoundException -> 0x005c }
        r1 = "ntu";
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x005c }
        r2 = defpackage.nrc.class;
        r1 = r1.asSubclass(r2);	 Catch:{ ClassNotFoundException -> 0x005c }
        r0.add(r1);	 Catch:{ ClassNotFoundException -> 0x005c }
    L_0x005c:
        r0 = c;	 Catch:{ ClassNotFoundException -> 0x006d }
        r1 = "num";
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x006d }
        r2 = defpackage.nrc.class;
        r1 = r1.asSubclass(r2);	 Catch:{ ClassNotFoundException -> 0x006d }
        r0.add(r1);	 Catch:{ ClassNotFoundException -> 0x006d }
    L_0x006d:
        r0 = c;	 Catch:{ ClassNotFoundException -> 0x007e }
        r1 = "nru";
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x007e }
        r2 = defpackage.nrc.class;
        r1 = r1.asSubclass(r2);	 Catch:{ ClassNotFoundException -> 0x007e }
        r0.add(r1);	 Catch:{ ClassNotFoundException -> 0x007e }
    L_0x007e:
        r0 = c;	 Catch:{ ClassNotFoundException -> 0x008f }
        r1 = "nte";
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x008f }
        r2 = defpackage.nrc.class;
        r1 = r1.asSubclass(r2);	 Catch:{ ClassNotFoundException -> 0x008f }
        r0.add(r1);	 Catch:{ ClassNotFoundException -> 0x008f }
    L_0x008f:
        r0 = c;	 Catch:{ ClassNotFoundException -> 0x00a0 }
        r1 = "nui";
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x00a0 }
        r2 = defpackage.nrc.class;
        r1 = r1.asSubclass(r2);	 Catch:{ ClassNotFoundException -> 0x00a0 }
        r0.add(r1);	 Catch:{ ClassNotFoundException -> 0x00a0 }
    L_0x00a0:
        r0 = c;	 Catch:{ ClassNotFoundException -> 0x00b1 }
        r1 = "nup";
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x00b1 }
        r2 = defpackage.nrc.class;
        r1 = r1.asSubclass(r2);	 Catch:{ ClassNotFoundException -> 0x00b1 }
        r0.add(r1);	 Catch:{ ClassNotFoundException -> 0x00b1 }
    L_0x00b1:
        r0 = c;	 Catch:{ ClassNotFoundException -> 0x00c2 }
        r1 = "com.google.android.exoplayer.ext.flac.FlacExtractor";
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x00c2 }
        r2 = defpackage.nrc.class;
        r1 = r1.asSubclass(r2);	 Catch:{ ClassNotFoundException -> 0x00c2 }
        r0.add(r1);	 Catch:{ ClassNotFoundException -> 0x00c2 }
    L_0x00c2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nrd.<clinit>():void");
    }
}
