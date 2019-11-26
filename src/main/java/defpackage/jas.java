package defpackage;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DogfoodPrefsFragment;
import com.google.android.apps.youtube.app.settings.developer.DebugOnlineAdActivity;

/* renamed from: jas */
public final class jas implements OnPreferenceClickListener {
    private final /* synthetic */ DogfoodPrefsFragment a;

    public jas(DogfoodPrefsFragment dogfoodPrefsFragment) {
        this.a = dogfoodPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        Intent intent = new Intent(this.a.getActivity(), DebugOnlineAdActivity.class);
        intent.putExtra("ancestor_classname", this.a.getActivity().getClass().getCanonicalName());
        this.a.startActivity(intent);
        return true;
    }
}
