package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* renamed from: aijn */
public final class aijn {
    public static awbv a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                azje azje = (azje) b;
                azjf azjf = azje.k;
                if (azjf == null) {
                    azjf = azjf.e;
                }
                if ((azjf.a & 1) != 0) {
                    azjf azjf2 = azje.k;
                    if (azjf2 == null) {
                        azjf2 = azjf.e;
                    }
                    awbv awbv = azjf2.b;
                    if (awbv == null) {
                        awbv = awbv.f;
                    }
                    return awbv;
                }
            }
        }
        return null;
    }

    public static apxu a(apxu apxu, awbu awbu) {
        if (!(awbu == null || apxu == null)) {
            anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                azjd azjd = (azjd) ((anxo) ((azje) obj).toBuilder());
                azje azje = (azje) azjd.instance;
                if ((azje.a & 512) != 0) {
                    anxl anxl = azje.k;
                    if (anxl == null) {
                        anxl = azjf.e;
                    }
                    azji azji = (azji) ((anxo) anxl.toBuilder());
                    azji.copyOnWrite();
                    azjf azjf = (azjf) azji.instance;
                    azjf.b = (awbv) ((anxl) awbu.build());
                    azjf.a |= 1;
                    azjd.copyOnWrite();
                    azje azje2 = (azje) azjd.instance;
                    azje2.k = (azjf) ((anxl) azji.build());
                    azje2.a |= 512;
                    apxx apxx = (apxx) ((anxo) apxu.toBuilder());
                    apxx.a(WatchEndpointOuterClass.watchEndpoint, (azje) ((anxl) azjd.build()));
                    return (apxu) ((anxl) apxx.build());
                }
            }
        }
        return null;
    }

    public static awbx b(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                azje azje = (azje) b;
                azjf azjf = azje.k;
                if (azjf == null) {
                    azjf = azjf.e;
                }
                if ((azjf.a & 8) != 0) {
                    azjf azjf2 = azje.k;
                    if (azjf2 == null) {
                        azjf2 = azjf.e;
                    }
                    awbx awbx = azjf2.d;
                    if (awbx == null) {
                        awbx = awbx.c;
                    }
                    return awbx;
                }
            }
        }
        return null;
    }

    public static boolean a(awbv awbv) {
        amqw.a((Object) awbv);
        return awbv.c < 0 || awbv.d < 0;
    }
}
