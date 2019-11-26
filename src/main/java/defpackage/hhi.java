package defpackage;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;

/* renamed from: hhi */
public final class hhi implements ejz {
    public final bcaa a;
    public final bcaa b;
    private final Activity c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final xhv g;

    public hhi(Activity activity, xhv xhv, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5) {
        this.c = activity;
        this.d = bcaa;
        this.e = bcaa2;
        this.f = bcaa3;
        this.a = bcaa4;
        this.b = bcaa5;
        this.g = xhv;
    }

    public final boolean a(apxu apxu) {
        boolean z = false;
        if (!this.g.c()) {
            fiw a = ((fiz) this.f.get()).a();
            if (a != null && a.d()) {
                return false;
            }
            if (((eki) this.d.get()).f()) {
                anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                azje azje = (azje) b;
                if (!azje.b.isEmpty()) {
                    agqy a2 = ((agwc) this.e.get()).b().k().a(azje.b);
                    if (a2 != null && a2.i()) {
                        z = true;
                        new Builder(this.c).setTitle(R.string.offline_candidate_download_title).setMessage(R.string.offline_candidate_download_message).setCancelable(true).setPositiveButton(R.string.offline_candidate_download_confirmed_button, new hhl(this, a2)).setNegativeButton(R.string.cancel_button, null).show();
                    }
                }
            }
        }
        return z;
    }
}
