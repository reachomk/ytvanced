package defpackage;

/* renamed from: amwd */
public final class amwd {
    public static Object[] a(Iterable iterable, Object[] objArr) {
        int i = 0;
        for (Object obj : iterable) {
            int i2 = i + 1;
            objArr[i] = obj;
            i = i2;
        }
        return objArr;
    }

    static Object[] a(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            amwd.a(objArr[i], i);
        }
        return objArr;
    }

    static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append("at index ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
