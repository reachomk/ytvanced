package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: dko */
final class dko implements bcaa {
    private final int a;
    private final /* synthetic */ dkn b;

    dko(dkn dkn, int i) {
        this.b = dkn;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        dkn dkn;
        Object obj;
        Object obj2;
        switch (i) {
            case 0:
                dkn = this.b;
                obj = dkn.a;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dkn.a;
                        if (obj2 instanceof baqe) {
                            agzu agzu = new agzu(dkn.g.oy(), dkn.g.cM(), dkn.g.gI(), dkn.g.dA(), dkn.g.lk(), dkn.g.oJ(), dkn.g.ox(), dkn.g.dl(), dkn.a(), dkn.g.ds());
                            dkn.a = bapx.a(dkn.a, agzu);
                        }
                    }
                    obj = obj2;
                }
                return (agzu) obj;
            case 1:
                dkn = this.b;
                return (ahak) baqd.a(new ahak(dkn.g.dl(), dkn.g.lm(), dkn.g.i()), "Cannot return null from a non-@Nullable @Provides method");
            case 2:
                dkn = this.b;
                obj = dkn.c;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dkn.c;
                        if (obj2 instanceof baqe) {
                            xsc oy = dkn.g.oy();
                            xua cM = dkn.g.cM();
                            ajgv gI = dkn.g.gI();
                            aajx dA = dkn.g.dA();
                            ahad lk = dkn.g.lk();
                            xsf oJ = dkn.g.oJ();
                            SharedPreferences ox = dkn.g.ox();
                            agpm dt = dkn.g.dt();
                            afhg dl = dkn.g.dl();
                            bcaa a = dkn.a();
                            bcaa bcaa = dkn.b;
                            if (bcaa == null) {
                                bcaa = new dko(dkn, 3);
                                dkn.b = bcaa;
                            }
                            agzz agzz = new agzz(oy, cM, gI, dA, lk, oJ, ox, dt, dl, a, bcaa, dkn.g.ds());
                            dkn.c = bapx.a(dkn.c, agzz);
                        }
                    }
                    obj = obj2;
                }
                return (agzz) obj;
            case 3:
                Object obj3;
                dkn = this.b;
                Context ow = dkn.g.ow();
                aaxf ln = dkn.g.ln();
                agne lj = dkn.g.lj();
                acuf m = dkn.g.m();
                diu diu = dkn.g;
                bcaa bcaa2 = diu.cm;
                if (bcaa2 == null) {
                    bcaa2 = new dlk(diu, 413);
                    diu.cm = bcaa2;
                }
                bcaa bcaa3 = diu.cn;
                if (bcaa3 == null) {
                    bcaa3 = new dlk(diu, 419);
                    diu.cn = bcaa3;
                }
                if (xy.c()) {
                    obj3 = (agnv) bcaa3.get();
                } else {
                    obj3 = (agnv) bcaa2.get();
                }
                return new agoa(ow, ln, lj, m, (agnv) baqd.a(obj3, "Cannot return null from a non-@Nullable @Provides method"));
            case 4:
                dkn = this.b;
                obj = dkn.d;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dkn.d;
                        if (obj2 instanceof baqe) {
                            agzq agzq = new agzq(dkn.g.oy(), dkn.g.cM(), dkn.g.lk(), dkn.g.oJ(), dkn.g.ox(), dkn.g.dl(), dkn.a(), dkn.g.ds());
                            dkn.d = bapx.a(dkn.d, agzq);
                        }
                    }
                    obj = obj2;
                }
                return (agzq) obj;
            case 5:
                dkn = this.b;
                obj = dkn.e;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dkn.e;
                        if (obj2 instanceof baqe) {
                            obj2 = new agzs(dkn.g.lk());
                            dkn.e = bapx.a(dkn.e, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (agzs) obj;
            case 6:
                dkn = this.b;
                obj = dkn.f;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dkn.f;
                        if (obj2 instanceof baqe) {
                            agzp agzp = new agzp(dkn.g.oy(), dkn.g.dt(), dkn.g.dA(), dkn.g.lk(), dkn.g.oW());
                            dkn.f = bapx.a(dkn.f, agzp);
                        }
                    }
                    obj = obj2;
                }
                return (agzp) obj;
            default:
                throw new AssertionError(i);
        }
    }
}
