package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: pek */
public final class pek extends pgs {
    private static List b = new ArrayList();

    public pek(pgd pgd) {
        super(pgd);
        HashSet hashSet = new HashSet();
    }

    public static void a() {
        synchronized (pek.class) {
            if (b != null) {
                for (Runnable run : b) {
                    run.run();
                }
                b = null;
            }
        }
    }
}
