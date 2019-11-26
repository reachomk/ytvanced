package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: ajzv */
public final class ajzv {
    public static ajzw a(axak axak) {
        if (axak == null) {
            return null;
        }
        try {
            return (ajzw) aocf.mergeFrom(new ajzw(), axak.toByteArray());
        } catch (aocg e) {
            throw new AssertionError(e);
        }
    }

    public static List a(List list) {
        if (list == null) {
            return null;
        }
        amuo amuo = new amuo();
        for (axak a : list) {
            amuo.c(ajzv.a(a));
        }
        return amuo.a();
    }

    public static axak a(ajzw ajzw) {
        if (ajzw == null) {
            return null;
        }
        try {
            return (axak) anxl.parseFrom(axak.a, aocf.toByteArray(ajzw), anxa.c());
        } catch (anyg e) {
            throw new AssertionError(e);
        }
    }

    public static aocf a(anze anze, Class cls) {
        if (anze == null) {
            return null;
        }
        try {
            return aocf.mergeFrom((aocf) cls.getConstructor(new Class[0]).newInstance(new Object[0]), anze.toByteArray());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException(e3);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException(e4);
        } catch (aocg e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static anze a(aocf aocf, anzq anzq) {
        if (aocf == null) {
            return null;
        }
        try {
            return (anze) anzq.a(aocf.toByteArray(aocf), anxa.c());
        } catch (anyg e) {
            throw new IllegalStateException(e);
        }
    }

    public static Object b(ajzw ajzw) {
        return ajzw != null ? ajzw.a : null;
    }

    public static anze b(axak axak) {
        if (axak == null || axak.equals((anxl) axak.getDefaultInstanceForType())) {
            return null;
        }
        anxr access$000 = anxl.checkIsLite(anxa.c().a(axak.a, anzg.a(axak)));
        axak.a(access$000);
        Object b = axak.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        return (anze) b;
    }

    public static Object a(ajzw ajzw, Class cls) {
        Object obj = ajzw != null ? ajzw.a : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    public static boolean b(ajzw ajzw, Class cls) {
        Object obj = ajzw != null ? ajzw.a : null;
        return obj != null && obj.getClass() == cls;
    }

    public static void a(ajzw ajzw, anwy anwy, anze anze) {
        if (ajzw != null && anze != null) {
            ajzw.a(anwy.a(), anze);
        }
    }
}
