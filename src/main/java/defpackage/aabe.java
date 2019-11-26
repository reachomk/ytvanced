package defpackage;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: aabe */
public final class aabe implements aadw, xcp {
    public final bbmn a;
    public final amur b;
    public final aaep c;
    public final long d;
    public volatile aabs e;
    private final xci f;
    private final afpu g;
    private final xsc h;
    private volatile afpt i;

    public aabe(Executor executor, xci xci, afpu afpu, Map map, xsc xsc, aaep aaep, zyw zyw) {
        this.a = bbzi.a((Executor) amqw.a((Object) executor));
        this.f = (xci) amqw.a((Object) xci);
        this.g = (afpu) amqw.a((Object) afpu);
        this.b = amur.a((Map) amqw.a((Object) map));
        this.h = xsc;
        this.e = new aabs(this, xsc);
        this.c = aaep;
        apxn a = zyw.a();
        long j = 30;
        if (a != null) {
            avam avam = a.n;
            if (avam == null) {
                avam = avam.j;
            }
            arge arge = avam.i;
            if (arge == null) {
                arge = arge.e;
            }
            if ((arge.a & 2) != 0) {
                avam avam2 = a.n;
                if (avam2 == null) {
                    avam2 = avam.j;
                }
                arge arge2 = avam2.i;
                if (arge2 == null) {
                    arge2 = arge.e;
                }
                j = (long) arge2.c;
            }
        }
        this.d = j;
    }

    public final void a() {
        this.f.a((Object) this);
        this.i = this.g.c();
    }

    public final aadq a(String str) {
        return (aadq) c().a(new aabh(str));
    }

    public final bbme b(String str) {
        bbme a = bbme.a(new aabg(this, str));
        Object obj = this.a;
        bbow.a(obj, "scheduler is null");
        return new bbsh(a, obj);
    }

    public final aadu c(String str) {
        return (aadu) c().a(new aabj(str));
    }

    public final bbms d(String str) {
        Object aabi = new aabi(this, str);
        bbow.a(aabi, "callable is null");
        bbwu bbwu = new bbwu(aabi);
        aabi = this.a;
        bbow.a(aabi, "scheduler is null");
        return new bbwy(bbwu, aabi);
    }

    public final bbmi a(String str, boolean z) {
        return (bbmi) c().a(new aabl(str, z));
    }

    public final bbmi e(String str) {
        return (bbmi) c().a(new aabk(str));
    }

    private final aabs c() {
        synchronized (this.e) {
            afpt afpt = this.i;
            this.i = this.g.c();
            aabs aabs;
            if (afpt == null && this.i == null) {
                aabs = this.e;
                return aabs;
            }
            if (afpt == null || this.i == null || !TextUtils.equals(afpt.f(), this.i.f())) {
                this.c.a("INTERNAL", "identity mismatch: clear");
                d();
            }
            aabs = this.e;
            return aabs;
        }
    }

    private final void d() {
        aabs aabs = this.e;
        this.e = new aabs(this, this.h);
        aabs.getClass();
        aabs.a(new aabn(aabs));
    }

    public final /* synthetic */ aaea b() {
        return new aabm(this, c(), this);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afqh.class};
        } else if (i == 0) {
            this.c.a("INTERNAL", "clear on SignOutEvent");
            d();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
