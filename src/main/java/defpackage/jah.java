package defpackage;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;

/* renamed from: jah */
public final class jah implements OnPreferenceChangeListener {
    private final /* synthetic */ zj a;

    public jah(zj zjVar) {
        this.a = zjVar;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        ((ListPreference) preference).setSummary((CharSequence) this.a.get(obj.toString()));
        return true;
    }
}
