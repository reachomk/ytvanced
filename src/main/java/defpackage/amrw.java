package defpackage;

/* renamed from: amrw */
public final class amrw {
    public static void a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new amrv(amrl.a(str, objArr));
        }
    }

    public static void a(boolean z, String str, Object obj) {
        if (!z) {
            throw new amrv(amrl.a(str, obj));
        }
    }

    public static Object a(Object obj) {
        boolean z = false;
        Object[] objArr = new Object[0];
        if (obj != null) {
            z = true;
        }
        amrw.a(z, "expected a non-null reference", objArr);
        return obj;
    }
}
