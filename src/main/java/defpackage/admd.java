package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.Collections;

/* renamed from: admd */
public final class admd implements adlv {
    public static final String a;
    private final xgq b;
    private final adlz c;

    public admd(xgq xgq, adlz adlz) {
        this.b = xgq;
        this.c = adlz;
    }

    public final adio a(adiy adiy) {
        if (adiy == null) {
            return null;
        }
        xhg b = xhc.b(String.valueOf(this.c.a()).concat("get_screen"));
        try {
            b.c = xhb.a(Collections.singletonMap("pairing_code", adiy.a), "ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
        }
        xhc a = b.a();
        admg admg = new admg(a.b());
        aebj.a(this.b, a, admg);
        return admg.a;
    }

    static {
        String valueOf = String.valueOf(admd.class.getCanonicalName());
        String str = "MDX.";
        a = xtl.b(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }
}
