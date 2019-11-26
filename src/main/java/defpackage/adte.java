package defpackage;

import android.net.Uri;
import java.util.Locale;

/* renamed from: adte */
final class adte implements addz {
    private final /* synthetic */ adsw a;

    adte(adsw adsw) {
        this.a = adsw;
    }

    public final void a(adio adio) {
        xtl.c(adsw.e, String.format(Locale.US, "Found corresponding cloud screen %s for DIAL device %s", new Object[]{adio, this.a.s}));
        this.a.a(adio);
    }

    public final void a(int i) {
        adpr adpr;
        if (i == 0) {
            adpr = adpr.LAUNCH_FAIL_DEVICE_BUSY;
        } else if (i == 2) {
            adpr = adpr.LAUNCH_FAIL_TIMEOUT;
        } else if (i == 3) {
            adpr = adpr.LAUNCH_FAIL_TIMEOUT;
        } else if (i != 4) {
            adpr = adpr.UNKNOWN;
        } else {
            adpr = adpr.NETWORK;
        }
        String str = adsw.e;
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = this.a.s;
        int i2 = 1;
        objArr[1] = adpr;
        xtl.a(str, String.format(locale, "Could not find cloud screen corresponding to DIAL device %s, %s", objArr));
        adsw adsw = this.a;
        if (i == 0) {
            i2 = 13;
        } else if (i == 2) {
            i2 = 14;
        } else if (i == 3) {
            i2 = 8;
        } else if (i == 4) {
            i2 = 5;
        }
        adsw.a(adpr, i2);
    }

    public final void a(Uri uri) {
        String str = adsw.e;
        String valueOf = String.valueOf(this.a.s);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 48);
        stringBuilder.append("Successfully launched YouTube TV on DIAL device ");
        stringBuilder.append(valueOf);
        xtl.c(str, stringBuilder.toString());
        this.a.r = uri;
    }
}
