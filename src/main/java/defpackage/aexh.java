package defpackage;

import android.text.TextUtils;
import android.view.Surface;
import java.io.IOException;

/* renamed from: aexh */
final class aexh implements obc {
    public int a;
    public odk b;
    private final afiz c = new afiz();
    private final afgk d = new afgk();
    private final oav e = new oav();
    private final aexg f;
    private final aexc g;
    private final afjj h;
    private int i;
    private int j;
    private int k;
    private int l;

    aexh(aexg aexg, aexc aexc, afjj afjj) {
        this.f = aexg;
        this.g = aexc;
        this.h = afjj;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void g() {
    }

    public final void h() {
    }

    public final void i() {
    }

    public final void j() {
    }

    public final void k() {
    }

    public final void a(obb obb) {
        this.f.a(e(obb));
    }

    public final void a(obb obb, boolean z, int i) {
        afaj e = e(obb);
        if (e != null) {
            afal afal = e.d;
            afal.a = i;
            afal.b = z;
            if (!afal.c) {
                afal.a(obb, z, i);
            }
        }
    }

    public final void a(obb obb, nyy nyy) {
        this.f.a(nyy, e(obb));
    }

    public final void a(obb obb, oag oag) {
        d(obb).a(oag.b);
    }

    public final void a(int i) {
        if (i == 0) {
            this.f.h();
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.g.h.a(0);
        } else {
            this.g.h.d(0);
        }
    }

    public final void a(int i, odk odk) {
        if (i == 2) {
            this.b = odk;
        }
    }

    public final void a(obb obb, int i, String str, long j) {
        if (i != 1) {
            aajj c;
            this.h.a(obb.a, j);
            afaj e = e(obb);
            if (e == null) {
                c = this.g.c();
            } else {
                c = e.d();
            }
            if (c.ag() && !TextUtils.isEmpty(str)) {
                d(obb).a("dec", (aevf) new aetw(str));
            }
            return;
        }
        this.h.b(obb.a, j);
    }

    public final void a(obb obb, long j, long j2) {
        aexg aexg = this.f;
        aeuy d = d(obb);
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("b.");
        stringBuilder.append(j);
        stringBuilder.append(";e.");
        stringBuilder.append(j2);
        aexg.a(d, 8, "underrun", stringBuilder.toString());
    }

    public final void a(obb obb, int i, long j) {
        afaj e = e(obb);
        if (e != null) {
            aajj d = e.d();
            aajs e2 = e.e();
            if (e2.w() && !e2.m() && d.ax() > 0) {
                long l = (long) l();
                new Object[1][0] = Long.valueOf(l);
                this.c.a(obb.a, l);
                if (this.c.a((double) d.ax())) {
                    this.c.a();
                    aexg aexg = this.f;
                    aeuy d2 = d(obb);
                    long j2 = ((long) (i * 1000)) / j;
                    StringBuilder stringBuilder = new StringBuilder(29);
                    stringBuilder.append("droprate.");
                    stringBuilder.append(j2);
                    aexg.a(d2, 8, "android.hfrdroppedframes", stringBuilder.toString());
                }
            }
        }
    }

    public final void a(int i, nzw nzw) {
        if (i == 2) {
            afkh afkh = this.g.i;
            if (nzw != null && afkh != null) {
                afkm a = this.d.a(nzw.t);
                if (a != null) {
                    a.d = nzw.s;
                }
                afkh.a(a);
            }
        }
    }

    public final void a(int i, int i2) {
        this.k = i;
        this.j = i2;
        afkh afkh = this.g.i;
        if (afkh != null && afkh.n()) {
            a(afkh);
        }
    }

    public final void a(Surface surface) {
        afkh afkh = this.g.i;
        if (afkh != null) {
            afkh.c(0);
            afkh.a(surface);
        }
    }

    public final void a(obb obb, int i, odk odk) {
        if (i == 2) {
            this.i += odk.g;
            this.a += odk.e;
            this.b = null;
            return;
        }
        d(obb).c(this.l);
    }

    public final void a(obb obb, IOException iOException) {
        this.f.a(iOException, d(obb));
    }

    public final void a(opb opb) {
        opb opb2 = opb;
        amqw.b(opb2.c instanceof afak);
        afak afak = (afak) opb2.c;
        nzw nzw = opb2.a;
        if (nzw != null) {
            String str = nzw.a;
            if (str != null) {
                afaj afaj = afak.a;
                boolean a = this.g.a();
                int i = opb2.b;
                aahr aahr = (aahr) afaj.n.v().get(str);
                if (aahr != null) {
                    if (aahr.E()) {
                        afaj.q = aahr;
                    } else if (aahr.F()) {
                        afaj.g = aahr;
                    }
                    if (afaj.k) {
                        if (afaj.h == null) {
                            afaj.h = afak.b.c;
                        }
                        if (afaj.q == null || afaj.g == null) {
                            if (afaj.g != null) {
                                return;
                            }
                            if (!afaj.n.n() && a) {
                                return;
                            }
                        }
                        aeuy aeuy = afaj.c;
                        aahr aahr2 = afaj.q;
                        aahr aahr3 = afaj.g;
                        aahr aahr4 = afaj.h;
                        afgv afgv = afaj.o;
                        aajq[] aajqArr = afgv.d;
                        aahn[] aahnArr = afgv.e;
                        afgq afgq = afgv.f;
                        aequ aequ = afak.c;
                        aeuy.a(new aetv(aahr2, aahr3, aahr4, aajqArr, aahnArr, afgq, i, aequ.b, aequ.c));
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public final void a(obb obb, Exception exception) {
        this.f.a(exception, d(obb));
    }

    public final void a(obb obb, int i) {
        this.l = i;
        d(obb).b(i);
    }

    public final void b(obb obb) {
        afaj e = e(obb);
        if (e != null) {
            e.d.c = true;
        }
    }

    public final void c(obb obb) {
        afaj e = e(obb);
        if (e != null) {
            afal afal = e.d;
            if (afal.c) {
                afal.c = false;
                afal.a(obb, afal.b, afal.a);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final int l() {
        int i = this.i;
        odk odk = this.b;
        return i + (odk != null ? odk.g : 0);
    }

    /* Access modifiers changed, original: final */
    public final void a(afkh afkh) {
        afkh.a(this.k, this.j);
    }

    private final aeuy d(obb obb) {
        afaj e = e(obb);
        return e == null ? this.g.d() : e.c;
    }

    private final afaj e(obb obb) {
        if (!obb.b.c()) {
            obb.b.a(obb.c, this.e, true);
            Object obj = this.e.a;
            if (obj instanceof afaj) {
                return (afaj) obj;
            }
        }
        return this.g.j;
    }
}
