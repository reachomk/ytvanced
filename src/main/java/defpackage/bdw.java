package defpackage;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.youtube.R;

/* renamed from: bdw */
public final class bdw implements bdy {
    public static bdw a;

    public final /* synthetic */ CharSequence a(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(listPreference.e())) {
            return listPreference.e.getString(R.string.not_set);
        }
        return listPreference.e();
    }
}
