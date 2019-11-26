package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: rhu */
public final class rhu extends AbstractList implements RandomAccess, rfs {
    public final rfs a;

    public rhu(rfs rfs) {
        this.a = rfs;
    }

    public final rfs e() {
        return this;
    }

    public final Object b(int i) {
        return this.a.b(i);
    }

    public final int size() {
        return this.a.size();
    }

    public final void a(rdg rdg) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator listIterator(int i) {
        return new rht(this, i);
    }

    public final Iterator iterator() {
        return new rhw(this);
    }

    public final List d() {
        return this.a.d();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }
}
