package defpackage;

import android.net.Uri;

/* renamed from: evk */
public final class evk extends gsb {
    public final Uri a;
    public final int b;

    public static Uri a(apmi apmi) {
        if (apmi == null) {
            return null;
        }
        String str = apmi.d;
        boolean z = true;
        if (apmi.j.size() != 0 || (apmi.k.size() <= 0 && apmi.l.size() <= 0)) {
            z = false;
        }
        return evk.a(str, z);
    }

    public static Uri a(String str, boolean z) {
        String str2 = !z ? "channel/list/view" : "channel/list/edit";
        return akmx.a(4, str2, str);
    }

    public evk(apmi apmi) {
        int i = 1;
        if (!(apmi == null || (apmi.a & 256) == 0)) {
            apme apme = apmi.i;
            if (apme == null) {
                apme = apme.c;
            }
            int a = apmg.a(apme.b);
            if (a != 0) {
                i = a;
            }
        }
        this(apmi, i);
    }

    public evk(apmi apmi, int i) {
        super(apmi, apmi.m);
        this.b = i;
        this.a = evk.a(apmi);
    }
}
