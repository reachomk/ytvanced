package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: cmu */
public final class cmu implements OnTouchListener {
    public coj a;

    cmu() {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        coj coj = this.a;
        if (coj != null) {
            if (cok.d == null) {
                cok.d = new crn();
            }
            cok.d.a = view;
            cok.d.b = motionEvent;
            boolean booleanValue = ((Boolean) coj.a.m().a(coj, cok.d)).booleanValue();
            cok.d.a = null;
            cok.d.b = null;
            if (booleanValue) {
                return true;
            }
        }
        return false;
    }
}
