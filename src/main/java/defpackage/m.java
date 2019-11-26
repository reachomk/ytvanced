package defpackage;

import java.util.Iterator;

/* renamed from: m */
public final class m implements Iterator, o {
    private j a;
    private boolean b = true;
    private final /* synthetic */ i c;

    m(i iVar) {
        this.c = iVar;
    }

    public final void c(j jVar) {
        j jVar2 = this.a;
        if (jVar == jVar2) {
            this.a = jVar2.d;
            this.b = this.a == null;
        }
    }

    public final boolean hasNext() {
        if (this.b) {
            return this.c.b != null;
        } else {
            j jVar = this.a;
            return (jVar == null || jVar.c == null) ? false : true;
        }
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.b) {
            this.b = false;
            this.a = this.c.b;
        } else {
            j jVar = this.a;
            this.a = jVar != null ? jVar.c : null;
        }
        return this.a;
    }
}
