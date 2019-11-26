package defpackage;

import android.app.Activity;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DogfoodPrefsFragment;

/* renamed from: jau */
public final class jau implements OnPreferenceClickListener {
    private final /* synthetic */ DogfoodPrefsFragment a;

    public jau(DogfoodPrefsFragment dogfoodPrefsFragment) {
        this.a = dogfoodPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        Activity activity = this.a.getActivity();
        DogfoodPrefsFragment dogfoodPrefsFragment = this.a;
        new jbw(activity, dogfoodPrefsFragment.a, dogfoodPrefsFragment.b, dogfoodPrefsFragment.c).a("Refreshing values...", "New config values downloaded. Restart app to apply?");
        return true;
    }
}
