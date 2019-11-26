package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.settings.developer.DebugOnlineAdActivity;

/* renamed from: jcw */
public final class jcw implements OnClickListener {
    private final /* synthetic */ DebugOnlineAdActivity a;

    public jcw(DebugOnlineAdActivity debugOnlineAdActivity) {
        this.a = debugOnlineAdActivity;
    }

    public final void onClick(View view) {
        DebugOnlineAdActivity debugOnlineAdActivity = this.a;
        debugOnlineAdActivity.l.a("debugAdEnableFreqCap", debugOnlineAdActivity.p.isChecked() ^ 1);
    }
}
