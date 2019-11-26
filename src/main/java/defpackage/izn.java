package defpackage;

import android.content.SharedPreferences.Editor;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;

/* renamed from: izn */
public final class izn implements OnPreferenceClickListener {
    private final /* synthetic */ DeveloperPrefsFragment a;

    public izn(DeveloperPrefsFragment developerPrefsFragment) {
        this.a = developerPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        Editor edit = this.a.a.edit();
        edit.putLong("MdxAutoCastCancelCoolDown", 0);
        edit.apply();
        return true;
    }
}
