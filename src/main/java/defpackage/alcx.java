package defpackage;

import android.content.Context;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;

/* renamed from: alcx */
final /* synthetic */ class alcx implements OnPreferenceClickListener {
    private final alcs a;
    private final axgi b;

    alcx(alcs alcs, axgi axgi) {
        this.a = alcs;
        this.b = axgi;
    }

    public final boolean onPreferenceClick(Preference preference) {
        aldb aldb = new aldb(this.a, this.b);
        axgo axgo = aldb.a.f;
        if (axgo == null) {
            axgo = axgo.c;
        }
        if (axgo.a != 64099105) {
            axgi axgi = aldb.a;
            if ((axgi.a & 16) != 0) {
                aaas aaas = aldb.b.d;
                apxu apxu = axgi.e;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
        } else {
            aqhy aqhy;
            Context context = aldb.b.c;
            axgo axgo2 = aldb.a.f;
            if (axgo2 == null) {
                axgo2 = axgo.c;
            }
            if (axgo2.a == 64099105) {
                aqhy = (aqhy) axgo2.b;
            } else {
                aqhy = aqhy.q;
            }
            alcs alcs = aldb.b;
            akcq.a(context, aqhy, alcs.d, alcs.e, null);
        }
        return true;
    }
}
