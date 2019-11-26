package defpackage;

import com.google.protos.youtube.api.innertube.ToggleConversationEndpointOuterClass$ToggleConversationEndpoint;
import java.util.Map;

/* renamed from: hax */
public final class hax implements aaap {
    private final bcaa a;

    public hax(bcaa bcaa) {
        this.a = bcaa;
    }

    public final void a(apxu apxu, Map map) {
        aaas aaas = (aaas) this.a.get();
        anxr access$000 = anxl.checkIsLite(ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.toggleConversationEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aaas.a(((ToggleConversationEndpointOuterClass$ToggleConversationEndpoint) b).a, xsb.c(map, "toggle_source"));
    }
}
