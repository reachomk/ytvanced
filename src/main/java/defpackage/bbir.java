package defpackage;

import java.util.ServiceConfigurationError;

/* renamed from: bbir */
public final class bbir {
    public static Object a(Class cls, Class cls2) {
        try {
            cls = cls.asSubclass(cls2).getConstructor(new Class[0]).newInstance(new Object[0]);
            return cls;
        } catch (Exception e) {
            String name = cls.getName();
            StringBuilder stringBuilder = new StringBuilder(name.length() + 36);
            stringBuilder.append("Provider ");
            stringBuilder.append(name);
            stringBuilder.append(" could not be instantiated.");
            throw new ServiceConfigurationError(stringBuilder.toString(), e);
        }
    }
}
