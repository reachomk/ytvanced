package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineActivity;

/* renamed from: agjc */
public final /* synthetic */ class agjc implements OnClickListener {
    private final DebugOfflineActivity a;
    private final Class b;

    public agjc(DebugOfflineActivity debugOfflineActivity, Class cls) {
        this.a = debugOfflineActivity;
        this.b = cls;
    }

    public final void onClick(View view) {
        DebugOfflineActivity debugOfflineActivity = this.a;
        debugOfflineActivity.startActivity(new Intent(debugOfflineActivity, this.b));
    }
}
