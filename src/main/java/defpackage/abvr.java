package defpackage;

import android.support.design.snackbar.Snackbar;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: abvr */
final /* synthetic */ class abvr implements OnClickListener {
    private final abvm a;
    private final aphg b;

    abvr(abvm abvm, aphg aphg) {
        this.a = abvm;
        this.b = aphg;
    }

    public final void onClick(View view) {
        Snackbar.a(this.a.m(), this.b.i, 0).c();
    }
}
