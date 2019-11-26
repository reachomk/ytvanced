package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import com.google.android.apps.youtube.app.settings.DogfoodPrefsFragment;

/* renamed from: jai */
public final class jai implements OnPreferenceClickListener {
    private final /* synthetic */ DogfoodPrefsFragment a;

    public jai(DogfoodPrefsFragment dogfoodPrefsFragment) {
        this.a = dogfoodPrefsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        DogfoodPrefsFragment dogfoodPrefsFragment = this.a;
        String b = dogfoodPrefsFragment.b();
        ((ClipboardManager) dogfoodPrefsFragment.getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(b, b));
        return true;
    }
}
