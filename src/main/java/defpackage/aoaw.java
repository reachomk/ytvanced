package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: aoaw */
public final class aoaw extends AbstractList implements anyo, RandomAccess {
    public final anyo a;

    public aoaw(anyo anyo) {
        this.a = anyo;
    }

    public final anyo e() {
        return this;
    }

    public final Object b(int i) {
        return this.a.b(i);
    }

    public final int size() {
        return this.a.size();
    }

    public final void a(anvu anvu) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator listIterator(int i) {
        return new aoav(this, i);
    }

    public final Iterator iterator() {
        return new aoay(this);
    }

    public final List d() {
        return this.a.d();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }
}
