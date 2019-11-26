package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: alnv */
final class alnv implements OnClickListener {
    private final /* synthetic */ aaas a;
    private final /* synthetic */ alnx b;
    private final /* synthetic */ alnt c;

    alnv(alnt alnt, aaas aaas, alnx alnx) {
        this.c = alnt;
        this.a = aaas;
        this.b = alnx;
    }

    public final void onClick(View view) {
        apxu apxu = this.c.c;
        if (apxu != null) {
            this.a.a(apxu, null);
        }
        this.b.a(this.c.d);
    }
}
