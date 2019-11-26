package defpackage;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* renamed from: xre */
public final class xre extends SimpleOnGestureListener {
    private final /* synthetic */ SwipeLayout a;

    public xre(SwipeLayout swipeLayout) {
        this.a = swipeLayout;
    }

    public final void onShowPress(MotionEvent motionEvent) {
        if (!this.a.a()) {
            this.a.a(motionEvent.getX(), motionEvent.getY());
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View f;
        if (motionEvent.getX() < ((float) this.a.c.getLeft())) {
            f = this.a.f();
            if (f != null) {
                f.performClick();
            }
        } else if (motionEvent.getX() >= ((float) this.a.c.getRight())) {
            f = this.a.g();
            if (f != null) {
                f.performClick();
            }
        } else if (!this.a.a()) {
            this.a.performClick();
            this.a.a(motionEvent.getX(), motionEvent.getY());
        }
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        if (!(this.a.a() || this.a.getParent() == null)) {
            this.a.performLongClick();
        }
        this.a.l();
    }
}
