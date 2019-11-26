package defpackage;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/* renamed from: rzw */
public final class rzw {
    public static Set a(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        for (Class declaredFields : clsArr) {
            for (Field field : declaredFields.getDeclaredFields()) {
                if (field.isAnnotationPresent(cls) && field.getType().equals(String.class)) {
                    try {
                        hashSet.add((String) field.get(null));
                    } catch (IllegalAccessException e) {
                        throw new IllegalArgumentException(e);
                    }
                }
            }
        }
        return hashSet;
    }

    public static rzx a(Iterable iterable) {
        return new sab(iterable);
    }
}
