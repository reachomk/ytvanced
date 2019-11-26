package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;

/* renamed from: hwt */
public final class hwt {
    public final Activity a;
    public final aaey b;
    private hwr c;

    public hwt(Activity activity, aaey aaey) {
        this.a = activity;
        this.b = aaey;
    }

    public final hwr a() {
        if (this.c == null) {
            this.c = new hwr(R.id.controls_overlay_menu_feedback, this.a.getString(R.string.menu_help), new hww(this));
            this.c.a(true);
            this.c.d = ra.a(this.a, (int) R.drawable.quantum_ic_help_grey600_24);
        }
        return this.c;
    }
}
