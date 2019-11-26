package defpackage;

import android.graphics.Canvas;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: bfi */
final class bfi {
    private static Method a;
    private static Method b;
    private static boolean c;

    static void a(Canvas canvas, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            if (VERSION.SDK_INT < 28) {
                if (!c) {
                    try {
                        Method declaredMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                        a = declaredMethod;
                        declaredMethod.setAccessible(true);
                        declaredMethod = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                        b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                    }
                    c = true;
                }
                if (z) {
                    try {
                        if (a != null) {
                            a.invoke(canvas, new Object[0]);
                        }
                    } catch (IllegalAccessException unused2) {
                        return;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e.getCause());
                    }
                } else if (b != null) {
                    b.invoke(canvas, new Object[0]);
                    return;
                }
            }
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
    }
}
