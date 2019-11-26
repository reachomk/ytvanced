package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: amta */
final class amta extends AbstractSet {
    private final /* synthetic */ amsw a;

    amta(amsw amsw) {
        this.a = amsw;
    }

    public final int size() {
        return this.a.d;
    }

    public final void clear() {
        this.a.clear();
    }

    public final Iterator iterator() {
        return new amsy(this.a);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            int a = this.a.a(entry.getKey());
            if (a != -1 && amqq.a(this.a.b[a], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final boolean remove(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            int a = this.a.a(entry.getKey());
            if (a != -1 && amqq.a(this.a.b[a], entry.getValue())) {
                this.a.a(a);
                return true;
            }
        }
        return false;
    }
}
