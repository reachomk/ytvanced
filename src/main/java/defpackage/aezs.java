package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aezs */
final class aezs implements ooj, opt, oqn {
    public final oop a;
    public oqk[] b;
    private final aajj c;
    private final aajs d;
    private final String e;
    private final aezw f;
    private final afhg g;
    private final owt h;
    private final opz i;
    private final aezv[] j;
    private final afgp k;
    private final ouw l;
    private ooi m;
    private final boolean n;
    private final aezk o;
    private onw p;
    private final afaf q;

    aezs(afhg afhg, owt owt, oop oop, ouw ouw, aajj aajj, aajs aajs, afgp afgp, aezw aezw, aezk aezk, String str) {
        aajs aajs2 = aajs;
        amqw.a(aajs2.n.isEmpty() ^ 1);
        this.c = aajj;
        this.d = aajs2;
        this.e = str;
        this.f = aezw;
        this.g = afhg;
        this.h = owt;
        List<aahr> list = aajs2.n;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (aahr aahr : list) {
            nzw H = aahr.H();
            if (aahr.F()) {
                arrayList.add(H);
                arrayList3.add(aahr);
            } else if (aahr.E()) {
                arrayList2.add(H);
                arrayList4.add(aahr);
            }
        }
        opz opz = new opz(new opx((nzw[]) arrayList.toArray(new nzw[arrayList.size()])), new opx((nzw[]) arrayList2.toArray(new nzw[arrayList2.size()])));
        this.i = (opz) new Object[]{opz, new aezv[]{new aezv(1, (aahr[]) arrayList3.toArray(new aahr[arrayList.size()])), new aezv(2, (aahr[]) arrayList4.toArray(new aahr[arrayList2.size()]))}}[0];
        this.j = r9;
        this.k = afgp;
        this.a = oop;
        this.l = ouw;
        this.n = false;
        this.o = aezk;
        this.b = new oqk[0];
        this.p = new onw(this.b);
        this.q = new afaf((long) ((aahr) aajs2.n.get(0)).o());
        oop.a();
    }

    public final long a(long j, oap oap) {
        return j;
    }

    public final void aT_() {
    }

    public final long c() {
        return -9223372036854775807L;
    }

    public final void f() {
    }

    public final void a(ooi ooi, long j) {
        this.m = ooi;
        ooi.a(this);
    }

    public final opz b() {
        return this.i;
    }

    public final long a(oum[] oumArr, boolean[] zArr, opr[] oprArr, boolean[] zArr2, long j) {
        oum[] oumArr2 = oumArr;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (i < oumArr2.length) {
            oqk oqk;
            oum oum = oumArr2[i];
            opr opr = oprArr[i];
            if (opr instanceof oqk) {
                oqk = (oqk) opr;
                if (oum == null || !zArr[i]) {
                    this.q.b((aezg) oqk.b);
                    oqk.c();
                    oprArr[i] = null;
                } else {
                    sparseArray.put(this.i.a(oum.f()), oqk);
                }
            }
            if (oprArr[i] == null && oum != null) {
                aezv aezv = this.j[i];
                aajj aajj = this.c;
                aahr[] aahrArr = aezv.b;
                afhg afhg = this.g;
                owt owt = this.h;
                aezw aezw = this.f;
                afgp afgp = this.k;
                afaf afaf = this.q;
                aezg aezg = new aezg(aajj, aahrArr, afhg, owt, aezw, oum, afgp, afaf, this.o, this.e, aezv.a, false);
                this.q.a(aezg);
                oqk = new oqk(aezv.a, aezg, this, this.l, !this.d.g() ? j : 0, new ovt(this.c.X()), this.a);
                sparseArray.put(this.i.a(oum.f()), oqk);
                oprArr[i] = oqk;
                zArr2[i] = true;
            }
            i++;
        }
        this.b = new oqk[sparseArray.size()];
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            this.b[i2] = (oqk) sparseArray.valueAt(i2);
        }
        this.p = new onw(this.b);
        return j;
    }

    public final void a(long j, boolean z) {
        for (oqk a : this.b) {
            a.a(j, z);
        }
    }

    public final long b(long j) {
        for (oqk b : this.b) {
            b.b(j);
        }
        return j;
    }

    public final long d() {
        return this.p.d();
    }

    public final long e() {
        long e = this.p.e();
        if (e != -9223372036854775807L) {
            return e;
        }
        long j = Long.MAX_VALUE;
        for (oqk oqk : this.b) {
            aezr aezr = ((aezg) oqk.b).b;
            long j2 = aezr != null ? aezr.r : -9223372036854775807L;
            if (!(j2 == -9223372036854775807L || j2 == Long.MIN_VALUE)) {
                j = Math.min(j, j2);
            }
        }
        return j == Long.MAX_VALUE ? 0 : j;
    }

    public final boolean c(long j) {
        return this.p.c(j);
    }

    public final void a(long j) {
        this.p.a(j);
    }
}
