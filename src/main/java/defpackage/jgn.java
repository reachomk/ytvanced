package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jgn */
final /* synthetic */ class jgn implements OnClickListener {
    private final jgm a;
    private final aphg b;

    jgn(jgm jgm, aphg aphg) {
        this.a = jgm;
        this.b = aphg;
    }

    public final void onClick(View view) {
        this.a.a(this.b);
    }
}
