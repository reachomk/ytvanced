package defpackage;

import java.lang.reflect.InvocationTargetException;

/* renamed from: nr */
public class nr {
    private static final aac a = new aac();

    private static Class d(ClassLoader classLoader, String str) {
        Class cls = (Class) a.get(str);
        if (cls != null) {
            return cls;
        }
        Class cls2 = Class.forName(str, false, classLoader);
        a.put(str, cls2);
        return cls2;
    }

    static boolean a(ClassLoader classLoader, String str) {
        try {
            return nf.class.isAssignableFrom(nr.d(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class b(ClassLoader classLoader, String str) {
        StringBuilder stringBuilder;
        String str2 = "Unable to instantiate fragment ";
        try {
            return nr.d(classLoader, str);
        } catch (ClassNotFoundException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(str);
            stringBuilder.append(": make sure class name exists");
            throw new nj(stringBuilder.toString(), e);
        } catch (ClassCastException e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(str);
            stringBuilder.append(": make sure class is a valid subclass of Fragment");
            throw new nj(stringBuilder.toString(), e2);
        }
    }

    public nf c(ClassLoader classLoader, String str) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        String str2 = ": make sure class name exists, is public, and has an empty constructor that is public";
        String str3 = "Unable to instantiate fragment ";
        try {
            return (nf) nr.b(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (InstantiationException e) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str3);
            stringBuilder.append(str);
            stringBuilder.append(str2);
            throw new nj(stringBuilder.toString(), e);
        } catch (IllegalAccessException e2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str3);
            stringBuilder.append(str);
            stringBuilder.append(str2);
            throw new nj(stringBuilder.toString(), e2);
        } catch (NoSuchMethodException e3) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str3);
            stringBuilder2.append(str);
            stringBuilder2.append(": could not find Fragment constructor");
            throw new nj(stringBuilder2.toString(), e3);
        } catch (InvocationTargetException e4) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str3);
            stringBuilder2.append(str);
            stringBuilder2.append(": calling Fragment constructor caused an exception");
            throw new nj(stringBuilder2.toString(), e4);
        }
    }
}
