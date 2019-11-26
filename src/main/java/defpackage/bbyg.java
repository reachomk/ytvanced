package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bbyg */
final class bbyg implements Runnable {
    private final Runnable a;
    private final bbyi b;
    private final long c;

    bbyg(Runnable runnable, bbyi bbyi, long j) {
        this.a = runnable;
        this.b = bbyi;
        this.c = j;
    }

    public final void run() {
        if (!this.b.b) {
            long a = bbmp.a(TimeUnit.MILLISECONDS);
            long j = this.c;
            if (j > a) {
                try {
                    Thread.sleep(j - a);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    bbzf.a(e);
                    return;
                }
            }
            if (!this.b.b) {
                this.a.run();
            }
        }
    }
}
