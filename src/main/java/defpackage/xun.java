package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: xun */
public final class xun {
    private static final Method a;

    public static boolean a(Context context, String str) {
        if (VERSION.SDK_INT >= 23) {
            Method method = a;
            if (method != null) {
                try {
                    if (((Integer) method.invoke(context, new Object[]{str})).intValue() != 0) {
                        return false;
                    }
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    xtl.a("Exception calling context.checkSelfPermissions().", e);
                }
            }
            return false;
        }
        return true;
    }

    static {
        Method declaredMethod;
        Class cls = Context.class;
        Class[] clsArr = new Class[]{String.class};
        String str = "checkSelfPermission";
        if (VERSION.SDK_INT >= 23) {
            try {
                declaredMethod = cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e) {
                throw new IllegalStateException("This is meant to be M, but methods aren't here.", e);
            }
        }
        declaredMethod = null;
        a = declaredMethod;
    }
}
