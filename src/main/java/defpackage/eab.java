package defpackage;

import com.google.protos.youtube.api.innertube.UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint;
import java.util.Map;

/* renamed from: eab */
public final class eab implements aaap {
    private final aaas a;

    public eab(aaas aaas) {
        this.a = aaas;
    }

    public final void a(apxu apxu, Map map) {
        aaas aaas = this.a;
        anxr access$000 = anxl.checkIsLite(UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.updateHorizontalCardListActionEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        aaas.a(((UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint) b).a, map);
    }
}
