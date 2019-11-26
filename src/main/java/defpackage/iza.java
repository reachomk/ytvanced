package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;
import com.google.android.youtube.R;

/* renamed from: iza */
public final /* synthetic */ class iza implements OnPreferenceClickListener {
    private final DeveloperPrefsFragment a;

    public iza(DeveloperPrefsFragment developerPrefsFragment) {
        this.a = developerPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        DeveloperPrefsFragment developerPrefsFragment = this.a;
        developerPrefsFragment.a.edit().remove("offline_stream_snackbar_last_shown").remove("offline_stream_snackbar_impressions").apply();
        developerPrefsFragment.a((int) R.string.pref_developer_reset_offline_snackbar_caps_success, 0);
        return true;
    }
}
