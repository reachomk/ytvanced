package defpackage;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: aaer */
public final class aaer {
    public static String a(int i, String str) {
        amqw.b(i > 0);
        amqw.a((Object) str);
        arft arft = (arft) arfq.e.createBuilder();
        arft.copyOnWrite();
        arfq arfq = (arfq) arft.instance;
        arfq.a |= 2;
        arfq.c = 2;
        arft.copyOnWrite();
        arfq = (arfq) arft.instance;
        arfq.a = 1 | arfq.a;
        arfq.b = (long) i;
        anvu a = anvu.a(str);
        arft.copyOnWrite();
        arfq arfq2 = (arfq) arft.instance;
        arfq2.a |= 4;
        arfq2.d = a;
        try {
            return URLEncoder.encode(Base64.encodeToString(((anxl) arft.build()).toByteArray(), 10), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
