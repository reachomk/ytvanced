package defpackage;

import android.app.Activity;
import android.content.DialogInterface.OnCancelListener;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: pxj */
final class pxj implements Runnable {
    public final /* synthetic */ pxh a;
    private final pxg b;

    pxj(pxh pxh, pxg pxg) {
        this.a = pxh;
        this.b = pxg;
    }

    public final void run() {
        if (this.a.d) {
            psa psa = this.b.b;
            pxh pxh;
            if (psa.a()) {
                pxh = this.a;
                pxh.a.startActivityForResult(GoogleApiActivity.a(pxh.a(), psa.c, this.b.a, false), 1);
            } else if (psl.b(psa.b)) {
                pxh = this.a;
                psf psf = pxh.f;
                Activity a = pxh.a();
                OnCancelListener onCancelListener = this.a;
                psf.a(a, onCancelListener.a, psa.b, onCancelListener);
            } else if (psa.b == 18) {
                psf.a(this.a.a().getApplicationContext(), new pxi(this, psf.a(this.a.a(), this.a)));
            } else {
                this.a.a(psa, this.b.a);
            }
        }
    }
}
