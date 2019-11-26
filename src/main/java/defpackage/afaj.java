package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: afaj */
public final class afaj {
    public final affe a;
    public final String b;
    public final aeuy c;
    public final afal d;
    public final aeoj e;
    public final afai f;
    public aahr g;
    public aahr h;
    public affh i;
    public boolean j;
    @Deprecated
    public boolean k;
    public boolean l;
    public boolean m;
    public aajs n;
    public afgv o;
    public afak p;
    public aahr q;
    public afag r;
    private afgp s;
    private Integer t;
    private aajj u;

    public afaj(afai afai, String str, aajj aajj, aeuy aeuy, aajs aajs, afgp afgp, affh affh, affe affe, afgv afgv, afjj afjj) {
        this(afai, str, aajj, aeuy, aajs, afgp, affh, affe, afgv, null, true, afjj);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public afaj(afai afai, String str, aajj aajj, aeuy aeuy, aajs aajs, afgp afgp, affh affh, affe affe, afgv afgv, aeoj aeoj, boolean z, afjj afjj) {
        this.b = str;
        this.u = aajj;
        this.c = new aeva(aeuy);
        this.d = new afal(this);
        this.n = aajs;
        this.s = afgp;
        this.i = affh;
        this.a = affe;
        this.o = afgv;
        this.e = aeoj;
        this.f = afai;
        this.k = z;
        this.r = new afag(afjj);
    }

    public final synchronized affh a() {
        return this.i;
    }

    public final synchronized afgp b() {
        return this.s;
    }

    public final synchronized Integer c() {
        return this.t;
    }

    public final synchronized aajj d() {
        return this.u;
    }

    public final synchronized aajs e() {
        return this.n;
    }

    public final synchronized afgv f() {
        return this.o;
    }

    public final synchronized afak g() {
        return this.p;
    }

    public final void a(afjs afjs, int i, afjc afjc, xhv xhv) {
        aahr a;
        afjs afjs2 = afjs;
        int i2 = i;
        aahr[] aahrArr = this.o.b;
        int k = xhv.k();
        int i3 = 0;
        if (i2 == 10001) {
            List asList = Arrays.asList(this.o.a);
            afgq afgq = this.o.f;
            aajj aajj = this.u;
            a = afgz.a(asList, afgq, xhv, aajj, aahrArr.length != 0 ? aahrArr[0].f : 0, afjs2.b, afjs2.c, aajj.ao(), afjc.a(k), k);
        } else {
            a = null;
        }
        aahr aahr = a;
        if (!(aahr == null || this.h == null || aahr.b() == this.h.b())) {
            i3 = 1;
        }
        if (!(i2 == 10001 && i3 == 0)) {
            aeuy aeuy = this.c;
            aahr aahr2 = this.q;
            aahr aahr3 = this.g;
            aahr aahr4 = this.h;
            afgv afgv = this.o;
            aeuy.a(new aetv(aahr2, aahr3, aahr4, afgv.d, afgv.e, afgv.f, i, -1, 0));
        }
        this.h = aahr;
    }

    public final synchronized void a(Integer num) {
        this.t = num;
    }

    public final synchronized void a(affh affh) {
        this.i = affh;
    }

    public final void a(afjc afjc, xhv xhv, afjs afjs) {
        if (this.p != null) {
            int i = 10001;
            if (afjs.c <= 0 && afjs.b <= 0) {
                i = 10002;
            }
            a(afjs, i, afjc, xhv);
        }
    }

    public final synchronized void a(afgv afgv) {
        this.o = afgv;
    }

    public final synchronized void a(aajj aajj, aajs aajs, afgp afgp, afgv afgv) {
        this.u = aajj;
        this.n = aajs;
        this.s = afgp;
        this.o = afgv;
    }
}
