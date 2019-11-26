package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* renamed from: amcg */
final class amcg implements OnSharedPreferenceChangeListener {
    private final /* synthetic */ amce a;

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (xay.UPLOAD_NETWORK_POLICY.equals(str)) {
            this.a.d();
        }
    }

    /* synthetic */ amcg(amce amce) {
        this.a = amce;
    }
}
