package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.youtube.app.settings.DogfoodPrefsFragment;

/* renamed from: jaq */
public final class jaq implements OnPreferenceChangeListener {
    private final /* synthetic */ DogfoodPrefsFragment a;

    public jaq(DogfoodPrefsFragment dogfoodPrefsFragment) {
        this.a = dogfoodPrefsFragment;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        String replace = obj.toString().replace(' ', ',');
        boolean z = TextUtils.isEmpty(replace) || replace.trim().matches("\\d+(\\s*,\\s*\\d+)*");
        if (z) {
            preference.setSummary(DogfoodPrefsFragment.a(replace));
        } else {
            Toast.makeText(this.a.getActivity(), "Invalid Format: experiment ids not saved. Expected: 111111,111112,...", 1).show();
        }
        return z;
    }
}
