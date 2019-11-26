package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: lep */
final /* synthetic */ class lep implements OnClickListener {
    private final len a;

    lep(len len) {
        this.a = len;
    }

    public final void onClick(View view) {
        len len = this.a;
        acvx e = len.e();
        if (e != null) {
            e.a(3, new acvs(acwc.ENGAGEMENT_PANEL_CLOSE_BUTTON), null);
        }
        len.d();
    }
}
