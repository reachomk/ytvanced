package defpackage;

/* renamed from: bbit */
public final class bbit {
    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            StringBuilder stringBuilder = new StringBuilder(str.length() + 16);
            Object obj = null;
            int i = 0;
            while (obj <= null) {
                int indexOf = str.indexOf("%s", 0);
                if (indexOf == -1) {
                    break;
                }
                stringBuilder.append(str, 0, indexOf);
                stringBuilder.append(objArr[0]);
                i = indexOf + 2;
                obj = 1;
            }
            stringBuilder.append(str, i, str.length());
            if (obj <= null) {
                stringBuilder.append(" [");
                stringBuilder.append(objArr[0]);
                stringBuilder.append(']');
            }
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static boolean b(Object obj, Object obj2) {
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
}
