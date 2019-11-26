package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* renamed from: ixh */
public final class ixh implements OnSharedPreferenceChangeListener {
    public final bapu a;

    public ixh(bapu bapu) {
        this.a = bapu;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2 = "enable_on_device_suggest";
        String str3 = "enable_on_device_suggest_counterfactual_logging";
        if (!sharedPreferences.getBoolean(str2, false) && !sharedPreferences.getBoolean(str3, false)) {
            return;
        }
        if ("latest_on_device_suggest_index_url".equals(str) || str2.equals(str) || str3.equals(str)) {
            ((abob) this.a.get()).a();
        }
    }
}
