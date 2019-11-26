package defpackage;

import android.app.Activity;

/* renamed from: lbm */
public final class lbm implements afsw {
    public final bcaa a;
    public final lbs b;
    public final String c;
    public akpk d;
    private final xoi e;
    private final akpd f;
    private final Activity g;

    public lbm(bcaa bcaa, xoi xoi, akpe akpe, aaas aaas, akzb akzb, xci xci, Activity activity, lbs lbs, String str) {
        this.a = bcaa;
        this.e = xoi;
        this.g = activity;
        this.b = lbs;
        this.c = str;
        lbp lbp = new lbp(this, xci);
        aknw aknw = new aknw();
        aknw.a(auvv.class, new lbl(activity, akzb, lbs));
        aknw.a(awgz.class, new lbo(activity, aaas, lbp));
        aknw.a(kes.class, new lbn(activity));
        this.f = akpe.a(aknw);
    }

    public final void a(bqn bqn) {
        xtl.a("Error adding video to playlist", (Throwable) bqn);
        this.b.g(true);
        xpr.a(this.g, this.e.a((Throwable) bqn), 0);
    }
}
