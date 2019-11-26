package defpackage;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.android.youtube.R;

/* renamed from: bdv */
public final class bdv implements bdy {
    public static bdv a;

    public final /* synthetic */ CharSequence a(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.e.getString(R.string.not_set);
        }
        return null;
    }
}
