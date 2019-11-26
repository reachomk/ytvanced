package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: ake */
final class ake extends ajh {
    private final /* synthetic */ akf d;

    public ake(akf akf, Context context, aju aju, View view) {
        this.d = akf;
        super(context, aju, view, false);
        if (!aju.l.f()) {
            View view2 = akf.i;
            if (view2 == null) {
                view2 = (View) akf.h;
            }
            this.a = view2;
        }
        a(akf.p);
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        akf akf = this.d;
        akf.n = null;
        akf.q = 0;
        super.e();
    }
}
