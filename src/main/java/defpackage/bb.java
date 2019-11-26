package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: bb */
public final class bb extends bd {
    public static bb a;
    private final Application b;

    public bb(Application application) {
        this.b = application;
    }

    public final az a(Class cls) {
        StringBuilder stringBuilder;
        String str = "Cannot create an instance of ";
        if (!n.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            return (az) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.b});
        } catch (NoSuchMethodException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(cls);
            throw new RuntimeException(stringBuilder.toString(), e);
        } catch (IllegalAccessException e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(cls);
            throw new RuntimeException(stringBuilder.toString(), e2);
        } catch (InstantiationException e3) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(cls);
            throw new RuntimeException(stringBuilder.toString(), e3);
        } catch (InvocationTargetException e4) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(cls);
            throw new RuntimeException(stringBuilder.toString(), e4);
        }
    }
}
