package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;

/* renamed from: izb */
public final /* synthetic */ class izb implements OnPreferenceClickListener {
    private final DeveloperPrefsFragment a;

    public izb(DeveloperPrefsFragment developerPrefsFragment) {
        this.a = developerPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        this.a.a();
        return true;
    }
}
