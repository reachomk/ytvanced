package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: sia */
final class sia implements OnGlobalLayoutListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ int b;
    private final /* synthetic */ shr c;

    sia(shr shr, View view, int i) {
        this.c = shr;
        this.a = view;
        this.b = i;
    }

    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.c.getWindow().setLayout(this.c.getWindow().getAttributes().width, this.b);
    }
}
