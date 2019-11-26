package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;

/* renamed from: amoc */
public final class amoc {
    public static final List a = new ArrayList();
    public static final Runnable b = new amoe();
    private static final uhn c = new uhn("tiktok_systrace");
    private static final ThreadLocal d = new amob();

    static amnv a() {
        return ((amog) d.get()).b;
    }

    static amnv b() {
        amnv a = amoc.a();
        return a == null ? new amnw() : a;
    }

    static amnv a(amnv amnv) {
        return amoc.a(amnv, true);
    }

    public static amnv a(amnv amnv, boolean z) {
        amog amog = (amog) d.get();
        amnv amnv2 = amog.b;
        if (amnv2 == amnv) {
            return amnv;
        }
        if ("true".equals(uhx.a(c.a, "false"))) {
            if (amnv2 != null) {
                if (amnv != null) {
                    if (amnv2.a() == amnv) {
                        Trace.endSection();
                    } else if (amnv2 == amnv.a()) {
                        amoc.a(amnv.b());
                    }
                }
                amoc.d(amnv2);
            }
            if (amnv != null) {
                amoc.c(amnv);
            }
        }
        if (amnv != null) {
            amnv.c();
        }
        if (amnv2 != null) {
            amnv2.c();
        }
        amog.b = amnv;
        if (amog.a && z) {
            a.add(amnv);
            uia.c().post(b);
        }
        return amnv2;
    }

    private static void a(String str) {
        if (str.length() > 127) {
            str.substring(0, 127);
        }
    }

    private static void c(amnv amnv) {
        amnv.a();
        amoc.a(amnv.b());
    }

    private static void d(amnv amnv) {
        amnv.a();
    }

    static String b(amnv amnv) {
        amnv.a();
        return amnv.b();
    }

    static {
        amod amod = new amod();
    }
}
