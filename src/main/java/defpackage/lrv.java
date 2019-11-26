package defpackage;

import android.view.View;

/* renamed from: lrv */
final /* synthetic */ class lrv implements amqv {
    private final lru a;

    lrv(lru lru) {
        this.a = lru;
    }

    public final boolean a(Object obj) {
        View view = (View) obj;
        fmf fmf = this.a.j;
        if (fmf == null) {
            return false;
        }
        View view2 = fmf.i;
        if (view2 == null || view != view2) {
            return false;
        }
        return true;
    }
}
