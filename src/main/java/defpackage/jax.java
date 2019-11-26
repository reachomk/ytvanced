package defpackage;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import com.google.android.youtube.R;

/* renamed from: jax */
public final /* synthetic */ class jax implements OnPreferenceChangeListener {
    private final ListPreference a;
    private final afib b;

    public jax(ListPreference listPreference, afib afib) {
        this.a = listPreference;
        this.b = afib;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        String string;
        ListPreference listPreference = this.a;
        afib afib = this.b;
        if (((Boolean) obj).booleanValue()) {
            string = afib.a.getString(R.string.pref_max_mobile_video_quality_value_480p);
        } else {
            string = afib.a.getString(R.string.pref_max_mobile_video_quality_value_auto);
        }
        listPreference.setValue(string);
        return true;
    }
}
