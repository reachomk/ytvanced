package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineAdActivity;

/* renamed from: agje */
public final class agje implements OnClickListener {
    private final /* synthetic */ DebugOfflineAdActivity a;

    public agje(DebugOfflineAdActivity debugOfflineAdActivity) {
        this.a = debugOfflineAdActivity;
    }

    public final void onClick(View view) {
        new agjj(this.a).execute(new Void[]{null});
    }
}
