package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* renamed from: hct */
public final class hct implements xcp {
    private static final acwc b = acwc.MDX_NOTIFICATION_CONNECTION_ERROR_TOAST;
    public final Activity a;
    private final adgw c;
    private final xci d;
    private final Context e;
    private final ftk f;
    private final nt g;
    private final baz h;
    private final adft i;
    private final fda j;
    private final adqf k;
    private final adhn l;
    private final SharedPreferences m;
    private final acwa n;
    private final aizy o;
    private autt p;
    private anvu q;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private adpw u = null;
    private bbs v = null;
    private String w = "";

    public hct(adgw adgw, xci xci, ftk ftk, nt ntVar, baz baz, adft adft, Context context, Activity activity, fda fda, adqf adqf, adhn adhn, SharedPreferences sharedPreferences, acwa acwa, aizy aizy) {
        this.c = adgw;
        this.d = xci;
        this.f = ftk;
        this.g = ntVar;
        this.h = baz;
        this.i = adft;
        this.e = context;
        this.a = activity;
        this.j = fda;
        this.k = adqf;
        this.l = adhn;
        this.n = acwa;
        this.m = sharedPreferences;
        this.o = aizy;
    }

    public final void a(autt autt, boolean z, anvu anvu) {
        this.p = (autt) amqw.a((Object) autt);
        String str = autt.c;
        this.q = (anvu) amqw.a((Object) anvu);
        this.d.a((Object) this);
        if (!(z || adld.a(this.p))) {
            aure aure = this.p.b;
            if (aure == null) {
                aure = aure.c;
            }
            this.w = (aure.a == 1 ? (aurg) aure.b : aurg.e).b;
        }
        adqe c = this.k.c();
        if (!(c == null || adld.a(this.p))) {
            String b = c.h().b();
            aure aure2 = this.p.b;
            if (aure2 == null) {
                aure2 = aure.c;
            }
            if (!adhn.a(b, (aure2.a == 1 ? (aurg) aure2.b : aurg.e).c)) {
                this.u = adpw.n().a(this.p.c).a(anvu.d()).e();
                c.a();
                this.t = true;
                return;
            }
        }
        a(str);
    }

    private final void a(String str) {
        ftk ftk = this.f;
        anvu anvu = this.q;
        azjd azjd = (azjd) azje.r.createBuilder();
        azjd.a(str);
        azje azje = (azje) ((anxl) azjd.build());
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(WatchEndpointOuterClass.watchEndpoint, azje);
        apxx.a(anvu);
        ftk.a((apxu) ((anxl) apxx.build()), null);
        this.s = true;
    }

    private final void b(String str) {
        this.j.a((albf) (fde) ((fdd) ((fdd) fde.h().b(this.a.getString(R.string.mdx_lr_notification_error_cant_connect_message, new Object[]{str}))).a(this.a.getString(R.string.mdx_lr_notification_error_cant_connect_get_help_button), new hcv(this))).d());
        this.n.t().b(new acvs(b));
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{adqk.class, ahkr.class};
        } else if (i == 0) {
            adqk adqk = (adqk) obj;
            boolean z = this.r;
            if (z || this.t) {
                adqe adqe = adqk.a;
                if (adqe == null) {
                    if (z) {
                        bbs bbs = this.v;
                        if (!(bbs == null || this.u == null)) {
                            b(bbs.d);
                            this.v = null;
                            this.u = null;
                            this.d.b(this);
                        }
                    }
                    if (this.t) {
                        adpw adpw = this.u;
                        if (adpw != null) {
                            a(adpw.a());
                            this.t = false;
                        }
                    }
                    this.d.b(this);
                } else if (adqe.d() == 1) {
                    this.u = null;
                    this.v = null;
                    this.r = false;
                    this.t = false;
                    this.d.b(this);
                    return null;
                }
            }
        } else if (i == 1) {
            ahkr ahkr = (ahkr) obj;
            if (this.s || this.t) {
                int i2 = ahkr.a;
                if (i2 == 5 || i2 == 2) {
                    this.s = false;
                    this.d.b(this);
                    this.o.b();
                    if (!this.w.isEmpty()) {
                        b(this.w);
                        this.w = "";
                    } else if (this.l.a(this.e).isEmpty()) {
                        this.j.a((albf) (fde) ((fdd) ((fdd) fde.h().b(this.a.getString(R.string.mdx_lr_notification_error_no_devices_found_message))).a(this.a.getString(R.string.mdx_lr_notification_error_no_devices_found_learn_more_button), new hcw(this))).d());
                    } else if (!adld.a(this.p)) {
                        aure aure = this.p.b;
                        if (aure == null) {
                            aure = aure.c;
                        }
                        amqp a = adld.a(aure.a == 1 ? (aurg) aure.b : aurg.e, this.m, this.l, this.e);
                        this.u = adpw.n().a(this.p.c).a(this.q.d()).e();
                        this.v = (bbs) a.b();
                        this.c.a(this.v, this.u);
                        this.r = true;
                        this.t = false;
                        this.d.a((Object) this);
                    } else if (this.k.c() == null) {
                        azi a2 = this.i.a();
                        a2.a(this.h);
                        a2.a(this.g, a2.getClass().getCanonicalName());
                        return null;
                    }
                }
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
