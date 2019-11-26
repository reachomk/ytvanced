package defpackage;

/* renamed from: bcwf */
public final class bcwf {
    public static final Object a = new bcwe();
    private static final Object b = new bcwh();

    public static Object a(Object obj) {
        return obj == null ? b : obj;
    }

    public static Object a(Throwable th) {
        return new bcwg(th);
    }

    public static boolean a(bcud bcud, Object obj) {
        if (obj == a) {
            bcud.bM_();
            return true;
        } else if (obj == b) {
            bcud.e_(null);
            return false;
        } else if (obj == null) {
            throw new IllegalArgumentException("The lite notification can not be null");
        } else if (obj.getClass() == bcwg.class) {
            bcud.a(((bcwg) obj).a);
            return true;
        } else {
            bcud.e_(obj);
            return false;
        }
    }

    public static boolean b(Object obj) {
        return obj == a;
    }

    public static boolean c(Object obj) {
        return obj instanceof bcwg;
    }

    public static boolean d(Object obj) {
        return (obj == null || (obj instanceof bcwg) || bcwf.b(obj)) ? false : true;
    }

    public static Object e(Object obj) {
        return obj == b ? null : obj;
    }

    public static Throwable f(Object obj) {
        return ((bcwg) obj).a;
    }
}
