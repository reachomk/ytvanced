package defpackage;

/* renamed from: cxa */
public final class cxa {
    public static cqq a(cmg cmg, cwh cwh, cwh cwh2) {
        cnh cnh = cmg.d;
        if (cnh == null) {
            return null;
        }
        cqq a = cpt.a(cmg, cnh, cnh.d());
        if (a != null) {
            String str;
            if (cwh != null) {
                str = cwh.e;
            }
            a.a();
            if (cwh2 != null) {
                str = cwh2.e;
            }
            a.a();
        }
        return a;
    }

    static String a(int i) {
        if (i == -1) {
            return "none";
        }
        if (i == 0) {
            return "setRoot";
        }
        if (i == 1) {
            return "setRootAsync";
        }
        if (i == 2) {
            return "updateState";
        }
        if (i == 3) {
            return "updateStateAsync";
        }
        throw new IllegalStateException("Unknown source");
    }
}
