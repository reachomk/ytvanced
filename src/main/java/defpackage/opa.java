package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.util.Arrays;

/* renamed from: opa */
final class opa implements ofo, ooj, opo, owh, owl {
    public static final nzw a = nzw.a("icy", "application/x-icy", Long.MAX_VALUE);
    private final owf A;
    private final ouw B;
    private final ope C;
    private final Runnable D;
    private boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private long I;
    private boolean J;
    private int K;
    public final oop b;
    public final oph c;
    public final String d;
    public final long e;
    public final owi f = new owi("Loader:ProgressiveMediaPeriod");
    public final oyf g;
    public final Runnable h;
    public final Handler i;
    public ooi j;
    public ofu k;
    public olu l;
    public opm[] m;
    public opi[] n;
    public boolean o;
    public boolean p;
    public opg q;
    public boolean r;
    public int s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    private final Uri y;
    private final ovi z;

    public opa(Uri uri, ovi ovi, ofm[] ofmArr, owf owf, oop oop, oph oph, ouw ouw, String str, int i) {
        this.y = uri;
        this.z = ovi;
        this.A = owf;
        this.b = oop;
        this.c = oph;
        this.B = ouw;
        this.d = str;
        this.e = (long) i;
        this.C = new ope(ofmArr);
        this.g = new oyf();
        this.D = new opd(this);
        this.h = new opc(this);
        this.i = new Handler();
        this.n = new opi[0];
        this.m = new opm[0];
        this.I = -9223372036854775807L;
        this.u = -1;
        this.t = -9223372036854775807L;
        this.s = 1;
        oop.a();
    }

    public final void a(long j) {
    }

    public final void f() {
        for (opm a : this.m) {
            a.a();
        }
        ope ope = this.C;
        ofm ofm = ope.a;
        if (ofm != null) {
            ofm.c();
            ope.a = null;
        }
    }

    public final void a(ooi ooi, long j) {
        this.j = ooi;
        this.g.a();
        l();
    }

    public final void aT_() {
        g();
        if (this.w && !this.p) {
            throw new oae("Loading finished before preparation is complete.");
        }
    }

    public final opz b() {
        return k().b;
    }

    public final long a(oum[] oumArr, boolean[] zArr, opr[] oprArr, boolean[] zArr2, long j) {
        int i;
        int i2;
        opg k = k();
        opz opz = k.b;
        boolean[] zArr3 = k.d;
        int i3 = this.H;
        int i4 = 0;
        int i5 = 0;
        while (i5 < oumArr.length) {
            opr opr = oprArr[i5];
            if (opr != null && (oumArr[i5] == null || !zArr[i5])) {
                i = ((opj) opr).a;
                oxz.b(zArr3[i]);
                this.H--;
                zArr3[i] = false;
                oprArr[i5] = null;
            }
            i5++;
        }
        Object obj = (this.E ? i3 == 0 : j != 0) ? 1 : null;
        Object obj2 = obj;
        for (i2 = 0; i2 < oumArr.length; i2++) {
            if (oprArr[i2] == null) {
                oum oum = oumArr[i2];
                if (oum != null) {
                    oxz.b(oum.g() == 1);
                    oxz.b(oum.b(0) == 0);
                    i = opz.a(oum.f());
                    oxz.b(zArr3[i] ^ 1);
                    this.H++;
                    zArr3[i] = true;
                    oprArr[i2] = new opj(this, i);
                    zArr2[i2] = true;
                    if (obj2 == null) {
                        opm opm = this.m[i];
                        opm.h();
                        obj2 = (opm.a(j, true) != -1 || opm.e() == 0) ? null : 1;
                    }
                }
            }
        }
        if (this.H == 0) {
            this.J = false;
            this.F = false;
            opm[] opmArr;
            if (this.f.a()) {
                opmArr = this.m;
                i2 = opmArr.length;
                while (i4 < i2) {
                    opmArr[i4].i();
                    i4++;
                }
                this.f.b();
            } else {
                opmArr = this.m;
                i2 = opmArr.length;
                while (i4 < i2) {
                    opmArr[i4].a();
                    i4++;
                }
            }
        } else if (obj2 != null) {
            j = b(j);
            while (i4 < oprArr.length) {
                if (oprArr[i4] != null) {
                    zArr2[i4] = true;
                }
                i4++;
            }
        }
        this.E = true;
        return j;
    }

    public final void a(long j, boolean z) {
        if (!n()) {
            boolean[] zArr = k().d;
            int length = this.m.length;
            for (int i = 0; i < length; i++) {
                this.m[i].a(j, z, zArr[i]);
            }
        }
    }

    public final boolean c(long j) {
        if (this.w || this.J || (this.p && this.H == 0)) {
            return false;
        }
        boolean a = this.g.a();
        if (!this.f.a()) {
            l();
            a = true;
        }
        return a;
    }

    public final long e() {
        return this.H != 0 ? d() : Long.MIN_VALUE;
    }

    public final long c() {
        if (!this.G) {
            this.b.c();
            this.G = true;
        }
        if (!this.F || (!this.w && m() <= this.K)) {
            return -9223372036854775807L;
        }
        this.F = false;
        return this.v;
    }

    public final long d() {
        boolean[] zArr = k().c;
        if (this.w) {
            return Long.MIN_VALUE;
        }
        if (n()) {
            return this.I;
        }
        long j;
        if (this.r) {
            int length = this.m.length;
            int i = 0;
            j = Long.MAX_VALUE;
            while (i < length) {
                if (zArr[i] && !this.m[i].a.e()) {
                    j = Math.min(j, this.m[i].g());
                }
                i++;
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = j();
        }
        return j == Long.MIN_VALUE ? this.v : j;
    }

    public final long b(long j) {
        opg k = k();
        ofu ofu = k.a;
        boolean[] zArr = k.c;
        if (!ofu.aS_()) {
            j = 0;
        }
        int i = 0;
        this.F = false;
        this.v = j;
        if (n()) {
            this.I = j;
            return j;
        }
        int length;
        if (this.s != 7) {
            length = this.m.length;
            int i2 = 0;
            while (i2 < length) {
                opm opm = this.m[i2];
                opm.h();
                if (opm.a(j, false) != -1 || (!zArr[i2] && this.r)) {
                    i2++;
                }
            }
            return j;
        }
        this.J = false;
        this.I = j;
        this.w = false;
        if (this.f.a()) {
            this.f.b();
        } else {
            opm[] opmArr = this.m;
            length = opmArr.length;
            while (i < length) {
                opmArr[i].a();
                i++;
            }
        }
        return j;
    }

    public final long a(long j, oap oap) {
        ofu ofu = k().a;
        if (!ofu.aS_()) {
            return 0;
        }
        ofx a = ofu.a(j);
        return ozp.a(j, oap, a.a.b, a.b.b);
    }

    /* Access modifiers changed, original: final */
    public final void g() {
        this.f.a(this.A.a(this.s));
    }

    public final void a(int i) {
        opg k = k();
        boolean[] zArr = k.e;
        if (!zArr[i]) {
            nzw a = k.b.a(i).a(0);
            this.b.a(oyu.g(a.i), a, 0, null, this.v);
            zArr[i] = true;
        }
    }

    public final void b(int i) {
        boolean[] zArr = k().c;
        if (this.J && zArr[i] && !this.m[i].c()) {
            this.I = 0;
            i = 0;
            this.J = false;
            this.F = true;
            this.v = 0;
            this.K = 0;
            opm[] opmArr = this.m;
            int length = opmArr.length;
            while (i < length) {
                opmArr[i].a();
                i++;
            }
            ((ooi) oxz.a(this.j)).a(this);
        }
    }

    public final boolean h() {
        return this.F || n();
    }

    public final ofy a(int i, int i2) {
        return a(new opi(i, false));
    }

    public final void a() {
        this.o = true;
        this.i.post(this.D);
    }

    public final void a(ofu ofu) {
        if (this.l != null) {
            ofu = new ofw(-9223372036854775807L);
        }
        this.k = ofu;
        this.i.post(this.D);
    }

    public final void i() {
        this.i.post(this.D);
    }

    public final ofy a(opi opi) {
        int length = this.m.length;
        for (int i = 0; i < length; i++) {
            if (opi.equals(this.n[i])) {
                return this.m[i];
            }
        }
        opm opm = new opm(this.B);
        opm.d = this;
        int i2 = length + 1;
        Object[] objArr = (opi[]) Arrays.copyOf(this.n, i2);
        objArr[length] = opi;
        this.n = (opi[]) ozp.a(objArr);
        Object[] objArr2 = (opm[]) Arrays.copyOf(this.m, i2);
        objArr2[length] = opm;
        this.m = (opm[]) ozp.a(objArr2);
        return opm;
    }

    private final opg k() {
        return (opg) oxz.a(this.q);
    }

    private final void a(opf opf) {
        if (this.u == -1) {
            this.u = opf.d;
        }
    }

    private final void l() {
        opf opf = new opf(this, this.y, this.z, this.C, this, this.g);
        if (this.p) {
            ofu ofu = k().a;
            oxz.b(n());
            long j = this.t;
            if (j == -9223372036854775807L || this.I < j) {
                opf.a(ofu.a(this.I).a.c, this.I);
                this.I = -9223372036854775807L;
            } else {
                this.w = true;
                this.I = -9223372036854775807L;
                return;
            }
        }
        this.K = m();
        this.f.a(opf, this, this.A.a(this.s));
        this.b.a(1, -1, null, 0, null, opf.b, this.t);
    }

    private final int m() {
        int i = 0;
        for (opm b : this.m) {
            i += b.b();
        }
        return i;
    }

    public final long j() {
        long j = Long.MIN_VALUE;
        for (opm g : this.m) {
            j = Math.max(j, g.g());
        }
        return j;
    }

    private final boolean n() {
        return this.I != -9223372036854775807L;
    }

    public final /* synthetic */ void a(owm owm, long j, long j2, boolean z) {
        opf opf = (opf) owm;
        this.b.c(1, -1, null, 0, null, opf.b, this.t);
        if (!z) {
            a(opf);
            for (opm a : this.m) {
                a.a();
            }
            if (this.H > 0) {
                ((ooi) oxz.a(this.j)).a(this);
            }
        }
    }

    public final /* synthetic */ void a(owm owm, long j, long j2) {
        opf opf = (opf) owm;
        if (this.t == -9223372036854775807L) {
            ofu ofu = this.k;
            if (ofu != null) {
                boolean aS_ = ofu.aS_();
                long j3 = j();
                j3 = j3 != Long.MIN_VALUE ? j3 + 10000 : 0;
                this.t = j3;
                this.c.a(j3, aS_);
            }
        }
        this.b.b(1, -1, null, 0, null, opf.b, this.t);
        a(opf);
        this.w = true;
        ((ooi) oxz.a(this.j)).a(this);
    }
}
