package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;

/* renamed from: izy */
public final class izy implements OnPreferenceClickListener {
    public final /* synthetic */ DeveloperPrefsFragment a;

    public izy(DeveloperPrefsFragment developerPrefsFragment) {
        this.a = developerPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        this.a.c.execute(new jab(this));
        return true;
    }
}
