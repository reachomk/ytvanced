package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: iht */
final class iht implements OnClickListener {
    private final /* synthetic */ ihu a;

    iht(ihu ihu) {
        this.a = ihu;
    }

    public final void onClick(View view) {
        ihu ihu = this.a;
        ihv ihv = ihu.d;
        if (ihv != null) {
            ihv.a(ihu.j, ihu.k);
        }
    }
}
