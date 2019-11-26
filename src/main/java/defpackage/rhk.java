package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: rhk */
final class rhk implements Iterator {
    private int a = -1;
    private boolean b;
    private Iterator c;
    private final /* synthetic */ rhb d;

    public final boolean hasNext() {
        if (this.a + 1 < this.d.a.size() || (!this.d.b.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (this.b) {
            this.b = false;
            this.d.d();
            if (this.a < this.d.a.size()) {
                rhb rhb = this.d;
                int i = this.a;
                this.a = i - 1;
                rhb.c(i);
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

    /* synthetic */ rhk(rhb rhb) {
        this.d = rhb;
    }
}
