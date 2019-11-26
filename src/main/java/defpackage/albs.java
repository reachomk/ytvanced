package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: albs */
final /* synthetic */ class albs implements OnTouchListener {
    private final albt a;

    albs(albt albt) {
        this.a = albt;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        albt albt = this.a;
        boolean contains = albt.b.contains((float) ((int) motionEvent.getX()), (float) ((int) motionEvent.getY()));
        if (motionEvent.getAction() == 1) {
            if (contains) {
                albt.a.a(1);
                albt.c.performClick();
            } else if (albt.d) {
                albt.a.a(0);
            }
        }
        return true;
    }
}
