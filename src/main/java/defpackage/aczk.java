package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: aczk */
final class aczk implements Runnable {
    private final /* synthetic */ aczg a;

    public final void run() {
        aczq aczq = this.a.l;
        if (aczq != null) {
            if (this.a.f.a() - this.a.m >= TimeUnit.SECONDS.toMillis((long) aczq.c())) {
                xtl.b(aczg.a, "timed out waiting for device");
                this.a.a(0);
                return;
            }
            String a = aczq.a();
            aczg aczg = this.a;
            adfq adfq = aczg.d;
            Context context = aczg.b;
            for (bbs bbs : adfq.a()) {
                if (adhn.a(a, bbs.c)) {
                    break;
                }
            }
            bbs bbs2 = null;
            if (bbs2 != null) {
                if (!a.equals(bbs2.c)) {
                    String.format("routeId mismatch: requested=%s matched=%s", new Object[]{a, bbs2.c});
                }
                aczg aczg2 = this.a;
                aczg2.h.a(aczg2.q);
                if (((Boolean) this.a.j.get()).booleanValue()) {
                    this.a.a(1);
                    return;
                }
                if (!this.a.c.a(bbs2, aczq.d())) {
                    xtl.a(aczg.a, "failed selecting route");
                    this.a.a(2);
                }
                return;
            }
            this.a.e.postDelayed(this, 300);
        }
    }

    /* synthetic */ aczk(aczg aczg) {
        this.a = aczg;
    }
}
