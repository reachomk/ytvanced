package defpackage;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* renamed from: almw */
final class almw extends SimpleOnGestureListener {
    private final /* synthetic */ int a;
    private final /* synthetic */ almx b;

    almw(almx almx, int i) {
        this.b = almx;
        this.a = i;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.b.f && Math.abs(f) >= ((float) this.a)) {
            if (f > 0.0f) {
                almx almx = this.b;
                almx.b.animate().setDuration(250).alpha(1.0f).setListener(new alnb(almx)).start();
                almx.c.animate().setDuration(250).translationX((float) (-almx.b.getLayoutParams().width)).start();
            } else {
                this.b.a(250);
            }
        }
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.b.a(250);
        almx almx = this.b;
        almx.a.a(almx.e);
        return false;
    }
}
