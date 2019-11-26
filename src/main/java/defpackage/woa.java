package defpackage;

import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* renamed from: woa */
public final class woa implements wnz {
    private final Runnable a;

    public woa(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(BrowseEndpointOuterClass.browseEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                this.a.run();
            }
        }
    }
}
