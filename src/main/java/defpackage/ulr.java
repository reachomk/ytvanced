package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: ulr */
public final class ulr extends ulk {
    private final List a = new ArrayList();

    public ulr(ulo ulo) {
        super(ulo);
    }

    public final void a(ulh ulh) {
        ulh a = ulh.a(a());
        while (a.g() > 8) {
            ulk a2 = ull.a(ulo.a(a));
            a2.a(a);
            this.a.add(a2);
        }
        a.b(a.g());
        ulh.a(a);
    }

    public final List b() {
        return this.a;
    }
}
