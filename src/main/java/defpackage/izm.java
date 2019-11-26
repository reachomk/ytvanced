package defpackage;

import android.content.SharedPreferences.Editor;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;

/* renamed from: izm */
public final class izm implements OnPreferenceClickListener {
    private final /* synthetic */ DeveloperPrefsFragment a;

    public izm(DeveloperPrefsFragment developerPrefsFragment) {
        this.a = developerPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        Editor edit = this.a.a.edit();
        edit.putInt("MdxAutoCastCancelCount", 0);
        edit.apply();
        return true;
    }
}
