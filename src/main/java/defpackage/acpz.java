package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: acpz */
final class acpz extends apk {
    private final /* synthetic */ acpy a;

    acpz(acpy acpy) {
        this.a = acpy;
    }

    public final void a(Rect rect, View view, RecyclerView recyclerView, aqh aqh) {
        int i = ((anm) recyclerView.n).a;
        int e = RecyclerView.e(view) % i;
        int dimensionPixelSize = this.a.q().getDimensionPixelSize(R.dimen.lc_scheduled_event_padding);
        int i2 = dimensionPixelSize / 2;
        rect.left = i2;
        rect.right = i2;
        rect.bottom = dimensionPixelSize;
        if (e == 0) {
            rect.left = dimensionPixelSize;
        }
        if (e == i - 1) {
            rect.right = dimensionPixelSize;
        }
    }
}
