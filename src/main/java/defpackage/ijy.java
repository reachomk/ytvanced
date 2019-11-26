package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;

/* renamed from: ijy */
public final class ijy implements aiyh {
    private final gqt a;
    private final aixa b;

    public ijy(gqt gqt, aixa aixa) {
        this.a = gqt;
        this.b = aixa;
    }

    public final aixk a(aiqq aiqq) {
        apxu apxu = aiqq.b;
        if (apxu != null) {
            anxr access$000 = anxl.checkIsLite(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                return this.b.a(this.a.a(), null);
            }
        }
        return null;
    }

    public final aixk a(aizx aizx) {
        if ((aizx instanceof aizs) && (((aizs) aizx).c instanceof gqr)) {
            return this.b.a(this.a.a(), null);
        }
        return null;
    }
}
