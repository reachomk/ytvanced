package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: mtr */
final class mtr implements OnTouchListener {
    private final /* synthetic */ mtm a;

    mtr(mtm mtm) {
        this.a = mtm;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.a.a.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
        return false;
    }
}
