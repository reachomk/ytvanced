package defpackage;

import java.util.Collection;

/* renamed from: agwz */
final /* synthetic */ class agwz implements xar {
    private final agwu a;

    agwz(agwu agwu) {
        this.a = agwu;
    }

    public final void accept(Object obj) {
        Collection<agqy> collection = (Collection) obj;
        agwh k = ((agwc) this.a.d.get()).b().k();
        for (agqy a : collection) {
            k.b(a.a(), 0);
        }
    }
}
