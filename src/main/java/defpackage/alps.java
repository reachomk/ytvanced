package defpackage;

/* renamed from: alps */
public final class alps {
    public static String a(aylg aylg) {
        aylk aylk = aylg.b;
        if (aylk == null) {
            aylk = aylk.d;
        }
        aqke aqke = aylk.b;
        if (aqke == null) {
            aqke = aqke.f;
        }
        aylk aylk2;
        if ((aqke.a & 2) == 0) {
            aylk = aylg.b;
            if (aylk == null) {
                aylk = aylk.d;
            }
            aqkg aqkg = aylk.c;
            if (aqkg == null) {
                aqkg = aqkg.h;
            }
            if ((aqkg.a & 2) == 0) {
                return null;
            }
            aylk2 = aylg.b;
            if (aylk2 == null) {
                aylk2 = aylk.d;
            }
            aqkg aqkg2 = aylk2.c;
            if (aqkg2 == null) {
                aqkg2 = aqkg.h;
            }
            return aqkg2.c;
        }
        aylk2 = aylg.b;
        if (aylk2 == null) {
            aylk2 = aylk.d;
        }
        aqke aqke2 = aylk2.b;
        if (aqke2 == null) {
            aqke2 = aqke.f;
        }
        return aqke2.c;
    }

    public static Object b(aylg aylg) {
        aylk aylk = aylg.b;
        if (aylk == null) {
            aylk = aylk.d;
        }
        aylk aylk2;
        Object obj;
        if ((aylk.a & 1) == 0) {
            aylk = aylg.b;
            if (aylk == null) {
                aylk = aylk.d;
            }
            if ((aylk.a & 2) == 0) {
                return null;
            }
            aylk2 = aylg.b;
            if (aylk2 == null) {
                aylk2 = aylk.d;
            }
            obj = aylk2.c;
            if (obj == null) {
                obj = aqkg.h;
            }
            return obj;
        }
        aylk2 = aylg.b;
        if (aylk2 == null) {
            aylk2 = aylk.d;
        }
        obj = aylk2.b;
        if (obj == null) {
            obj = aqke.f;
        }
        return obj;
    }

    public static Object c(aylg aylg) {
        aqjs aqjs = aylg.c;
        if (aqjs == null) {
            aqjs = aqjs.d;
        }
        aqjs aqjs2;
        Object obj;
        if ((aqjs.a & 1) == 0) {
            aqjs = aylg.c;
            if (aqjs == null) {
                aqjs = aqjs.d;
            }
            if ((aqjs.a & 2) == 0) {
                return null;
            }
            aqjs2 = aylg.c;
            if (aqjs2 == null) {
                aqjs2 = aqjs.d;
            }
            obj = aqjs2.c;
            if (obj == null) {
                obj = aqkc.h;
            }
            return obj;
        }
        aqjs2 = aylg.c;
        if (aqjs2 == null) {
            aqjs2 = aqjs.d;
        }
        obj = aqjs2.b;
        if (obj == null) {
            obj = aqju.g;
        }
        return obj;
    }
}
