package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window.OnFrameMetricsAvailableListener;

/* renamed from: tux */
final class tux implements OnFrameMetricsAvailableListener, ttq, ttt {
    public Activity a;
    public boolean b;
    public HandlerThread c;
    public Handler d;
    private final tva e;
    private final boolean f;

    tux(tva tva, boolean z) {
        this.e = tva;
        this.f = z;
        if (z) {
            this.b = true;
        }
    }

    public final void a() {
        Activity activity = this.a;
        if (activity != null) {
            Window window = activity.getWindow();
            if (this.d == null) {
                this.c = new HandlerThread("Primes-Jank");
                this.c.start();
                this.d = new Handler(this.c.getLooper());
            }
            window.addOnFrameMetricsAvailableListener(this, this.d);
        }
    }

    private final void c() {
        Activity activity = this.a;
        if (activity != null) {
            try {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this);
            } catch (RuntimeException e) {
                tyv.a("FrameMetricService", "remove frame metrics listener failed", e, new Object[0]);
            }
        }
    }

    public final void b(Activity activity) {
        if (this.f) {
            this.e.a(tux.c(activity));
        }
        synchronized (this) {
            this.a = activity;
            if (this.b) {
                a();
            }
        }
    }

    public final void a(Activity activity) {
        synchronized (this) {
            if (this.b) {
                c();
            }
            this.a = null;
        }
        if (this.f) {
            this.e.b(tux.c(activity));
        }
    }

    private static String c(Activity activity) {
        if (activity instanceof tzx) {
            return twr.a(((tzx) activity).a());
        }
        return activity.getClass().getName();
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        synchronized (this) {
            this.b = false;
            c();
        }
    }

    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long metric = frameMetrics.getMetric(8);
        tva tva = this.e;
        double d = (double) metric;
        Double.isNaN(d);
        tva.a((int) (d / 1000000.0d));
    }
}
