package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: eyq */
public final class eyq extends apk {
    private final int a;

    public eyq(int i) {
        this.a = i;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        int e = RecyclerView.e(view);
        int g = abe.g(recyclerView);
        if (e != 0) {
            if (g == 1) {
                rect.right += this.a;
            } else {
                rect.left += this.a;
            }
        }
        Object tag = view.getTag(R.id.offset_adjuster_tag);
        if (tag instanceof eyr) {
            ((eyr) tag).a(rect);
        }
    }
}
