package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: afaw */
final class afaw implements ooj, opt {
    public final oop a;
    public List b;
    private final ouw c;
    private final String d;
    private final afas e;
    private final onz f = new ony();
    private final aajs g;
    private final int h;
    private final afjj i;
    private final long j;
    private final opz k;
    private final owt l;
    private ooi m;
    private opq n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;

    afaw(ouw ouw, String str, afas afas, oop oop, int i, aajs aajs, afjj afjj, long j, owt owt) {
        this.c = ouw;
        this.d = str;
        this.e = afas;
        this.a = oop;
        this.g = aajs;
        this.h = i;
        this.i = afjj;
        this.j = j;
        this.l = owt;
        this.b = Collections.emptyList();
        this.n = this.f.a(g());
        this.i.a.a(new aejj());
        ArrayList arrayList = new ArrayList(2);
        aajs aajs2 = this.g;
        List list = aajs2.o;
        List list2 = aajs2.p;
        nzw[] nzwArr = new nzw[list.size()];
        nzw[] nzwArr2 = new nzw[list2.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            nzwArr[i2] = ((aahr) list.get(i2)).H();
        }
        for (int i3 = 0; i3 < list2.size(); i3++) {
            nzwArr2[i3] = ((aahr) list2.get(i3)).H();
        }
        if (nzwArr.length > 0) {
            arrayList.add(new opx(nzwArr));
        }
        if (nzwArr2.length > 0) {
            arrayList.add(new opx(nzwArr2));
        }
        this.i.a.a(new aejk());
        this.k = new opz((opx[]) arrayList.toArray(new opx[0]));
        oop.a();
    }

    public final void aT_() {
    }

    public final long c() {
        return -9223372036854775807L;
    }

    public final synchronized void a(ooi ooi, long j) {
        this.m = ooi;
        ooi.a(this);
    }

    public final opz b() {
        return this.k;
    }

    public final long a(oum[] oumArr, boolean[] zArr, opr[] oprArr, boolean[] zArr2, long j) {
        oum[] oumArr2 = oumArr;
        opr[] oprArr2 = oprArr;
        this.i.a.a(new aejp());
        int i = 0;
        while (i < oumArr2.length) {
            if (oumArr2[i] == null || !zArr[i]) {
                opr opr = oprArr2[i];
                if (opr instanceof oqk) {
                    ((oqk) opr).c();
                }
                oprArr2[i] = null;
            }
            if (oprArr2[i] == null && oumArr2[i] != null) {
                int i2;
                int i3 = (i == 0 || i == 3) ? 1 : 2;
                zArr2[i] = true;
                this.i.a.a(new aejl());
                oqx a = this.g.a(this.d);
                this.i.a.a(new aejm());
                ArrayList arrayList = new ArrayList();
                List list = a.a().a;
                for (i2 = 0; i2 < list.size(); i2++) {
                    if (((oqy) list.get(i2)).a == i3) {
                        arrayList.add(Integer.valueOf(i2));
                    }
                }
                int[] iArr = new int[arrayList.size()];
                for (i2 = 0; i2 < iArr.length; i2++) {
                    iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                afas afas = this.e;
                oprArr2[i] = new oqk(i3, afas.a(a, afas.a, iArr, oumArr2[i], i3, this.l, afas.b, afas.c), this, this.c, j, new ovt(this.h), this.a);
            }
            i++;
        }
        this.b = new ArrayList();
        for (opr opr2 : oprArr2) {
            if (opr2 instanceof oqk) {
                this.b.add((oqk) opr2);
            }
        }
        this.n = this.f.a(g());
        this.i.a.a(new aejq());
        return j;
    }

    public final void a(long j, boolean z) {
        if (!this.s) {
            this.i.a.a(new aejn());
        }
        for (oqk a : this.b) {
            a.a(j, z);
        }
        if (!this.s) {
            this.i.a.a(new aejo());
        }
        this.s = true;
    }

    public final long b(long j) {
        for (oqk b : this.b) {
            b.b(j);
        }
        return j;
    }

    public final long a(long j, oap oap) {
        for (oqk oqk : this.b) {
            if (oqk.a == 2) {
                return oqk.b.a(j, oap);
            }
        }
        return j;
    }

    public final long d() {
        long j = 0;
        long j2 = 0;
        for (oqk oqk : this.b) {
            int i = oqk.a;
            if (i == 1) {
                j = oqk.d();
            } else if (i == 2) {
                j2 = oqk.d();
            } else {
                afpf afpf = afpf.media;
                int i2 = oqk.a;
                StringBuilder stringBuilder = new StringBuilder(42);
                stringBuilder.append("Unexpected primary track type: ");
                stringBuilder.append(i2);
                afpc.a(1, afpf, stringBuilder.toString());
            }
        }
        if (!this.o && j >= this.j / 2) {
            this.i.i();
            this.o = true;
        }
        if (!this.q && j >= this.j) {
            this.i.j();
            this.q = true;
        }
        if (!this.p && j2 >= this.j / 2) {
            this.i.g();
            this.p = true;
        }
        if (!this.r && j2 >= this.j) {
            this.i.h();
            this.r = true;
        }
        return this.n.d();
    }

    public final long e() {
        return this.n.e();
    }

    public final boolean c(long j) {
        return this.n.c(j);
    }

    public final void a(long j) {
        this.n.a(j);
    }

    public final void f() {
        this.m.a(this);
    }

    private final opq[] g() {
        List list = this.b;
        return (opq[]) list.toArray(new opq[list.size()]);
    }
}
