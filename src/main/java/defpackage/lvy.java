package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: lvy */
final /* synthetic */ class lvy implements OnClickListener {
    private final lvv a;

    lvy(lvv lvv) {
        this.a = lvv;
    }

    public final void onClick(View view) {
        lvv lvv = this.a;
        if (lvv.c != ejd.VIRTUAL_REALITY_FULLSCREEN) {
            lvv.b.a(3, new acvs(acwc.MINI_PLAYER_EXPAND_BUTTON), null);
            lvv.f(true);
        }
    }
}
