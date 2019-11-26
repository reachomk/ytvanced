package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: zvn */
final class zvn extends apk {
    private final /* synthetic */ zvi a;

    zvn(zvi zvi) {
        this.a = zvi;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        if (RecyclerView.e(view) > 0) {
            rect.top = this.a.a.getResources().getDimensionPixelSize(R.dimen.card_drawer_watch_next_spacing);
        }
    }
}
