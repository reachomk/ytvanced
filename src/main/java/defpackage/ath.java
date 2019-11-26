package defpackage;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: ath */
public final class ath extends SimpleOnGestureListener {
    public boolean a = true;
    private final /* synthetic */ ata b;

    public ath(ata ata) {
        this.b = ata;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        if (this.a) {
            View a = this.b.a(motionEvent);
            if (a != null) {
                aqj a2 = this.b.p.a(a);
                if (a2 != null) {
                    ata ata = this.b;
                    if (ata.l.c(ata.p, a2)) {
                        int pointerId = motionEvent.getPointerId(0);
                        int i = this.b.k;
                        if (pointerId == i) {
                            pointerId = motionEvent.findPointerIndex(i);
                            float x = motionEvent.getX(pointerId);
                            float y = motionEvent.getY(pointerId);
                            ata ata2 = this.b;
                            ata2.c = x;
                            ata2.d = y;
                            ata2.h = 0.0f;
                            ata2.g = 0.0f;
                            ata2.l.a();
                        }
                    }
                }
            }
        }
    }
}
