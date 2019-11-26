package defpackage;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DeveloperPrefsFragment;
import com.google.android.libraries.youtube.upload.developer.DebugUploadActivity;

/* renamed from: izs */
public final class izs implements OnPreferenceClickListener {
    private final /* synthetic */ DeveloperPrefsFragment a;

    public izs(DeveloperPrefsFragment developerPrefsFragment) {
        this.a = developerPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        Intent intent = new Intent(this.a.getActivity(), DebugUploadActivity.class);
        intent.putExtra("ancestor_classname", this.a.getActivity().getClass().getCanonicalName());
        this.a.startActivity(intent);
        return true;
    }
}
