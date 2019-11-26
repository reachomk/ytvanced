package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: abud */
final /* synthetic */ class abud implements OnClickListener {
    private final abub a;
    private final aphg b;

    abud(abub abub, aphg aphg) {
        this.a = abub;
        this.b = aphg;
    }

    public final void onClick(View view) {
        abub abub = this.a;
        aphg aphg = this.b;
        aaas b = abub.b();
        apxu apxu = aphg.m;
        if (apxu == null) {
            apxu = apxu.d;
        }
        b.a(apxu, abub.c());
    }
}
