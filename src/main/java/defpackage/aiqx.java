package defpackage;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: aiqx */
public final class aiqx {
    private static final Map a = new ConcurrentHashMap();

    public static void a(aiqv aiqv) {
        a.put(aiqv.a(), aiqv);
    }

    public static aiqv a(apxu apxu) {
        for (aiqv aiqv : a.values()) {
            anxr access$000 = anxl.checkIsLite(aiqv.a());
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                return aiqv;
            }
        }
        return null;
    }

    public static String b(apxu apxu) {
        aiqv a = aiqx.a(apxu);
        if (a == null) {
            return "";
        }
        return a.a(apxu);
    }

    public static String c(apxu apxu) {
        aiqv a = aiqx.a(apxu);
        if (a == null) {
            return "";
        }
        return a.b(apxu);
    }

    public static boolean a(apxu apxu, apxu apxu2) {
        aiqv a = aiqx.a(apxu);
        if (a != null) {
            anxr access$000 = anxl.checkIsLite(a.a());
            apxu2.a(access$000);
            if (apxu2.h.a(access$000.d)) {
                return a.a(apxu, apxu2);
            }
        }
        return false;
    }

    public static boolean a(aiqq aiqq, aiqq aiqq2) {
        if (aiqq == aiqq2) {
            return true;
        }
        if (!(aiqq == null || aiqq2 == null)) {
            apxu apxu = aiqq.b;
            if (apxu != null) {
                apxu apxu2 = aiqq2.b;
                if (apxu2 != null) {
                    return aiqx.a(apxu, apxu2);
                }
            }
            if (aiqq.f() == null && aiqq2.f() == null && aiqq.l() == aiqq2.l() && aiqq.m() == aiqq2.m() && aiqq.j() == aiqq2.j() && TextUtils.equals(aiqq.c(), aiqq2.c())) {
                if (TextUtils.equals("", aiqq.c()) || Math.abs(aiqq.d() - aiqq2.d()) <= 1) {
                    return TextUtils.equals(aiqq.b(), aiqq2.b());
                }
            }
        }
        return false;
    }

    static {
        aiqx.a(new airn());
        aiqx.a(new airm());
        aiqx.a(new aiqo());
    }
}
