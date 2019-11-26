package defpackage;

import android.app.Activity;
import android.content.pm.PackageManager;
import com.google.android.libraries.youtube.player.playability.AgeVerificationDialog;

/* renamed from: dmi */
final class dmi implements huv {
    private volatile Object a = new baqe();
    private volatile Object b = new baqe();
    private volatile Object c = new baqe();
    private volatile Object d = new baqe();
    private volatile Object e = new baqe();
    private volatile Object f = new baqe();
    private final /* synthetic */ dlu g;

    public final void a(huk huk) {
        Object obj;
        dlu dlu = this.g;
        Object obj2 = dlu.dq;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = dlu.dq;
                if (obj instanceof baqe) {
                    zyw c = dlu.dL.c();
                    bcaa cb = dlu.cb();
                    bcaa bcaa = dlu.dp;
                    if (bcaa == null) {
                        bcaa = new dmu(dlu, 611);
                        dlu.dp = bcaa;
                    }
                    if (foh.f(c)) {
                        obj = (lgm) bcaa.get();
                    } else {
                        obj = (lgm) cb.get();
                    }
                    obj = (lgm) baqd.a(obj, "Cannot return null from a non-@Nullable @Provides method");
                    dlu.dq = bapx.a(dlu.dq, obj);
                }
            }
            obj2 = obj;
        }
        huk.a = (lgm) obj2;
        huk.b = this.g.cc();
        huk.c = this.g.dL.oI();
        huk.Z = this.g.dL.oC();
        huk.aa = this.g.c();
        huk.ab = this.g.bK();
        huk.ac = this.g.jH();
        Object obj3 = this.a;
        if (obj3 instanceof baqe) {
            synchronized (obj3) {
                obj2 = this.a;
                if (obj2 instanceof baqe) {
                    diu diu = this.g.dL;
                    Object obj4 = diu.dV;
                    if (obj4 instanceof baqe) {
                        Object obj5;
                        synchronized (obj4) {
                            obj5 = diu.dV;
                            if (obj5 instanceof baqe) {
                                obj5 = (PackageManager) baqd.a(dnj.a(diu.ow()), "Cannot return null from a non-@Nullable @Provides method");
                                diu.dV = bapx.a(diu.dV, obj5);
                            }
                        }
                        obj4 = obj5;
                    }
                    dwq dwq = new dwq((PackageManager) obj4, this.g.dL.ms(), this.g.bX(), this.g.e(), this.g.jH(), this.g.dL.eu());
                    this.a = bapx.a(this.a, dwq);
                }
            }
            obj3 = obj2;
        }
        huk.ad = (dwq) obj3;
        huk.ae = this.g.bW();
        huk.af = this.g.dL.gO();
        huk.ag = this.g.dL.aS();
        obj3 = this.b;
        if (obj3 instanceof baqe) {
            synchronized (obj3) {
                obj2 = this.b;
                if (obj2 instanceof baqe) {
                    Activity a = xex.a(this.g.a);
                    obj2 = (aiuq) baqd.a(new aiuq(a, new AgeVerificationDialog(a, this.g.dL.oz(), this.g.dL.k(), this.g.dL.mF(), this.g.dL.ht())), "Cannot return null from a non-@Nullable @Provides method");
                    this.b = bapx.a(this.b, obj2);
                }
            }
            obj3 = obj2;
        }
        huk.ah = (aiuq) obj3;
        huk.ai = this.g.dL.fP();
        huk.aj = this.g.dL.lE();
        huk.ak = this.g.H();
        huk.al = this.g.dL.nU();
        huk.am = this.g.gI();
        huk.an = this.g.be();
        dlu = this.g;
        obj2 = dlu.dr;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = dlu.dr;
                if (obj instanceof baqe) {
                    mjy cf = dlu.cf();
                    if (cf.U == null) {
                        cf.U = new aiqd(cf.h.a(1), cf.h.a(2), cf.T.b, cf.h.a(0));
                    }
                    obj = (aiqd) baqd.a(cf.U, "Cannot return null from a non-@Nullable @Provides method");
                    dlu.dr = bapx.a(dlu.dr, obj);
                }
            }
            obj2 = obj;
        }
        huk.ao = (aiqd) obj2;
        huk.ap = this.g.cf();
        huk.aq = this.g.dL.el();
        obj3 = this.c;
        if (obj3 instanceof baqe) {
            synchronized (obj3) {
                obj2 = this.c;
                if (obj2 instanceof baqe) {
                    liw liw = new liw(this.g.dt(), this.g.gG(), this.g.aI(), this.g.dL.oC(), this.g.c(), this.g.dL.c());
                    this.c = bapx.a(this.c, liw);
                }
            }
            obj3 = obj2;
        }
        huk.ar = (liw) obj3;
        dlu = this.g;
        obj2 = dlu.ds;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = dlu.ds;
                if (obj instanceof baqe) {
                    htr htr = new htr(dlu.d(), dlu.dx());
                    dlu.ds = bapx.a(dlu.ds, htr);
                    obj = htr;
                }
            }
            obj2 = obj;
        }
        huk.as = (htr) obj2;
        obj3 = this.d;
        if (obj3 instanceof baqe) {
            synchronized (obj3) {
                obj2 = this.d;
                if (obj2 instanceof baqe) {
                    hto hto = new hto(this.g.d(), this.g.dx(), this.g.dL.oC(), this.g.dL.n(), this.g.dL.c(), this.g.c());
                    this.d = bapx.a(this.d, hto);
                }
            }
            obj3 = obj2;
        }
        huk.at = (hto) obj3;
        obj3 = this.e;
        if (obj3 instanceof baqe) {
            synchronized (obj3) {
                obj2 = this.e;
                if (obj2 instanceof baqe) {
                    obj2 = new hug(this.g.dx(), this.g.dL.fz());
                    this.e = bapx.a(this.e, obj2);
                }
            }
            obj3 = obj2;
        }
        huk.au = (hug) obj3;
        huk.av = this.g.d();
        huk.aw = this.g.dL.gM();
        obj3 = this.f;
        if (obj3 instanceof baqe) {
            synchronized (obj3) {
                obj2 = this.f;
                if (obj2 instanceof baqe) {
                    obj2 = new huh(this.g.d());
                    this.f = bapx.a(this.f, obj2);
                }
            }
            obj3 = obj2;
        }
        huk.ax = (huh) obj3;
        huk.ay = this.g.gW();
        huk.az = this.g.dL.nV();
        huk.aA = this.g.dL.lZ();
        huk.aB = this.g.ha();
        huk.aC = this.g.ak();
        huk.aD = this.g.S();
        huk.aE = this.g.dx();
        huk.aF = this.g.dL.c();
        huk.aG = this.g.ek();
        huk.aH = this.g.dL.ge();
        huk.aI = this.g.dL.jg();
        huk.aJ = dvo.a(this.g.a);
    }

    /* synthetic */ dmi(dlu dlu) {
        this.g = dlu;
    }
}
