package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ljc */
final /* synthetic */ class ljc implements OnClickListener {
    private final acvx a;
    private final lci b;

    ljc(acvx acvx, lci lci) {
        this.a = acvx;
        this.b = lci;
    }

    public final void onClick(View view) {
        acvx acvx = this.a;
        lci lci = this.b;
        acvx.a(3, new acvs(acwc.MINI_PLAYER_DISMISSAL_BUTTON), null);
        lci.g();
    }
}
