package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* renamed from: xrf */
final class xrf extends aqd {
    private final /* synthetic */ xrg a;

    xrf(xrg xrg) {
        this.a = xrg;
    }

    public final boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (recyclerView == this.a.b && motionEvent.getAction() == 0) {
            for (SwipeLayout swipeLayout : this.a.a) {
                if (abe.H(swipeLayout)) {
                    Rect rect = new Rect();
                    swipeLayout.getGlobalVisibleRect(rect);
                    if (!rect.contains((int) (motionEvent.getRawX() + 0.5f), (int) (motionEvent.getRawY() + 0.5f)) && swipeLayout.a()) {
                        swipeLayout.b();
                    }
                }
            }
        }
        return false;
    }
}
