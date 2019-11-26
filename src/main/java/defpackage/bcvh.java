package defpackage;

import java.util.HashSet;

/* renamed from: bcvh */
public final class bcvh extends RuntimeException {
    public static final long serialVersionUID = -569558213262703934L;

    public static Throwable a(Throwable th, Object obj) {
        int i;
        int i2 = 0;
        RuntimeException runtimeException = th;
        while (runtimeException.getCause() != null) {
            i = i2 + 1;
            if (i2 >= 25) {
                runtimeException = new RuntimeException("Stack too deep to get final cause");
                break;
            }
            runtimeException = runtimeException.getCause();
            i2 = i;
        }
        if ((runtimeException instanceof bcvg) && ((bcvg) runtimeException).a == obj) {
            return th;
        }
        bcvg bcvg = new bcvg(obj);
        HashSet hashSet = new HashSet();
        i2 = 0;
        Throwable th2 = th;
        while (th2.getCause() != null) {
            i = i2 + 1;
            if (i2 >= 25) {
                break;
            }
            th2 = th2.getCause();
            if (!hashSet.contains(th2.getCause())) {
                hashSet.add(th2.getCause());
                i2 = i;
            }
        }
        try {
            th2.initCause(bcvg);
        } catch (Throwable unused) {
        }
        return th;
    }
}
