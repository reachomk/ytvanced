package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: iph */
final class iph extends apk {
    private final int a;

    iph(Resources resources) {
        this.a = resources.getDimensionPixelOffset(R.dimen.red_carpet_shelf_divider_height);
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        int i = this.a;
        rect.top = i;
        rect.bottom = i;
    }
}
