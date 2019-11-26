package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.settings.DogfoodPrefsFragment;

/* renamed from: jad */
public final class jad implements OnPreferenceChangeListener {
    public final /* synthetic */ DogfoodPrefsFragment a;

    public jad(DogfoodPrefsFragment dogfoodPrefsFragment) {
        this.a = dogfoodPrefsFragment;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        String str = (String) obj;
        DogfoodPrefsFragment dogfoodPrefsFragment;
        if (TextUtils.isEmpty(str) || ehy.a.matcher(str).matches()) {
            if (TextUtils.isEmpty(str)) {
                preference.getEditor().remove(preference.getKey()).commit();
            }
            preference.setSummary(DogfoodPrefsFragment.c(str));
            dogfoodPrefsFragment = this.a;
            jca.a(dogfoodPrefsFragment.c, dogfoodPrefsFragment.getActivity(), "This change requires restart. Do it now?", new jag(this));
            return true;
        }
        dogfoodPrefsFragment = this.a;
        jca.a(dogfoodPrefsFragment.c, dogfoodPrefsFragment.getActivity(), "Invalid version number specified", false);
        return false;
    }
}
