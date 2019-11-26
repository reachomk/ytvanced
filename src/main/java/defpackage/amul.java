package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: amul */
public abstract class amul extends amuh implements List, RandomAccess {
    private static final amxn a = new amun(amwj.a, 0);

    public static amul g() {
        return amwj.a;
    }

    public final amul e() {
        return this;
    }

    public static amul a(Object obj) {
        return amul.c(obj);
    }

    public static amul a(Object obj, Object obj2) {
        return amul.c(obj, obj2);
    }

    public static amul a(Object obj, Object obj2, Object obj3) {
        return amul.c(obj, obj2, obj3);
    }

    public static amul a(Object obj, Object obj2, Object obj3, Object obj4) {
        return amul.c(obj, obj2, obj3, obj4);
    }

    public static amul a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return amul.c(obj, obj2, obj3, obj4, obj5);
    }

    public static amul a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return amul.c(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static amul a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return amul.c(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public static amul a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        return amul.c(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @SafeVarargs
    public static amul a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        Object obj13 = objArr;
        amqw.a(true, (Object) "the total number of elements must fit in an int");
        int length = obj13.length;
        Object[] objArr2 = new Object[(length + 12)];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(obj13, 0, objArr2, 12, length);
        return amul.c(objArr2);
    }

    public static amul a(Iterable iterable) {
        amqw.a((Object) iterable);
        if (iterable instanceof Collection) {
            return amul.a((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return amwj.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return amul.a(next);
        }
        amuo amuo = new amuo();
        amuo.c(next);
        amuo.a(it);
        return amuo.a();
    }

    public static amul a(Collection collection) {
        if (!(collection instanceof amuh)) {
            return amul.c(collection.toArray());
        }
        amul e = ((amuh) collection).e();
        if (e.f()) {
            e = amul.b(e.toArray());
        }
        return e;
    }

    public static amul a(Object[] objArr) {
        if (objArr.length != 0) {
            return amul.c((Object[]) objArr.clone());
        }
        return amwj.a;
    }

    public static amul a(Comparator comparator, Iterable iterable) {
        amqw.a((Object) comparator);
        Object[] toArray = amux.a(iterable).toArray();
        amwd.a(toArray);
        Arrays.sort(toArray, comparator);
        return amul.b(toArray);
    }

    private static amul c(Object... objArr) {
        return amul.b(amwd.a(objArr));
    }

    static amul b(Object[] objArr) {
        return amul.b(objArr, objArr.length);
    }

    static amul b(Object[] objArr, int i) {
        if (i != 0) {
            return new amwj(objArr, i);
        }
        return amwj.a;
    }

    amul() {
    }

    public final amxo a() {
        return (amxn) listIterator();
    }

    /* renamed from: h */
    public final amxn listIterator() {
        return b(0);
    }

    private final amxn b(int i) {
        amqw.b(i, size());
        if (isEmpty()) {
            return a;
        }
        return new amun(this, i);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* renamed from: a */
    public amul subList(int i, int i2) {
        amqw.a(i, i2, size());
        i2 -= i;
        if (i2 == size()) {
            return this;
        }
        if (i2 != 0) {
            return new amus(this, i, i2);
        }
        return amwj.a;
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    /* Access modifiers changed, original: 0000 */
    public int a(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public amul i() {
        return size() > 1 ? new amuq(this) : this;
    }

    public final boolean equals(Object obj) {
        return amvj.a((List) this, obj);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* Access modifiers changed, original: 0000 */
    public Object writeReplace() {
        return new amup(toArray());
    }

    public static amuo j() {
        return new amuo();
    }

    public static amuo a(int i) {
        amss.a(i, "expectedSize");
        return new amuo(i);
    }

    public final /* synthetic */ Iterator iterator() {
        return (amxn) listIterator();
    }

    public final /* synthetic */ ListIterator listIterator(int i) {
        return b(i);
    }
}
