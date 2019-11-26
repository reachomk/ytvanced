package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: dkd */
final class dkd implements bcaa {
    private final int a;
    private final /* synthetic */ dka b;

    dkd(dka dka, int i) {
        this.b = dka;
        this.a = i;
    }

    public final Object get() {
        int i = this.a;
        dka dka;
        Object obj;
        Object obj2;
        xsc oy;
        bcaa bcaa;
        bcaa kY;
        bcaa bcaa2;
        bcaa mK;
        bcaa o;
        bcaa bcaa3;
        bcaa kY2;
        switch (i) {
            case 0:
                return this.b.a();
            case 1:
                return this.b.f();
            case 2:
                dka = this.b;
                obj = dka.i;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dka.i;
                        if (obj2 instanceof baqe) {
                            afzn afzn = new afzn(dka.b(), dka.x.dC(), dka.m(), dka.t(), dka.q());
                            dka.i = bapx.a(dka.i, afzn);
                        }
                    }
                    obj = obj2;
                }
                return (afzn) obj;
            case 3:
                return this.b.l();
            case 4:
                return this.b.s();
            case 5:
                return this.b.b();
            case 6:
                dka = this.b;
                obj = dka.c;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dka.c;
                        if (obj2 instanceof baqe) {
                            agdo agdo = new agdo(dka.x.ow(), dka.x.oy(), dka.x.cM(), dka.a, dka.x.li(), dka.x.kR(), dka.m(), dka.x.ph(), dka.x.ox(), dka.x.n());
                            dka.c = bapx.a(dka.c, agdo);
                        }
                    }
                    obj = obj2;
                }
                return (agdo) obj;
            case 7:
                dka = this.b;
                obj = dka.d;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dka.d;
                        if (obj2 instanceof baqe) {
                            obj2 = new afzq(dka.m());
                            dka.d = bapx.a(dka.d, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (afzq) obj;
            case 8:
                dka = this.b;
                obj = dka.f;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dka.f;
                        if (obj2 instanceof baqe) {
                            oy = dka.x.oy();
                            bcaa = dka.e;
                            if (bcaa == null) {
                                bcaa = new dkd(dka, 9);
                                dka.e = bcaa;
                            }
                            agbo agbo = new agbo(oy, bcaa, dka.x.oh(), dka.m(), dka.w, dka.x.oA());
                            dka.f = bapx.a(dka.f, agbo);
                        }
                    }
                    obj = obj2;
                }
                return (agbo) obj;
            case 9:
                return this.b.e();
            case 10:
                dka = this.b;
                obj = dka.g;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dka.g;
                        if (obj2 instanceof baqe) {
                            agdt agdt = new agdt(dka.s());
                            dka.g = bapx.a(dka.g, agdt);
                            obj2 = agdt;
                        }
                    }
                    obj = obj2;
                }
                return obj;
            case 11:
                dka = this.b;
                obj = dka.h;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dka.h;
                        if (obj2 instanceof baqe) {
                            agdz agdz = new agdz(dka.s());
                            dka.h = bapx.a(dka.h, agdz);
                            obj2 = agdz;
                        }
                    }
                    obj = obj2;
                }
                return (agdz) obj;
            case 12:
                return this.b.w();
            case 13:
                dka = this.b;
                obj = dka.l;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dka.l;
                        if (obj2 instanceof baqe) {
                            Context ow = dka.x.ow();
                            oy = dka.x.oy();
                            String str = dka.a;
                            kY = dka.x.kY();
                            xah kR = dka.x.kR();
                            diu diu = dka.x;
                            bcaa = diu.ei;
                            if (bcaa == null) {
                                bcaa = new dlk(diu, 526);
                                diu.ei = bcaa;
                            }
                            bcaa2 = bcaa;
                            mK = dka.x.mK();
                            agbg agbg = dka.b;
                            Executor oA = dka.x.oA();
                            Executor kQ = dka.x.kQ();
                            agfu g = dka.g();
                            bcaa m = dka.m();
                            bcaa n = dka.n();
                            bcaa c = dka.c();
                            o = dka.o();
                            bcaa p = dka.p();
                            bcaa t = dka.t();
                            bcaa u = dka.u();
                            ahdm dq = dka.x.dq();
                            bcaa3 = dka.k;
                            if (bcaa3 == null) {
                                bcaa3 = new dkd(dka, 15);
                                dka.k = bcaa3;
                            }
                            afzs afzs = new afzs(ow, oy, str, kY, kR, bcaa2, mK, agbg, oA, kQ, g, m, n, c, o, p, t, u, dq, bcaa3, dka.r(), dka.x.c());
                            dka.l = bapx.a(dka.l, afzs);
                        }
                    }
                    obj = obj2;
                }
                return (afzs) obj;
            case 14:
                return this.b.k();
            case 15:
                dka = this.b;
                obj = dka.j;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dka.j;
                        if (obj2 instanceof baqe) {
                            agdh agdh = new agdh((agdq) dka.w(), dka.x.eF());
                            dka.j = bapx.a(dka.j, agdh);
                            obj2 = agdh;
                        }
                    }
                    obj = obj2;
                }
                return obj;
            case 16:
                dka = this.b;
                obj = dka.n;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dka.n;
                        if (obj2 instanceof baqe) {
                            kY2 = dka.x.kY();
                            agbg agbg2 = dka.b;
                            bcaa v = dka.v();
                            kY = dka.o();
                            bcaa p2 = dka.p();
                            bcaa2 = dka.t();
                            bcaa3 = dka.m;
                            if (bcaa3 == null) {
                                bcaa3 = new dkd(dka, 17);
                                dka.m = bcaa3;
                            }
                            mK = bcaa3;
                            bcaa u2 = dka.u();
                            zzl n2 = dka.x.n();
                            String str2 = dka.a;
                            xah kR2 = dka.x.kR();
                            ahdm dq2 = dka.x.dq();
                            agwa ds = dka.x.ds();
                            xsc oy2 = dka.x.oy();
                            agdx.a();
                            o = dka.r();
                            dka.m();
                            agbu agbu = new agbu(kY2, agbg2, v, kY, p2, bcaa2, mK, u2, n2, str2, kR2, dq2, ds, oy2, o, dka.x.oA());
                            dka.n = bapx.a(dka.n, agbu);
                        }
                    }
                    obj = obj2;
                }
                return (agbu) obj;
            case 17:
                return this.b.h();
            case 18:
                dka = this.b;
                obj = dka.o;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dka.o;
                        if (obj2 instanceof baqe) {
                            agce agce = new agce(dka.x.oy(), dka.a, dka.x.oh(), dka.x.kY(), dka.x.nj(), dka.x.ga(), dka.x.du(), dka.b(), dka.m(), dka.b, dka.o(), dka.t(), dka.q(), dka.x.dB(), dka.x.n(), dka.x.c());
                            dka.o = bapx.a(dka.o, agce);
                        }
                    }
                    obj = obj2;
                }
                return (agce) obj;
            case 19:
                dka = this.b;
                obj = dka.r;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dka.r;
                        if (obj2 instanceof baqe) {
                            bcaa = dka.q;
                            if (bcaa == null) {
                                bcaa = new dkd(dka, 20);
                                dka.q = bcaa;
                            }
                            afzj afzj = new afzj(bcaa, dka.x.kQ(), dka.m(), dka.o(), dka.b);
                            dka.r = bapx.a(dka.r, afzj);
                        }
                    }
                    obj = obj2;
                }
                return (afzj) obj;
            case 20:
                dka = this.b;
                obj = dka.p;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dka.p;
                        if (obj2 instanceof baqe) {
                            obj2 = (agdi) baqd.a((Object) new agdi(dka.x.gc(), dka.x.dB(), dka.l(), dka.x.oy(), dka.x.fW().c()), "Cannot return null from a non-@Nullable @Provides method");
                            dka.p = bapx.a(dka.p, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (agdi) obj;
            case 21:
                dka = this.b;
                obj = dka.t;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dka.t;
                        if (obj2 instanceof baqe) {
                            bcaa = dka.s;
                            if (bcaa == null) {
                                bcaa = new dkd(dka, 22);
                                dka.s = bcaa;
                            }
                            obj2 = new afzp(bcaa);
                            dka.t = bapx.a(dka.t, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (afzp) obj;
            case 22:
                return this.b.d();
            case 23:
                dka = this.b;
                obj = dka.v;
                if (obj instanceof baqe) {
                    synchronized (obj) {
                        obj2 = dka.v;
                        if (obj2 instanceof baqe) {
                            dka.x.oA();
                            dka.m();
                            dka.p();
                            bcaa = dka.j();
                            kY2 = dka.u;
                            if (kY2 == null) {
                                kY2 = new dkd(dka, 24);
                                dka.u = kY2;
                            }
                            obj2 = new agbs(bcaa, kY2, dka.b);
                            dka.v = bapx.a(dka.v, obj2);
                        }
                    }
                    obj = obj2;
                }
                return (agbs) obj;
            case 24:
                return this.b.i();
            default:
                throw new AssertionError(i);
        }
    }
}
