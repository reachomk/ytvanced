package defpackage;

import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.TimeUnit;

/* renamed from: achi */
public final class achi implements achm, acie {
    public final acic a;
    public acho b;
    private final Runnable c = new achl(this);
    private final acih d;
    private final Surface e;
    private final String f;
    private final achn g;
    private final Handler h;
    private final long i;
    private final int j;
    private final int k;
    private long l;
    private long m;
    private long n = Long.MIN_VALUE;
    private boolean o;
    private boolean p = true;

    public achi(acic acic, acih acih, int i, int i2, achn achn, Handler handler) {
        boolean z = false;
        if (i2 > 0 && i >= i2) {
            z = true;
        }
        amqw.a(z);
        this.a = (acic) amqw.a((Object) acic);
        this.d = (acih) amqw.a((Object) acih);
        this.g = (achn) amqw.a((Object) achn);
        this.h = (Handler) amqw.a((Object) handler);
        this.j = i2;
        this.k = i;
        b(i);
        this.i = TimeUnit.SECONDS.toMillis(1) / ((long) i2);
        String str = acih.a;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 5);
        stringBuilder.append("FRC[");
        stringBuilder.append(str);
        stringBuilder.append("]");
        this.f = stringBuilder.toString();
        String.valueOf(this.f).length();
        this.e = (Surface) amqw.a(acih.j);
        acic.a(this.e);
        acic.a((acie) this, handler);
    }

    private final void b(int i) {
        int i2 = this.j;
        if (i < i2) {
            i = i2;
        }
        i2 = this.k;
        if (i > i2) {
            i = i2;
        }
        long toNanos = TimeUnit.SECONDS.toNanos(1) / ((long) i);
        this.l = toNanos;
        this.m = (toNanos * 10) / 100;
        this.d.b(i);
    }

    public final String e() {
        return this.f;
    }

    public final boolean b() {
        if (!this.d.b()) {
            return false;
        }
        this.o = true;
        this.n = Long.MIN_VALUE;
        this.h.postDelayed(this.c, this.i);
        return true;
    }

    public final void a(acho acho) {
        this.b = acho;
    }

    public final boolean a(boolean z) {
        if (!this.d.a(z)) {
            return false;
        }
        if (!z) {
            this.p = false;
        }
        return true;
    }

    public final boolean g() {
        if (!this.d.g()) {
            return false;
        }
        this.p = true;
        return true;
    }

    public final boolean c() {
        a();
        return this.d.c();
    }

    private final void a() {
        this.o = false;
    }

    public final boolean f() {
        return this.o && this.d.f();
    }

    public final boolean a(achp achp) {
        a();
        return this.d.a(achp);
    }

    public final boolean d() {
        this.a.a(null, null);
        return this.d.d();
    }

    public final void a(int i) {
        this.d.a(i);
    }

    public final int h() {
        return this.d.c;
    }

    public final void a(acic acic) {
        this.h.removeCallbacks(this.c);
        if (this.o) {
            String str = "VideoCaptureFRC";
            if (acic != this.a) {
                Log.e(str, "Unexpected video source");
            }
            long d = this.g.d();
            long j = this.n;
            if (j < 0) {
                this.n = d;
                j = d;
            }
            try {
                if (d >= j - this.m) {
                    if (this.p) {
                        acic.a(this.e, j);
                    }
                    do {
                        j = this.n + this.l;
                        this.n = j;
                    } while (j <= d);
                }
            } catch (Exception e) {
                Log.e(str, "Error copying frame to encoder", e);
                acho acho = this.b;
                if (acho != null) {
                    acho.a(this, 7);
                }
            }
            this.h.postDelayed(this.c, this.i);
        }
    }
}
