package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: vfi */
final class vfi implements Serializable, Comparator {
    public static final long serialVersionUID = 1;

    private vfi() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int a;
        aogi aogi = (aogi) obj;
        aogi aogi2 = (aogi) obj2;
        int a2 = aogh.a(aogi.d);
        int i = 1;
        if (a2 == 0 || a2 != 2) {
            a2 = aogh.a(aogi2.d);
            if (a2 == 0 || a2 != 2) {
                a2 = aogh.a(aogi.d);
                if (a2 != 0 && a2 == 4) {
                    a = aogh.a(aogi2.d);
                    if (a != 0 && a == 4) {
                        return 0;
                    }
                }
                a2 = aogh.a(aogi2.d);
                if (a2 == 0 || a2 != 4) {
                    return aogi.b - aogi2.b;
                }
                i = -1;
            }
        }
        a = aogh.a(aogi.d);
        return (a == 0 || a != 2) ? i : -1;
    }

    /* synthetic */ vfi(byte b) {
    }
}
