package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineAdActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: agjf */
public final class agjf implements OnClickListener {
    private final /* synthetic */ DebugOfflineAdActivity a;

    public agjf(DebugOfflineAdActivity debugOfflineAdActivity) {
        this.a = debugOfflineAdActivity;
    }

    public final void onClick(View view) {
        new agjt(this.a).execute(new Long[]{Long.valueOf(TimeUnit.HOURS.toSeconds(6))});
    }
}
