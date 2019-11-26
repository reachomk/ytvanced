package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.slimstatusbar.SlimStatusBar;

/* renamed from: hjg */
final /* synthetic */ class hjg implements Runnable {
    private final ViewGroup a;
    private final SlimStatusBar b;

    hjg(ViewGroup viewGroup, SlimStatusBar slimStatusBar) {
        this.a = viewGroup;
        this.b = slimStatusBar;
    }

    public final void run() {
        ViewGroup viewGroup = this.a;
        SlimStatusBar slimStatusBar = this.b;
        int indexOfChild = viewGroup.indexOfChild(slimStatusBar) - 1;
        if (indexOfChild >= 0) {
            View childAt = viewGroup.getChildAt(indexOfChild);
            Rect rect = new Rect();
            childAt.getHitRect(rect);
            rect.bottom += slimStatusBar.getHeight();
            viewGroup.setTouchDelegate(new hjp(rect, childAt));
        }
    }
}
