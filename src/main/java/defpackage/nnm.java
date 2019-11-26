package defpackage;

import android.content.Context;
import android.view.WindowManager;

/* renamed from: nnm */
public final class nnm {
    public final nnl a;
    public final boolean b;
    public final long c;
    public final long d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public long i;
    public long j;
    public long k;

    public nnm() {
        this(-1.0f, false);
    }

    public nnm(Context context) {
        this(((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate(), true);
    }

    private nnm(float f, boolean z) {
        this.b = z;
        if (z) {
            this.a = nnl.b;
            double d = (double) f;
            Double.isNaN(d);
            long j = (long) (1.0E9d / d);
            this.c = j;
            this.d = (j * 80) / 100;
            return;
        }
        this.a = null;
        this.c = -1;
        this.d = -1;
    }

    public final boolean a(long j, long j2) {
        return Math.abs((j2 - this.i) - (j - this.j)) > 20000000;
    }
}
