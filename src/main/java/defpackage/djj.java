package defpackage;

/* renamed from: djj */
final class djj implements agyn {
    private final agyt a;
    private volatile Object b = new baqe();
    private volatile Object c = new baqe();
    private volatile Object d = new baqe();
    private volatile Object e = new baqe();
    private volatile Object f = new baqe();
    private volatile Object g = new baqe();
    private final /* synthetic */ diu h;

    /* synthetic */ djj(diu diu, agyt agyt) {
        this.h = diu;
        this.a = agyt;
    }

    public final void a(agyk agyk) {
        Object obj;
        agyk.d = this.h.i();
        this.h.oy();
        agyk.e = this.h.oG();
        agyk.f = this.h.g();
        agyk.g = this.h.lv();
        this.h.lw();
        this.h.ll();
        agyk.h = this.h.ds();
        agyk.i = this.h.ga();
        agyk.j = this.h.dt();
        agyk.k = this.h.lx();
        agyk.l = this.h.c();
        Object obj2 = this.b;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.b;
                if (obj instanceof baqe) {
                    obj = agyh.a(this.a, this.h.hK());
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
                    obj = new agyr(this.h.ow());
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
                    obj = agyx.a(this.h.i(), this.a);
                    this.e = bapx.a(this.e, obj);
                }
            }
            obj2 = obj;
        }
        agys.c(agyk, obj2);
        agyk.q = this.h.lm();
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
}
