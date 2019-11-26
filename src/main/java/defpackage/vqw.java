package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: vqw */
final class vqw implements OnTouchListener {
    private final /* synthetic */ float a;
    private final /* synthetic */ vqx b;

    vqw(vqx vqx, float f) {
        this.b = vqx;
        this.a = f;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.b.a((int) (motionEvent.getX() / this.a), (int) (motionEvent.getY() / this.a));
        }
        return false;
    }
}
