package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DogfoodPrefsFragment;

/* renamed from: jan */
public final class jan implements OnPreferenceClickListener {
    private final /* synthetic */ DogfoodPrefsFragment a;

    public jan(DogfoodPrefsFragment dogfoodPrefsFragment) {
        this.a = dogfoodPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        DogfoodPrefsFragment dogfoodPrefsFragment = this.a;
        ehh ehh = dogfoodPrefsFragment.h;
        dogfoodPrefsFragment.getActivity();
        ehh.a();
        return true;
    }
}
