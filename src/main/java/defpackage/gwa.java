package defpackage;

import android.text.TextUtils;

/* renamed from: gwa */
public final class gwa {
    public static String a(asic asic) {
        if (!(asic == null || asic.d.size() == 0)) {
            for (asie asie : asic.d) {
                int a = asig.a(asie.b);
                if (a != 0 && a == 5) {
                    for (atwo atwo : asie.c) {
                        if (TextUtils.equals(atwo.d, "context")) {
                            return atwo.b == 2 ? (String) atwo.c : "";
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }
}
