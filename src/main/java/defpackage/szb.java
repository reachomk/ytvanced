package defpackage;

import android.text.TextUtils;

/* renamed from: szb */
public final class szb {
    public static Object a(aoca aoca, aobz aobz) {
        Object extension;
        synchronized (aoca) {
            extension = aoca.getExtension(aobz);
        }
        return extension;
    }

    public static String a(bdho bdho) {
        if (bdho != null && bdho.hasExtension(bdhh.a)) {
            bdhh bdhh = (bdhh) bdho.getExtension(bdhh.a);
            if (!TextUtils.isEmpty(bdhh.b)) {
                String str = bdhh.b;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 2);
                stringBuilder.append("[");
                stringBuilder.append(str);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        }
        return "[Unknown element]";
    }
}
