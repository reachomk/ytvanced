package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: acyy */
public final class acyy {
    public static xgp a(int i, int i2) {
        return xgp.e().a(i).b(i2).a(false).a();
    }

    public static String a(acyw acyw, adby adby) {
        HashSet hashSet;
        Set set = acyw.a;
        if (set == null || set.isEmpty()) {
            hashSet = new HashSet();
        } else {
            hashSet = new HashSet(set);
        }
        if (!acyw.g) {
            hashSet.remove("ska");
        }
        if (adby.h()) {
            hashSet.add("que");
        }
        return !hashSet.isEmpty() ? TextUtils.join(",", hashSet) : null;
    }
}
