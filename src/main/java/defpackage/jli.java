package defpackage;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.youtube.R;

/* renamed from: jli */
public final class jli implements jln {
    private final fjg a;

    public jli(fjg fjg) {
        this.a = fjg;
    }

    public final void a(MotionEvent motionEvent, int i) {
        fja b = this.a.b();
        if (b != null && b.z() != null && b.z().getParent() != null) {
            ViewParent parent = b.z().getParent();
            if (parent instanceof ViewGroup) {
                View view = (ViewGroup) parent;
                if (view.getId() == R.id.pane_fragment_container) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    Point point = new Point();
                    point.set((int) motionEvent.getRawX(), ((int) motionEvent.getRawY()) - i);
                    fpl.a(point, view);
                    obtain.setLocation((float) point.x, (float) point.y);
                    view.dispatchTouchEvent(obtain);
                    obtain.recycle();
                }
            }
        }
    }
}
