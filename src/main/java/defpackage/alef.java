package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: alef */
final class alef implements OnClickListener {
    private final /* synthetic */ axhz a;
    private final /* synthetic */ aldw b;

    alef(aldw aldw, axhz axhz) {
        this.b = aldw;
        this.a = axhz;
    }

    public final void onClick(View view) {
        this.b.af.d(new alhi());
        this.b.b(this.a.c);
        axhz axhz = this.a;
        if ((axhz.a & 4) != 0) {
            this.b.aa.a(3, new acvs(axhz.d), null);
        }
        this.b.dismiss();
    }
}
