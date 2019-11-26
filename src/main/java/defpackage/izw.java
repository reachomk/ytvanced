package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;

/* renamed from: izw */
public final class izw implements OnPreferenceClickListener {
    public final /* synthetic */ DeveloperPrefsFragment a;

    public izw(DeveloperPrefsFragment developerPrefsFragment) {
        this.a = developerPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        this.a.c.execute(new izz(this));
        return true;
    }
}
