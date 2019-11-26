package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: acva */
public final class acva {
    protected static void a(acul acul, acty acty, asnf asnf, afpt afpt) {
        anyd<asnh> anyd = asnf.c;
        if (anyd != null) {
            acul.g = new HashMap();
            for (asnh asnh : anyd) {
                if (asnh != null) {
                    argx argx = asnh.b;
                    if (argx == null) {
                        argx = argx.f;
                    }
                    if (!argx.c) {
                        long a = asnh.c > 0 ? acul.b.a() + TimeUnit.MINUTES.toMillis(asnh.c) : Long.MAX_VALUE;
                        argx argx2 = asnh.b;
                        if (argx2 == null) {
                            argx2 = argx.f;
                        }
                        asmy a2 = asmy.a(argx2.b);
                        if (a2 != null) {
                            acul.g.put(a2, Long.valueOf(a));
                        }
                    }
                }
            }
        }
        if (acul.a()) {
            String str = asnf.d;
            if (afpt != null && !TextUtils.isEmpty(str)) {
                acty.a(afpt);
                acty.a.edit().putString(acty.c(afpt), str).apply();
            }
        }
    }
}
