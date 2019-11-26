package defpackage;

import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: dao */
final class dao implements OnPreDrawListener {
    private final /* synthetic */ dad a;

    dao(dad dad) {
        this.a = dad;
    }

    public final boolean onPreDraw() {
        this.a.j();
        return true;
    }
}
