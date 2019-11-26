package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: aclt */
final /* synthetic */ class aclt implements OnClickListener {
    private final aclq a;

    aclt(aclq aclq) {
        this.a = aclq;
    }

    public final void onClick(View view) {
        aclq aclq = this.a;
        aclq.X();
        acmf acmf = aclq.ac;
        if (acmf != null) {
            acmf.C();
        }
    }
}
