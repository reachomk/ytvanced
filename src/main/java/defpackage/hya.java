package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: hya */
public final class hya implements ahvm {
    public final hwr a;
    public final acvx b;
    public ahvp c;

    public hya(Activity activity, acvx acvx) {
        amqw.a((Object) activity);
        this.b = (acvx) amqw.a((Object) acvx);
        this.a = new hwr(R.id.controls_overlay_menu_vr, activity.getString(R.string.vr_overflow_menu_item), new hxz(this));
        this.a.d = ra.a((Context) activity, (int) R.drawable.quantum_ic_cardboard_grey600_24);
        a(false);
    }

    public final void a(ahvp ahvp) {
        this.c = ahvp;
    }

    public final void a(boolean z) {
        this.a.a(z);
        this.b.a(new acvs(acwc.VR_MODE_MENU_ITEM_BUTTON));
    }
}
