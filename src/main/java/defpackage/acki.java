package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.libraries.youtube.livecreation.ui.LiveCreationActivity;

/* renamed from: acki */
public final /* synthetic */ class acki implements Runnable {
    private final LiveCreationActivity a;

    public acki(LiveCreationActivity liveCreationActivity) {
        this.a = liveCreationActivity;
    }

    public final void run() {
        LiveCreationActivity liveCreationActivity = this.a;
        SharedPreferences a = xly.a(liveCreationActivity);
        String str = "SHARED_PREF_PORTRAIT_COUNT_KEY";
        int i = a.getInt(str, 0) + 1;
        if (i <= liveCreationActivity.z.e()) {
            Editor edit = a.edit();
            edit.putInt(str, i);
            edit.commit();
        }
    }
}
