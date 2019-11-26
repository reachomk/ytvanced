package defpackage;

import org.chromium.net.impl.CronetUrlRequest;

/* renamed from: bcme */
public final class bcme implements Runnable {
    private final /* synthetic */ CronetUrlRequest a;

    public bcme(CronetUrlRequest cronetUrlRequest) {
        this.a = cronetUrlRequest;
    }

    public final void run() {
        this.a.f();
        synchronized (this.a.c) {
            if (this.a.e()) {
                return;
            }
            this.a.k = true;
            try {
                CronetUrlRequest cronetUrlRequest = this.a;
                cronetUrlRequest.d.a(cronetUrlRequest, cronetUrlRequest.g);
            } catch (Exception e) {
                this.a.a(e);
            }
        }
    }
}
