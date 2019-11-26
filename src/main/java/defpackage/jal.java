package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.text.TextUtils;
import com.google.android.apps.youtube.app.settings.DogfoodPrefsFragment;

/* renamed from: jal */
public final class jal implements OnPreferenceChangeListener {
    public final /* synthetic */ DogfoodPrefsFragment a;

    public jal(DogfoodPrefsFragment dogfoodPrefsFragment) {
        this.a = dogfoodPrefsFragment;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            preference.getEditor().remove(preference.getKey()).commit();
        }
        preference.setSummary(DogfoodPrefsFragment.d(str));
        DogfoodPrefsFragment dogfoodPrefsFragment = this.a;
        jca.a(dogfoodPrefsFragment.c, dogfoodPrefsFragment.getActivity(), "This change requires restart. Do it now?", new jao(this));
        return true;
    }
}
