package defpackage;

import com.google.protos.youtube.api.innertube.UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint;
import java.util.Map;

/* renamed from: etf */
public final class etf implements aaap {
    private final ezg a;

    public etf(ezg ezg) {
        this.a = ezg;
    }

    public final void a(apxu apxu, Map map) {
        ezg ezg = this.a;
        anxr access$000 = anxl.checkIsLite(UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.updatedMetadataEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ezj b2 = ezg.b(((UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint) b).b);
        if (!b2.g) {
            b2.a.postDelayed(b2, 30000);
            b2.g = true;
        }
    }
}
