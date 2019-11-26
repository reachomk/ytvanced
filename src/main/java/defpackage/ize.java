package defpackage;

import android.os.Handler;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;
import com.google.android.youtube.R;

/* renamed from: ize */
public final /* synthetic */ class ize implements OnPreferenceClickListener {
    private final DeveloperPrefsFragment a;

    public ize(DeveloperPrefsFragment developerPrefsFragment) {
        this.a = developerPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        DeveloperPrefsFragment developerPrefsFragment = this.a;
        new Handler().postDelayed(izh.a, 20000);
        developerPrefsFragment.a((int) R.string.pref_developer_crash_app_toast, 0);
        developerPrefsFragment.getActivity().finish();
        return true;
    }
}
