package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: ibz */
final class ibz implements OnTouchListener {
    private final /* synthetic */ ibv a;

    ibz(ibv ibv) {
        this.a = ibv;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        amqw.a(this.a.l);
        if (motionEvent.getAction() != 1) {
            return false;
        }
        this.a.l.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        view.performClick();
        return true;
    }
}
