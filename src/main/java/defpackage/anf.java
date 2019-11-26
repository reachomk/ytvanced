package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: anf */
final class anf implements Runnable {
    private final /* synthetic */ and a;

    anf(and and) {
        this.a = and;
    }

    public final void run() {
        and and = this.a;
        and.d();
        View view = and.a;
        if (view.isEnabled() && !view.isLongClickable() && and.b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            and.b = true;
        }
    }
}
