package defpackage;

@Deprecated
/* renamed from: cvu */
public class cvu {
    private final cvt a;

    protected cvu(cvt cvt) {
        this.a = cvt;
    }

    public static Object a(cvu cvu) {
        return cvu.a.a(cvu);
    }

    public static boolean a(cvu cvu, cvu cvu2) {
        if (cvu != null) {
            cvt cvt = cvu.a;
            if (cvu2 != null && cvu.getClass() == cvu2.getClass()) {
                return cvt.a(cvu, cvu2);
            }
            return true;
        } else if (cvu2 == null) {
            return false;
        } else {
            return true;
        }
    }
}
