package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

/* renamed from: xcf */
final class xcf implements Iterator {
    private final Iterator a;
    private LinkedList b;
    private Iterator c;

    public final boolean hasNext() {
        boolean z = true;
        if (!this.a.hasNext()) {
            Iterator it = this.c;
            if (it != null) {
                return it.hasNext() ? z : false;
            } else {
                z = false;
            }
        }
    }

    public final Object next() {
        while (true) {
            Iterator it = this.c;
            if (it != null && it.hasNext()) {
                return this.c.next();
            }
            this.b = (LinkedList) ((Entry) this.a.next()).getValue();
            this.c = this.b.iterator();
        }
    }

    public final void remove() {
        this.c.remove();
        if (this.b.isEmpty()) {
            this.a.remove();
        }
    }

    /* synthetic */ xcf(xcg xcg) {
        this.a = xcg.a.entrySet().iterator();
    }
}
