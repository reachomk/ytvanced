package defpackage;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* renamed from: gev */
final class gev extends SimpleOnGestureListener {
    private final /* synthetic */ geq a;

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        geq geq = this.a;
        if (geq.c) {
            return false;
        }
        geq.a.aa();
        return true;
    }

    /* synthetic */ gev(geq geq) {
        this.a = geq;
    }
}
