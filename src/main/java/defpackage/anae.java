package defpackage;

import java.lang.reflect.InvocationTargetException;

/* renamed from: anae */
public final class anae {
    private static final anag a = anag.a();

    public static StackTraceElement a(Class cls, Throwable th) {
        anad.a(cls, "target");
        anad.a(th, "throwable");
        StackTraceElement[] stackTrace = a == null ? th.getStackTrace() : null;
        int i = 1;
        Object obj = null;
        while (true) {
            try {
                StackTraceElement a;
                if (a != null) {
                    a = a.a(th, i);
                } else {
                    a = stackTrace[i];
                }
                if (cls.getName().equals(a.getClassName())) {
                    obj = 1;
                } else if (obj != null) {
                    return a;
                }
                i++;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static StackTraceElement[] a(Class cls, Throwable th, int i) {
        anad.a(cls, "target");
        anad.a(th, "throwable");
        if (i > 0 || i == -1) {
            int intValue;
            StackTraceElement[] stackTraceElementArr;
            anag anag = a;
            int i2 = 1;
            if (anag != null) {
                try {
                    intValue = ((Integer) anag.b.invoke(anag.a, new Object[]{th})).intValue();
                    stackTraceElementArr = null;
                } catch (InvocationTargetException e) {
                    if (e.getCause() instanceof RuntimeException) {
                        throw ((RuntimeException) e.getCause());
                    } else if (e.getCause() instanceof Error) {
                        throw ((Error) e.getCause());
                    } else {
                        throw new RuntimeException(e.getCause());
                    }
                } catch (IllegalAccessException e2) {
                    throw new AssertionError(e2);
                }
            }
            stackTraceElementArr = th.getStackTrace();
            intValue = stackTraceElementArr.length;
            Object obj = null;
            for (int i3 = 0; i3 < intValue; i3++) {
                StackTraceElement a;
                anag anag2 = a;
                if (anag2 != null) {
                    a = anag2.a(th, i3);
                } else {
                    a = stackTraceElementArr[i3];
                }
                if (cls.getName().equals(a.getClassName())) {
                    obj = 1;
                } else if (obj != null) {
                    int i4 = intValue - i3;
                    if (i > 0 && i < i4) {
                        i4 = i;
                    }
                    StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i4];
                    stackTraceElementArr2[0] = a;
                    while (i2 < i4) {
                        StackTraceElement a2;
                        anag = a;
                        if (anag != null) {
                            a2 = anag.a(th, i3 + i2);
                        } else {
                            a2 = stackTraceElementArr[i3 + i2];
                        }
                        stackTraceElementArr2[i2] = a2;
                        i2++;
                    }
                    return stackTraceElementArr2;
                }
            }
            return new StackTraceElement[0];
        }
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("invalid maximum depth: ");
        stringBuilder.append(i);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
