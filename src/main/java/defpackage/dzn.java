package defpackage;

import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import java.util.Map;

/* renamed from: dzn */
public final class dzn implements aaap {
    private final xhv a;
    private final agwc b;
    private final afpu c;
    private final agvs d;

    public dzn(xhv xhv, agwc agwc, afpu afpu, agvs agvs) {
        this.a = xhv;
        this.b = agwc;
        this.c = afpu;
        this.d = agvs;
    }

    public final void a(apxu apxu, Map map) {
        if (this.a.c() && this.c.a()) {
            agwh k = this.b.b().k();
            anxr access$000 = anxl.checkIsLite(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            k.a(((OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) b).b, this.d.g(), agqq.OFFLINE_IMMEDIATELY, (byte[]) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", byte[].class), 0);
        }
    }
}
