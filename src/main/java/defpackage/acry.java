package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

/* renamed from: acry */
final class acry implements OnGlobalLayoutListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ LinearLayout b;
    private final /* synthetic */ acrv c;

    acry(acrv acrv, View view, LinearLayout linearLayout) {
        this.c = acrv;
        this.a = view;
        this.b = linearLayout;
    }

    public final void onGlobalLayout() {
        PopupWindow popupWindow = this.c.g;
        View view = this.a;
        popupWindow.update(view, 0, acrv.a(this.b, view), -2, -2);
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
