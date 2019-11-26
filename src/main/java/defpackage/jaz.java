package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;

/* renamed from: jaz */
public final class jaz implements OnPreferenceChangeListener {
    private final /* synthetic */ GeneralPrefsFragment a;

    public jaz(GeneralPrefsFragment generalPrefsFragment) {
        this.a = generalPrefsFragment;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        this.a.f.b();
        return true;
    }
}
