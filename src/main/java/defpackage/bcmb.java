package defpackage;

import org.chromium.net.impl.CronetUrlRequest;

/* renamed from: bcmb */
public final class bcmb implements Runnable {
    private final /* synthetic */ bcoo a;
    private final /* synthetic */ String b;
    private final /* synthetic */ CronetUrlRequest c;

    public bcmb(CronetUrlRequest cronetUrlRequest, bcoo bcoo, String str) {
        this.c = cronetUrlRequest;
        this.a = bcoo;
        this.b = str;
    }

    public final void run() {
        this.c.f();
        synchronized (this.c.c) {
            if (this.c.e()) {
                return;
            }
            this.c.b = true;
            try {
                bckx bckx = this.c;
                bckx.d.a(bckx, this.a, this.b);
            } catch (Exception e) {
                this.c.a(e);
            }
        }
    }
}
