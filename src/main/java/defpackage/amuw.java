package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: amuw */
public abstract class amuw extends amuh implements Set {
    private transient amul a;

    public static amuw a(Object obj) {
        return new amwu(obj);
    }

    public static boolean a(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* Access modifiers changed, original: 0000 */
    public boolean g() {
        return false;
    }

    public static amuw a(Object obj, Object obj2) {
        return amuw.a(2, obj, obj2);
    }

    public static amuw a(Object obj, Object obj2, Object obj3) {
        return amuw.a(3, obj, obj2, obj3);
    }

    public static amuw a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return amuw.a(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static amuw a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        amqw.a(true, (Object) "the total number of elements must fit in an int");
        int length = objArr.length;
        Object[] objArr2 = new Object[(length + 6)];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return amuw.a(objArr2.length, objArr2);
    }

    public static amuw a(int i, Object... objArr) {
        if (i == 0) {
            return amwp.a;
        }
        if (i == 1) {
            return amuw.a(objArr[0]);
        }
        int a = amuw.a(i);
        Object[] objArr2 = new Object[a];
        int i2 = a - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object a2 = amwd.a(objArr[i5], i5);
            int hashCode = a2.hashCode();
            int a3 = amud.a(hashCode);
            while (true) {
                int i6 = a3 & i2;
                Object obj = objArr2[i6];
                if (obj != null) {
                    if (obj.equals(a2)) {
                        break;
                    }
                    a3++;
                } else {
                    a3 = i4 + 1;
                    objArr[i4] = a2;
                    objArr2[i6] = a2;
                    i3 += hashCode;
                    i4 = a3;
                    break;
                }
            }
        }
        Arrays.fill(objArr, i4, i, null);
        if (i4 == 1) {
            return new amwu(objArr[0], i3);
        }
        if (amuw.a(i4) < a / 2) {
            return amuw.a(i4, objArr);
        }
        if (amuw.a(i4, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new amwp(objArr, i3, objArr2, i2, i4);
    }

    static int a(int i) {
        i = Math.max(i, 2);
        if (i < 751619276) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            while (true) {
                highestOneBit += highestOneBit;
                double d = (double) highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= ((double) i)) {
                    return highestOneBit;
                }
            }
        } else {
            amqw.a(i < 1073741824, (Object) "collection too large");
            return 1073741824;
        }
    }

    public static amuw a(Collection collection) {
        if ((collection instanceof amuw) && !(collection instanceof SortedSet)) {
            amuw amuw = (amuw) collection;
            if (!amuw.f()) {
                return amuw;
            }
        }
        Object[] toArray = collection.toArray();
        return amuw.a(toArray.length, toArray);
    }

    public static amuw a(Iterable iterable) {
        if (iterable instanceof Collection) {
            return amuw.a((Collection) iterable);
        }
        Object it = iterable.iterator();
        if (!it.hasNext()) {
            return amwp.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return amuw.a(next);
        }
        amuv amuv = new amuv();
        amuv.c(next);
        amqw.a(it);
        while (it.hasNext()) {
            amuv.c(it.next());
        }
        return amuv.a();
    }

    public static amuw a(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return amwp.a;
        }
        if (length != 1) {
            return amuw.a(length, (Object[]) objArr.clone());
        }
        return amuw.a(objArr[0]);
    }

    amuw() {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof amuw) && g() && ((amuw) obj).g() && hashCode() != obj.hashCode()) {
            return false;
        }
        return amws.a((Set) this, obj);
    }

    public int hashCode() {
        return amws.a(this);
    }

    public amul e() {
        amul amul = this.a;
        if (amul != null) {
            return amul;
        }
        amul = h();
        this.a = amul;
        return amul;
    }

    /* Access modifiers changed, original: 0000 */
    public amul h() {
        return amul.b(toArray());
    }

    /* Access modifiers changed, original: 0000 */
    public Object writeReplace() {
        return new amuy(toArray());
    }

    public static amuv i() {
        return new amuv();
    }

    public static amuv b(int i) {
        amss.a(i, "expectedSize");
        return new amuv(i);
    }

    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
