package defpackage;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* renamed from: ijr */
final class ijr extends SimpleOnGestureListener {
    private final /* synthetic */ ijs a;

    ijr(ijs ijs) {
        this.a = ijs;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ijs ijs = this.a;
        double hypot = Math.hypot((double) f, (double) f2);
        boolean z = false;
        if (ijs.a && hypot >= 1500.0d) {
            z = true;
        }
        ijs.b = z;
        return true;
    }
}
