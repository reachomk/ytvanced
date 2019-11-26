package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;

/* renamed from: aczg */
public final class aczg implements aczo {
    public static final String a = xtl.b("MDX.BackgroundPlaybackStarter");
    public final Context b;
    public final adgw c;
    public final adfq d;
    public final Handler e;
    public final xsc f;
    public final aczx g;
    public final adqf h;
    public final Intent i;
    public final bcaa j;
    public final aczr k;
    public aczq l;
    public long m;
    public boolean n;
    public adqe o;
    public boolean p;
    public final adqi q = new aczh(this);
    private final aczw r = new aczi(this);

    public aczg(Context context, adgw adgw, adfq adfq, xsc xsc, aczx aczx, adqf adqf, Intent intent, bcaa bcaa, aczr aczr) {
        this.b = context;
        this.c = adgw;
        this.d = adfq;
        this.e = new Handler(Looper.getMainLooper());
        this.f = xsc;
        this.g = aczx;
        this.h = adqf;
        this.i = intent;
        this.j = bcaa;
        this.k = aczr;
    }

    public final void a(aczq aczq) {
        a(aczq, false);
    }

    public final void a(aczq aczq, boolean z) {
        amqw.a((Object) aczq);
        this.n = z;
        this.g.a(this.r);
        this.g.a(aczq);
        if (aczq.c() <= 0) {
            aczq = aczq.e().a(10).a();
        }
        this.m = this.f.a();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.c.a((Object) this);
        } else {
            this.e.post(new aczf(this));
        }
        this.l = aczq;
        this.e.removeCallbacksAndMessages(null);
        this.e.post(new aczk(this));
    }

    public final void a(int i) {
        a(i, null);
    }

    public final void a(int i, adqe adqe) {
        amqw.a(this.l);
        this.g.b(this.l);
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 5;
            } else if (i != 2) {
                amqw.a((Object) adqe);
                i2 = 4;
            } else {
                i2 = 6;
            }
        }
        this.k.a(i2, this.l.f(), this.n, this.l.d().e());
        a();
    }

    public final void a() {
        this.e.removeCallbacksAndMessages(null);
        this.h.b(this.q);
        this.c.c(this);
        this.l = null;
        this.p = false;
        this.o = null;
    }

    public final void b() {
        adqe adqe = this.o;
        if (adqe != null) {
            this.p = true;
            adqe.a();
            this.k.a(7, this.l.f(), this.n, this.l.d().e());
        }
        a();
    }
}
