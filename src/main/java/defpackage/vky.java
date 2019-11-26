package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: vky */
final class vky {
    public final List a = new ArrayList();
    public int b;

    public vky() {
        this.a.add(vtg.a);
        this.b = -1;
    }

    public final vso a(int i) {
        return (i < 0 || i >= this.a.size()) ? null : (vso) this.a.get(i);
    }

    public final void b(int i) {
        List list = this.a;
        list.removeAll(list.subList(i, list.size()));
    }
}
