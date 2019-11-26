package defpackage;

import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: bhr */
final class bhr {
    public static Method a;
    public static boolean b;

    static bho a(ViewGroup viewGroup) {
        return new bhp(viewGroup);
    }

    static void a(ViewGroup viewGroup, boolean z) {
        if (!bhq.b) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                bhq.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            bhq.b = true;
        }
        if (bhq.a != null) {
            try {
                bhq.a.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }
}
