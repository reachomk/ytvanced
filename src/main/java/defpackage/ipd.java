package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: ipd */
final class ipd extends apk {
    private final int a;

    public ipd(Resources resources) {
        this.a = resources.getDimensionPixelOffset(R.dimen.red_carpet_list_divider_width);
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        if (abe.g(view) == 1) {
            rect.left = this.a;
        } else {
            rect.right = this.a;
        }
    }
}
