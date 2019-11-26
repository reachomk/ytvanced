package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

/* renamed from: gqs */
public final class gqs extends aiql {
    public final anwy a() {
        return ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint;
    }

    private static String a(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        return (reelWatchEndpointOuterClass$ReelWatchEndpoint.a & 1) != 0 ? reelWatchEndpointOuterClass$ReelWatchEndpoint.b : "";
    }

    private static String b(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        return (reelWatchEndpointOuterClass$ReelWatchEndpoint.a & 2) != 0 ? reelWatchEndpointOuterClass$ReelWatchEndpoint.c : "";
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, Object obj2) {
        return amqq.a((ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj, (ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj2);
    }

    public final /* synthetic */ String c(Object obj) {
        return gqs.a((ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj);
    }
}
