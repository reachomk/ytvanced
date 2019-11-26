package defpackage;

import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;

/* renamed from: woc */
public final class woc implements wnz {
    private final Runnable a;

    public woc(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(apxu apxu) {
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                this.a.run();
            }
        }
    }
}
