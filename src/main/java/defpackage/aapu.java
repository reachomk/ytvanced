package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* renamed from: aapu */
public final class aapu {
    public static String a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                return ((apge) b).b;
            }
        }
        return null;
    }
}
