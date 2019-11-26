package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ygf */
final /* synthetic */ class ygf implements OnClickListener {
    private final ygg a;

    ygf(ygg ygg) {
        this.a = ygg;
    }

    public final void onClick(View view) {
        ygg ygg = this.a;
        if (xrn.c(ygg.f)) {
            ygg.r();
            return;
        }
        Object obj = ygg.k;
        if ((obj instanceof ajtu) && ((ajtu) obj).e != null) {
            akor akor = ygg.b;
            ygr ygr = akor != null ? (ygr) akor.a("CONVERSATION_VIDEO_PLAYBACK_CONTROLLER_TAG") : null;
            if (ygr != null) {
                ygr.a((ajtu) ygg.k);
            }
        }
    }
}
