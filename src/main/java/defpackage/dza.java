package defpackage;

import com.google.protos.youtube.api.innertube.MuteAdEndpointOuterClass$MuteAdEndpoint;
import java.util.Map;

/* renamed from: dza */
public final class dza implements aaap {
    private final xci a;
    private final aaas b;

    public dza(xci xci, aaas aaas) {
        this.a = (xci) amqw.a((Object) xci);
        this.b = (aaas) amqw.a((Object) aaas);
    }

    public final void a(apxu apxu, Map map) {
        Object c = xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        anxr access$000 = anxl.checkIsLite(MuteAdEndpointOuterClass$MuteAdEndpoint.muteAdEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        MuteAdEndpointOuterClass$MuteAdEndpoint muteAdEndpointOuterClass$MuteAdEndpoint = (MuteAdEndpointOuterClass$MuteAdEndpoint) b;
        this.a.d(new vwr(muteAdEndpointOuterClass$MuteAdEndpoint, c));
        this.b.a(muteAdEndpointOuterClass$MuteAdEndpoint.c, c);
    }
}
