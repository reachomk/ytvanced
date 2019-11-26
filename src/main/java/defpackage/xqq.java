package defpackage;

import android.view.MotionEvent;

/* renamed from: xqq */
final class xqq implements Runnable {
    private final /* synthetic */ xqr a;

    xqq(xqr xqr) {
        this.a = xqr;
    }

    public final void run() {
        xqr xqr = this.a;
        xqx xqx = xqr.d;
        if (xqx != null) {
            MotionEvent motionEvent = xqr.a;
            if (motionEvent != null) {
                xqx.a(motionEvent);
            }
        }
        this.a.a();
    }
}
