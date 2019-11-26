package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;

/* renamed from: hqe */
public final class hqe extends ahbc {
    private final hqj e;

    public hqe(Activity activity, afpu afpu, agwc agwc, afqe afqe, xoi xoi, xhv xhv, agvs agvs, ahcp ahcp, ahcf ahcf, ahcc ahcc, xpa xpa, hqj hqj, agwa agwa) {
        super(activity, afpu, agwc, afqe, xoi, xhv, agvs, ahcp, ahcf, ahcc, xpa, agwa);
        this.e = hqj;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, int i) {
        hqj hqj = this.e;
        hqj.b.b(hqj.a(i, new hqk(hqj, str)));
    }

    public final void a(String str, ahbv ahbv) {
        super.a(str, ahbv);
        if (!ahbv.a()) {
            this.e.b(R.string.offline_actions_playlist_deleted_snackbar_text);
        }
    }
}
