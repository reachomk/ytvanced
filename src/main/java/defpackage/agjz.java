package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineResyncActivity;

/* renamed from: agjz */
public final class agjz implements OnClickListener {
    private final /* synthetic */ DebugOfflineResyncActivity a;

    public agjz(DebugOfflineResyncActivity debugOfflineResyncActivity) {
        this.a = debugOfflineResyncActivity;
    }

    public final void onClick(View view) {
        xpr.a(this.a, (CharSequence) "Expiring all offline videos...", 1);
        new agke(this.a).execute(new Void[]{null});
    }
}
