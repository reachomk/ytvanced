package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: zl */
public final class zl implements Collection, Set {
    private static final int[] c = new int[0];
    private static final Object[] d = new Object[0];
    private static Object[] e;
    private static int f;
    private static Object[] g;
    private static int h;
    public Object[] a;
    public int b;
    private int[] i;
    private zt j;

    private final int a(Object obj, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        int a = zm.a(this.i, i2, i);
        if (a < 0 || obj.equals(this.a[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.i[i3] == i) {
            if (obj.equals(this.a[i3])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.i[a] == i) {
            if (obj.equals(this.a[a])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    private final int a() {
        int i = this.b;
        if (i == 0) {
            return -1;
        }
        int a = zm.a(this.i, i, 0);
        if (a < 0 || this.a[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.i[i2] == 0) {
            if (this.a[i2] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.i[a] == 0) {
            if (this.a[a] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    private final void c(int i) {
        Class cls = zl.class;
        Object[] objArr;
        if (i == 8) {
            synchronized (cls) {
                if (g != null) {
                    objArr = g;
                    this.a = objArr;
                    g = (Object[]) objArr[0];
                    this.i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (e != null) {
                    objArr = e;
                    this.a = objArr;
                    e = (Object[]) objArr[0];
                    this.i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f--;
                    return;
                }
            }
        }
        this.i = new int[i];
        this.a = new Object[i];
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        Class cls = zl.class;
        int length = iArr.length;
        if (length == 8) {
            synchronized (cls) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    while (true) {
                        i--;
                        if (i < 2) {
                            break;
                        }
                        objArr[i] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
        } else if (length == 4) {
            synchronized (cls) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    while (true) {
                        i--;
                        if (i < 2) {
                            break;
                        }
                        objArr[i] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
        }
    }

    public zl() {
        this(0);
    }

    public zl(int i) {
        if (i == 0) {
            this.i = c;
            this.a = d;
        } else {
            c(i);
        }
        this.b = 0;
    }

    public final void clear() {
        int i = this.b;
        if (i != 0) {
            zl.a(this.i, this.a, i);
            this.i = c;
            this.a = d;
            this.b = 0;
        }
    }

    public final boolean contains(Object obj) {
        return a(obj) >= 0;
    }

    public final int a(Object obj) {
        return obj != null ? a(obj, obj.hashCode()) : a();
    }

    public final Object a(int i) {
        return this.a[i];
    }

    public final boolean isEmpty() {
        return this.b <= 0;
    }

    public final boolean add(Object obj) {
        int a;
        int i;
        if (obj == null) {
            a = a();
            i = 0;
        } else {
            a = obj.hashCode();
            i = a;
            a = a(obj, a);
        }
        if (a >= 0) {
            return false;
        }
        a ^= -1;
        int i2 = this.b;
        int[] iArr = this.i;
        int length = iArr.length;
        if (i2 >= length) {
            int i3 = 4;
            if (i2 >= 8) {
                i3 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i3 = 8;
            }
            Object[] objArr = this.a;
            c(i3);
            int[] iArr2 = this.i;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, length);
                System.arraycopy(objArr, 0, this.a, 0, objArr.length);
            }
            zl.a(iArr, objArr, this.b);
        }
        int i4 = this.b;
        if (a < i4) {
            int[] iArr3 = this.i;
            int i5 = a + 1;
            System.arraycopy(iArr3, a, iArr3, i5, i4 - a);
            Object[] objArr2 = this.a;
            System.arraycopy(objArr2, a, objArr2, i5, this.b - a);
        }
        this.i[a] = i;
        this.a[a] = obj;
        this.b++;
        return true;
    }

    public final boolean remove(Object obj) {
        int a = a(obj);
        if (a < 0) {
            return false;
        }
        b(a);
        return true;
    }

    public final Object b(int i) {
        Object[] objArr = this.a;
        Object obj = objArr[i];
        int i2 = this.b;
        if (i2 <= 1) {
            zl.a(this.i, objArr, i2);
            this.i = c;
            this.a = d;
            this.b = 0;
        } else {
            int[] iArr = this.i;
            int length = iArr.length;
            int i3 = 8;
            if (length <= 8 || i2 >= length / 3) {
                i2--;
                this.b = i2;
                if (i < i2) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, iArr, i, i2 - i);
                    Object[] objArr2 = this.a;
                    System.arraycopy(objArr2, i4, objArr2, i, this.b - i);
                }
                this.a[this.b] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                c(i3);
                this.b--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.i, 0, i);
                    System.arraycopy(objArr, 0, this.a, 0, i);
                }
                i2 = this.b;
                if (i < i2) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, this.i, i, i2 - i);
                    System.arraycopy(objArr, i5, this.a, i, this.b - i);
                }
            }
        }
        return obj;
    }

    public final int size() {
        return this.b;
    }

    public final Object[] toArray() {
        int i = this.b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.a, 0, objArr, 0, i);
        return objArr;
    }

    public final Object[] toArray(Object[] objArr) {
        Object objArr2;
        if (objArr2.length < this.b) {
            objArr2 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), this.b);
        }
        System.arraycopy(this.a, 0, objArr2, 0, this.b);
        int length = objArr2.length;
        int i = this.b;
        if (length > i) {
            objArr2[i] = null;
        }
        return objArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.b == set.size()) {
                int i = 0;
                while (i < this.b) {
                    try {
                        if (!set.contains(a(i))) {
                            return false;
                        }
                        i++;
                    } catch (ClassCastException | NullPointerException unused) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.i;
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.b * 14);
        stringBuilder.append('{');
        for (int i = 0; i < this.b; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            zl a = a(i);
            if (a == this) {
                stringBuilder.append("(this Set)");
            } else {
                stringBuilder.append(a);
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final Iterator iterator() {
        if (this.j == null) {
            this.j = new zk(this);
        }
        return this.j.d().iterator();
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean addAll(Collection collection) {
        int size = this.b + collection.size();
        int[] iArr = this.i;
        if (iArr.length < size) {
            Object[] objArr = this.a;
            c(size);
            size = this.b;
            if (size > 0) {
                System.arraycopy(iArr, 0, this.i, 0, size);
                System.arraycopy(objArr, 0, this.a, 0, this.b);
            }
            zl.a(iArr, objArr, this.b);
        }
        size = 0;
        for (Object add : collection) {
            size |= add(add);
        }
        if (size != 0) {
            return true;
        }
        return false;
    }

    public final boolean removeAll(Collection collection) {
        int i = 0;
        for (Object remove : collection) {
            i |= remove(remove);
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.b - 1; i >= 0; i--) {
            if (!collection.contains(this.a[i])) {
                b(i);
                z = true;
            }
        }
        return z;
    }
}
