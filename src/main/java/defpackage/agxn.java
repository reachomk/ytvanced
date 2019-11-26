package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* renamed from: agxn */
final class agxn implements OnSharedPreferenceChangeListener {
    private final /* synthetic */ agxl a;

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(this.a.c())) {
            this.a.e();
        }
    }

    /* synthetic */ agxn(agxl agxl) {
        this.a = agxl;
    }
}
