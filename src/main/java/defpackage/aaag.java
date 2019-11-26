package defpackage;

import com.google.protos.youtube.api.innertube.ClientActionEndpointOuterClass$ClientActionEndpoint;
import java.util.List;
import java.util.Map;

/* renamed from: aaag */
public final class aaag implements aaas {
    public aaaj a;

    public final void a(List list, Object obj) {
        aaav.a((aaas) this, list, obj);
    }

    public final void a(List list, Map map) {
        aaav.a((aaas) this, list, map);
    }

    public final void a(apxu[] apxuArr, Object obj) {
        aaav.a((aaas) this, apxuArr, obj);
    }

    public final void a(apxu[] apxuArr, Map map) {
        aaav.a((aaas) this, apxuArr, map);
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(ClientActionEndpointOuterClass$ClientActionEndpoint.clientActionEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        ClientActionEndpointOuterClass$ClientActionEndpoint clientActionEndpointOuterClass$ClientActionEndpoint = (ClientActionEndpointOuterClass$ClientActionEndpoint) b;
        aaaj aaaj = this.a;
        if (aaaj != null && clientActionEndpointOuterClass$ClientActionEndpoint != null && (clientActionEndpointOuterClass$ClientActionEndpoint.a & 1) != 0) {
            apul apul = clientActionEndpointOuterClass$ClientActionEndpoint.b;
            if (apul == null) {
                apul = apul.c;
            }
            int a = apuk.a(apul.b);
            if (a == 0) {
                a = 1;
            }
            aaaj.a(a);
        }
    }
}
