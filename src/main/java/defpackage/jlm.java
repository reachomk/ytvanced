package defpackage;

import android.graphics.Point;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.youtube.app.ui.PivotTabsBar;

/* renamed from: jlm */
public final class jlm implements OnGestureListener {
    private boolean a = false;
    private View b;
    private final /* synthetic */ PivotTabsBar c;

    public jlm(PivotTabsBar pivotTabsBar) {
        this.c = pivotTabsBar;
    }

    private final void a() {
        View view = this.b;
        if (view != null) {
            view.setPressed(false);
        }
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.a = false;
        return true;
    }

    public final void onShowPress(MotionEvent motionEvent) {
        Point point = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        fpl.a(point, this.c);
        View a = fpl.a(this.c, point, jll.a);
        if (a != null) {
            a.setPressed(true);
            this.b = a;
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View view = this.c;
        Point point = new Point();
        point.set((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        fpl.a(point, view);
        view = fpl.a(view, point, jlj.a);
        if (view != null) {
            view.performClick();
        }
        onShowPress(motionEvent);
        this.c.a(motionEvent);
        a();
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.a) {
            this.c.b(motionEvent);
            this.a = true;
        }
        this.c.b(motionEvent2);
        a();
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.c.a(motionEvent);
        a();
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.a) {
            this.c.b(motionEvent);
            this.a = true;
        }
        this.c.b(motionEvent2);
        a();
        return true;
    }
}
