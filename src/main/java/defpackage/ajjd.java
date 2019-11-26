package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ajjd */
public final class ajjd implements afqj {
    private final List a = new ArrayList();
    private final List b = new ArrayList();

    public ajjd() {
        a(0, ajiy.a);
    }

    public final ajjd a(long j, ajiy ajiy) {
        if (!this.a.isEmpty()) {
            List list = this.a;
            if (j < ((Long) list.get(list.size() - 1)).longValue()) {
                xtl.d("subtitle settings are not given in non-decreasing start time order");
            }
        }
        this.a.add(Long.valueOf(j));
        this.b.add(ajiy);
        return this;
    }

    /* renamed from: a */
    public final ajja b() {
        return new ajja(this.a, this.b);
    }
}
