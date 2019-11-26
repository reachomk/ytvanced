package defpackage;

import android.view.View;

/* renamed from: lfd */
final class lfd implements xqa {
    private lfd() {
    }

    private static int b(View view) {
        return ((View) view.getParent()).getWidth();
    }

    public final void a(View view, long j, xqd xqd) {
        view.setX(lfa.a(view, (float) lfd.b(view)));
        abr p = abe.p(view);
        p.c();
        p.b(0.0f);
        p.a(j);
        p.a(xqe.a(xqd));
        p.b();
    }

    public final void b(View view, long j, xqd xqd) {
        abr p = abe.p(view);
        p.c();
        p.b(lfa.a(view, (float) lfd.b(view)));
        p.a(j);
        p.a(xqe.a(xqd));
        p.b();
    }

    public final void a(View view) {
        view.setX(0.0f);
        abe.p(view).a();
    }

    /* synthetic */ lfd(byte b) {
    }
}
