package defpackage;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;

/* renamed from: aaeq */
public final class aaeq {
    private final Map a;

    public aaeq(Map map) {
        this.a = map;
    }

    public final aadt a(String str, byte[] bArr) {
        long j = Long.MIN_VALUE;
        try {
            arfq arfq = (arfq) anxl.parseFrom(arfq.e, Base64.decode(URLDecoder.decode(str, "UTF-8"), 8));
            if ((arfq.a & 1) != 0) {
                long j2 = arfq.b;
                if (j2 > 0) {
                    j = j2;
                }
            }
        } catch (anyg | UnsupportedEncodingException | IllegalArgumentException unused) {
        }
        aaeb aaeb = (aaeb) this.a.get(Long.valueOf(j));
        if (aaeb != null) {
            return aaeb.a(bArr);
        }
        aaef aaef = new aaef();
        aaef.b = str;
        aaef.a = bArr;
        return aaef;
    }
}
