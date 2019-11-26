package defpackage;

import android.text.TextUtils;
import java.io.IOException;

/* renamed from: afco */
class afco implements noh {
    private final /* synthetic */ afbo a;

    public void a() {
    }

    public void a(int i, IOException iOException) {
        if (i == this.a.F()) {
            this.a.i.a(aevl.a(iOException, this.a.o(), this.a.c, 8));
        }
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void a(int i, nom nom, int i2, long j) {
        if (i == this.a.F()) {
            afbo afbo = this.a;
            if (afbo.s != null && afbo.E != null && afhz.a(i2)) {
                String str = nom.a;
                aajs aajs = this.a.s;
                int a = aajy.a(str);
                str = aajy.b(str);
                for (aahr aahr : aajs.l) {
                    if (aahr.b() == a && TextUtils.equals(aahr.t(), str)) {
                        break;
                    }
                }
                aahr aahr2 = null;
                if (aahr2 != null) {
                    if (aahr2.E()) {
                        afbo = this.a;
                        afbo.F = aahr2;
                        affq a2 = afbo.m.a(j);
                        afbo afbo2 = this.a;
                        afbo2.H = a2.b;
                        afbo2.J = a2.c;
                        afbo2.K = i2;
                    } else if (aahr2.F()) {
                        afbo = this.a;
                        afbo.G = aahr2;
                        if (afbo.z) {
                            afbo.K = i2;
                        }
                    } else {
                        return;
                    }
                    e();
                }
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        afbo afbo = this.a;
        boolean z = afbo.z;
        Object obj = null;
        if (!(z || afbo.F == null || afbo.G == null)) {
            obj = 1;
        }
        if ((z && afbo.G != null) || obj != null) {
            if (afbo.I == null) {
                afbo.I = afbo.E.c;
            }
            aeuy aeuy = afbo.i;
            aahr aahr = afbo.F;
            aahr aahr2 = afbo.G;
            aahr aahr3 = afbo.I;
            afgv afgv = afbo.E;
            aajq[] aajqArr = afgv.d;
            aahn[] aahnArr = afgv.e;
            afgq afgq = afbo.J;
            int i = afbo.K;
            aequ aequ = afbo.H;
            aeuy.a(new aetv(aahr, aahr2, aahr3, aajqArr, aahnArr, afgq, i, aequ.b, aequ.c));
        }
    }

    /* synthetic */ afco(afbo afbo) {
        this.a = afbo;
    }
}
