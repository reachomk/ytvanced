package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: oqk */
public final class oqk implements opq, opr, owh, owl {
    public final int a;
    public final oqm b;
    private final boolean[] c = new boolean[0];
    private final opt d;
    private final oop e;
    private final owf f;
    private final owi g = new owi("Loader:ChunkSampleStream");
    private final oql h = new oql();
    private final ArrayList i = new ArrayList();
    private final List j = Collections.unmodifiableList(this.i);
    private final opm k;
    private final opm[] l = new opm[0];
    private final oqe m;
    private nzw n;
    private oqn o;
    private long p;
    private long q;
    private int r;
    private long s;
    private boolean t;

    public oqk(int i, oqm oqm, opt opt, ouw ouw, long j, owf owf, oop oop) {
        this.a = i;
        this.b = oqm;
        this.d = opt;
        this.e = oop;
        this.f = owf;
        int[] iArr = new int[1];
        opm[] opmArr = new opm[1];
        this.k = new opm(ouw);
        iArr[0] = i;
        opmArr[0] = this.k;
        this.m = new oqe(iArr, opmArr);
        this.p = j;
        this.q = j;
    }

    public final void a(long j, boolean z) {
        if (!g()) {
            int d = this.k.d();
            this.k.a(j, z, true);
            int d2 = this.k.d();
            if (d2 > d) {
                long f = this.k.a.f();
                int i = 0;
                while (true) {
                    opm[] opmArr = this.l;
                    if (i >= opmArr.length) {
                        break;
                    }
                    opmArr[i].a(f, z, this.c[i]);
                    i++;
                }
            }
            d2 = Math.min(a(d2, 0), this.r);
            if (d2 > 0) {
                ozp.a(this.i, 0, d2);
                this.r -= d2;
            }
        }
    }

    public final long d() {
        if (this.t) {
            return Long.MIN_VALUE;
        }
        if (g()) {
            return this.p;
        }
        long j = this.q;
        oqc i = i();
        if (!i.e()) {
            if (this.i.size() > 1) {
                ArrayList arrayList = this.i;
                i = (oqc) arrayList.get(arrayList.size() - 2);
            } else {
                i = null;
            }
        }
        if (i != null) {
            j = Math.max(j, i.k);
        }
        return Math.max(j, this.k.g());
    }

    public final void b(long j) {
        this.q = j;
        if (g()) {
            this.p = j;
            return;
        }
        oqc oqc;
        boolean a;
        int i = 0;
        int i2 = 0;
        while (true) {
            oqc = null;
            if (i2 >= this.i.size()) {
                break;
            }
            oqc oqc2 = (oqc) this.i.get(i2);
            long j2 = oqc2.j;
            if (j2 != j || oqc2.a != -9223372036854775807L) {
                if (j2 > j) {
                    break;
                }
                i2++;
            } else {
                oqc = oqc2;
                break;
            }
        }
        this.k.h();
        if (oqc != null) {
            a = this.k.a.a(oqc.a(0));
            this.s = 0;
        } else {
            a = this.k.a(j, (j > e() ? 1 : (j == e() ? 0 : -1)) < 0) != -1;
            this.s = this.q;
        }
        if (a) {
            this.r = a(this.k.e(), 0);
            for (opm opm : this.l) {
                opm.h();
                opm.a(j, false);
            }
        } else {
            this.p = j;
            this.t = false;
            this.i.clear();
            this.r = 0;
            if (this.g.a()) {
                this.g.b();
                return;
            }
            this.k.a();
            opm[] opmArr = this.l;
            int length = opmArr.length;
            while (i < length) {
                opmArr[i].a();
                i++;
            }
        }
    }

    public final void c() {
        a(null);
    }

    public final void a(oqn oqn) {
        this.o = oqn;
        this.k.i();
        for (opm i : this.l) {
            i.i();
        }
        this.g.a((owl) this);
    }

    public final void f() {
        this.k.a();
        for (opm a : this.l) {
            a.a();
        }
        oqn oqn = this.o;
        if (oqn != null) {
            oqn.f();
        }
    }

    public final boolean a() {
        boolean z = true;
        if (!this.t) {
            if (!g()) {
                return this.k.c() ? z : false;
            } else {
                z = false;
            }
        }
    }

    public final void b() {
        this.g.a((int) aocf.UNSET_ENUM_VALUE);
        if (!this.g.a()) {
            this.b.a();
        }
    }

    public final int a(nzy nzy, odj odj, boolean z) {
        if (g()) {
            return -3;
        }
        h();
        return this.k.a(nzy, odj, z, this.t, this.s);
    }

    public final int c_(long j) {
        int i = 0;
        if (!g()) {
            if (!this.t || j <= this.k.g()) {
                int a = this.k.a(j, true);
                if (a != -1) {
                    i = a;
                }
            } else {
                i = this.k.j();
            }
            h();
        }
        return i;
    }

    public final boolean c(long j) {
        int i = 0;
        if (!(this.t || this.g.a())) {
            List emptyList;
            long j2;
            boolean g = g();
            if (g) {
                emptyList = Collections.emptyList();
                j2 = this.p;
            } else {
                emptyList = this.j;
                j2 = i().k;
            }
            long j3 = j2;
            long j4 = j;
            this.b.a(j4, j3, emptyList, this.h);
            oql oql = this.h;
            boolean z = oql.b;
            oqh oqh = oql.a;
            oql.a = null;
            oql.b = false;
            if (z) {
                this.p = -9223372036854775807L;
                this.t = true;
                return true;
            } else if (oqh != null) {
                if (oqh instanceof oqc) {
                    oqc oqc = (oqc) oqh;
                    if (g) {
                        long j5 = oqc.j;
                        long j6 = this.p;
                        if (j5 == j6) {
                            j6 = 0;
                        }
                        this.s = j6;
                        this.p = -9223372036854775807L;
                    }
                    oqe oqe = this.m;
                    oqc.c = oqe;
                    int[] iArr = new int[oqe.a.length];
                    while (true) {
                        opm[] opmArr = oqe.a;
                        if (i >= opmArr.length) {
                            break;
                        }
                        opm opm = opmArr[i];
                        if (opm != null) {
                            iArr[i] = opm.b();
                        }
                        i++;
                    }
                    oqc.d = iArr;
                    this.i.add(oqc);
                }
                this.g.a(oqh, this, this.f.a(oqh.f));
                this.e.a(oqh.f, this.a, oqh.g, oqh.h, oqh.i, oqh.j, oqh.k);
                return true;
            }
        }
        return false;
    }

    public final long e() {
        if (g()) {
            return this.p;
        }
        return !this.t ? i().k : Long.MIN_VALUE;
    }

    public final void a(long j) {
        if (!this.g.a() && !g()) {
            int size = this.i.size();
            int a = this.b.a(j, this.j);
            if (size > a) {
                while (a < size) {
                    if (!a(a)) {
                        break;
                    }
                    a++;
                }
                a = size;
                if (a != size) {
                    long j2 = i().k;
                    oqc b = b(a);
                    if (this.i.isEmpty()) {
                        this.p = this.q;
                    }
                    this.t = false;
                    oop oop = this.e;
                    oop.a(new opb(null, 3, null, oop.a(b.j), oop.a(j2)));
                }
            }
        }
    }

    private final boolean a(int i) {
        oqc oqc = (oqc) this.i.get(i);
        if (this.k.e() > oqc.a(0)) {
            return true;
        }
        int i2 = 0;
        while (true) {
            opm[] opmArr = this.l;
            if (i2 >= opmArr.length) {
                return false;
            }
            int i3 = i2 + 1;
            if (opmArr[i2].e() > oqc.a(i3)) {
                return true;
            }
            i2 = i3;
        }
    }

    private final boolean g() {
        return this.p != -9223372036854775807L;
    }

    private final void h() {
        int a = a(this.k.e(), this.r - 1);
        while (true) {
            int i = this.r;
            if (i <= a) {
                this.r = i + 1;
                oqc oqc = (oqc) this.i.get(i);
                nzw nzw = oqc.g;
                if (!nzw.equals(this.n)) {
                    this.e.a(this.a, nzw, oqc.h, oqc.i, oqc.j);
                }
                this.n = nzw;
            } else {
                return;
            }
        }
    }

    private final int a(int i, int i2) {
        while (true) {
            i2++;
            if (i2 >= this.i.size()) {
                return this.i.size() - 1;
            }
            if (((oqc) this.i.get(i2)).a(0) > i) {
                return i2 - 1;
            }
        }
    }

    private final oqc i() {
        ArrayList arrayList = this.i;
        return (oqc) arrayList.get(arrayList.size() - 1);
    }

    private final oqc b(int i) {
        oqc oqc = (oqc) this.i.get(i);
        List list = this.i;
        ozp.a(list, i, list.size());
        this.r = Math.max(this.r, this.i.size());
        int i2 = 0;
        this.k.a(oqc.a(0));
        while (true) {
            opm[] opmArr = this.l;
            if (i2 >= opmArr.length) {
                return oqc;
            }
            int i3 = i2 + 1;
            opmArr[i2].a(oqc.a(i3));
            i2 = i3;
        }
    }

    public final /* synthetic */ owk a(owm owm, long j, long j2, IOException iOException, int i) {
        boolean z;
        IOException iOException2 = iOException;
        oqh oqh = (oqh) owm;
        boolean z2 = oqh instanceof oqc;
        int size = this.i.size() - 1;
        if (oqh.c() != 0 && z2 && a(size)) {
            z = false;
        } else {
            z = true;
        }
        owk owk = null;
        if (this.b.a(oqh, z, (Exception) iOException, z ? this.f.a(iOException2) : -9223372036854775807L)) {
            if (z) {
                owk = owi.b;
                if (z2) {
                    oxz.b(b(size) == oqh);
                    if (this.i.isEmpty()) {
                        this.p = this.q;
                    }
                }
            } else {
                oyp.a("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            }
        }
        if (owk == null) {
            long a = this.f.a(iOException2, i);
            if (a != -9223372036854775807L) {
                owk = owi.a(false, a);
            } else {
                owk = owi.c;
            }
        }
        owk owk2 = owk;
        boolean a2 = owk2.a() ^ 1;
        this.e.a(oqh.f, this.a, oqh.g, oqh.h, oqh.i, oqh.j, oqh.k, iOException, a2);
        if (a2) {
            this.d.a(this);
        }
        return owk2;
    }

    public final /* synthetic */ void a(owm owm, long j, long j2, boolean z) {
        oqh oqh = (oqh) owm;
        this.e.c(oqh.f, this.a, oqh.g, oqh.h, oqh.i, oqh.j, oqh.k);
        if (!z) {
            this.k.a();
            for (opm a : this.l) {
                a.a();
            }
            this.d.a(this);
        }
    }
}
