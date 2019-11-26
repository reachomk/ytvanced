package defpackage;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: acod */
final class acod implements OnGlobalLayoutListener {
    private final /* synthetic */ View a;

    acod(View view) {
        this.a = view;
    }

    public final void onGlobalLayout() {
        LayoutParams layoutParams = this.a.getLayoutParams();
        if (layoutParams instanceof auy) {
            ((auy) layoutParams).a(new acog());
            this.a.setLayoutParams(layoutParams);
        }
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
