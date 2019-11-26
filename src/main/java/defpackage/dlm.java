package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.google.android.apps.youtube.app.extensions.upload.UploadActivity;
import com.google.android.libraries.youtube.edit.geo.EditLocation;
import com.google.protos.youtube.api.innertube.ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint;
import com.google.protos.youtube.api.innertube.OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint;
import com.google.protos.youtube.api.innertube.RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint;
import com.google.protos.youtube.api.innertube.ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint;
import java.util.concurrent.Executor;

/* renamed from: dlm */
final class dlm implements gsn {
    private volatile bcaa A;
    private volatile Object B = new baqe();
    private volatile Object C = new baqe();
    private volatile bcaa D;
    private volatile Object E = new baqe();
    private volatile Object F = new baqe();
    private volatile Object G = new baqe();
    private volatile Object H = new baqe();
    private volatile bcaa I;
    public final dvk a;
    public final gtv b;
    public volatile egu c;
    public volatile ageb d;
    public volatile aaez e;
    public volatile urh f;
    public volatile uzr g;
    public volatile uzq h;
    public volatile Object i = new baqe();
    public volatile Object j = new baqe();
    public volatile Object k = new baqe();
    public volatile Object l = new baqe();
    public volatile Object m = new baqe();
    public volatile Object n = new baqe();
    public final /* synthetic */ diu o;
    private volatile Object p = new baqe();
    private volatile Object q = new baqe();
    private volatile bcaa r;
    private volatile bcaa s;
    private volatile bcaa t;
    private volatile bcaa u;
    private volatile bcaa v;
    private volatile bcaa w;
    private volatile bcaa x;
    private volatile Object y = new baqe();
    private volatile bcaa z;

    public final urs a() {
        Object obj = this.q;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.q;
                if (obj2 instanceof baqe) {
                    obj2 = this.p;
                    if (obj2 instanceof baqe) {
                        Object obj3;
                        synchronized (obj2) {
                            obj3 = this.p;
                            if (obj3 instanceof baqe) {
                                obj3 = new urv(dvo.a(this.a), this.o.oC());
                                this.p = bapx.a(this.p, obj3);
                            }
                        }
                        obj2 = obj3;
                    }
                    obj2 = (urv) obj2;
                    obj2.a(gtu.a(this.b));
                    obj2 = (urs) baqd.a(obj2, "Cannot return null from a non-@Nullable @Provides method");
                    this.q = bapx.a(this.q, obj2);
                }
            }
            obj = obj2;
        }
        return (urs) obj;
    }

    public final bcaa b() {
        bcaa bcaa = this.r;
        if (bcaa != null) {
            return bcaa;
        }
        dlp dlp = new dlp(this, 1);
        this.r = dlp;
        return dlp;
    }

    public final aaas c() {
        Object obj;
        Object obj2 = this.y;
        if (obj2 instanceof baqe) {
            synchronized (obj2) {
                obj = this.y;
                if (obj instanceof baqe) {
                    UploadActivity a = gtu.a(this.b);
                    vod fX = this.o.fX();
                    Activity a2 = xex.a(this.a);
                    xci oC = this.o.oC();
                    xhv i = this.o.i();
                    bcaa bcaa = this.s;
                    if (bcaa == null) {
                        bcaa = new dlp(this, 0);
                        this.s = bcaa;
                    }
                    bcaa bcaa2 = bcaa;
                    Class cls = OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.class;
                    bcaa = this.t;
                    if (bcaa == null) {
                        bcaa = new dlp(this, 2);
                        this.t = bcaa;
                    }
                    bcaa bcaa3 = bcaa;
                    Class cls2 = aoxd.class;
                    bcaa = this.u;
                    if (bcaa == null) {
                        bcaa = new dlp(this, 3);
                        this.u = bcaa;
                    }
                    bcaa bcaa4 = bcaa;
                    Class cls3 = ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.class;
                    bcaa = this.v;
                    if (bcaa == null) {
                        bcaa = new dlp(this, 4);
                        this.v = bcaa;
                    }
                    bcaa bcaa5 = bcaa;
                    Class cls4 = RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.class;
                    bcaa = this.w;
                    if (bcaa == null) {
                        bcaa = new dlp(this, 5);
                        this.w = bcaa;
                    }
                    bcaa bcaa6 = bcaa;
                    Class cls5 = ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint.class;
                    bcaa = this.x;
                    if (bcaa == null) {
                        bcaa = new dlp(this, 6);
                        this.x = bcaa;
                    }
                    obj = (aaas) baqd.a(new acwi(new ehb(fX, a2, oC, i, bcaa2, new aaak(amur.a(cls, bcaa3, cls2, bcaa4, cls3, bcaa5, cls4, bcaa6, cls5, bcaa)), this.o.bn()), a), "Cannot return null from a non-@Nullable @Provides method");
                    this.y = bapx.a(this.y, obj);
                }
            }
        } else {
            obj = obj2;
        }
        return (aaas) obj;
    }

    private final bcaa f() {
        bcaa bcaa = this.z;
        if (bcaa != null) {
            return bcaa;
        }
        dlp dlp = new dlp(this, 7);
        this.z = dlp;
        return dlp;
    }

    private final bcaa g() {
        bcaa bcaa = this.A;
        if (bcaa != null) {
            return bcaa;
        }
        dlp dlp = new dlp(this, 8);
        this.A = dlp;
        return dlp;
    }

    private final akoe h() {
        return new akoe(g());
    }

    public final acxj d() {
        return new acxj(this.o.oG(), this.o.oC(), this.o.p(), this.o.q(), this.o.jW(), this.o.r());
    }

    public final zqe e() {
        Object obj = this.H;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.H;
                if (obj2 instanceof baqe) {
                    obj2 = zqh.a();
                    obj2.a = xfa.a(this.a);
                    obj2.b = tlg.a();
                    obj2.c = this.o.n();
                    this.H = bapx.a(this.H, obj2);
                }
            }
            obj = obj2;
        }
        return (zqe) obj;
    }

    public final void a(uqx uqx) {
        uqx.Z = a();
    }

    public final void a(urj urj) {
        urj.ab = a();
        urj.ac = c();
        urj.ad = this.o.oI();
        urj.ae = this.o.bi();
        urj.af = this.o.ka();
        urj.ag = new usk(xfa.a(this.a), c(), a());
        urj.ah = this.o.cB();
    }

    public final void a(EditLocation editLocation) {
        editLocation.a = this.o.s();
        editLocation.b = new akzb(f(), this.o.jw(), g());
    }

    public final void a(dru dru) {
        dru.Z = this.o.oI();
        dru.aa = this.o.aN();
        dru.ab = new usv(this.o.aN(), this.o.hs(), this.o.oA(), this.o.oB());
        dru.ac = this.o.aO();
        dru.ad = f();
        dru.ae = this.o.oC();
        dru.af = this.o.k();
        dru.ag = this.o.s();
        dru.ah = this.o.cd();
        dru.ai = this.o.hs();
        dru.aj = h();
        dru.ak = new dne();
        dru.al = this.o.c();
        dru.am = this.o.jv();
    }

    public final void a(uqv uqv) {
        uqv.Z = this.o.oI();
        uqv.aa = this.o.aN();
        uqv.ab = this.o.oC();
        uqv.ac = this.o.s();
        uqv.ad = this.o.cd();
        uqv.ae = this.o.hs();
        uqv.af = this.o.aO();
        uqv.ag = h();
        uqv.ah = this.o.k();
        uqv.ai = this.o.oB();
        uqv.aj = this.o.oA();
    }

    public final void a(zrr zrr) {
        zrr.ao = this.o.bf();
        zrr.ap = this.o.ox();
        zrr.aq = this.o.n();
        zrr.ar = this.o.bi();
    }

    public final void a(UploadActivity uploadActivity) {
        Object obj;
        Object obj2;
        ambh ambh;
        dvg dvg = uploadActivity;
        dvg.g = this.o.aB();
        dvg.h = this.o.oH();
        Object obj3 = this.C;
        if (obj3 instanceof baqe) {
            synchronized (obj3) {
                obj = this.C;
                if (obj instanceof baqe) {
                    Handler oF = this.o.oF();
                    Object obj4 = this.B;
                    if (obj4 instanceof baqe) {
                        Object obj5;
                        synchronized (obj4) {
                            obj5 = this.B;
                            if (obj5 instanceof baqe) {
                                obj5 = new ewf();
                                this.B = bapx.a(this.B, obj5);
                            }
                        }
                        obj4 = obj5;
                    }
                    obj = new ewi(oF, (ewf) obj4);
                    this.C = bapx.a(this.C, obj);
                }
            }
            obj3 = obj;
        }
        dvg.b_ = (ewi) obj3;
        this.o.c();
        dvg.j = new suq(this.o.W());
        obj3 = this.E;
        if (obj3 instanceof baqe) {
            synchronized (obj3) {
                obj = this.E;
                if (obj instanceof baqe) {
                    dvg a = dvo.a(this.a);
                    dvo.a(this.a);
                    bcaa bcaa = this.D;
                    if (bcaa == null) {
                        bcaa = new dlp(this, 9);
                        this.D = bcaa;
                    }
                    bapx.b(bcaa);
                    obj = dvp.a(a, amuw.a(dvm.a(amuw.a(dvn.a()))));
                    this.E = bapx.a(this.E, obj);
                }
            }
            obj3 = obj;
        }
        dvg.k = (xfg) obj3;
        obj3 = this.F;
        if (obj3 instanceof baqe) {
            synchronized (obj3) {
                obj = this.F;
                if (obj instanceof baqe) {
                    obj = new urf(a(), this.o.k(), this.o.aN());
                    this.F = bapx.a(this.F, obj);
                }
            }
            obj3 = obj;
        }
        dvg.l = (urf) obj3;
        dvg.m = this.o.oC();
        dvg.n = this.o.k();
        dvg.o = this.o.aQ();
        dvg.p = d();
        dvg.q = a();
        dvg a2 = dvo.a(this.a);
        Executor oB = this.o.oB();
        Executor oA = this.o.oA();
        akkq cd = this.o.cd();
        xhv i = this.o.i();
        atlx iQ = this.o.iQ();
        zzl n = this.o.n();
        ambh iT = this.o.iT();
        Context a3 = xfa.a(this.a);
        Object obj6 = this.G;
        if (obj6 instanceof baqe) {
            synchronized (obj6) {
                obj2 = this.G;
                if (obj2 instanceof baqe) {
                    ambh = iT;
                    xhf xhf = (xhf) baqd.a(this.o.aj().a(new bqs(), xhl.a(this.o.ak(), null)), "Cannot return null from a non-@Nullable @Provides method");
                    this.G = bapx.a(this.G, xhf);
                    obj2 = xhf;
                } else {
                    ambh = iT;
                }
            }
        } else {
            ambh = iT;
            obj2 = obj6;
        }
        znv znv = new znv(a3, (xhf) obj2, this.o.ox());
        zqe e = e();
        bcaa jy = this.o.jy();
        bcaa bcaa2 = this.I;
        if (bcaa2 == null) {
            bcaa2 = new dlp(this, 10);
            this.I = bcaa2;
        }
        zqs zqs = new zqs(jy, bcaa2, this.o.jA());
        alwu bb = this.o.bb();
        alyf ja = this.o.ja();
        alyf alyf = ja;
        alwu alwu = bb;
        UploadActivity uploadActivity2 = uploadActivity;
        uploadActivity2.r = new gso(a2, oB, oA, cd, i, iQ, n, ambh, znv, e, zqs, alwu, alyf, this.o.iO(), new alyd(this.o.ow(), new alyt(this.o.H(), this.o.iJ(), this.o.iK(), this.o.c(), this.o.iL())));
        uploadActivity2.s = e();
        uploadActivity2.t = this.o.kS();
    }

    public final vat a(vav vav) {
        baqd.a(vav);
        return new dlo(this, vav);
    }

    /* synthetic */ dlm(diu diu, dvk dvk, gtv gtv) {
        this.o = diu;
        this.a = dvk;
        this.b = gtv;
    }
}
