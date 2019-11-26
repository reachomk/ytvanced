package defpackage;

import android.view.View;

/* renamed from: xmy */
public final class xmy implements xqa {
    public final void a(View view, long j, xqd xqd) {
        abe.b(view, 0.0f);
        abr p = abe.p(view);
        p.a(1.0f);
        p.a(j);
        p.a(xqe.a(xqd));
    }

    public final void b(View view, long j, xqd xqd) {
        abe.b(view, 1.0f);
        abr p = abe.p(view);
        p.a(0.0f);
        p.a(j);
        p.a(xqe.a(xqd));
    }

    public final void a(View view) {
        abe.p(view).a();
        abe.b(view, 1.0f);
    }
}
