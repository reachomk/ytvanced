package defpackage;

import android.os.Handler;

/* renamed from: affz */
public final class affz extends affu {
    public boolean d;
    public long e;
    private long f;

    public affz(nok nok, nlx nlx, int i, Handler handler, noh noh, int i2, int i3, npz npz, boolean z) {
        super(nok, nlx, i, handler, noh, i2, i3, npz);
        this.d = z;
    }

    public final int a(int i, long j, nmz nmz, nnb nnb) {
        if (this.d) {
            long b = (long) this.a.b();
            if (this.a.a(-30000 + j) && this.f <= 0) {
                this.e += ((long) this.a.b()) - b;
            }
        }
        i = super.a(i, j, nmz, nnb);
        j = this.f;
        if (j > 0 && nnb != null && nnb.e >= j) {
            this.f = 0;
        }
        return i;
    }

    public final void a(long j) {
        this.f = j;
        super.a(j);
    }
}
