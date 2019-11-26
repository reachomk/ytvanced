package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: krn */
final /* synthetic */ class krn implements OnTouchListener {
    private final krl a;

    krn(krl krl) {
        this.a = krl;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.e.b.a(motionEvent);
        return false;
    }
}
