package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;

/* renamed from: izf */
public final /* synthetic */ class izf implements OnPreferenceChangeListener {
    private final DeveloperPrefsFragment a;

    public izf(DeveloperPrefsFragment developerPrefsFragment) {
        this.a = developerPrefsFragment;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        DeveloperPrefsFragment developerPrefsFragment = this.a;
        preference.setSummary(obj.toString());
        jca.a(developerPrefsFragment.g, developerPrefsFragment.getActivity(), "Restart application to apply changes", new izg(developerPrefsFragment));
        return true;
    }
}
