package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* renamed from: abxl */
public final class abxl extends apk {
    private final int a;

    abxl(int i) {
        this.a = i;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        super.a(rect, view, recyclerView, aqh);
        if (RecyclerView.e(view) <= 0) {
            if (abe.g(recyclerView) == 0) {
                rect.left = this.a;
                rect.right = 0;
                return;
            }
            rect.left = 0;
            rect.right = this.a;
        }
    }
}
