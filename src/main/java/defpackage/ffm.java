package defpackage;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

/* renamed from: ffm */
public final class ffm implements ffk, xqb {
    private final xpw a;
    private final View b;
    private final ffn c;
    private View d;

    public ffm(View view, View view2, ffn ffn) {
        this.b = view;
        this.a = new xpw(view2);
        this.c = ffn;
    }

    public final void a() {
    }

    public final void a(View view, int i) {
    }

    public final void a(xpu xpu) {
    }

    public final void a(int i) {
        LayoutParams layoutParams = this.b.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(0);
            layoutParams2.setMarginEnd(0);
            layoutParams2.topMargin = 0;
            layoutParams2.gravity = 51;
            this.b.setLayoutParams(layoutParams2);
        }
    }

    public final void c() {
        this.d = null;
        this.a.a(null);
    }

    public final void b() {
        this.b.setTranslationY(0.0f);
        this.b.setTranslationX(0.0f);
        View view = this.b;
        view.setTranslationY((float) (-view.getHeight()));
    }
}
