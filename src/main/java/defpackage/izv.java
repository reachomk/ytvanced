package defpackage;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;
import com.google.android.apps.youtube.app.settings.developer.DebugOnlineAdActivity;

/* renamed from: izv */
public final class izv implements OnPreferenceClickListener {
    private final /* synthetic */ DeveloperPrefsFragment a;

    public izv(DeveloperPrefsFragment developerPrefsFragment) {
        this.a = developerPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        Intent intent = new Intent(this.a.getActivity(), DebugOnlineAdActivity.class);
        intent.putExtra("ancestor_classname", this.a.getActivity().getClass().getCanonicalName());
        this.a.startActivity(intent);
        return true;
    }
}
