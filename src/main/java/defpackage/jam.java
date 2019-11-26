package defpackage;

import android.content.Context;
import android.os.Handler;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.google.android.apps.youtube.app.settings.DogfoodPrefsFragment;

/* renamed from: jam */
public final class jam implements OnPreferenceChangeListener {
    private final /* synthetic */ DogfoodPrefsFragment a;

    public jam(DogfoodPrefsFragment dogfoodPrefsFragment) {
        this.a = dogfoodPrefsFragment;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (this.a.g.d() == 1) {
            String obj2 = editTextPreference.getEditText().getText().toString();
            DogfoodPrefsFragment dogfoodPrefsFragment = this.a;
            Handler handler = dogfoodPrefsFragment.c;
            Context activity = dogfoodPrefsFragment.getActivity();
            String valueOf = String.valueOf(obj2);
            String str = "Sending debug command: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            jca.a(handler, activity, valueOf, true);
            this.a.g.c().g(obj2);
            return true;
        }
        DogfoodPrefsFragment dogfoodPrefsFragment2 = this.a;
        jca.a(dogfoodPrefsFragment2.c, dogfoodPrefsFragment2.getActivity(), "Must connect to a screen before sending debug commands.", true);
        return false;
    }
}
