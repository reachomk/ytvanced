package defpackage;

import java.nio.charset.Charset;

/* renamed from: aocd */
public final class aocd {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Object b = new Object();

    public static boolean a(Object[] objArr, Object[] objArr2) {
        int length = objArr != null ? objArr.length : 0;
        int length2 = objArr2 != null ? objArr2.length : 0;
        int i = 0;
        int i2 = 0;
        while (true) {
            Object obj = i < length ? null : 1;
            if (i >= length || objArr[i] != null) {
                while (i2 < length2 && objArr2[i2] == null) {
                    i2++;
                }
                Object obj2 = i2 < length2 ? null : 1;
                if (obj != null && i2 >= length2) {
                    return true;
                }
                if (obj != obj2 || !objArr[i].equals(objArr2[i2])) {
                    return false;
                }
                i++;
                i2++;
            } else {
                i++;
            }
        }
        return false;
    }

    public static int a(Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode();
            }
        }
        return i;
    }

    public static void a(aoca aoca, aoca aoca2) {
        aocb aocb = aoca.unknownFieldData;
        if (aocb != null) {
            aoca2.unknownFieldData = (aocb) aocb.clone();
        }
    }

    static {
        Charset.forName("ISO-8859-1");
    }
}
