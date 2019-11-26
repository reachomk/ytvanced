package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: abwu */
final /* synthetic */ class abwu implements OnClickListener {
    private final abwv a;
    private final boolean b;

    abwu(abwv abwv, boolean z) {
        this.a = abwv;
        this.b = z;
    }

    public final void onClick(View view) {
        abwv abwv = this.a;
        abwv.s.a(abwv.t, abwv.u, false, this.b);
        abwv.h().setVisibility(8);
    }
}
