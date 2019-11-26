package defpackage;

/* renamed from: alpt */
public final class alpt {
    public static String a(Object obj) {
        if (obj instanceof aqju) {
            return ((aqju) obj).d;
        }
        if (obj instanceof aqkc) {
            aqkc aqkc = (aqkc) obj;
            if ((aqkc.a & 2) != 0) {
                return aqkc.c;
            }
        }
        return null;
    }

    public static aygk b(Object obj) {
        aygk aygk;
        if (obj instanceof aqju) {
            aqju aqju = (aqju) obj;
            if ((aqju.a & 2) == 0) {
                return null;
            }
            aygk = aqju.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
            return aygk;
        }
        if (obj instanceof aqkc) {
            aqkc aqkc = (aqkc) obj;
            aqtk aqtk = aqkc.d;
            if (aqtk == null) {
                aqtk = aqtk.c;
            }
            if ((aqtk.a & 1) != 0) {
                aqtk aqtk2 = aqkc.d;
                if (aqtk2 == null) {
                    aqtk2 = aqtk.c;
                }
                aygk = aqtk2.b;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                return aygk;
            }
        }
        return null;
    }

    public static apxu c(Object obj) {
        if (obj instanceof aqkc) {
            aqkc aqkc = (aqkc) obj;
            if ((aqkc.a & 8) != 0) {
                apxu apxu = aqkc.e;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                return apxu;
            }
        }
        return null;
    }

    public static byte[] d(Object obj) {
        if (obj instanceof aqju) {
            return ((aqju) obj).f.d();
        }
        return obj instanceof aqkc ? ((aqkc) obj).g.d() : null;
    }

    public static boolean e(Object obj) {
        return (obj instanceof aqkc) || (obj instanceof aqju);
    }
}
