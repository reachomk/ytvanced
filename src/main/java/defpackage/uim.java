package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: uim */
public final class uim implements uij {
    private static final Charset e = Charset.forName("UTF-8");
    private static final List f = new ArrayList();
    public final Map a = new HashMap(10);
    public final Object b = new Object();
    public volatile uik c;
    private final String d;

    private uim(String str) {
        this.d = str;
    }

    public static synchronized uim a(String str) {
        synchronized (uim.class) {
            for (uim uim : f) {
                if (uim.d.equals(str)) {
                    return uim;
                }
            }
            uim uim2 = new uim(str);
            f.add(uim2);
            return uim2;
        }
    }

    public final uib a(String str, uig... uigArr) {
        synchronized (this.b) {
            uib uib = (uib) this.a.get(str);
            if (uib != null) {
                uib.a(uigArr);
                return uib;
            }
            uib = new uib(str, this, uigArr);
            this.a.put(uib.c, uib);
            return uib;
        }
    }

    public static long b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes(e));
            return ByteBuffer.wrap(instance.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public final uik a() {
        return this.c;
    }

    static {
        uim uim = new uim("");
    }
}
