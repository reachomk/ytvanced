package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: lql */
public final class lql implements elr {
    public final lqn a;
    private final ViewGroup b;

    public lql(ViewGroup viewGroup, lqn lqn) {
        this.b = viewGroup;
        this.a = lqn;
        lqo lqo = new lqo();
        ffs ffs = new ffs();
    }

    public final void a(View view, View view2) {
        if (view.getParent() == null) {
            this.b.addView(view, -1, -1);
        }
        this.a.a(view2);
    }

    public final void b(View view, View view2) {
        this.b.removeView(view);
        this.a.b(view2);
    }

    public final void a(View view) {
        this.a.c(view);
    }

    public final void b(View view) {
        this.a.d(view);
    }

    public final void setAlpha(float f) {
        this.b.setAlpha(f);
        this.a.a(f);
    }
}
