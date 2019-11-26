package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: aixn */
public final class aixn {
    public final bapu a;
    public final zzl b;
    public final xoi c;
    public final Executor d;
    public final aiyx e;
    public aixt f;
    public wxi g;
    public volatile aixy h;
    public aixi i;
    public aiqq j;
    public aiqq k;
    public volatile aakj l;
    public volatile aafv m;
    public boolean n;
    public volatile int o;
    private final Handler p;
    private final Executor q;
    private final aize r;
    private final zyw s;
    private final ahhq t;
    private final aixs u = new aixs(this);

    public aixn(xci xci, bapu bapu, Handler handler, xoi xoi, Executor executor, Executor executor2, aiyx aiyx, aize aize, zzl zzl, zyw zyw, ahhq ahhq) {
        this.a = bapu;
        this.p = handler;
        this.c = xoi;
        this.d = executor;
        this.q = executor2;
        this.e = aiyx;
        this.r = aize;
        this.b = zzl;
        this.s = zyw;
        this.t = ahhq;
        xci.a(this.u);
    }

    static boolean a(int i) {
        return i == 3 || i == 2 || i == 0;
    }

    public final void a() {
        b(1);
        if (this.l != null) {
            b(4);
            if (this.m != null) {
                b(5);
            }
        }
    }

    public final void a(aiqq aiqq, String str, aiye aiye, aiqw aiqw) {
        int i;
        if (aiqq != null) {
            if ((aiqq.a.n ^ 1) == 0) {
                i = 0;
            } else if (this.n) {
                i = 2;
            }
            a(aiqq, i, str, aiye, aiqw);
        }
        i = 3;
        a(aiqq, i, str, aiye, aiqw);
    }

    public final void a(aiqq aiqq, int i, String str, aiye aiye, aiqw aiqw) {
        boolean a = aixn.a(i);
        if (a && (this.h == null || this.h.a(false))) {
            wxi wxi = this.g;
            if (wxi != null) {
                wxi.a();
                this.g = null;
            }
            if (this.l != null) {
                if (this.m != null) {
                    c(5);
                } else {
                    c(4);
                }
            } else if (this.o == 2) {
                b(1);
            }
        }
        this.k = (aiqq) amqw.a((Object) aiqq);
        if (a && !aipo.e(this.s)) {
            b(2);
        }
        aiqq aiqq2 = this.k;
        aixi aixi = this.i;
        aakj aakj = this.l;
        boolean z = this.n;
        Handler handler = this.p;
        int i2 = aipo.b(this.b).b;
        long j = i2 > 0 ? (long) i2 : -1;
        this.h = new aixy(aiqq2, i, aixi, aakj, str, z, handler, j, aipo.a(this.b, airv.b), this.c, new aixr(this, aiye, aiqw.a()), aiqw);
        this.d.execute(this.h);
        if (a && aipo.e(this.s)) {
            b(2);
        }
    }

    public final void a(aakj aakj, aiqq aiqq, acxt acxt) {
        amqw.a((Object) aakj);
        if (!(this.m == null || aakj.b().equals(this.m.b))) {
            this.m = null;
            aixt aixt = this.f;
            if (aixt != null) {
                aixt.a(null);
            }
        }
        this.l = aakj;
        if (this.r.a(aakj) != 2) {
            if (!airg.a(this.o, 4)) {
                b(4);
            }
            aixt aixt2 = this.f;
            if (aixt2 != null) {
                aixt2.a(aakj, aiqq, acxt);
            }
        }
    }

    public final void a(String str, aiye aiye) {
        if (this.k != null) {
            aixt aixt = this.f;
            if (aixt != null) {
                aixt.a();
            }
            a(this.k, str, aiye, aiqw.a);
        }
    }

    public final void b() {
        if (this.h != null) {
            this.h.a(true);
            this.h = null;
        }
        wxi wxi = this.g;
        if (wxi != null) {
            wxi.a();
            this.g = null;
        }
    }

    public final aakj c() {
        return (!airg.a(this.o, 4, 5) || a(this.l, "currentPlayerResponse")) ? null : this.l;
    }

    public final void d() {
        aakj c = c();
        apxu apxu = null;
        aafv aafv = (this.o != 5 || a(this.m, "currentWatchNextResponse")) ? null : this.m;
        aiqq aiqq = this.k;
        if (aiqq != null) {
            apxu = aiqq.b;
        }
        this.e.g().e_(new ahkf(this.o, c, aafv, apxu));
    }

    public final boolean a(Object obj, String str) {
        if (obj != null) {
            return false;
        }
        afpc.a(2, afpf.player, String.format("%s was null when it shouldn't be", new Object[]{str}));
        aixt aixt = this.f;
        if (aixt != null) {
            aixt.b(new ahjc(10, true, "There was an error with the video", new IllegalStateException()));
        }
        return true;
    }

    public final void b(int i) {
        this.o = i;
        String.valueOf(airg.a(i)).length();
        d();
    }

    private final void c(int i) {
        this.o = i;
        String.valueOf(airg.a(i)).length();
    }
}
