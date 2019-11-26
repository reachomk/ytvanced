package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: mut */
final class mut extends apk {
    private mut() {
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        int e = RecyclerView.e(view);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.related_scroller_inside_padding);
        rect.left = dimensionPixelSize;
        rect.right = dimensionPixelSize;
        if (e >= 0) {
            if (e <= 0) {
                rect.left = view.getResources().getDimensionPixelSize(R.dimen.related_scroller_edge_padding);
            }
            if (e >= recyclerView.m.a() - 1) {
                rect.right = view.getResources().getDimensionPixelSize(R.dimen.related_scroller_edge_padding);
            }
        }
    }

    /* synthetic */ mut(byte b) {
    }
}
