package defpackage;

import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import android.text.TextUtils;

/* renamed from: jar */
public final class jar implements OnPreferenceChangeListener {
    public final boolean onPreferenceChange(Preference preference, Object obj) {
        String str = (String) obj;
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(str)) {
            editTextPreference.setSummary(abmm.b(str));
            return true;
        }
        abmp a = abmm.a(str);
        if (TextUtils.isEmpty(a.a)) {
            return false;
        }
        try {
            if (Integer.parseInt(a.b) <= 0) {
                return false;
            }
            String str2 = a.a;
            str = a.b;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length());
            stringBuilder.append(str2);
            stringBuilder.append('=');
            stringBuilder.append(str);
            str = stringBuilder.toString();
            editTextPreference.setSummary(abmm.b(str));
            editTextPreference.setText(str);
            return false;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
