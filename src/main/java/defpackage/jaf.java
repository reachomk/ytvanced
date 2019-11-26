package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DogfoodPrefsFragment;

/* renamed from: jaf */
public final class jaf implements OnPreferenceClickListener {
    private final /* synthetic */ DogfoodPrefsFragment a;

    public jaf(DogfoodPrefsFragment dogfoodPrefsFragment) {
        this.a = dogfoodPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        this.a.getPreferenceManager().getSharedPreferences().edit().remove("visitor_id").commit();
        preference.setSummary(null);
        return true;
    }
}
