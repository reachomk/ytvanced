package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;

/* renamed from: dtb */
public final class dtb implements OnSharedPreferenceChangeListener {
    private final /* synthetic */ Context a;

    public dtb(Context context) {
        this.a = context;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (dtf.a.a(str)) {
            YouTubeBackupAgent.d(this.a);
        }
    }
}
