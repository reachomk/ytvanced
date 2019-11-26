package defpackage;

import android.content.SharedPreferences.Editor;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: ackj */
public final class ackj implements Runnable {
    private final /* synthetic */ LiveCreationActivity a;

    public ackj(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public final void run() {
        Editor edit = xly.a(this.a).edit();
        edit.putLong("SHARED_PREF_LS_TIMESTAMP_KEY", this.a.w.a());
        edit.commit();
        this.a.X.postDelayed(this, LiveCreationActivity.W);
    }
}
