package defpackage;

import android.content.Context;

/* renamed from: dmj */
final class dmj implements bcaa {
    private final int a;
    private final /* synthetic */ dmg b;

    dmj(dmg dmg, int i) {
        this.b = dmg;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        dmg dmg;
        Object obj;
        Object obj2;
        switch (i) {
            case 0:
                dmg = this.b;
                obj = dmg.f;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dmg.f;
                        if (obj2 instanceof baqe) {
                            bcaa bcaa = dmg.c;
                            if (bcaa == null) {
                                bcaa = new dmj(dmg, 1);
                                dmg.c = bcaa;
                            }
                            bcaa bcaa2 = dmg.e;
                            if (bcaa2 == null) {
                                bcaa2 = new dmj(dmg, 4);
                                dmg.e = bcaa2;
                            }
                            if (dmg.j.dL.np()) {
                                obj2 = (hdy) bcaa2.get();
                            } else {
                                obj2 = (hdy) bcaa.get();
                            }
                            obj2 = (hdy) baqd.a(obj2, "Cannot return null from a non-@Nullable @Provides method");
                            dmg.f = bapx.a(dmg.f, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (hdy) obj;
            case 1:
                dmg = this.b;
                obj = dmg.b;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dmg.b;
                        if (obj2 instanceof baqe) {
                            hdq hdq = new hdq(xfa.a(dmg.j.a), dmg.j.dL.oC(), dmg.j.dL.nK(), dmg.b(), dmg.c(), dmg.d(), dmg.e(), dmg.j.c(), dmg.j.dL.el(), dmg.j.dL.c());
                            dmg.b = bapx.a(dmg.b, hdq);
                        }
                    }
                    obj = obj2;
                }
                return (hdq) obj;
            case 2:
                return this.b.a();
            case 3:
                dmg = this.b;
                obj = dmg.a;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dmg.a;
                        if (obj2 instanceof baqe) {
                            obj2 = (aibd) baqd.a((Object) new aibd(dmg.j.d(), (hea) dmg.a(), dmg.j.dL.m0do(), dmg.j.dL.oz(), dmg.j.dL.oB()), "Cannot return null from a non-@Nullable @Provides method");
                            dmg.a = bapx.a(dmg.a, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (aibd) obj;
            case 4:
                dmg = this.b;
                obj = dmg.d;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dmg.d;
                        if (obj2 instanceof baqe) {
                            hfy hfy = new hfy(xfa.a(dmg.j.a), dmg.j.dL.oC(), dmg.j.dL.nK(), dmg.b(), dmg.c(), dmg.d(), dmg.e(), dmg.j.c(), dmg.j.dL.el(), dmg.j.dL.c(), dmg.j.p(), dmg.j.dL.ox());
                            dmg.d = bapx.a(dmg.d, hfy);
                        }
                    }
                    obj = obj2;
                }
                return (hfy) obj;
            case 5:
                return this.b.f();
            case 6:
                dmg = this.b;
                obj = dmg.g;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dmg.g;
                        if (obj2 instanceof baqe) {
                            obj2 = (aibd) baqd.a((Object) new aibd(dmg.j.d(), (heb) dmg.f(), dmg.j.dL.m0do(), dmg.j.dL.oz(), dmg.j.dL.oB()), "Cannot return null from a non-@Nullable @Provides method");
                            dmg.g = bapx.a(dmg.g, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (aibd) obj;
            case 7:
                dmg = this.b;
                obj = dmg.h;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dmg.h;
                        if (obj2 instanceof baqe) {
                            aizy d = dmg.j.d();
                            dmg.j.dL.oC();
                            obj2 = (hek) baqd.a(new hek(dmg.j.dL.el(), d, (aifc) dmg.f()), "Cannot return null from a non-@Nullable @Provides method");
                            dmg.h = bapx.a(dmg.h, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (hek) obj;
            case 8:
                dmg = this.b;
                obj = dmg.i;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dmg.i;
                        if (obj2 instanceof baqe) {
                            Context a = xfa.a(dmg.j.a);
                            aizy d2 = dmg.j.d();
                            Object hfn = new hfn(new aiga(a));
                            d2.getClass();
                            hfn.a(new hfi(d2));
                            obj2 = (aigc) baqd.a(hfn, "Cannot return null from a non-@Nullable @Provides method");
                            dmg.i = bapx.a(dmg.i, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (aigc) obj;
            case 9:
                return this.b.g();
            default:
                throw new AssertionError(i);
        }
    }
}
