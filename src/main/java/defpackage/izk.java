package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;

/* renamed from: izk */
public final class izk implements OnPreferenceChangeListener {
    private final /* synthetic */ DeveloperPrefsFragment a;

    public izk(DeveloperPrefsFragment developerPrefsFragment) {
        this.a = developerPrefsFragment;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        this.a.a.edit().putBoolean("enable_hsv", ((Boolean) obj).booleanValue()).apply();
        return true;
    }
}
