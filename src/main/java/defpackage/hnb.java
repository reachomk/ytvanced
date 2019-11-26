package defpackage;

import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;

/* renamed from: hnb */
public final class hnb extends hlk {
    public Boolean b;
    private final bcaa c;
    private final String d;
    private final boolean e;

    hnb(eki eki, bcaa bcaa, String str, OfflineArrowView offlineArrowView, boolean z, OnClickListener onClickListener) {
        super(eki, bcaa, 1, str, offlineArrowView, onClickListener);
        this.c = bcaa;
        this.d = str;
        this.e = z;
    }

    public final void a(hks hks) {
        if (!hks.a && (((agwc) this.c.get()).b().n().i(this.d) > 0 || Boolean.FALSE.equals(this.b))) {
            hlo hlo = this.a;
            hlo.c();
            hlo.a.b(R.drawable.ic_offline_sync_playlist);
            hlo.b(R.string.accessibility_offline_button_sync);
        } else if (!hks.a || this.e) {
            super.a(hks);
        } else {
            this.a.a();
        }
    }

    public final void a() {
        if (b() || this.e) {
            super.a();
        } else {
            this.a.a();
        }
    }
}
