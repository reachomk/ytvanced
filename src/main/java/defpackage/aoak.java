package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: aoak */
final class aoak implements Iterator {
    private int a = -1;
    private boolean b;
    private Iterator c;
    private final /* synthetic */ aoae d;

    public final boolean hasNext() {
        boolean z = true;
        if (this.a + 1 >= this.d.a.size()) {
            if (this.d.b.isEmpty()) {
                z = false;
            } else if (a().hasNext()) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    public final void remove() {
        if (this.b) {
            this.b = false;
            this.d.d();
            if (this.a < this.d.a.size()) {
                aoae aoae = this.d;
                int i = this.a;
                this.a = i - 1;
                aoae.c(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private final Iterator a() {
        if (this.c == null) {
            this.c = this.d.b.entrySet().iterator();
        }
        return this.c;
    }

    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        if (i < this.d.a.size()) {
            return (Entry) this.d.a.get(this.a);
        }
        return (Entry) a().next();
    }

    /* synthetic */ aoak(aoae aoae) {
        this.d = aoae;
    }
}
