package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jzc */
final /* synthetic */ class jzc implements OnClickListener {
    private final jzd a;
    private final int b;

    jzc(jzd jzd, int i) {
        this.a = jzd;
        this.b = i;
    }

    public final void onClick(View view) {
        jzd jzd = this.a;
        jzd.a.a(this.b);
    }
}
