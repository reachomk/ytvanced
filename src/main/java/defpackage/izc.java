package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;
import com.google.android.youtube.R;

/* renamed from: izc */
public final /* synthetic */ class izc implements OnPreferenceClickListener {
    private final DeveloperPrefsFragment a;

    public izc(DeveloperPrefsFragment developerPrefsFragment) {
        this.a = developerPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        DeveloperPrefsFragment developerPrefsFragment = this.a;
        developerPrefsFragment.f.d().b();
        developerPrefsFragment.a((int) R.string.pref_developer_remove_guide_success, 0);
        return true;
    }
}
