package defpackage;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;

/* renamed from: tqk */
final class tqk implements OnAttachStateChangeListener {
    private final /* synthetic */ tql a;

    tqk(tql tql) {
        this.a = tql;
    }

    public final void onViewDetachedFromWindow(View view) {
        tql tql = this.a;
        tql.r = true;
        if (tql.t) {
            tql.f();
            tql.p.c(tql.o);
            return;
        }
        tql.p.b(tql.o);
    }

    public final void onViewAttachedToWindow(View view) {
        tql tql = this.a;
        tql.r = false;
        if (!tql.s) {
            tql.p.a(tql.o, tql);
        }
    }
}
