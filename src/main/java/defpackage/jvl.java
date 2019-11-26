package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;

/* renamed from: jvl */
public final class jvl extends TouchDelegate {
    public jvl(Rect rect, View view) {
        super(rect, view);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!onTouchEvent || motionEvent.getAction() != 1) {
            return onTouchEvent;
        }
        motionEvent = MotionEvent.obtain(motionEvent);
        motionEvent.setAction(3);
        super.onTouchEvent(motionEvent);
        return true;
    }
}
