package defpackage;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* renamed from: adly */
public final class adly implements adlv {
    public static final String a;
    private final xgq b;
    private final adlz c;

    public adly(xgq xgq, adlz adlz) {
        this.b = xgq;
        this.c = adlz;
    }

    public final Map a(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return Collections.emptyMap();
        }
        xhg b = xhc.b(String.valueOf(this.c.a()).concat("get_lounge_token_batch"));
        try {
            b.c = xhb.a(Collections.singletonMap("screen_ids", TextUtils.join(",", collection)), "ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
        }
        xhc a = b.a();
        adma adma = new adma(a.b());
        aebj.a(this.b, a, adma);
        return adma.a;
    }

    static {
        String valueOf = String.valueOf(adly.class.getCanonicalName());
        String str = "MDX.";
        a = xtl.b(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }
}
