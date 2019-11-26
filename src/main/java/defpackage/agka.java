package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineResyncActivity;

/* renamed from: agka */
public final class agka implements OnClickListener {
    private final /* synthetic */ DebugOfflineResyncActivity a;

    public agka(DebugOfflineResyncActivity debugOfflineResyncActivity) {
        this.a = debugOfflineResyncActivity;
    }

    public final void onClick(View view) {
        DebugOfflineResyncActivity debugOfflineResyncActivity = this.a;
        debugOfflineResyncActivity.f.a(((agwc) debugOfflineResyncActivity.e.get()).c());
        xpr.a(this.a, (CharSequence) "Immediate refresh requested.", 1);
    }
}
