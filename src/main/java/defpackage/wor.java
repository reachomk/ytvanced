package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: wor */
final /* synthetic */ class wor implements OnTouchListener {
    private final woo a;

    wor(woo woo) {
        this.a = woo;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.a.requestFocus();
        return false;
    }
}
