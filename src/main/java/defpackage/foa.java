package defpackage;

import android.text.TextUtils;

/* renamed from: foa */
public final /* synthetic */ class foa {
    public static boolean a(fob fob, fob fob2) {
        if (fob2 == null) {
            return false;
        }
        apxu d;
        apxu c;
        if (fob.c() == null) {
            d = fob.d();
        } else {
            d = fob.c();
        }
        if (fob2.c() != null) {
            c = fob2.c();
        } else {
            c = fob2.d();
        }
        if (d == null || c == null) {
            return TextUtils.equals(fob.b(), fob2.b());
        }
        return aiqx.a(d, c);
    }

    public static boolean a(fob fob) {
        return fob.j() == 4;
    }

    public static boolean b(fob fob) {
        return fob.j() == 5;
    }

    public static boolean c(fob fob) {
        return fob.g() || fob.h();
    }
}
