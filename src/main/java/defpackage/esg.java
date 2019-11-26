package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: esg */
final /* synthetic */ class esg implements OnTouchListener {
    private final ese a;
    private final axqn b;

    esg(ese ese, axqn axqn) {
        this.a = ese;
        this.b = axqn;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ese ese = this.a;
        axqn axqn = this.b;
        if (motionEvent.getAction() == 1) {
            akor akor = ese.d;
            if (akor != null) {
                hkq.b(akor, axqn);
                view.performClick();
            }
        }
        return false;
    }
}
