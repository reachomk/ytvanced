package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

/* renamed from: ffc */
public final class ffc implements ffk {
    private final int a;
    private final int b;
    private final int c;
    private final View d;
    private final ffn e;
    private int f;

    public ffc(Context context, View view, ffn ffn) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.a = xss.a(displayMetrics, 16);
        this.b = xss.a(displayMetrics, 80);
        this.c = xss.a(displayMetrics, 640);
        this.d = view;
        this.e = ffn;
    }

    public final void a(int i) {
        LayoutParams layoutParams = this.d.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(0);
            layoutParams2.setMarginEnd(this.a);
            layoutParams2.bottomMargin = i + this.a;
            layoutParams2.gravity = 8388693;
            this.d.setLayoutParams(layoutParams2);
        }
    }

    public final void a() {
        this.f = 0;
    }

    public final void a(View view, int i) {
        this.f += i;
        if (view.canScrollVertically(-1)) {
            int i2 = this.f;
            if (i2 >= (-this.c)) {
                if (i2 > this.b) {
                    this.e.a(true);
                    this.f = 0;
                    return;
                }
            }
        }
        this.e.a();
        this.f = 0;
    }

    public final void b() {
        this.d.setTranslationY(0.0f);
        this.d.setTranslationX(0.0f);
        this.f = 0;
    }
}
