package defpackage;

import android.os.SystemClock;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.List;

/* renamed from: lhr */
final class lhr {
    public static final lhr a = new lhr(-1, amul.g());
    public final int b;
    public final amul c;
    public volatile List d;

    private lhr(int i, amul amul) {
        this.b = i;
        this.c = amul;
    }

    public static boolean a(int i, int i2, int i3) {
        return i3 == 4 && i != -1 && i < i2;
    }

    static lhr a(aikc aikc) {
        int e = aikc.e();
        int a = aikc.a(0);
        int max = Math.max(0, e - 3);
        a = Math.min(a, e + 4);
        amuo a2 = amul.a(a - max);
        for (int i = max; i < a; i++) {
            a2.c(((enm) aikc.a(0, i)).d());
        }
        return new lhr(e - max, a2.a());
    }

    static lhr a(lft lft, enl enl) {
        int size = lft.b.size();
        int i = lft.c;
        if (!lhr.a(i, size, lft.d)) {
            return a;
        }
        amul g;
        size = lft.b.size();
        if (size > 0) {
            amuo a = amul.a(size);
            int i2 = 0;
            while (i2 < size) {
                try {
                    a.c((apxu) anxl.parseFrom(apxu.d, ((lfv) lft.b.get(i2)).b, anxa.c()));
                    i2++;
                } catch (anyg unused) {
                    g = amul.g();
                }
            }
            g = a.a();
        } else {
            g = amul.g();
        }
        lhr lhr = new lhr(i, g);
        if (!lhr.c.isEmpty()) {
            synchronized (lhr.c) {
                amuo a2 = amul.a(lhr.c.size());
                for (int i3 = 0; i3 < lhr.c.size(); i3++) {
                    a2.c(enl.a((apxu) lhr.c.get(i3)));
                }
                lhr.d = a2.a();
            }
        }
        return lhr;
    }

    public static byte[] a(apxu apxu) {
        if (apxu != null) {
            anxp apxu2;
            try {
                apxu2 = apxu2.toByteArray();
                return apxu2;
            } catch (IllegalStateException e) {
                xtl.b("safeConvertToBytes: proto was mutated", e);
                SystemClock.sleep(10);
                try {
                    apxu2 = apxu2.toByteArray();
                    return apxu2;
                } catch (IllegalStateException e2) {
                    xtl.b("safeConvertToBytes: proto still mutated...", e2);
                    try {
                        Object obj;
                        anxr access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                        apxu2.a(access$000);
                        Object b = apxu2.h.b(access$000.d);
                        if (b == null) {
                            obj = access$000.b;
                        } else {
                            obj = access$000.a(b);
                        }
                        azje azje = (azje) obj;
                        if (azje != null) {
                            apxx apxx = (apxx) ((anxo) airn.a(azje.b, azje.c, azje.d, azje.g).toBuilder());
                            if ((apxu2.a & 1) != 0) {
                                apxx.a(apxu2.b);
                            }
                            azjd azjd = (azjd) ((anxo) ((azje) apxx.b(WatchEndpointOuterClass.watchEndpoint)).toBuilder());
                            if (azjd != null) {
                                azjd.c(azje.j);
                                apxx.a(WatchEndpointOuterClass.watchEndpoint, (azje) ((anxl) azjd.build()));
                            }
                            return ((apxu) ((anxl) apxx.build())).toByteArray();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return null;
    }
}
