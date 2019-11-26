package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: abui */
final /* synthetic */ class abui implements OnTouchListener {
    private final abug a;

    abui(abug abug) {
        this.a = abug;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        abug abug = this.a;
        int action = motionEvent.getAction();
        if (action == 0) {
            abug.c.post(abug.d);
            return true;
        } else if (action != 1) {
            return false;
        } else {
            abug.c.removeCallbacks(abug.d);
            return true;
        }
    }
}
