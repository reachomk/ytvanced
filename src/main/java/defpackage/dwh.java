package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: dwh */
final class dwh extends dwf {
    private final LinkedHashSet a = new LinkedHashSet();

    dwh(bcaa bcaa, int i, boolean z, boolean z2, String str) {
        super(bcaa, i, z, z2, str);
    }

    public final void a(dwl dwl, String str, Object obj, boolean z) {
        super.a(dwl, str, obj, z);
        this.a.remove(dwl);
        this.a.add(dwl);
    }

    public final void a(dwl dwl) {
        super.a(dwl);
        this.a.remove(dwl);
    }

    public final void b(List list) {
        a(list);
        if (list.isEmpty() && !this.a.isEmpty()) {
            list.add((dwl) this.a.iterator().next());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        return this.a.size();
    }
}
