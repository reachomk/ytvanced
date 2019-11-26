package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineResyncActivity;

/* renamed from: agjy */
public final /* synthetic */ class agjy implements OnClickListener {
    private final DebugOfflineResyncActivity a;

    public agjy(DebugOfflineResyncActivity debugOfflineResyncActivity) {
        this.a = debugOfflineResyncActivity;
    }

    public final void onClick(View view) {
        Context context = this.a;
        xpr.a(context, (CharSequence) "Randomizing all offline video expiration times...", 1);
        new agkg(context).execute(new Void[]{null});
    }
}
