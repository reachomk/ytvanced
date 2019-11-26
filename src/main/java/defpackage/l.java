package defpackage;

import java.util.Iterator;

/* renamed from: l */
abstract class l implements Iterator, o {
    private j a;
    private j b;

    l(j jVar, j jVar2) {
        this.a = jVar2;
        this.b = jVar;
    }

    public abstract j a(j jVar);

    public abstract j b(j jVar);

    public final boolean hasNext() {
        return this.b != null;
    }

    public final void c(j jVar) {
        if (this.a == jVar && jVar == this.b) {
            this.b = null;
            this.a = null;
        }
        j jVar2 = this.a;
        if (jVar2 == jVar) {
            this.a = b(jVar2);
        }
        if (this.b == jVar) {
            this.b = a();
        }
    }

    private final j a() {
        j jVar = this.b;
        j jVar2 = this.a;
        return (jVar == jVar2 || jVar2 == null) ? null : a(jVar);
    }

    public final /* synthetic */ Object next() {
        j jVar = this.b;
        this.b = a();
        return jVar;
    }
}
