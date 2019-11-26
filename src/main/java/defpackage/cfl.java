package defpackage;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

@Deprecated
/* renamed from: cfl */
public final class cfl {
    public final Context a;

    public cfl(Context context) {
        this.a = context;
    }

    public static cfj a(String str) {
        try {
            Class cls = Class.forName(str);
            Object obj = null;
            try {
                obj = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e) {
                cfl.a(cls, e);
            } catch (IllegalAccessException e2) {
                cfl.a(cls, e2);
            } catch (NoSuchMethodException e3) {
                cfl.a(cls, e3);
            } catch (InvocationTargetException e4) {
                cfl.a(cls, e4);
            }
            if (obj instanceof cfj) {
                return (cfj) obj;
            }
            String valueOf = String.valueOf(obj);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 44);
            stringBuilder.append("Expected instanceof GlideModule, but found: ");
            stringBuilder.append(valueOf);
            throw new RuntimeException(stringBuilder.toString());
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    private static void a(Class cls, Exception exception) {
        String valueOf = String.valueOf(cls);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 53);
        stringBuilder.append("Unable to instantiate GlideModule implementation for ");
        stringBuilder.append(valueOf);
        throw new RuntimeException(stringBuilder.toString(), exception);
    }
}
