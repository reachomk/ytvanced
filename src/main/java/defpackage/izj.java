package defpackage;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;

/* renamed from: izj */
public final class izj implements OnPreferenceClickListener {
    private final /* synthetic */ DeveloperPrefsFragment a;

    public izj(DeveloperPrefsFragment developerPrefsFragment) {
        this.a = developerPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        new Bundle().putString("ancestor_classname", this.a.getActivity().getClass().getCanonicalName());
        DeveloperPrefsFragment developerPrefsFragment = this.a;
        egg egg = developerPrefsFragment.l;
        developerPrefsFragment.getActivity();
        egg.a();
        return true;
    }
}
