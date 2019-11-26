package defpackage;

import android.text.TextUtils;

/* renamed from: uhv */
public final class uhv {
    public static boolean a(Object obj, Object obj2) {
        boolean equals;
        if (obj != null) {
            equals = obj.equals(obj2);
        } else if (obj2 == null) {
            return true;
        } else {
            equals = false;
        }
        return equals;
    }

    public static String a(String str, Object... objArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append('(');
        stringBuilder.append(TextUtils.join(",", objArr));
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
