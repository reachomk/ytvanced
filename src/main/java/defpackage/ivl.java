package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.youtube.R;

/* renamed from: ivl */
final class ivl implements OnGlobalLayoutListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ ivg b;

    ivl(ivg ivg, View view) {
        this.b = ivg;
        this.a = view;
    }

    public final void onGlobalLayout() {
        wlj.a(this.b.d, 0, 0, (int) this.b.a.getDimension(R.dimen.dropdown_switch_button_tap_area_margin_right), 0);
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
