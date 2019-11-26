package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

/* renamed from: ztm */
final /* synthetic */ class ztm implements OnPreferenceClickListener {
    private final ztk a;

    ztm(ztk ztk) {
        this.a = ztk;
    }

    public final boolean onPreferenceClick(Preference preference) {
        apxu apxu;
        ztk ztk = this.a;
        aaas aaas = ztk.b;
        arqh arqh = ztk.a;
        if (arqh.f) {
            apxu = arqh.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = arqh.g;
            if (apxu == null) {
                apxu = apxu.d;
            }
        }
        aaas.a(apxu, amur.a("accountLinkChangeListener", new ztr(ztk)));
        return true;
    }
}
