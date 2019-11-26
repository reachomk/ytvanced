package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;

/* renamed from: izd */
public final /* synthetic */ class izd implements OnPreferenceClickListener {
    private final DeveloperPrefsFragment a;

    public izd(DeveloperPrefsFragment developerPrefsFragment) {
        this.a = developerPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        DeveloperPrefsFragment developerPrefsFragment = this.a;
        aaxz aaxz = developerPrefsFragment.e;
        aaxz.a(aaxz.a(), new izp(developerPrefsFragment));
        return true;
    }
}
