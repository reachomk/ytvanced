package defpackage;

import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;

/* renamed from: agsx */
final /* synthetic */ class agsx implements amqv {
    public static final amqv a = new agsx();

    private agsx() {
    }

    public final boolean a(Object obj) {
        aafv aafv = (aafv) obj;
        if (aafv != null) {
            apxu apxu = aafv.c;
            if (apxu != null) {
                anxr access$000 = anxl.checkIsLite(OfflineWatchEndpointOuterClass.offlineWatchEndpoint);
                apxu.a(access$000);
                if (apxu.h.a(access$000.d)) {
                    return true;
                }
            }
        }
        return false;
    }
}
