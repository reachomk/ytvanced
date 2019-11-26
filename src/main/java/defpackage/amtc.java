package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: amtc */
final class amtc extends AbstractSet {
    private final /* synthetic */ amsw a;

    amtc(amsw amsw) {
        this.a = amsw;
    }

    public final int size() {
        return this.a.d;
    }

    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public final boolean remove(Object obj) {
        int a = this.a.a(obj);
        if (a == -1) {
            return false;
        }
        this.a.a(a);
        return true;
    }

    public final Iterator iterator() {
        return new amsv(this.a);
    }

    public final void clear() {
        this.a.clear();
    }
}
