package defpackage;

import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.impl.CronetUrlRequestContext;

/* renamed from: bcmd */
public final class bcmd implements Runnable {
    private final /* synthetic */ CronetUrlRequest a;

    public bcmd(CronetUrlRequest cronetUrlRequest) {
        this.a = cronetUrlRequest;
    }

    public final void run() {
        synchronized (this.a.c) {
            if (this.a.e()) {
                return;
            }
            this.a.a(0);
            try {
                CronetUrlRequest cronetUrlRequest = this.a;
                cronetUrlRequest.d.b(cronetUrlRequest, cronetUrlRequest.g);
                this.a.g();
            } catch (Exception e) {
                bchu.c(CronetUrlRequestContext.a, "Exception in onSucceeded method", e);
            }
        }
    }
}
