package defpackage;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: acxa */
public final class acxa {
    public final Map a = new ConcurrentHashMap();

    public final apxu a(apxu apxu) {
        String b = acxa.b(apxu);
        if (b == null) {
            return apxu;
        }
        b = (String) this.a.remove(b);
        if (b == null) {
            return apxu;
        }
        avjh avjh;
        anxr access$000 = anxl.checkIsLite(avjd.b);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            Object obj;
            access$000 = anxl.checkIsLite(avjd.b);
            apxu.a(access$000);
            Object b2 = apxu.h.b(access$000.d);
            if (b2 == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(b2);
            }
            avjh = (avjh) ((anxo) ((avjf) obj).toBuilder());
        } else {
            avjh = (avjh) avjf.h.createBuilder();
        }
        avjh.a(b);
        apxx apxx = (apxx) ((anxo) apxu.toBuilder());
        apxx.a(avjd.b, (avjf) ((anxl) avjh.build()));
        return (apxu) ((anxl) apxx.build());
    }

    public static String b(apxu apxu) {
        if (apxu.b.b() > 0) {
            return new String(apxu.b.d(), Charset.defaultCharset());
        }
        anxr access$000 = anxl.checkIsLite(avjd.b);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(avjd.b);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            avjf avjf = (avjf) b;
            if ((avjf.a & 2) != 0) {
                int i = avjf.d;
                int i2 = avjf.c;
                StringBuilder stringBuilder = new StringBuilder(23);
                stringBuilder.append(i2);
                stringBuilder.append(":");
                stringBuilder.append(i);
                return stringBuilder.toString();
            }
        }
        return null;
    }
}
