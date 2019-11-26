package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: lvb */
final /* synthetic */ class lvb implements OnClickListener {
    private final luz a;

    lvb(luz luz) {
        this.a = luz;
    }

    public final void onClick(View view) {
        luz luz = this.a;
        if (luz.d != ejd.VIRTUAL_REALITY_FULLSCREEN) {
            if (luz.b.a() != null) {
                luz.b.a().a(3, new acvs(acwc.MINI_PLAYER_EXPAND_BUTTON), null);
            }
            luz.f(true);
        }
    }
}
