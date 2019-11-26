package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: cuy */
public final class cuy {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    private cuy() {
    }

    public static void a(cvd cvd, cvd cvd2, String str) {
        if (cvd.b.remove(cvd2)) {
            Map map = cvd2.a;
            if (map == null || map.remove(str) == null) {
                String valueOf = String.valueOf(str);
                str = "Tried to remove non-existent input with name: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                throw new RuntimeException(valueOf);
            }
            return;
        }
        throw new RuntimeException("Tried to remove non-existent input!");
    }

    /* synthetic */ cuy(byte b) {
    }
}
