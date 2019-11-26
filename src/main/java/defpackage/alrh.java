package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: alrh */
final class alrh {
    public final boolean a;
    public boolean b = false;
    public final /* synthetic */ alrc c;
    private final int d;
    private final int e;
    private final float f;
    private final int g;
    private int h = 0;
    private Future i;

    public alrh(alrc alrc, int i, int i2, float f, int i3, boolean z) {
        this.c = alrc;
        this.d = i;
        this.e = i2;
        this.f = f;
        this.g = i3;
        this.a = z;
    }

    public final synchronized void a() {
        Future future = this.i;
        if (future != null) {
            future.cancel(true);
            this.i = null;
        }
        this.b = true;
    }

    public final synchronized void b() {
        if (!this.b) {
            int i = this.g;
            if (i != -1 && this.h >= i) {
                return;
            }
            if (this.i == null) {
                int i2;
                ScheduledExecutorService scheduledExecutorService = this.c.d;
                alrg alrg = new alrg(this, this.h);
                int i3 = this.h;
                if (i3 == 0) {
                    i2 = this.d;
                } else {
                    double d = (double) this.e;
                    double pow = Math.pow((double) this.f, (double) (i3 - 1));
                    Double.isNaN(d);
                    i2 = (int) (d * pow);
                }
                this.i = scheduledExecutorService.schedule(alrg, (long) i2, TimeUnit.SECONDS);
                this.h++;
            }
        }
    }

    public final synchronized void c() {
        this.i = null;
    }
}
