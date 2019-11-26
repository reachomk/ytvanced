package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: sih */
final class sih implements OnGlobalLayoutListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ int b;
    private final /* synthetic */ shz c;

    sih(shz shz, View view, int i) {
        this.c = shz;
        this.a = view;
        this.b = i;
    }

    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.c.getWindow().setLayout(this.c.getWindow().getAttributes().width, this.b);
    }
}
