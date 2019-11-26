package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: foi */
public final class foi extends apv implements FrameCallback {
    public final boolean a;
    public acvx b;
    public boolean c;
    private final xsc d;
    private final Choreographer e;
    private final fol f;
    private boolean g;

    public foi(acum acum, alxv alxv, zyw zyw, ScheduledExecutorService scheduledExecutorService, xsc xsc) {
        apxn a = zyw.a();
        float f = 0.0f;
        if (!(a == null || (a.a & 16384) == 0)) {
            axam axam = a.k;
            if (axam == null) {
                axam = axam.d;
            }
            f = axam.b;
        }
        this.a = alxv.a(f, "scroll_tracker_when_to_sample_counter");
        this.d = xsc;
        this.e = Choreographer.getInstance();
        this.f = new fol(acum, scheduledExecutorService);
        this.g = false;
        this.c = false;
    }

    public final void doFrame(long j) {
        if (this.g) {
            this.e.postFrameCallback(this);
            fol fol = this.f;
            if (fol.h == 0) {
                fol.h = j;
                fol.g = j;
                return;
            }
            long toMillis = TimeUnit.NANOSECONDS.toMillis(j - fol.g);
            if (toMillis > 17) {
                long toMillis2 = TimeUnit.NANOSECONDS.toMillis(j);
                double d = (double) toMillis;
                Double.isNaN(d);
                int i = (int) (d / 16.67d);
                int i2 = 0;
                while (i2 < fol.a.length && fol.a[i2] <= i) {
                    long[] jArr = fol.d;
                    long j2 = jArr[i2];
                    if (j2 != 0) {
                        long[] jArr2 = fol.e;
                        jArr2[i2] = jArr2[i2] + (toMillis2 - j2);
                        int[] iArr = fol.f;
                        iArr[i2] = iArr[i2] + 1;
                    }
                    jArr[i2] = toMillis2;
                    int[] iArr2 = fol.c;
                    iArr2[i2] = iArr2[i2] + 1;
                    i2++;
                }
            }
            fol.g = j;
        }
    }

    public final void a(RecyclerView recyclerView, int i) {
        int i2 = i;
        if (i2 != 0) {
            if (i2 == 1 && !this.g) {
                this.e.postFrameCallback(this);
                this.g = true;
                fol fol = this.f;
                fol.g = 0;
                fol.h = 0;
                fol.i = 0;
                fol.c = new int[fol.a.length];
                fol.d = new long[fol.a.length];
                fol.e = new long[fol.a.length];
                fol.f = new int[fol.a.length];
                fol.j = false;
                fol.k = false;
                fol.n = 1;
                fol.o = 1;
            }
        } else if (this.g) {
            fol fol2 = this.f;
            long a = this.d.a();
            acvx acvx = this.b;
            String d = acvx == null ? "" : acvx.d();
            long toMillis = TimeUnit.NANOSECONDS.toMillis(fol2.g - fol2.h);
            if (!(fol2.j && fol2.k) && toMillis > 0) {
                fon fon = new fon(fol2.c, fol2.e, fol2.f, toMillis);
                int i3 = fol2.i;
                if (i3 < 0) {
                    fol2.n = 3;
                } else if (i3 > 0) {
                    fol2.n = 2;
                } else {
                    fol2.n = 1;
                }
                if (!d.isEmpty()) {
                    fol2.m.execute(new fok(fol2, d, fon, Math.abs(fol2.i), fol2.o, fol2.n, a));
                }
            }
            this.g = false;
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        fol fol = this.f;
        if (i != 0) {
            fol.j = true;
            fol.o = 2;
        }
        if (i2 != 0) {
            fol.k = true;
            fol.o = 3;
        }
        fol.i += i2 + i;
    }
}
