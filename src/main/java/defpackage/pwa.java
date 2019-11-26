package defpackage;

import java.util.Collections;

/* renamed from: pwa */
final class pwa implements Runnable {
    private final /* synthetic */ psa a;
    private final /* synthetic */ ptz b;

    pwa(ptz ptz, psa psa) {
        this.b = ptz;
        this.a = psa;
    }

    public final void run() {
        ptz ptz;
        if (this.a.b()) {
            ptz = this.b;
            ptz.c = true;
            if (ptz.a.k()) {
                this.b.a();
                return;
            }
            try {
                this.b.a.a(null, Collections.emptySet());
                return;
            } catch (SecurityException unused) {
                ptz = this.b;
                ((ptx) ptz.d.j.get(ptz.b)).a(new psa(10));
                return;
            }
        }
        ptz = this.b;
        ((ptx) ptz.d.j.get(ptz.b)).a(this.a);
    }
}
