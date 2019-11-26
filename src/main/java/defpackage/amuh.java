package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: amuh */
public abstract class amuh extends AbstractCollection implements Serializable {
    private static final Object[] a = new Object[0];

    amuh() {
    }

    /* Access modifiers changed, original: 0000 */
    public int a(Object[] objArr, int i) {
        throw null;
    }

    /* renamed from: a */
    public abstract amxo iterator();

    /* Access modifiers changed, original: 0000 */
    public Object[] b() {
        return null;
    }

    public abstract boolean contains(Object obj);

    public amul e() {
        throw null;
    }

    public abstract boolean f();

    public final Object[] toArray() {
        return toArray(a);
    }

    public final Object[] toArray(Object[] objArr) {
        amqw.a((Object) objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] b = b();
            if (b != null) {
                return Arrays.copyOfRange(b, c(), d(), objArr.getClass());
            }
            objArr = amwf.a(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        a(objArr, 0);
        return objArr;
    }

    /* Access modifiers changed, original: 0000 */
    public int c() {
        throw new UnsupportedOperationException();
    }

    /* Access modifiers changed, original: 0000 */
    public int d() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* Access modifiers changed, original: 0000 */
    public Object writeReplace() {
        return new amup(toArray());
    }
}
