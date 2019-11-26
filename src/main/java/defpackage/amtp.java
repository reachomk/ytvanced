package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: amtp */
public abstract class amtp extends amtr implements Collection {
    protected amtp() {
    }

    public abstract Collection b();

    /* Access modifiers changed, original: protected|bridge|synthetic */
    public /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    public final Iterator iterator() {
        return b().iterator();
    }

    public final int size() {
        return b().size();
    }

    public final boolean removeAll(Collection collection) {
        return b().removeAll(collection);
    }

    public final boolean isEmpty() {
        return b().isEmpty();
    }

    public boolean contains(Object obj) {
        return b().contains(obj);
    }

    public boolean add(Object obj) {
        return b().add(obj);
    }

    public boolean remove(Object obj) {
        return b().remove(obj);
    }

    public final boolean containsAll(Collection collection) {
        return b().containsAll(collection);
    }

    public boolean addAll(Collection collection) {
        return b().addAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        return b().retainAll(collection);
    }

    public final void clear() {
        b().clear();
    }

    public final Object[] toArray() {
        return b().toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return b().toArray(objArr);
    }
}
