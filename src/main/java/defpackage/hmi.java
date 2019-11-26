package defpackage;

import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;

/* renamed from: hmi */
public final class hmi extends hlg {
    public hmi(OfflineArrowView offlineArrowView, OnClickListener onClickListener) {
        super(offlineArrowView, onClickListener);
    }

    public final void a(agqy agqy) {
        int q;
        if (agqy == null || agqy.i()) {
            b();
        } else if (agqy.u() == agqs.PLAYABLE) {
            d();
            this.b.d();
            this.b.e();
            this.b.setContentDescription(this.a.getString(R.string.accessibility_offline_button_remove_video));
        } else if (!agqy.v()) {
            Object obj = 1;
            int i = 0;
            if (!agqy.p() && (agqy.l() || agqy.k())) {
                obj = null;
            }
            int i2 = obj == null ? 0 : 2;
            if (agqy.m()) {
                i = 4;
            }
            i2 |= i;
            q = agqy.q();
            i = i2 & 4;
            d();
            if ((2 & i2) == 0) {
                this.b.b();
            } else if (i == 0) {
                this.b.c();
            } else {
                this.b.a();
            }
            this.b.c(q);
            this.b.setContentDescription(this.a.getString(R.string.accessibility_offline_button_cancel));
        } else if (agqy.w()) {
            q = agqy.q();
            d();
            this.b.a(R.drawable.ic_offline_refresh);
            if (q <= 0) {
                this.b.e();
            } else {
                this.b.c(q);
            }
        } else {
            b();
        }
    }
}
