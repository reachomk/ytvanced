package defpackage;

import android.preference.Preference;
import android.preference.Preference.OnPreferenceChangeListener;
import java.util.List;

/* renamed from: uwb */
final /* synthetic */ class uwb implements OnPreferenceChangeListener {
    private final uwc a;
    private final axha b;
    private final List c;
    private final uwi d;

    uwb(uwc uwc, axha axha, List list, uwi uwi) {
        this.a = uwc;
        this.b = axha;
        this.c = list;
        this.d = uwi;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        uwc uwc = this.a;
        axha axha = this.b;
        List list = this.c;
        uwi uwi = this.d;
        return new uwf(uwc, uwc.b, axha, list, uwi, uwc.d).a(uwi.getValue(), obj);
    }
}
