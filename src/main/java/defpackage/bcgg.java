package defpackage;

import android.text.TextUtils;

/* renamed from: bcgg */
public final class bcgg {
    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static String a(String str, Object obj) {
        bcgg.a((Object) str, obj);
        bcgg.a(TextUtils.isEmpty(str) ^ 1, obj);
        return str;
    }

    public static String b(String str, Object obj) {
        if (str != null) {
            bcgg.a(str, obj);
        }
        return str;
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }
}
