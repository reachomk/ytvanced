package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: iib */
final class iib implements OnTouchListener {
    private final /* synthetic */ ihy a;

    iib(ihy ihy) {
        this.a = ihy;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.a.b = (int) motionEvent.getRawX();
        this.a.c = (int) motionEvent.getRawY();
        view.performClick();
        return true;
    }
}
