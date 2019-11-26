package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pxh */
public abstract class pxh extends LifecycleCallback implements OnCancelListener {
    private final Handler b = new Handler(Looper.getMainLooper());
    public volatile boolean d;
    public final AtomicReference e = new AtomicReference(null);
    public final psf f;

    protected pxh(puf puf) {
        psf psf = psf.a;
        super(puf);
        this.f = psf;
    }

    public abstract void a(psa psa, int i);

    public abstract void e();

    public final void onCancel(DialogInterface dialogInterface) {
        a(new psa(13, null), pxh.a((pxg) this.e.get()));
        f();
    }

    public final void a(Bundle bundle) {
        if (bundle != null) {
            this.e.set(bundle.getBoolean("resolving_error", false) ? new pxg(new psa(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void b(Bundle bundle) {
        pxg pxg = (pxg) this.e.get();
        if (pxg != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", pxg.a);
            bundle.putInt("failed_status", pxg.b.b);
            bundle.putParcelable("failed_resolution", pxg.b.c);
        }
    }

    public void b() {
        this.d = true;
    }

    public final void a(int i, int i2, Intent intent) {
        pxg pxg = (pxg) this.e.get();
        Object obj = 1;
        Object obj2 = null;
        if (i != 1) {
            if (i == 2) {
                i = this.f.c(a());
                if (i != 0) {
                    obj = null;
                }
                if (pxg != null && (pxg.b.b != 18 || i != 18)) {
                    obj2 = obj;
                } else {
                    return;
                }
            }
        } else if (i2 == -1) {
            obj2 = 1;
        } else if (i2 == 0) {
            i = 13;
            if (intent != null) {
                i = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
            }
            pxg pxg2 = new pxg(new psa(i, null), pxh.a(pxg));
            this.e.set(pxg2);
            pxg = pxg2;
        }
        if (obj2 != null) {
            f();
            return;
        }
        if (pxg != null) {
            a(pxg.b, pxg.a);
        }
    }

    public void d() {
        this.d = false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void f() {
        this.e.set(null);
        e();
    }

    public final void b(psa psa, int i) {
        pxg pxg = new pxg(psa, i);
        if (this.e.compareAndSet(null, pxg)) {
            this.b.post(new pxj(this, pxg));
        }
    }

    private static int a(pxg pxg) {
        return pxg != null ? pxg.a : -1;
    }
}
