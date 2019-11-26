package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineResyncActivity;

/* renamed from: agkc */
public final class agkc implements OnClickListener {
    private final /* synthetic */ DebugOfflineResyncActivity a;

    public agkc(DebugOfflineResyncActivity debugOfflineResyncActivity) {
        this.a = debugOfflineResyncActivity;
    }

    public final void onClick(View view) {
        xpr.a(this.a, (CharSequence) "Expiring all offline videos and metadata...", 1);
        new agkd(this.a).execute(new Void[]{null});
    }
}
