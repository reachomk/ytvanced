package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineAdActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: agjh */
public final class agjh implements OnClickListener {
    private final /* synthetic */ DebugOfflineAdActivity a;

    public agjh(DebugOfflineAdActivity debugOfflineAdActivity) {
        this.a = debugOfflineAdActivity;
    }

    public final void onClick(View view) {
        DebugOfflineAdActivity debugOfflineAdActivity = this.a;
        debugOfflineAdActivity.a(debugOfflineAdActivity.f.a() - TimeUnit.MINUTES.toMillis(7));
    }
}
