package defpackage;

import android.content.SharedPreferences;

/* renamed from: etm */
public final class etm {
    public final aaas a;
    public final acvx b;
    public final xhv c;
    public final xsc d;
    public final SharedPreferences e;
    public final albi f;

    public etm(aaas aaas, acvx acvx, xhv xhv, xsc xsc, SharedPreferences sharedPreferences, albi albi) {
        this.a = aaas;
        this.b = acvx;
        this.c = xhv;
        this.d = xsc;
        this.e = sharedPreferences;
        this.f = albi;
    }

    public static boolean a(azdi azdi, azdn azdn) {
        if ((azdi.a & 1) != 0) {
            azdm azdm = azdi.b;
            if (azdm == null) {
                azdm = azdm.h;
            }
            for (azdn azdn2 : new anyc(azdm.b, azdm.c)) {
                if (azdn == azdn2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static avkh a(azdi azdi) {
        if (azdi != null) {
            azdk azdk = azdi.f;
            if (azdk == null) {
                azdk = azdk.c;
            }
            aphj aphj = (azdk.a == 96140188 ? (avkh) azdk.b : avkh.e).c;
            if (aphj == null) {
                aphj = aphj.d;
            }
            if ((aphj.a & 1) != 0) {
                avkh avkh;
                azdk azdk2 = azdi.f;
                if (azdk2 == null) {
                    azdk2 = azdk.c;
                }
                if (azdk2.a == 96140188) {
                    avkh = (avkh) azdk2.b;
                } else {
                    avkh = avkh.e;
                }
                return avkh;
            }
        }
        return null;
    }
}
