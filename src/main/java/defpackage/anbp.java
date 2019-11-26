package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/* renamed from: anbp */
public final class anbp implements anbr, anbz, Serializable {
    private static final HashMap d = new HashMap();
    private static final HashMap e = new HashMap();
    private static boolean f = false;
    public final int a;

    anbp(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof anbz) && this.a == ((anbz) obj).a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 31;
    }

    public final String toString() {
        Class cls = anbp.class;
        synchronized (d) {
            if (f) {
            } else {
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    if (cls.equals(field.getType())) {
                        if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
                            try {
                                anbp anbp = (anbp) field.get(null);
                                d.put(new anbs(anbp.a), anbp);
                                e.put(anbp, field);
                            } catch (IllegalAccessException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
                f = true;
            }
        }
        return ((Field) e.get(this)).getName();
    }
}
