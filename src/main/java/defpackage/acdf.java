package defpackage;

import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: acdf */
final class acdf implements Runnable {
    public final achr a;
    public final achm b;
    public final Handler c;
    public final ScheduledExecutorService d;
    public ScheduledFuture e;
    public int f;
    public int g = Integer.MAX_VALUE;
    private final xsc h;
    private final int i;
    private final int j;
    private final ArrayDeque k;
    private long l = -1;
    private long m = -1;

    public acdf(achr achr, achm achm, Handler handler, ScheduledExecutorService scheduledExecutorService, xsc xsc, int i, int i2, int i3) {
        this.h = xsc;
        this.a = achr;
        this.b = achm;
        this.c = handler;
        this.d = scheduledExecutorService;
        this.f = i;
        this.i = i2;
        this.j = i3;
        this.k = new ArrayDeque();
    }

    public final void run() {
        int g = this.a.g();
        if (g >= 0) {
            Object obj = null;
            int intValue = this.k.size() == 3 ? ((Integer) this.k.remove()).intValue() : 0;
            this.k.add(Integer.valueOf(g));
            Iterator it = this.k.iterator();
            int i = 0;
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (intValue2 < intValue || (intValue2 == 0 && intValue == 0)) {
                    i--;
                } else if (intValue2 > intValue) {
                    i++;
                }
                intValue = intValue2;
            }
            double d = (double) g;
            double d2 = (double) this.g;
            Double.isNaN(d);
            Double.isNaN(d2);
            d /= d2;
            long b = this.h.b();
            if (i >= 3 || d >= 0.25d) {
                this.l = this.h.b();
                b(-1);
            } else if (i <= 0 && d < 0.15d) {
                long j = this.l;
                Object obj2 = (j < 0 || b - j > 16000) ? 1 : null;
                long j2 = this.m;
                if (j2 < 0 || b - j2 > 6000) {
                    obj = 1;
                }
                if (j < 0 || !(obj2 == null || obj == null)) {
                    this.m = this.h.b();
                    b(1);
                }
            }
        }
    }

    private final void b(int i) {
        int i2 = 0;
        while (i2 < acda.c.length) {
            if (this.f < acda.c[i2]) {
                i2++;
            } else {
                i2 = acda.d[i2];
                i2 = Math.min(Math.max(((this.f / i2) + i) * i2, this.i), this.j);
                if (i2 != this.f) {
                    StringBuilder stringBuilder = new StringBuilder(26);
                    stringBuilder.append("Video bitrate: ");
                    stringBuilder.append(i2);
                    xtl.e(stringBuilder.toString());
                    int a = acdf.a(i2);
                    this.g = a;
                    StringBuilder stringBuilder2 = new StringBuilder(25);
                    stringBuilder2.append("Buffer limit: ");
                    stringBuilder2.append(a);
                    xtl.e(stringBuilder2.toString());
                    this.f = i2;
                    this.c.post(new acdh(this, i));
                    return;
                }
                return;
            }
        }
    }

    public static int a(int i) {
        return ((i + 144000) << 2) / 8;
    }
}
