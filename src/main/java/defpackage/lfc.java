package defpackage;

import android.view.View;

/* renamed from: lfc */
final class lfc implements xqa {
    private final float a;

    lfc(float f) {
        this.a = f;
    }

    public final void a(View view, long j, xqd xqd) {
        view.setAlpha(0.0f);
        view.setX(lfa.a(view, this.a));
        abr p = abe.p(view);
        p.c();
        p.a(1.0f);
        p.b(0.0f);
        p.a(j);
        p.a(xqe.a(xqd));
        p.b();
    }

    public final void b(View view, long j, xqd xqd) {
        abr p = abe.p(view);
        p.c();
        p.a(0.0f);
        p.b(lfa.a(view, this.a));
        p.a(j);
        p.a(xqe.a(xqd));
        p.b();
    }

    public final void a(View view) {
        view.setAlpha(1.0f);
        view.setX(0.0f);
        abe.p(view).a();
    }
}
