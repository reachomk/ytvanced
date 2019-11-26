package defpackage;

import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.impl.CronetUrlRequestContext;

/* renamed from: bcmg */
public final class bcmg implements Runnable {
    private final /* synthetic */ CronetUrlRequest a;

    public bcmg(CronetUrlRequest cronetUrlRequest) {
        this.a = cronetUrlRequest;
    }

    public final void run() {
        try {
            CronetUrlRequest cronetUrlRequest = this.a;
            cronetUrlRequest.d.c(cronetUrlRequest, cronetUrlRequest.g);
            this.a.g();
        } catch (Exception e) {
            bchu.c(CronetUrlRequestContext.a, "Exception in onCanceled method", e);
        }
    }
}
