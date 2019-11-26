package defpackage;

import java.io.IOException;

/* renamed from: qul */
final class qul implements Runnable {
    private final /* synthetic */ qui a;

    qul(qui qui) {
        this.a = qui;
    }

    public final void run() {
        qui qui = this.a;
        try {
            if (qui.f == null && qui.i) {
                pcv pcv = new pcv(qui.a);
                pcv.a(true);
                qui.f = pcv;
            }
        } catch (IOException | psg | psj unused) {
            qui.f = null;
        }
    }
}
