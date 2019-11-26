package defpackage;

import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.impl.CronetUrlRequestContext;

/* renamed from: bcmi */
public final class bcmi implements Runnable {
    private final /* synthetic */ CronetUrlRequest a;

    public bcmi(CronetUrlRequest cronetUrlRequest) {
        this.a = cronetUrlRequest;
    }

    public final void run() {
        try {
            bckx bckx = this.a;
            bckx.d.a(bckx, bckx.g, bckx.h);
            this.a.g();
        } catch (Exception e) {
            bchu.c(CronetUrlRequestContext.a, "Exception in onFailed method", e);
        }
    }
}
