package defpackage;

import com.google.android.youtube.R;

/* renamed from: dlo */
final class dlo implements vat {
    private final vav a;
    private final /* synthetic */ dlm b;

    private final xwb a() {
        dlm dlm = this.b;
        Object obj = dlm.n;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = dlm.n;
                if (obj2 instanceof baqe) {
                    int a = fmv.a(dlm.o.ox());
                    if (a == 1) {
                        obj2 = xwb.a(R.style.f552Theme.YouTube.Verification.Light);
                    } else if (a == 2) {
                        obj2 = xwb.a(R.style.f551Theme.YouTube.Verification.Dark);
                    } else {
                        throw new AssertionError(String.format("Unrecognized theme type: %d", new Object[]{Integer.valueOf(a)}));
                    }
                    obj2 = (xwb) baqd.a(obj2, "Cannot return null from a non-@Nullable @Provides method");
                    dlm.n = bapx.a(dlm.n, obj2);
                }
            }
            obj = obj2;
        }
        return vau.a((xwb) obj);
    }

    public final void a(vac vac) {
        vac.b = vax.a(this.a);
        vac.c = this.b.c();
    }

    public final void a(vap vap) {
        Object obj;
        vap.Z = this.b.c();
        dlm dlm = this.b;
        Object obj2 = dlm.l;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = dlm.l;
                if (obj instanceof baqe) {
                    obj = (vam) baqd.a(dlm.b.a.r, "Cannot return null from a non-@Nullable @Provides method");
                    dlm.l = bapx.a(dlm.l, obj);
                }
            }
            obj2 = obj;
        }
        vap.aa = (vam) obj2;
        dlm = this.b;
        obj2 = dlm.m;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = dlm.m;
                if (obj instanceof baqe) {
                    obj = (acvx) baqd.a(dlm.d(), "Cannot return null from a non-@Nullable @Provides method");
                    dlm.m = bapx.a(dlm.m, obj);
                }
            }
            obj2 = obj;
        }
        vap.ab = (acvx) obj2;
    }

    public final void a(vba vba) {
        vba.b = vaz.a(this.a);
        vba.c = a();
    }

    public final void a(vbg vbg) {
        vbg.ae = vay.a(this.a);
        vbg.af = this.b.c();
        vbg.ag = a();
    }

    public final void a(vbp vbp) {
        vbp.ad = vaw.a(this.a);
        vbp.ae = this.b.c();
    }

    public final void a(vbs vbs) {
        vbs.b = vbb.a(this.a);
    }

    /* synthetic */ dlo(dlm dlm, vav vav) {
        this.b = dlm;
        this.a = vav;
    }
}
