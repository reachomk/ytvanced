package defpackage;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: bhx */
class bhx extends bhu {
    private static Method a;
    private static boolean b;
    private static Method c;
    private static boolean d;
    private static Method e;
    private static boolean f;

    bhx() {
    }

    public final void a(View view, Matrix matrix) {
        Method declaredMethod;
        if (!b) {
            try {
                declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            b = true;
        }
        declaredMethod = a;
        if (declaredMethod != null) {
            try {
                declaredMethod.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    public final void b(View view, Matrix matrix) {
        Method declaredMethod;
        if (!d) {
            try {
                declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            d = true;
        }
        declaredMethod = c;
        if (declaredMethod != null) {
            try {
                declaredMethod.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    public final void c(View view, Matrix matrix) {
        Method declaredMethod;
        if (!f) {
            try {
                declaredMethod = View.class.getDeclaredMethod("setAnimationMatrix", new Class[]{Matrix.class});
                e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f = true;
        }
        declaredMethod = e;
        if (declaredMethod != null) {
            try {
                declaredMethod.invoke(view, new Object[]{matrix});
            } catch (InvocationTargetException unused2) {
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
