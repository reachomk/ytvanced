package defpackage;

import java.util.concurrent.ScheduledFuture;

/* renamed from: amjc */
final class amjc {
    public final amne a;
    private boolean b = false;
    private anjv c;
    private ScheduledFuture d;

    public final synchronized boolean a() {
        return this.b;
    }

    public final synchronized void a(anjv anjv) {
        this.c = anjv;
        if (this.b) {
            anjv.cancel(true);
        }
    }

    public final synchronized void a(ScheduledFuture scheduledFuture) {
        this.d = scheduledFuture;
        if (this.b) {
            scheduledFuture.cancel(true);
        }
    }

    public final synchronized void b() {
        this.b = true;
        anjv anjv = this.c;
        if (anjv != null) {
            anjv.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    /* synthetic */ amjc(amne amne) {
        this.a = amne;
        amne.a(new amjb(this), aniv.a);
    }
}
