package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

/* renamed from: uei */
final /* synthetic */ class uei implements OnSharedPreferenceChangeListener {
    private final uej a;

    uei(uej uej) {
        this.a = uej;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        uej uej = this.a;
        synchronized (uej.a) {
            uej.b = null;
            uee.a();
        }
        synchronized (uej) {
            for (udx a : uej.c) {
                a.a();
            }
        }
    }
}
