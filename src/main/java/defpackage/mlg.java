package defpackage;

import android.os.Handler;
import java.util.concurrent.TimeUnit;

/* renamed from: mlg */
public final class mlg implements xcp {
    public final bdfi a = bdfi.h();
    public long b;
    private final xci c;
    private final Handler d;
    private final Runnable e = new mlf(this);
    private boolean f;
    private boolean g;
    private long h;
    private long i;
    private long j;

    public mlg(xci xci, Handler handler) {
        this.c = xci;
        this.d = handler;
    }

    public final void a() {
        this.c.a((Object) this);
    }

    public final void b() {
        this.c.b(this);
    }

    public final void a(int i, TimeUnit timeUnit) {
        this.j = timeUnit.toMillis((long) i);
    }

    public final void c() {
        if (!this.f) {
            this.f = true;
            this.g = true;
            this.d.removeCallbacks(this.e);
        }
    }

    public final void d() {
        if (this.f) {
            this.f = false;
            this.d.postDelayed(this.e, this.b);
        }
    }

    public final void e() {
        this.i = 0;
        this.g = true;
        this.d.removeCallbacks(this.e);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ahkm.class};
        } else if (i == 0) {
            ahkm ahkm = (ahkm) obj;
            if (this.f) {
                long j = ahkm.f;
                if (this.g) {
                    this.h = j;
                    this.g = false;
                } else {
                    long j2 = this.i + (j - this.h);
                    this.i = j2;
                    this.h = j;
                    if (j2 >= this.j) {
                        this.a.e_(null);
                        d();
                        e();
                        return null;
                    }
                }
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
