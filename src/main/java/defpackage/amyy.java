package defpackage;

import java.lang.reflect.InvocationTargetException;

/* renamed from: amyy */
final class amyy {
    public static final amyv a = amyy.a(amyv.d);

    private static amyv a(String[] strArr) {
        amyv a;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            a = amza.a();
        } catch (NoClassDefFoundError unused) {
            a = null;
        }
        if (a != null) {
            return a;
        }
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                return (amyv) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable th) {
                Object th2 = th;
                if (th2 instanceof InvocationTargetException) {
                    th2 = th2.getCause();
                }
                stringBuilder.append(10);
                stringBuilder.append(str);
                stringBuilder.append(": ");
                stringBuilder.append(th2);
                i++;
            }
        }
        throw new IllegalStateException(stringBuilder.insert(0, "No logging platforms found:").toString());
    }
}
