package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: absw */
final /* synthetic */ class absw implements OnClickListener {
    private final absu a;
    private final aphg b;

    absw(absu absu, aphg aphg) {
        this.a = absu;
        this.b = aphg;
    }

    public final void onClick(View view) {
        absu absu = this.a;
        apxu apxu = this.b.l;
        if (apxu == null) {
            apxu = apxu.d;
        }
        absu.a(apxu);
    }
}
