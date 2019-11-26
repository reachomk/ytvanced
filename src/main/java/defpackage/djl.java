package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.android.libraries.youtube.edit.geo.EditLocation;
import com.google.protos.youtube.api.innertube.OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint;

/* renamed from: djl */
final class djl implements gsk {
    private volatile bcaa A;
    private volatile Object B = new baqe();
    private volatile Object C = new baqe();
    private volatile Object D = new baqe();
    private volatile Object E = new baqe();
    private volatile Object F = new baqe();
    public final dvk a;
    public volatile ageb b;
    public volatile bcaa c;
    public volatile Object d = new baqe();
    public volatile Object e = new baqe();
    public volatile Object f = new baqe();
    public volatile Object g = new baqe();
    public volatile ehd h;
    public volatile fts i;
    public volatile aaez j;
    public volatile Object k = new baqe();
    public volatile Object l = new baqe();
    public volatile Object m = new baqe();
    public final /* synthetic */ diu n;
    private volatile bcaa o;
    private volatile bcaa p;
    private volatile bcaa q;
    private volatile bcaa r;
    private volatile Object s = new baqe();
    private volatile bcaa t;
    private volatile bcaa u;
    private volatile Object v = new baqe();
    private volatile Object w = new baqe();
    private volatile bcaa x;
    private volatile Object y = new baqe();
    private volatile Object z = new baqe();

    public final aaas a() {
        Object obj;
        Object obj2 = this.s;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.s;
                if (obj instanceof baqe) {
                    Object obj3 = OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class;
                    Object obj4 = this.o;
                    if (obj4 == null) {
                        obj4 = new djk(this, 1);
                        this.o = obj4;
                    }
                    Object obj5 = ayvl.class;
                    Object obj6 = this.p;
                    if (obj6 == null) {
                        obj6 = new djk(this, 2);
                        this.p = obj6;
                    }
                    Object obj7 = aoyr.class;
                    Object obj8 = this.q;
                    if (obj8 == null) {
                        obj8 = new djk(this, 4);
                        this.q = obj8;
                    }
                    Object obj9 = aoxd.class;
                    Object obj10 = this.r;
                    if (obj10 == null) {
                        obj10 = new djk(this, 5);
                        this.r = obj10;
                    }
                    amss.a(obj3, obj4);
                    amss.a(obj5, obj6);
                    amss.a(obj7, obj8);
                    amss.a(obj9, obj10);
                    obj = new egw(new aaak(amwm.a(4, new Object[]{obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10})), this.n.ff());
                    this.s = bapx.a(this.s, obj);
                }
            }
        } else {
            obj = obj2;
        }
        return (aaas) obj;
    }

    public final zqe b() {
        Object obj = this.z;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.z;
                if (obj2 instanceof baqe) {
                    obj2 = zqh.a();
                    obj2.a = xfa.a(this.a);
                    obj2.b = tlg.a();
                    obj2.c = this.n.n();
                    this.z = bapx.a(this.z, obj2);
                }
            }
            obj = obj2;
        }
        return (zqe) obj;
    }

    private final xnu c() {
        Object obj = this.C;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.C;
                if (obj2 instanceof baqe) {
                    obj2 = new xnu(xex.a(this.a));
                    this.C = bapx.a(this.C, obj2);
                }
            }
            obj = obj2;
        }
        return (xnu) obj;
    }

    private final fbp d() {
        Object obj = this.E;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.E;
                if (obj2 instanceof baqe) {
                    Object obj3;
                    zyw c = this.n.c();
                    fpb fpb = new fpb(this.n.by(), this.n.J());
                    Object obj4 = this.B;
                    if (obj4 instanceof baqe) {
                        synchronized (obj4) {
                            obj3 = this.B;
                            if (obj3 instanceof baqe) {
                                obj3 = enr.a();
                                this.B = bapx.a(this.B, obj3);
                            }
                        }
                        obj4 = obj3;
                    }
                    eif eif = (eif) obj4;
                    xnu c2 = c();
                    obj4 = this.D;
                    if (obj4 instanceof baqe) {
                        synchronized (obj4) {
                            obj3 = this.D;
                            if (obj3 instanceof baqe) {
                                obj3 = xpc.a(c());
                                this.D = bapx.a(this.D, obj3);
                            }
                        }
                        obj4 = obj3;
                    }
                    fbp fbp = new fbp(c, fpb, eif, c2, (bctz) obj4);
                    this.E = bapx.a(this.E, fbp);
                }
            }
            obj = obj2;
        }
        return (fbp) obj;
    }

    public final void a(EditLocation editLocation) {
        editLocation.a = this.n.s();
        bcaa bcaa = this.t;
        if (bcaa == null) {
            bcaa = new djk(this, 0);
            this.t = bcaa;
        }
        bcaa jw = this.n.jw();
        bcaa bcaa2 = this.u;
        if (bcaa2 == null) {
            bcaa2 = new djk(this, 6);
            this.u = bcaa2;
        }
        editLocation.b = new akzb(bcaa, jw, bcaa2);
    }

    public final void a(EditVideoActivity editVideoActivity) {
        Object obj;
        bcaa bcaa;
        editVideoActivity.g = this.n.aB();
        editVideoActivity.h = this.n.oH();
        Object obj2 = this.w;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.w;
                if (obj instanceof baqe) {
                    Handler oF = this.n.oF();
                    Object obj3 = this.v;
                    if (obj3 instanceof baqe) {
                        Object obj4;
                        synchronized (obj3) {
                            obj4 = this.v;
                            if (obj4 instanceof baqe) {
                                obj4 = new ewf();
                                this.v = bapx.a(this.v, obj4);
                            }
                        }
                        obj3 = obj4;
                    }
                    obj = new ewi(oF, (ewf) obj3);
                    this.w = bapx.a(this.w, obj);
                }
            }
            obj2 = obj;
        }
        editVideoActivity.b_ = (ewi) obj2;
        this.n.c();
        editVideoActivity.j = new suq(this.n.W());
        obj2 = this.y;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.y;
                if (obj instanceof baqe) {
                    dvg a = dvo.a(this.a);
                    dvo.a(this.a);
                    bcaa = this.x;
                    if (bcaa == null) {
                        bcaa = new djk(this, 7);
                        this.x = bcaa;
                    }
                    bapx.b(bcaa);
                    obj = dvp.a(a, amuw.a(dvm.a(amuw.a(dvn.a()))));
                    this.y = bapx.a(this.y, obj);
                }
            }
            obj2 = obj;
        }
        editVideoActivity.k = (xfg) obj2;
        editVideoActivity.l = this.n.k();
        editVideoActivity.m = this.n.n();
        editVideoActivity.n = this.n.iV();
        editVideoActivity.o = this.n.oC();
        editVideoActivity.p = bapx.b(this.n.jx());
        editVideoActivity.q = this.n.s();
        bcaa jy = this.n.jy();
        bcaa = this.A;
        if (bcaa == null) {
            bcaa = new djk(this, 8);
            this.A = bcaa;
        }
        editVideoActivity.r = new zqs(jy, bcaa, this.n.jA());
        editVideoActivity.s = b();
        editVideoActivity.t = this.n.ja();
        editVideoActivity.u = a();
        editVideoActivity.v = d();
        obj2 = this.F;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.F;
                if (obj instanceof baqe) {
                    obj = fdb.a(d(), this.n.oF());
                    this.F = bapx.a(this.F, obj);
                }
            }
            obj2 = obj;
        }
        editVideoActivity.w = (fda) obj2;
    }

    /* synthetic */ djl(diu diu, dvk dvk) {
        this.n = diu;
        this.a = dvk;
    }
}
