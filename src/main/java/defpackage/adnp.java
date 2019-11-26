package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: adnp */
final class adnp implements adod {
    private final /* synthetic */ aikc a;

    adnp(aikc aikc) {
        this.a = aikc;
    }

    public final void a() {
    }

    public final void a(List list) {
        this.a.a(1, 0, (Collection) list);
        int size = list.size();
        aikc aikc = this.a;
        aikc.a(1, size, aikc.a(1) - size);
    }
}
