package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.text.TextUtils;

/* renamed from: jae */
public final /* synthetic */ class jae implements OnPreferenceChangeListener {
    public static final OnPreferenceChangeListener a = new jae();

    private jae() {
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            preference.getEditor().remove(preference.getKey()).commit();
        }
        preference.setSummary(str);
        return true;
    }
}
