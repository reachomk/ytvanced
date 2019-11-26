package defpackage;

import android.os.Handler;
import com.google.android.apps.youtube.app.settings.developer.DebugForceInnertubeCapabilitiesActivity;
import com.google.android.apps.youtube.app.settings.developer.DebugMobileDataPlanActivity;
import com.google.android.apps.youtube.app.settings.developer.DebugOnlineAdActivity;
import com.google.android.apps.youtube.app.settings.developer.DebugShowOfflineQueueActivity;
import com.google.android.apps.youtube.app.settings.developer.DebugSpacecastActivity;

/* renamed from: djd */
final class djd implements jcf {
    public final dvk a;
    public volatile Object b = new baqe();
    public volatile Object c = new baqe();
    public volatile Object d = new baqe();
    public final /* synthetic */ diu e;
    private volatile Object f = new baqe();
    private volatile Object g = new baqe();
    private volatile bcaa h;
    private volatile Object i = new baqe();
    private volatile bcaa j;

    private final ewi a() {
        Object obj = this.g;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.g;
                if (obj2 instanceof baqe) {
                    Handler oF = this.e.oF();
                    Object obj3 = this.f;
                    if (obj3 instanceof baqe) {
                        Object obj4;
                        synchronized (obj3) {
                            obj4 = this.f;
                            if (obj4 instanceof baqe) {
                                obj4 = new ewf();
                                this.f = bapx.a(this.f, obj4);
                            }
                        }
                        obj3 = obj4;
                    }
                    obj2 = new ewi(oF, (ewf) obj3);
                    this.g = bapx.a(this.g, obj2);
                }
            }
            obj = obj2;
        }
        return (ewi) obj;
    }

    private final suq b() {
        return new suq(this.e.W());
    }

    private final xfg c() {
        Object obj = this.i;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.i;
                if (obj2 instanceof baqe) {
                    dvg a = dvo.a(this.a);
                    dvo.a(this.a);
                    bcaa bcaa = this.h;
                    if (bcaa == null) {
                        bcaa = new djc(this, 0);
                        this.h = bcaa;
                    }
                    bapx.b(bcaa);
                    obj2 = dvp.a(a, amuw.a(dvm.a(amuw.a(dvn.a()))));
                    this.i = bapx.a(this.i, obj2);
                }
            }
            obj = obj2;
        }
        return (xfg) obj;
    }

    public final void a(DebugOnlineAdActivity debugOnlineAdActivity) {
        debugOnlineAdActivity.g = this.e.aB();
        debugOnlineAdActivity.h = this.e.oH();
        debugOnlineAdActivity.b_ = a();
        this.e.c();
        debugOnlineAdActivity.j = b();
        debugOnlineAdActivity.k = c();
        debugOnlineAdActivity.l = this.e.dX();
    }

    public final void a(DebugForceInnertubeCapabilitiesActivity debugForceInnertubeCapabilitiesActivity) {
        debugForceInnertubeCapabilitiesActivity.g = this.e.aB();
        debugForceInnertubeCapabilitiesActivity.h = this.e.oH();
        debugForceInnertubeCapabilitiesActivity.b_ = a();
        this.e.c();
        debugForceInnertubeCapabilitiesActivity.j = b();
        debugForceInnertubeCapabilitiesActivity.k = c();
        debugForceInnertubeCapabilitiesActivity.l = new jcu(this.e.ox());
    }

    public final void a(DebugShowOfflineQueueActivity debugShowOfflineQueueActivity) {
        debugShowOfflineQueueActivity.g = this.e.aB();
        debugShowOfflineQueueActivity.h = this.e.oH();
        debugShowOfflineQueueActivity.b_ = a();
        this.e.c();
        debugShowOfflineQueueActivity.j = b();
        debugShowOfflineQueueActivity.k = c();
        debugShowOfflineQueueActivity.l = this.e.bI();
        bcaa bcaa = this.j;
        if (bcaa == null) {
            bcaa = new djc(this, 1);
            this.j = bcaa;
        }
        debugShowOfflineQueueActivity.m = new akoe(bcaa);
    }

    public final void a(DebugSpacecastActivity debugSpacecastActivity) {
        debugSpacecastActivity.g = this.e.aB();
        debugSpacecastActivity.h = this.e.oH();
        debugSpacecastActivity.b_ = a();
        this.e.c();
        debugSpacecastActivity.j = b();
        debugSpacecastActivity.k = c();
        this.e.ox();
    }

    public final void a(DebugMobileDataPlanActivity debugMobileDataPlanActivity) {
        debugMobileDataPlanActivity.g = this.e.aB();
        debugMobileDataPlanActivity.h = this.e.oH();
        debugMobileDataPlanActivity.b_ = a();
        this.e.c();
        debugMobileDataPlanActivity.j = b();
        debugMobileDataPlanActivity.k = c();
        this.e.iv();
        this.e.iu();
    }

    /* synthetic */ djd(diu diu, dvk dvk) {
        this.e = diu;
        this.a = dvk;
    }
}
