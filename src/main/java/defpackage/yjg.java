package defpackage;

import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* renamed from: yjg */
public final class yjg {
    public static apxu a(String str, acvx acvx) {
        azjd azjd = (azjd) azje.r.createBuilder();
        azjd.copyOnWrite();
        azje azje = (azje) azjd.instance;
        azje.a |= 32;
        azje.f = true;
        if (str != null) {
            azjd.a(str);
        }
        return yjg.a(acvx, (azje) ((anxl) azjd.build()));
    }

    public static apxu a(acvx acvx, azje azje) {
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(WatchEndpointOuterClass.watchEndpoint, azje);
        avjh avjh = (avjh) avjf.h.createBuilder();
        avjh.a(acvx.d());
        if (acvx.c() != null) {
            avjh.a(acvx.c().e.aH);
        } else {
            avjh.a(acwl.ao.aH);
        }
        apxx.a(avjd.b, (avjf) ((anxl) avjh.build()));
        return (apxu) ((anxl) apxx.build());
    }
}
