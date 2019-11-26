package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

/* renamed from: alcu */
final /* synthetic */ class alcu implements OnPreferenceClickListener {
    private final alcs a;
    private final axgy b;

    alcu(alcs alcs, axgy axgy) {
        this.a = alcs;
        this.b = axgy;
    }

    public final boolean onPreferenceClick(Preference preference) {
        aldd aldd = new aldd(this.a, this.b);
        axgy axgy = aldd.a;
        if ((axgy.a & 128) != 0) {
            aaas aaas = aldd.b.d;
            apxu apxu = axgy.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
        return true;
    }
}
