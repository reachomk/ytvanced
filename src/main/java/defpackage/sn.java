package defpackage;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: sn */
public final class sn extends sk {
    /* Access modifiers changed, original: protected|final */
    public final Typeface a(Object obj) {
        try {
            Array.set(Array.newInstance(this.a, 1), 0, obj);
            Method method = this.b;
            r3 = new Object[4];
            Integer valueOf = Integer.valueOf(-1);
            r3[2] = valueOf;
            r3[3] = valueOf;
            return (Typeface) method.invoke(null, r3);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Method a(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
