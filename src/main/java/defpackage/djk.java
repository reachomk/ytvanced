package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: djk */
final class djk implements bcaa {
    private final int a;
    private final /* synthetic */ djl b;

    djk(djl djl, int i) {
        this.b = djl;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        djl djl;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        switch (i) {
            case 0:
                return this.b.a();
            case 1:
                djl = this.b;
                obj = djl.b;
                if (obj == null) {
                    obj = new ageb(djl.n.jq(), djl.n.dr());
                    djl.b = obj;
                }
                return obj;
            case 2:
                djl = this.b;
                obj = djl.h;
                if (obj == null) {
                    Object obj5;
                    Object obj6;
                    Context a = xfa.a(djl.a);
                    vod fX = djl.n.fX();
                    obj2 = djl.e;
                    if (obj2 instanceof baqe) {
                        synchronized (obj2) {
                            obj3 = djl.e;
                            if (obj3 instanceof baqe) {
                                obj5 = djl.d;
                                if (obj5 instanceof baqe) {
                                    synchronized (obj5) {
                                        obj6 = djl.d;
                                        if (obj6 instanceof baqe) {
                                            bcaa bcaa = djl.c;
                                            if (bcaa == null) {
                                                bcaa = new djk(djl, 3);
                                                djl.c = bcaa;
                                            }
                                            obj6 = new exu(bcaa);
                                            djl.d = bapx.a(djl.d, obj6);
                                        }
                                    }
                                    obj5 = obj6;
                                }
                                obj3 = new dwc((exu) obj5, djl.a());
                                djl.e = bapx.a(djl.e, obj3);
                            }
                        }
                        obj2 = obj3;
                    }
                    dwc dwc = (dwc) obj2;
                    obj3 = djl.g;
                    if (obj3 instanceof baqe) {
                        synchronized (obj3) {
                            obj5 = djl.g;
                            if (obj5 instanceof baqe) {
                                bcaa jt = djl.n.jt();
                                egr egr = new egr();
                                vur vur = new vur(djl.n.ow(), djl.n.fQ());
                                afqv bM = djl.n.bM();
                                Executor oA = djl.n.oA();
                                xci oC = djl.n.oC();
                                obj6 = djl.f;
                                if (obj6 instanceof baqe) {
                                    Object obj7;
                                    synchronized (obj6) {
                                        obj7 = djl.f;
                                        if (obj7 instanceof baqe) {
                                            obj7 = (ajam) baqd.a(djl.n.oU().a, "Cannot return null from a non-@Nullable @Provides method");
                                            djl.f = bapx.a(djl.f, obj7);
                                        }
                                    }
                                    obj6 = obj7;
                                }
                                egv egv = new egv(jt, egr, vur, bM, oA, oC, (ajam) obj6, djl.n.c());
                                djl.g = bapx.a(djl.g, egv);
                            }
                        }
                        obj3 = obj5;
                    }
                    obj = ehi.a(a, fX, dwc, (egv) obj3, djl.n.ju());
                    djl.h = obj;
                }
                return obj;
            case 3:
                return amuw.a(this.b.n.js());
            case 4:
                djl = this.b;
                obj = djl.i;
                if (obj == null) {
                    obj = new fts(xfa.a(djl.a));
                    djl.i = obj;
                }
                return obj;
            case 5:
                djl = this.b;
                obj = djl.j;
                if (obj == null) {
                    obj = new aaez(xex.a(djl.a), djl.n.jv(), ampo.a);
                    djl.j = obj;
                }
                return obj;
            case 6:
                djl = this.b;
                obj = djl.k;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj4 = djl.k;
                        if (obj4 instanceof baqe) {
                            obj4 = new akpi();
                            djl.k = bapx.a(djl.k, obj4);
                        }
                    }
                    obj = obj4;
                }
                return (akpi) obj;
            case 7:
                djl = this.b;
                obj = djl.m;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj4 = djl.m;
                        if (obj4 instanceof baqe) {
                            obj2 = djl.l;
                            if (obj2 instanceof baqe) {
                                synchronized (obj2) {
                                    obj3 = djl.l;
                                    if (obj3 instanceof baqe) {
                                        obj3 = new egh(xex.a(djl.a), djl.n.ox());
                                        djl.l = bapx.a(djl.l, obj3);
                                    }
                                }
                                obj2 = obj3;
                            }
                            obj4 = new egk((egh) obj2);
                            djl.m = bapx.a(djl.m, obj4);
                        }
                    }
                    obj = obj4;
                }
                return (egk) obj;
            case 8:
                return this.b.b();
            default:
                throw new AssertionError(i);
        }
    }
}
