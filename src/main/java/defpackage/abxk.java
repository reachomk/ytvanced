package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: abxk */
public final class abxk extends apk {
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            int measuredHeight = (int) (((float) recyclerView.getMeasuredHeight()) * 0.3f);
            int top = (childAt.getTop() + childAt.getBottom()) / 2;
            abxk.a(top < measuredHeight ? ((((float) top) * 0.7f) / ((float) measuredHeight)) + 0.2f : 0.9f, childAt);
        }
    }

    static void a(float f, View view) {
        view.setAlpha(f);
        view.animate().setStartDelay(6000).alpha(0.0f).setDuration(4000).start();
    }
}
