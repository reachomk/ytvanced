package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.youtube.R;

/* renamed from: hgl */
public final class hgl implements ebj, t {
    public final ftk a;
    public final xhv b;
    public final eif c;
    public final lum d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public int f;
    public boolean g;
    private final Context h;
    private final aizy i;
    private final fjg j;
    private final albh k;
    private final acwa l;
    private final eki m;
    private final lud n;
    private final zyw o;
    private final xci p;
    private final ajam q;
    private final hgt r = new hgt(this);
    private final hgq s = new hgq(this);
    private bcuo t;
    private albg u;
    private azfa v;
    private int w;

    public hgl(Context context, aizy aizy, fjg fjg, ftk ftk, ebk ebk, albh albh, acwa acwa, xhv xhv, eif eif, eki eki, lud lud, lum lum, xci xci, ajam ajam, zyw zyw) {
        this.h = context;
        this.i = aizy;
        this.j = fjg;
        this.a = ftk;
        this.k = albh;
        this.l = acwa;
        this.b = xhv;
        this.c = eif;
        this.m = eki;
        this.n = lud;
        this.d = lum;
        this.p = xci;
        this.q = ajam;
        this.o = zyw;
        ebk.a((ebj) this);
    }

    public final void a(af afVar) {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void a(boolean z) {
        if (z) {
            if (!(this.c.c().b() && this.i.c())) {
                a(g());
            }
            return;
        }
        f();
    }

    public final void B_() {
        if (foh.x(this.o)) {
            bctz a = this.q.Q().d.f().a(emg.a(this.o, 4294967296L, 1));
            hgt hgt = this.r;
            hgt.getClass();
            this.t = a.a(new hgk(hgt), hgn.a);
        } else {
            this.p.a(this.r);
        }
        this.p.a(this.s);
    }

    public final void C_() {
        if (foh.x(this.o)) {
            this.t.b();
            this.t = null;
        } else {
            this.p.b(this.r);
        }
        this.p.b(this.s);
    }

    public final void a(albg albg) {
        if (albg != null) {
            this.e.removeCallbacks(null);
            this.k.b(albg);
            this.g = true;
            this.u = albg;
            if (albg.m() != null) {
                this.v = b(albg.m());
                this.l.t().a(this.v);
                azfa azfa = this.v;
                if (azfa == null) {
                    xtl.d("Missing offline mealbar visual element");
                    return;
                }
                acwc acwc;
                acwc acwc2;
                if (this.m.f()) {
                    acwc = acwc.OFFLINE_DOWNLOAD_RECOMMENDATIONS_AVAILABLE_MEALBAR_GOTO_BUTTON;
                } else {
                    acwc = acwc.OFFLINE_DOWNLOADS_AVAILABLE_MEALBAR_GOTO_BUTTON;
                }
                azfa b = b(acwc);
                if (this.m.f()) {
                    acwc2 = acwc.OFFLINE_DOWNLOAD_RECOMMENDATIONS_AVAILABLE_MEALBAR_CANCEL_BUTTON;
                } else {
                    acwc2 = acwc.OFFLINE_DOWNLOADS_AVAILABLE_MEALBAR_CANCEL_BUTTON;
                }
                azfa b2 = b(acwc2);
                acvx t = this.l.t();
                t.b(acxf.a(b), acxf.a(azfa));
                t.b(acxf.a(b2), acxf.a(azfa));
            }
        }
    }

    public final void f() {
        albg albg = this.u;
        if (albg != null) {
            this.k.a(albg);
            this.u = null;
        }
    }

    public final void a(acwc acwc) {
        if (this.v == null) {
            xtl.d("Missing offline mealbar visual element");
        }
        if (acwc != null) {
            this.l.t().a(3, new acvs(acwc), null);
        }
    }

    private final azfa b(acwc acwc) {
        this.w++;
        return this.l.t().a(Integer.valueOf(this.w), acwc, this.w);
    }

    /* JADX WARNING: Missing block: B:11:0x002c, code skipped:
            if (r0.k() != 3) goto L_0x0076;
     */
    /* JADX WARNING: Missing block: B:23:0x0072, code skipped:
            if (((defpackage.apge) r0).b.equals("FElibrary") != false) goto L_0x011b;
     */
    public final defpackage.albg g() {
        /*
        r5 = this;
        r0 = r5.m;
        r0 = r0.b();
        if (r0 == 0) goto L_0x011b;
    L_0x0008:
        r0 = r5.j;
        r0 = r0.a();
        if (r0 == 0) goto L_0x011b;
    L_0x0010:
        r0 = r5.g;
        if (r0 != 0) goto L_0x011b;
    L_0x0014:
        r0 = r5.c;
        r0 = r0.c();
        r0 = r0.b();
        if (r0 == 0) goto L_0x0030;
    L_0x0020:
        r0 = r5.n;
        r0 = r0.a;
        if (r0 != 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0076;
    L_0x0027:
        r0 = r0.k();
        r1 = 3;
        if (r0 != r1) goto L_0x0076;
    L_0x002e:
        goto L_0x011b;
    L_0x0030:
        r0 = r5.j;
        r0 = r0.b();
        r1 = r0 instanceof defpackage.ear;
        if (r1 == 0) goto L_0x0042;
    L_0x003a:
        r0 = (defpackage.ear) r0;
        r0 = r0.ae_();
        if (r0 != 0) goto L_0x011b;
    L_0x0042:
        r0 = r5.j;
        r0 = r0.a();
        r0 = r0.a();
        if (r0 == 0) goto L_0x011b;
    L_0x004e:
        r1 = com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass.browseEndpoint;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r0 = r0.h;
        r2 = r1.d;
        r0 = r0.b(r2);
        if (r0 != 0) goto L_0x0064;
    L_0x0061:
        r0 = r1.b;
        goto L_0x0068;
    L_0x0064:
        r0 = r1.a(r0);
    L_0x0068:
        r0 = (defpackage.apge) r0;
        r0 = r0.b;
        r1 = "FElibrary";
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0076;
    L_0x0074:
        goto L_0x011b;
    L_0x0076:
        r0 = r5.m;
        r0 = r0.f();
        r1 = 2131953001; // 0x7f130569 float:1.954246E38 double:1.0533247363E-314;
        if (r0 == 0) goto L_0x00e4;
    L_0x0081:
        r0 = r5.m;
        r0 = r0.g();
        if (r0 != 0) goto L_0x008d;
    L_0x0089:
        r2 = 2131953002; // 0x7f13056a float:1.9542463E38 double:1.053324737E-314;
        goto L_0x0090;
    L_0x008d:
        r2 = 2131953003; // 0x7f13056b float:1.9542465E38 double:1.0533247373E-314;
    L_0x0090:
        if (r0 != 0) goto L_0x0096;
    L_0x0092:
        r0 = 2131953013; // 0x7f130575 float:1.9542485E38 double:1.0533247423E-314;
        goto L_0x0099;
    L_0x0096:
        r0 = 2131953011; // 0x7f130573 float:1.954248E38 double:1.0533247413E-314;
    L_0x0099:
        r3 = r5.h();
        r4 = 2130838072; // 0x7f020238 float:1.7281116E38 double:1.052773888E-314;
        r3 = r3.d(r4);
        r4 = r5.h;
        r0 = r4.getString(r0);
        r0 = r3.d(r0);
        r3 = r5.h;
        r2 = r3.getString(r2);
        r0 = r0.c(r2);
        r2 = r5.h;
        r3 = 2131953009; // 0x7f130571 float:1.9542477E38 double:1.0533247403E-314;
        r2 = r2.getString(r3);
        r3 = new hgm;
        r3.<init>(r5);
        r0 = r0.a(r2, r3);
        r2 = r5.h;
        r1 = r2.getString(r1);
        r2 = new hgp;
        r2.<init>(r5);
        r0 = r0.b(r1, r2);
        r1 = defpackage.acwc.OFFLINE_DOWNLOAD_RECOMMENDATIONS_AVAILABLE_MEALBAR;
        r0 = r0.a(r1);
        r0 = r0.e();
        return r0;
    L_0x00e4:
        r0 = r5.h();
        r2 = r5.h;
        r3 = 2131953000; // 0x7f130568 float:1.9542459E38 double:1.053324736E-314;
        r2 = r2.getString(r3);
        r0 = r0.c(r2);
        r2 = r5.h;
        r3 = 2131952999; // 0x7f130567 float:1.9542457E38 double:1.0533247354E-314;
        r2 = r2.getString(r3);
        r3 = new hgo;
        r3.<init>(r5);
        r0 = r0.a(r2, r3);
        r2 = r5.h;
        r1 = r2.getString(r1);
        r2 = new hgr;
        r2.<init>(r5);
        r0 = r0.b(r1, r2);
        r0 = r0.e();
        return r0;
    L_0x011b:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgl.g():albg");
    }

    private final albj h() {
        return ((fck) ((fck) ((fck) ((fck) this.k.b()).d((int) R.drawable.ic_offline_no_content)).d(this.h.getString(R.string.offline_no_content_title_offline_eligible_and_no_content))).a(acwc.OFFLINE_DOWNLOADS_AVAILABLE_MEALBAR)).c(false);
    }
}
