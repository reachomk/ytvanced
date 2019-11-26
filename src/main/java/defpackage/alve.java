package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

/* renamed from: alve */
final /* synthetic */ class alve implements OnPreferenceClickListener {
    public static final OnPreferenceClickListener a = new alve();

    private alve() {
    }

    public final boolean onPreferenceClick(Preference preference) {
        try {
            long j = alvf.a;
            Thread.sleep(alvf.a);
        } catch (InterruptedException unused) {
        }
        return true;
    }
}
