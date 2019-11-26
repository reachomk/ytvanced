package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: ihw */
final class ihw implements OnTouchListener {
    private final /* synthetic */ ihu a;

    ihw(ihu ihu) {
        this.a = ihu;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.a.j = (int) motionEvent.getRawX();
        this.a.k = (int) motionEvent.getRawY();
        view.performClick();
        return true;
    }
}
