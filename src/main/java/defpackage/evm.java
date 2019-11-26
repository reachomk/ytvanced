package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import java.util.PriorityQueue;
import java.util.Queue;

/* renamed from: evm */
public final class evm implements ajan, ejc, exv, xcp {
    public final Queue a = new PriorityQueue();
    public String b;
    public String c;
    public boolean d;
    private final xci e;
    private final Handler f;
    private final xsc g;
    private final eif h;
    private final bdfu i = new bdfu();
    private final ajam j;
    private final zyw k;
    private final Runnable l = new evl(this);
    private long m;
    private long n = -1;
    private String o;

    public evm(xci xci, xsc xsc, eif eif, ajam ajam, zyw zyw, exu exu) {
        Object handler = new Handler();
        this.e = (xci) amqw.a((Object) xci);
        this.g = (xsc) amqw.a((Object) xsc);
        this.f = (Handler) amqw.a(handler);
        this.h = (eif) amqw.a((Object) eif);
        this.j = (ajam) amqw.a((Object) ajam);
        this.k = (zyw) amqw.a((Object) zyw);
        if (exu.a) {
            a();
        }
        exu.a((exv) this);
    }

    public final long e() {
        return 1;
    }

    public final void a() {
        if (foh.x(this.k)) {
            this.i.a(a(this.j));
        } else {
            this.e.a((Object) this);
        }
        this.h.a(this);
    }

    public final void b() {
        if (foh.x(this.k)) {
            this.i.a();
        } else {
            this.e.b(this);
        }
        this.h.b(this);
    }

    public final void a(ahkn ahkn) {
        if (ahkn.a != airi.VIDEO_PLAYING) {
            this.c = null;
            this.n = -1;
            h();
            return;
        }
        this.c = ahkn.b.b();
        if (!this.c.equals(this.o)) {
            this.m = 0;
            this.o = this.c;
        }
        f();
    }

    public final void a(ahkr ahkr) {
        if (!TextUtils.isEmpty(this.c)) {
            this.m = c();
            this.n = ahkr.a == 2 ? this.g.a() : -1;
            f();
        }
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (!i()) {
            h();
        } else if (!this.d) {
            f();
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.k, 34359738368L, 1)).a(new evo(this), evn.a), ajam.Q().d.f().a(emg.a(this.k, 34359738368L, 1)).a(new evq(this), evp.a)};
    }

    public final long c() {
        return this.m + (this.n != -1 ? this.g.a() - this.n : 0);
    }

    public final void d() {
        this.a.clear();
        this.b = null;
    }

    private final void h() {
        if (this.d) {
            this.f.removeCallbacks(this.l);
            this.d = false;
        }
    }

    public final void f() {
        h();
        if (g() && this.n != -1 && !this.a.isEmpty()) {
            this.f.postDelayed(this.l, Math.max(0, ((evr) this.a.peek()).a - c()));
            this.d = true;
        }
    }

    public final boolean g() {
        String str = this.c;
        if (str == null || str.equals(this.b)) {
            return i();
        }
        d();
        return false;
    }

    private final boolean i() {
        ejd c = this.h.c();
        return (c == null || !c.l() || c.a()) ? false : true;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class, ahkr.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else if (i == 1) {
            a((ahkr) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
