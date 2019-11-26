package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ydi */
final class ydi implements OnClickListener {
    private final /* synthetic */ yde a;

    ydi(yde yde) {
        this.a = yde;
    }

    public final void onClick(View view) {
        yde yde = this.a;
        Uri o = yde.o();
        ycm ycm = o != null ? (ycm) yde.h.a(o) : null;
        if (ycm != null) {
            apxu apxu = ycm.k;
            if (apxu != null) {
                yde.g.a(apxu, null);
            }
        }
    }
}
