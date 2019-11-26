package defpackage;

import android.content.Context;
import android.os.SystemClock;

/* renamed from: pgd */
public final class pgd {
    private static volatile pgd h;
    public final Context a;
    public final Context b;
    public final qaw c = qaz.a;
    public final pev d = new pev(this);
    public final pfm e;
    public final pfc f;
    public final pfq g;
    private final pgv i;
    private final pfh j;
    private final pfx k;

    private pgd(pgf pgf) {
        Object obj = pgf.a;
        pzr.a(obj, (Object) "Application context can't be null");
        Object obj2 = pgf.b;
        pzr.a(obj2);
        this.a = obj;
        this.b = obj2;
        pfm pfm = new pfm(this);
        pfm.g();
        this.e = pfm;
        pfm a = a();
        String str = pge.a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 134);
        stringBuilder.append("Google Analytics ");
        stringBuilder.append(str);
        stringBuilder.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        a.b(4, stringBuilder.toString(), null, null, null);
        pfq pfq = new pfq(this);
        pfq.g();
        this.g = pfq;
        pfx pfx = new pfx(this);
        pfx.g();
        this.k = pfx;
        pfh pfh = new pfh(this, pgf);
        per per = new per(this);
        pen pen = new pen(this);
        pgn pgn = new pgn(this);
        pez pez = new pez(this);
        pzr.a(obj);
        if (pgv.a == null) {
            synchronized (pgv.class) {
                if (pgv.a == null) {
                    pgv.a = new pgv(obj);
                }
            }
        }
        pgv pgv = pgv.a;
        pgv.d = new pgg(this);
        this.i = pgv;
        pek pek = new pek(this);
        per.g();
        pen.g();
        pgn.g();
        pez.g();
        pfc pfc = new pfc(this);
        pfc.g();
        this.f = pfc;
        pfh.g();
        this.j = pfh;
        pfx d = pek.a.d();
        d.b();
        d.f();
        if (d.e) {
            d.f();
        }
        d.b();
        pgq pgq = pfh.a;
        pgq.f();
        pzr.a(pgq.a ^ 1, (Object) "Analytics backend already started");
        pgq.a = true;
        pgq.l().a(new pep(pgq));
    }

    public static pgd a(Context context) {
        pzr.a((Object) context);
        if (h == null) {
            synchronized (pgd.class) {
                if (h == null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    pgd pgd = new pgd(new pgf(context));
                    h = pgd;
                    pek.a();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    elapsedRealtime = ((Long) pel.B.a).longValue();
                    if (elapsedRealtime2 > elapsedRealtime) {
                        pgd.a().b("Slow initialization (ms)", Long.valueOf(elapsedRealtime2), Long.valueOf(elapsedRealtime));
                    }
                }
            }
        }
        return h;
    }

    public final pfm a() {
        pgd.a(this.e);
        return this.e;
    }

    public final pgv b() {
        pzr.a(this.i);
        return this.i;
    }

    public final pfh c() {
        pgd.a(this.j);
        return this.j;
    }

    public final pfx d() {
        pgd.a(this.k);
        return this.k;
    }

    public static void a(pgb pgb) {
        pzr.a((Object) pgb, (Object) "Analytics service not created/initialized");
        pzr.b(pgb.e(), "Analytics service not initialized");
    }
}
