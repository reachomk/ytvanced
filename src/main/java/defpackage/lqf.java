package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: lqf */
public final class lqf extends lqa {
    private final lqj a;
    private final ezm b;

    public lqf(lqj lqj, ezm ezm) {
        this.a = lqj;
        this.b = ezm;
    }

    /* Access modifiers changed, original: final */
    public final float c() {
        return this.a.a().q();
    }

    /* Access modifiers changed, original: final */
    public final View a() {
        return this.b.b();
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return this.b.a() && this.a.i() && xss.b(((ViewGroup) this.b.b()).getContext());
    }

    /* Access modifiers changed, original: final */
    public final Rect d() {
        return this.a.a().l();
    }

    /* Access modifiers changed, original: final */
    public final Rect e() {
        return this.a.a(1).l();
    }
}
