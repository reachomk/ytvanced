package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: adwz */
final /* synthetic */ class adwz implements addr {
    private final adxa a;
    private final adqf b;
    private final xci c;

    adwz(adxa adxa, adqf adqf, xci xci) {
        this.a = adxa;
        this.b = adqf;
        this.c = xci;
    }

    public final void a(adiq adiq) {
        adxa adxa = this.a;
        adqf adqf = this.b;
        xci xci = this.c;
        if (adqf.c() == null) {
            Map m = adiq.m();
            adxb adxb = null;
            if (m != null) {
                String str = "smartRemoteRequestedTime";
                if (m.containsKey(str)) {
                    String str2 = (String) m.get("screenId");
                    String str3 = (String) m.get(str);
                    if (!(TextUtils.isEmpty(str2) || TextUtils.isEmpty(str))) {
                        try {
                            adxb = Long.parseLong(str3);
                            adxb = new adxb(adiq, adxb);
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
            if (adxb != null && !adxa.a) {
                xci.d(new adxc(adxb.a, adxb.b));
            }
        }
    }
}
