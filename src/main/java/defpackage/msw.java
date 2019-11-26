package defpackage;

import android.os.Handler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: msw */
public final class msw {
    public final Handler a;
    private final Map b = Collections.synchronizedMap(new HashMap());

    public msw(Handler handler) {
        this.a = handler;
    }

    public final synchronized void a(ngn[] ngnArr) {
        Set<msx> set = (Set) this.b.get(ngnArr[0].a());
        if (set != null) {
            for (msx aI_ : set) {
                aI_.aI_();
            }
        }
    }

    public final synchronized void a(ngn ngn) {
        Set<msx> set = (Set) this.b.get(ngn.a());
        if (set != null) {
            for (msx a : set) {
                a.a(ngn);
            }
        }
    }

    public final synchronized void a(ngq ngq, msx msx) {
        Set set = (Set) this.b.get(ngq);
        if (set == null) {
            set = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
            this.b.put(ngq, set);
        }
        set.add(msx);
    }
}
