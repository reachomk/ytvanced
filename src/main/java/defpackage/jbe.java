package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;

/* renamed from: jbe */
public final /* synthetic */ class jbe implements OnPreferenceChangeListener {
    private final OfflinePrefsFragment a;

    public jbe(OfflinePrefsFragment offlinePrefsFragment) {
        this.a = offlinePrefsFragment;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        this.a.c.a(((Boolean) obj).booleanValue());
        return true;
    }
}
