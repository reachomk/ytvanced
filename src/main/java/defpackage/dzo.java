package defpackage;

import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import java.util.Map;

/* renamed from: dzo */
public final class dzo implements aaap {
    private final xhv a;
    private final agwc b;
    private final afpu c;
    private final agvs d;

    public dzo(xhv xhv, agwc agwc, afpu afpu, agvs agvs) {
        this.a = xhv;
        this.b = agwc;
        this.c = afpu;
        this.d = agvs;
    }

    public final void a(apxu apxu, Map map) {
        if (this.a.c() && this.c.a()) {
            agvx n = this.b.b().n();
            anxr access$000 = anxl.checkIsLite(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            n.a(((OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) b).b, this.d.g(), agqq.OFFLINE_IMMEDIATELY, (byte[]) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", byte[].class), 0, 3);
        }
    }
}
