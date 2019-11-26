package defpackage;

/* renamed from: bbow */
public final class bbow {
    public static final bbnu a = new bbov();

    public static int a(int i, int i2) {
        if (i < i2) {
            i = -1;
        } else if (i > i2) {
            return 1;
        } else {
            i = 0;
        }
        return i;
    }

    public static int a(long j, long j2) {
        int i;
        if (j < j2) {
            i = -1;
        } else if (j > j2) {
            return 1;
        } else {
            i = 0;
        }
        return i;
    }

    public static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static boolean a(Object obj, Object obj2) {
        boolean z = true;
        if (obj != obj2) {
            if (obj != null) {
                return obj.equals(obj2) ? z : false;
            } else {
                z = false;
            }
        }
    }

    public static int a(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" > 0 required but it was ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
