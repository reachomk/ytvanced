package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: alsr */
public final class alsr implements alss {
    private final bcaa a;
    private final Collection b = new HashSet();
    private boolean c;

    public alsr(bcaa bcaa) {
        this.a = bcaa;
    }

    public final void a() {
        alrw alrw = (alrw) this.a.get();
        if (!this.b.isEmpty()) {
            for (alrz a : this.b) {
                alrw.a(a);
            }
        }
        alrw.a();
        this.c = true;
        this.b.clear();
    }

    public final void b() {
        if (this.c) {
            ((alrw) this.a.get()).b();
        }
    }

    public final void c() {
        if (this.c) {
            ((alrw) this.a.get()).c();
        }
    }

    public final boolean d() {
        return this.c && ((alrw) this.a.get()).d();
    }

    public final List e() {
        if (this.c) {
            return ((alrw) this.a.get()).e();
        }
        return Collections.emptyList();
    }

    public final alte f() {
        return this.c ? ((alrw) this.a.get()).g() : null;
    }

    public final Future a(String str, String str2) {
        if (this.c) {
            return ((alrw) this.a.get()).a(str, str2);
        }
        afsx a = afsx.a();
        a.a(null);
        return a;
    }
}
