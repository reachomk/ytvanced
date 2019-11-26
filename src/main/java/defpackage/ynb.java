package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* renamed from: ynb */
final /* synthetic */ class ynb implements ywy {
    private final yna a;
    private final yke b;

    ynb(yna yna, yke yke) {
        this.a = yna;
        this.b = yke;
    }

    public final void a() {
        yna yna = this.a;
        apxx apxx = (apxx) apxu.d.createBuilder();
        apgd apgd = (apgd) apge.j.createBuilder();
        apgd.a(this.b.getChannelId());
        apxx.a(BrowseEndpointOuterClass.browseEndpoint, (apge) ((anxl) apgd.build()));
        yna.g.a((apxu) ((anxl) apxx.build()), null);
    }
}
