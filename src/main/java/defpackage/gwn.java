package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* renamed from: gwn */
final /* synthetic */ class gwn implements amro {
    private final gwl a;

    gwn(gwl gwl) {
        this.a = gwl;
    }

    public final Object get() {
        if (this.a.ah) {
            return hrt.f();
        }
        apgd apgd = (apgd) apge.j.createBuilder();
        apgd.a("FEhistory");
        apxx apxx = (apxx) apxu.d.createBuilder();
        apxx.a(BrowseEndpointOuterClass.browseEndpoint, (apge) ((anxl) apgd.build()));
        return gub.a((apxu) ((anxl) apxx.build()));
    }
}
