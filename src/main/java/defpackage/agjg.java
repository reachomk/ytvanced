package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineAdActivity;

/* renamed from: agjg */
public final class agjg implements OnClickListener {
    private final /* synthetic */ DebugOfflineAdActivity a;

    public agjg(DebugOfflineAdActivity debugOfflineAdActivity) {
        this.a = debugOfflineAdActivity;
    }

    public final void onClick(View view) {
        new agjt(this.a).execute(new Long[]{Long.valueOf(0)});
    }
}
