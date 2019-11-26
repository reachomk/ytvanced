package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: almy */
final class almy implements OnTouchListener {
    private final xor a = new xor(this.b.c);
    private final /* synthetic */ almx b;

    almy(almx almx) {
        this.b = almx;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.a(motionEvent);
        return this.b.d.onTouchEvent(motionEvent);
    }
}
