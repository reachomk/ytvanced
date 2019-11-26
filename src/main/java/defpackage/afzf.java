package defpackage;

import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: afzf */
public final class afzf implements afzi {
    private volatile afzi a = null;

    public final synchronized void a(afzi afzi) {
        this.a = afzi;
    }

    private final synchronized List f() {
        if (this.a != null) {
            return (List) this.a.get();
        }
        return Collections.emptyList();
    }

    public final synchronized List a() {
        if (this.a != null) {
            return this.a.a();
        }
        return Collections.emptyList();
    }

    public final agpv b() {
        return this.a != null ? this.a.b() : null;
    }

    public final File c() {
        return this.a != null ? this.a.c() : null;
    }

    public final agpv d() {
        return this.a != null ? this.a.d() : null;
    }

    public final agpv e() {
        return this.a != null ? this.a.e() : null;
    }

    public final /* synthetic */ Object get() {
        return f();
    }
}
