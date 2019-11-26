package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: lwb */
public final class lwb implements elr {
    private final lws a;
    private final ViewGroup b;

    public lwb(lws lws) {
        this.a = lws;
        this.b = lws.a();
    }

    public final void a(View view, View view2) {
        if (view.getParent() == null) {
            this.b.addView(view, -1, -1);
        }
        this.b.addView(view2, -1, -1);
    }

    public final void b(View view, View view2) {
        this.b.removeView(view2);
        this.b.removeView(view);
    }

    public final void a(View view) {
        this.a.a(view);
    }

    public final void b(View view) {
        this.a.b(view);
    }

    public final void setAlpha(float f) {
        this.b.setAlpha(f);
    }
}
