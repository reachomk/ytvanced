package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: wcb */
final /* synthetic */ class wcb implements OnTouchListener {
    private final wby a;

    wcb(wby wby) {
        this.a = wby;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        wby wby = this.a;
        OnTouchListener onTouchListener = wby.c;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            wby.a();
            wby.d.add(wby.a);
        } else if (action != 1) {
            wby.f = true;
        } else {
            wby.b();
            wby.e = MotionEvent.obtain(motionEvent);
            wby.f = true;
        }
        return false;
    }
}
