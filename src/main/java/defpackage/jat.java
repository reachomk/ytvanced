package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DogfoodPrefsFragment;

/* renamed from: jat */
public final class jat implements OnPreferenceClickListener {
    private final /* synthetic */ DogfoodPrefsFragment a;

    public jat(DogfoodPrefsFragment dogfoodPrefsFragment) {
        this.a = dogfoodPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        this.a.i.a("Sign out from dogfood settings", true);
        return true;
    }
}
