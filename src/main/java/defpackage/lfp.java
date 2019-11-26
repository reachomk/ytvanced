package defpackage;

import android.view.View;

/* renamed from: lfp */
public final class lfp implements xqa {
    public static final lfp a = new lfp(1);
    public static final lfp b = new lfp(2);
    private final int c;

    private lfp(int i) {
        this.c = i;
    }

    public final void a(View view, long j, xqd xqd) {
        view.setTranslationY((float) b(view));
        abr p = abe.p(view);
        p.c(0.0f);
        p.a(j);
        p.a(xqe.a(xqd));
        p.b();
    }

    public final void b(View view, long j, xqd xqd) {
        view.setTranslationY(0.0f);
        abr p = abe.p(view);
        p.c((float) b(view));
        p.a(j);
        p.a(xqe.a(xqd));
        p.b();
    }

    public final void a(View view) {
        view.setTranslationY(0.0f);
        abe.p(view).a();
    }

    private final int b(View view) {
        int height = ((View) view.getParent()).getHeight();
        return this.c == 1 ? -height : height;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lfp) && ((lfp) obj).c == this.c;
    }

    public final int hashCode() {
        return this.c;
    }
}
