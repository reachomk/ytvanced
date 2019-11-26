package defpackage;

import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;

/* renamed from: ike */
final /* synthetic */ class ike implements amqv {
    public static final amqv a = new ike();

    private ike() {
    }

    public final boolean a(Object obj) {
        apxu apxu = (apxu) obj;
        anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
        apxu.a(access$000);
        if (!apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint);
            apxu.a(access$000);
            if (!apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(OfflineWatchEndpointOuterClass.offlineWatchEndpoint);
                apxu.a(access$000);
                if (!apxu.h.a(access$000.d)) {
                    return false;
                }
            }
        }
        return true;
    }
}
