package defpackage;

import android.os.Handler;
import java.io.IOException;

/* renamed from: aezu */
public final class aezu extends ono implements afae, owh {
    public volatile aezf b;
    public volatile aezk c;
    private final afhg d;
    private final aezw e;
    private final afgp f;
    private final aajj g;
    private final aajs h;
    private final String i;
    private final Object j;
    private owt k;
    private owi l;
    private IOException m;
    private boolean n;

    public aezu(afhg afhg, Handler handler, Handler handler2, aajj aajj, aajs aajs, afgp afgp, aezx aezx, String str, Object obj) {
        amqw.a(aajs.n.isEmpty() ^ 1);
        this.d = afhg;
        this.e = new aezw(this, handler, aezx, handler2);
        this.g = aajj;
        this.h = aajs;
        this.f = afgp;
        this.i = str;
        this.j = obj;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(owt owt) {
        this.k = owt;
        aezc aezc = new aezc(this.h, this.j, this.d, this.i, this.e);
        int X = this.g.X();
        this.l = new owi("Fetch-Live-Head-Headers");
        this.l.a(aezc, this, X);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        owi owi = this.l;
        if (owi != null) {
            owi.a(null);
            this.l = null;
        }
    }

    public final synchronized void b() {
        if (this.n) {
            throw this.m;
        }
    }

    public final ooj a(ook ook, ouw ouw, long j) {
        oxz.a(ook != null);
        return new aezs(this.d, this.k, this.g_.a(0, ook), ouw, this.g, this.h, this.f, this.e, this.c, this.i);
    }

    public final void a(ooj ooj) {
        if (ooj instanceof aezs) {
            oqn oqn = (aezs) ooj;
            for (oqk a : oqn.b) {
                a.a(oqn);
            }
            oqn.a.b();
        }
    }

    public final synchronized void a(owm owm, long j, long j2) {
        this.m = null;
    }

    public final synchronized void a(owm owm, long j, long j2, boolean z) {
        this.n = true;
    }

    public final synchronized owk a(owm owm, long j, long j2, IOException iOException, int i) {
        this.m = iOException;
        return owi.a;
    }

    public final long a(long j) {
        return this.c != null ? this.c.a(j) : -1;
    }
}
