package defpackage;

import java.util.Iterator;

/* renamed from: ubv */
public final class ubv implements ubt {
    private final Iterator a;
    private ubt b = c();

    public ubv(Iterator it) {
        this.a = it;
    }

    public final boolean a() {
        while (true) {
            ubt ubt = this.b;
            if (ubt != null && !ubt.a()) {
                this.b = c();
            }
        }
        return this.b != null;
    }

    private final ubt c() {
        return this.a.hasNext() ? (ubt) this.a.next() : null;
    }

    public final Object b() {
        return this.b.b();
    }
}
