package defpackage;

/* renamed from: dkp */
final class dkp implements agyn {
    private final agyt a;
    private volatile Object b = new baqe();
    private volatile Object c = new baqe();
    private volatile Object d = new baqe();
    private volatile Object e = new baqe();
    private volatile Object f = new baqe();
    private volatile Object g = new baqe();
    private final /* synthetic */ dkn h;

    public final void a(agyk agyk) {
        Object obj;
        agyk.d = this.h.g.i();
        this.h.g.oy();
        agyk.e = this.h.g.oG();
        agyk.f = this.h.g.g();
        agyk.g = this.h.g.lv();
        this.h.g.lw();
        this.h.g.ll();
        agyk.h = this.h.g.ds();
        agyk.i = this.h.g.ga();
        agyk.j = this.h.g.dt();
        agyk.k = this.h.g.lx();
        agyk.l = this.h.g.c();
        Object obj2 = this.b;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.b;
                if (obj instanceof baqe) {
                    obj = agyh.a(this.a, this.h.g.hK());
                    this.b = bapx.a(this.b, obj);
                }
            }
            obj2 = obj;
        }
        agys.a(agyk, obj2);
        obj2 = this.c;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.c;
                if (obj instanceof baqe) {
                    obj = new agyr(this.h.g.ow());
                    this.c = bapx.a(this.c, obj);
                }
            }
            obj2 = obj;
        }
        agyk.n = (agyr) obj2;
        obj2 = this.d;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.d;
                if (obj instanceof baqe) {
                    obj = agyv.a(this.a);
                    this.d = bapx.a(this.d, obj);
                }
            }
            obj2 = obj;
        }
        agys.b(agyk, obj2);
        obj2 = this.e;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.e;
                if (obj instanceof baqe) {
                    obj = agyx.a(this.h.g.i(), this.a);
                    this.e = bapx.a(this.e, obj);
                }
            }
            obj2 = obj;
        }
        agys.c(agyk, obj2);
        agyk.q = this.h.g.lm();
        obj2 = this.f;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.f;
                if (obj instanceof baqe) {
                    obj = agzd.a();
                    this.f = bapx.a(this.f, obj);
                }
            }
            obj2 = obj;
        }
        agys.d(agyk, obj2);
        obj2 = this.g;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.g;
                if (obj instanceof baqe) {
                    obj = agyz.a();
                    this.g = bapx.a(this.g, obj);
                }
            }
            obj2 = obj;
        }
        agys.e(agyk, obj2);
    }

    /* synthetic */ dkp(dkn dkn, agyt agyt) {
        this.h = dkn;
        this.a = agyt;
    }
}
