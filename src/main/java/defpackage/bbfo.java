package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bbfo */
final class bbfo implements Runnable {
    private final /* synthetic */ bbfl a;

    public final void run() {
        bbfl bbfl = this.a;
        if (bbfl.e) {
            long a = bbfl.a();
            bbfl bbfl2 = this.a;
            if (bbfl2.d - a > 0) {
                bbfl2.f = bbfl2.a.schedule(new bbfn(bbfl2), this.a.d - a, TimeUnit.NANOSECONDS);
                return;
            }
            bbfl2.e = false;
            bbfl2.f = null;
            bbfl2.c.run();
            return;
        }
        bbfl.f = null;
    }

    /* synthetic */ bbfo(bbfl bbfl) {
        this.a = bbfl;
    }
}
