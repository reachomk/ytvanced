package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: igi */
final class igi implements OnTouchListener {
    private final /* synthetic */ igd a;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.a.g = (int) motionEvent.getRawX();
        this.a.h = (int) motionEvent.getRawY();
        view.performClick();
        return true;
    }

    /* synthetic */ igi(igd igd) {
        this.a = igd;
    }
}
