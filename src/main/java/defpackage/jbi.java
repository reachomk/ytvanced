package defpackage;

import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import com.google.android.youtube.R;

/* renamed from: jbi */
final class jbi implements afsw {
    private final /* synthetic */ String a;
    private final /* synthetic */ Boolean b;
    private final /* synthetic */ OfflinePrefsFragment c;

    jbi(OfflinePrefsFragment offlinePrefsFragment, String str, Boolean bool) {
        this.c = offlinePrefsFragment;
        this.a = str;
        this.b = bool;
    }

    public final void a(bqn bqn) {
        this.c.a(R.string.pref_cross_device_offline_error);
        this.c.findPreference("cross_device_offline").setEnabled(true);
    }
}
