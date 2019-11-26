package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: wcd */
final /* synthetic */ class wcd implements OnTouchListener {
    private final wby a;

    wcd(wby wby) {
        this.a = wby;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        wby wby = this.a;
        if (motionEvent.getAction() == 0) {
            wby.a();
            wby.d.add(view);
        }
        return false;
    }
}
