package defpackage;

import java.util.logging.Level;

/* renamed from: bbco */
final class bbco implements Runnable {
    private final /* synthetic */ bbcm a;

    bbco(bbcm bbcm) {
        this.a = bbcm;
    }

    public final void run() {
        try {
            synchronized (this.a.h) {
                bbcm bbcm = this.a;
                bbcm.m = null;
                if (bbcm.n) {
                    this.a.i.a();
                    return;
                }
                bbcm.g.a(2, "CONNECTING after backoff");
                this.a.a(basp.CONNECTING);
                this.a.c();
                this.a.i.a();
            }
        } catch (Throwable th) {
            try {
                bbcm.a.logp(Level.WARNING, "io.grpc.internal.InternalSubchannel$1EndOfCurrentBackoff", "run", "Exception handling end of backoff", th);
            } finally {
                this.a.i.a();
            }
        }
    }
}
