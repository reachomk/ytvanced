package defpackage;

import java.util.HashSet;

/* renamed from: nzt */
public final class nzt {
    private static final HashSet a = new HashSet();
    private static String b = "goog.exo.core";

    public static synchronized String a() {
        String str;
        synchronized (nzt.class) {
            str = b;
        }
        return str;
    }

    public static synchronized void a(String str) {
        synchronized (nzt.class) {
            if (a.add(str)) {
                String str2 = b;
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 2) + String.valueOf(str).length());
                stringBuilder.append(str2);
                stringBuilder.append(", ");
                stringBuilder.append(str);
                b = stringBuilder.toString();
            }
        }
    }
}
