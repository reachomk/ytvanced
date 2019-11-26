package defpackage;

import com.google.android.youtube.R;

/* renamed from: djy */
final class djy implements vat {
    private final vav a;
    private final /* synthetic */ dju b;

    private final xwb a() {
        dju dju = this.b;
        Object obj = dju.R;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = dju.R;
                if (obj2 instanceof baqe) {
                    obj2 = (xwb) baqd.a(xwb.a(R.style.f551Theme.YouTube.Verification.Dark), "Cannot return null from a non-@Nullable @Provides method");
                    dju.R = bapx.a(dju.R, obj2);
                }
            }
            obj = obj2;
        }
        return vau.a((xwb) obj);
    }

    public final void a(vac vac) {
        vac.b = vax.a(this.a);
        vac.c = this.b.m();
    }

    public final void a(vap vap) {
        vap.Z = this.b.m();
        dju dju = this.b;
        Object obj = dju.Q;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = dju.Q;
                if (obj2 instanceof baqe) {
                    obj2 = (vam) baqd.a(dju.a.a, "Cannot return null from a non-@Nullable @Provides method");
                    dju.Q = bapx.a(dju.Q, obj2);
                }
            }
            obj = obj2;
        }
        vap.aa = (vam) obj;
        vap.ab = this.b.n();
    }

    public final void a(vba vba) {
        vba.b = vaz.a(this.a);
        vba.c = a();
    }

    public final void a(vbg vbg) {
        vbg.ae = vay.a(this.a);
        vbg.af = this.b.m();
        vbg.ag = a();
    }

    public final void a(vbp vbp) {
        vbp.ad = vaw.a(this.a);
        vbp.ae = this.b.m();
    }

    public final void a(vbs vbs) {
        vbs.b = vbb.a(this.a);
    }

    /* synthetic */ djy(dju dju, vav vav) {
        this.b = dju;
        this.a = vav;
    }
}
