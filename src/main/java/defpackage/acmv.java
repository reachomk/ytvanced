package defpackage;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: acmv */
final class acmv implements OnTouchListener {
    private final /* synthetic */ ScaleGestureDetector a;
    private final /* synthetic */ acmw b;

    acmv(acmw acmw, ScaleGestureDetector scaleGestureDetector) {
        this.b = acmw;
        this.a = scaleGestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 5 && motionEvent.getPointerCount() >= 2) {
            this.b.aj = true;
        }
        if (action == 0) {
            this.b.ak = true;
        }
        if (action == 2) {
            if ((motionEvent.getHistorySize() != 0 ? (float) Math.hypot((double) (motionEvent.getX() - motionEvent.getHistoricalX(0)), (double) (motionEvent.getY() - motionEvent.getHistoricalY(0))) : 0.0f) > 20.0f) {
                this.b.ak = false;
            }
        }
        if (action == 1) {
            acmw acmw = this.b;
            if (acmw.aj || !acmw.ak) {
                if (motionEvent.getPointerCount() < 2) {
                    this.b.aj = false;
                }
                view.performClick();
            } else {
                acmw.ak = false;
                acmw.ad.a(motionEvent.getX(), motionEvent.getY());
                return true;
            }
        }
        if (this.b.aj && action == 2) {
            return this.a.onTouchEvent(motionEvent);
        }
        return false;
    }
}
