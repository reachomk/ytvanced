package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

@Deprecated
/* renamed from: cvq */
public final class cvq implements Set {
    private static final Integer a = Integer.valueOf(0);
    private static final Object[] b = new Object[0];
    private final aac c = new aac();

    public final boolean add(Object obj) {
        return this.c.put(obj, a) == null;
    }

    /* JADX WARNING: Missing block: B:3:0x0024, code skipped:
            if (size() != r0) goto L_0x005d;
     */
    /* JADX WARNING: Missing block: B:15:0x005a, code skipped:
            if (r3 == 0) goto L_0x005c;
     */
    /* JADX WARNING: Missing block: B:18:0x005e, code skipped:
            return true;
     */
    public final boolean addAll(java.util.Collection r6) {
        /*
        r5 = this;
        r0 = r5.size();
        r1 = r6.size();
        r2 = r5.c;
        r0 = r0 + r1;
        r2.a(r0);
        r0 = r6 instanceof defpackage.cvq;
        r1 = 0;
        if (r0 == 0) goto L_0x0027;
    L_0x0013:
        r6 = (defpackage.cvq) r6;
        r0 = r5.size();
        r2 = r5.c;
        r6 = r6.c;
        r2.a(r6);
        r6 = r5.size();
        if (r6 == r0) goto L_0x005c;
    L_0x0026:
        goto L_0x005d;
    L_0x0027:
        r0 = r6 instanceof java.util.List;
        if (r0 == 0) goto L_0x0045;
    L_0x002b:
        r0 = r6 instanceof java.util.RandomAccess;
        if (r0 == 0) goto L_0x0045;
    L_0x002f:
        r6 = (java.util.List) r6;
        r0 = r6.size();
        r2 = 0;
        r3 = 0;
    L_0x0037:
        if (r2 >= r0) goto L_0x005a;
    L_0x0039:
        r4 = r6.get(r2);
        r4 = r5.add(r4);
        r3 = r3 | r4;
        r2 = r2 + 1;
        goto L_0x0037;
    L_0x0045:
        r6 = r6.iterator();
        r3 = 0;
    L_0x004a:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x005a;
    L_0x0050:
        r0 = r6.next();
        r0 = r5.add(r0);
        r3 = r3 | r0;
        goto L_0x004a;
    L_0x005a:
        if (r3 != 0) goto L_0x005d;
    L_0x005c:
        return r1;
    L_0x005d:
        r6 = 1;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvq.addAll(java.util.Collection):boolean");
    }

    public final void clear() {
        this.c.clear();
    }

    public final boolean contains(Object obj) {
        return this.c.containsKey(obj);
    }

    public final boolean containsAll(Collection collection) {
        if ((collection instanceof List) && (collection instanceof RandomAccess)) {
            List list = (List) collection;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!contains(list.get(i))) {
                    return false;
                }
            }
        } else {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() == set.size()) {
                try {
                    int size = size();
                    for (int i = 0; i < size; i++) {
                        if (!set.contains(b(i))) {
                            return false;
                        }
                    }
                    return true;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object b = b(i2);
            if (b != null) {
                i += b.hashCode();
            }
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    public final Iterator iterator() {
        return new cvp(this);
    }

    public final boolean remove(Object obj) {
        int a = this.c.a(obj);
        if (a < 0) {
            return false;
        }
        a(a);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        int i;
        if ((collection instanceof List) && (collection instanceof RandomAccess)) {
            List list = (List) collection;
            i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                i |= remove(list.get(i2));
            }
        } else {
            i = 0;
            for (Object remove : collection) {
                i |= remove(remove);
            }
        }
        if (i == 0) {
            return false;
        }
        return true;
    }

    public final Object a(int i) {
        Object b = this.c.b(i);
        this.c.d(i);
        return b;
    }

    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(b(size))) {
                a(size);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.c.b;
    }

    public final Object[] toArray() {
        int i = this.c.b;
        if (i == 0) {
            return b;
        }
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = this.c.b(i2);
        }
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        for (int i = 0; i < size; i++) {
            objArr[i] = b(i);
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        int size = size();
        StringBuilder stringBuilder = new StringBuilder(size * 14);
        stringBuilder.append('{');
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            cvq b = b(i);
            if (b == this) {
                stringBuilder.append("(this Set)");
            } else {
                stringBuilder.append(b);
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final Object b(int i) {
        return this.c.b(i);
    }
}
