package defpackage;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

/* renamed from: zir */
public final class zir extends SimpleOnGestureListener {
    public boolean a;
    private final zip b;
    private final /* synthetic */ ziq c;

    public zir(ziq ziq, zip zip) {
        this.c = ziq;
        this.b = (zip) amqw.a((Object) zip);
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.b.an();
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.a) {
            return false;
        }
        float y = motionEvent2.getY() - motionEvent.getY();
        float x = motionEvent2.getX() - motionEvent.getX();
        if (Math.abs(x) > Math.abs(y)) {
            if (Math.abs(x) <= 100.0f || Math.abs(f) <= 100.0f) {
                return false;
            }
            if (x > 0.0f) {
                this.b.d(3);
            } else {
                this.b.d(1);
            }
        } else if (Math.abs(y) <= 100.0f || Math.abs(f2) <= 100.0f) {
            return false;
        } else {
            if (y > 0.0f) {
                this.b.d(4);
            } else {
                this.b.d(2);
            }
        }
        return true;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.b.am();
        return super.onDoubleTap(motionEvent);
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.a) {
            return false;
        }
        if (this.c.a()) {
            this.b.a(motionEvent.getX(), motionEvent.getY());
        }
        return super.onSingleTapConfirmed(motionEvent);
    }
}
