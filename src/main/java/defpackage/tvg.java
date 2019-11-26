package defpackage;

import android.app.Application;
import android.content.SharedPreferences;

/* renamed from: tvg */
final class tvg {
    public volatile tul a;
    public volatile tvk b;
    public volatile twg c;
    public volatile tuw d;
    public volatile twn e;
    public volatile tvm f;
    public volatile tuc g;
    public final tzu h;
    public final Application i;
    public final tzu j;
    public final tzu k;
    public final txw l;
    public final tyi m;
    public final SharedPreferences n;
    public final tzs o;
    private volatile tur p;
    private volatile tvy q;
    private volatile udc r;

    tvg(Application application, tzu tzu, tzu tzu2, txw txw, tyi tyi, SharedPreferences sharedPreferences, tzs tzs, amqp amqp) {
        this.i = application;
        this.k = tzu;
        tzt tzt = new tzt(tzu2);
        this.l = txw;
        this.m = tyi;
        this.n = sharedPreferences;
        this.o = tzs;
        this.j = new tzt(new tvi(application, txw));
        this.h = new tzt(new tvh(this, txw, application, tzu, amqp));
    }

    /* Access modifiers changed, original: final */
    public final tzr a(tzr tzr) {
        if (!this.o.a(tzr)) {
            tzr.a();
        }
        return tzr;
    }

    /* Access modifiers changed, original: final */
    public final udc a() {
        if (this.r == null) {
            synchronized (udc.class) {
                if (this.r == null) {
                    udc typ;
                    if (this.m.h) {
                        txw txw = this.l;
                        txw.getClass();
                        typ = new typ(new tvf(txw));
                    } else {
                        typ = this.l.a();
                    }
                    this.r = typ;
                }
            }
        }
        return this.r;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return this.l.e().a() && ((txz) this.l.e().b()).a;
    }

    /* Access modifiers changed, original: final */
    public final tur c() {
        if (this.p == null) {
            synchronized (tur.class) {
                if (this.p == null) {
                    txz txz = (txz) this.l.e().b();
                    udc a = a();
                    Application application = this.i;
                    this.p = (tur) a(new tur(a, txz.c, this.j, this.k, application, txz.b, this.m.e));
                }
            }
        }
        return this.p;
    }

    /* Access modifiers changed, original: final */
    public final boolean d() {
        return this.l.c().a() && ((tyy) this.l.c().b()).a;
    }

    /* Access modifiers changed, original: final */
    public final tvy e() {
        if (this.q == null) {
            synchronized (tvy.class) {
                if (this.q == null) {
                    udc a = a();
                    Application application = this.i;
                    tzu tzu = this.j;
                    tzu tzu2 = this.k;
                    tyy tyy = (tyy) this.l.c().b();
                    boolean z = this.m.c;
                    tvx tvx = new tvx();
                    this.q = (tvy) a(new tvy(a, application, tzu, tzu2, tyy.b, (tvp) tyy.c.c(), z));
                }
            }
        }
        return this.q;
    }
}
