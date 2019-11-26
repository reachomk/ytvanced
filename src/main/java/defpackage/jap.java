package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.youtube.app.settings.DogfoodPrefsFragment;

/* renamed from: jap */
public final class jap implements OnPreferenceChangeListener {
    private final /* synthetic */ DogfoodPrefsFragment a;

    public jap(DogfoodPrefsFragment dogfoodPrefsFragment) {
        this.a = dogfoodPrefsFragment;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        String replace = obj.toString().replace(" ", "");
        boolean z = TextUtils.isEmpty(replace) || replace.trim().matches("\\s*.*\\s*=\\s*.*\\s*(,\\s*.*\\s*=\\s*.*\\s*)*");
        if (z) {
            preference.setSummary(DogfoodPrefsFragment.b(replace));
        } else {
            Toast.makeText(this.a.getActivity(), "Invalid Format: experiment ids not saved. Expected: experiment_flag=true,...", 1).show();
        }
        return z;
    }
}
