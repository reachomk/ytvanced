package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;

/* renamed from: pva */
final class pva implements pye {
    public final boolean a;
    private final WeakReference b;
    private final pso c;

    public pva(puy puy, pso pso, boolean z) {
        this.b = new WeakReference(puy);
        this.c = pso;
        this.a = z;
    }

    public final void a(psa psa) {
        puy puy = (puy) this.b.get();
        if (puy != null) {
            pzr.a(Looper.myLooper() == puy.a.m.d, (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            puy.b.lock();
            try {
                if (puy.b(0)) {
                    if (!psa.b()) {
                        puy.b(psa, this.c, this.a);
                    }
                    if (puy.d()) {
                        puy.e();
                    }
                    puy.b.unlock();
                    return;
                }
                puy.b.unlock();
            } catch (Throwable th) {
                puy.b.unlock();
            }
        }
    }
}
