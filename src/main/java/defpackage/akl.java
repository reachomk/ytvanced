package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: akl */
final class akl extends ajh {
    private final /* synthetic */ akf d;

    public akl(akf akf, Context context, aiw aiw, View view) {
        this.d = akf;
        super(context, aiw, view, true);
        a(akf.p);
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        aiw aiw = this.d.c;
        if (aiw != null) {
            aiw.close();
        }
        this.d.m = null;
        super.e();
    }
}
