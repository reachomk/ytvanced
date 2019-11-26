package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: zhs */
final class zhs implements OnClickListener {
    private final /* synthetic */ zhq a;

    public final void onClick(View view) {
        if (this.a.a.e()) {
            this.a.c.a(3, new acvs(acwc.UPLOAD_VIDEO_FLASH_TOGGLE), this.a.d);
            zhq zhq = this.a;
            zhq.a(zhq.a.d ^ 1, true, true);
        }
    }

    /* synthetic */ zhs(zhq zhq) {
        this.a = zhq;
    }
}
