package defpackage;

/* renamed from: uhy */
public final class uhy {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(uhy.a(str, objArr));
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(uhy.a(str, objArr));
        }
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    public static int a(int i, int i2) {
        if (i >= 0 && i < i2) {
            return i;
        }
        String a;
        String str = "index";
        if (i < 0) {
            a = uhy.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            StringBuilder stringBuilder = new StringBuilder(26);
            stringBuilder.append("negative size: ");
            stringBuilder.append(i2);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            a = uhy.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(a);
    }

    public static int b(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        String a;
        String str = "index";
        if (i < 0) {
            a = uhy.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else {
            a = uhy.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(a);
    }

    private static String a(String str, Object... objArr) {
        int length;
        str = String.valueOf(str);
        StringBuilder stringBuilder = new StringBuilder(str.length() + (objArr.length << 4));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length) {
                break;
            }
            int indexOf = str.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            stringBuilder.append(str.substring(i2, indexOf));
            i2 = i + 1;
            stringBuilder.append(objArr[i]);
            int i3 = i2;
            i2 = indexOf + 2;
            i = i3;
        }
        stringBuilder.append(str.substring(i2));
        if (i < length) {
            stringBuilder.append(" [");
            int i4 = i + 1;
            stringBuilder.append(objArr[i]);
            while (i4 < objArr.length) {
                stringBuilder.append(", ");
                i = i4 + 1;
                stringBuilder.append(objArr[i4]);
                i4 = i;
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }
}
