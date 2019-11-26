package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;

/* renamed from: acs */
final class acs implements Runnable {
    private final /* synthetic */ acq a;

    acs(acq acq) {
        this.a = acq;
    }

    public final void run() {
        acq acq = this.a;
        if (acq.e) {
            act act;
            if (acq.c) {
                acq.c = false;
                act = acq.a;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                act.e = currentAnimationTimeMillis;
                act.i = -1;
                act.f = currentAnimationTimeMillis;
                act.j = 0.5f;
                act.g = 0;
                act.h = 0;
            }
            act = this.a.a;
            if ((act.i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= act.i + ((long) act.k)) && this.a.a()) {
                acq acq2 = this.a;
                if (acq2.d) {
                    acq2.d = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    acq2.b.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (act.f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = act.a(currentAnimationTimeMillis2);
                    long j = act.f;
                    act.f = currentAnimationTimeMillis2;
                    float f = ((float) (currentAnimationTimeMillis2 - j)) * (((-4.0f * a) * a) + (a * 4.0f));
                    act.g = (int) (act.c * f);
                    int i = (int) (f * act.d);
                    act.h = i;
                    this.a.a(i);
                    abe.a(this.a.b, (Runnable) this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            this.a.e = false;
        }
    }
}
