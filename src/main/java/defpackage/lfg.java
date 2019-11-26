package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: lfg */
final /* synthetic */ class lfg implements OnClickListener {
    private final lff a;

    lfg(lff lff) {
        this.a = lff;
    }

    public final void onClick(View view) {
        lff lff = this.a;
        acvx acvx = lff.g;
        if (acvx != null) {
            acvx.a(3, new acvs(acwc.ENGAGEMENT_PANEL_BACK_BUTTON), null);
        }
        lei lei = lff.e;
        if (lei != null) {
            lei.a();
        }
    }
}
