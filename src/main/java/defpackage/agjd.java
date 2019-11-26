package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineAdActivity;

/* renamed from: agjd */
public final class agjd implements OnClickListener {
    private final /* synthetic */ DebugOfflineAdActivity a;

    public agjd(DebugOfflineAdActivity debugOfflineAdActivity) {
        this.a = debugOfflineAdActivity;
    }

    public final void onClick(View view) {
        new agjr(this.a).execute(new Void[]{null});
    }
}
