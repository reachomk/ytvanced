package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: liz */
final /* synthetic */ class liz implements OnClickListener {
    private final acvx a;
    private final lck b;

    liz(acvx acvx, lck lck) {
        this.a = acvx;
        this.b = lck;
    }

    public final void onClick(View view) {
        acvx acvx = this.a;
        lck lck = this.b;
        acvx.a(3, new acvs(acwc.MINI_PLAYER_EXPAND_BUTTON), null);
        lck.h();
    }
}
