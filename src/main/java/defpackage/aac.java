package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: aac */
public class aac {
    private static Object[] c;
    private static int d;
    private static Object[] e;
    private static int f;
    public Object[] a;
    public int b;
    private int[] g;

    private static int a(int[] iArr, int i, int i2) {
        try {
            return zm.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private final int a(Object obj, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        int a = aac.a(this.g, i2, i);
        if (a < 0 || obj.equals(this.a[a + a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.g[i3] == i) {
            if (obj.equals(this.a[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.g[a] == i) {
            if (obj.equals(this.a[a + a])) {
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
        int a = aac.a(this.g, i, 0);
        if (a < 0 || this.a[a + a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.g[i2] == 0) {
            if (this.a[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.g[a] == 0) {
            if (this.a[a + a] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    private final void e(int i) {
        Class cls = aac.class;
        Object[] objArr;
        if (i == 8) {
            synchronized (cls) {
                if (e != null) {
                    objArr = e;
                    this.a = objArr;
                    e = (Object[]) objArr[0];
                    this.g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (c != null) {
                    objArr = c;
                    this.a = objArr;
                    c = (Object[]) objArr[0];
                    this.g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    d--;
                    return;
                }
            }
        }
        this.g = new int[i];
        this.a = new Object[(i + i)];
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        Class cls = aac.class;
        int length = iArr.length;
        if (length == 8) {
            synchronized (cls) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    i += i;
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
        } else if (length == 4) {
            synchronized (cls) {
                if (d < 10) {
                    objArr[0] = c;
                    objArr[1] = iArr;
                    i += i;
                    while (true) {
                        i--;
                        if (i < 2) {
                            break;
                        }
                        objArr[i] = null;
                    }
                    c = objArr;
                    d++;
                }
            }
        }
    }

    public aac() {
        this.g = zm.a;
        this.a = zm.c;
        this.b = 0;
    }

    public aac(int i) {
        if (i == 0) {
            this.g = zm.a;
            this.a = zm.c;
        } else {
            e(i);
        }
        this.b = 0;
    }

    public aac(aac aac) {
        this();
        if (aac != null) {
            a(aac);
        }
    }

    public void clear() {
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.g;
            Object[] objArr = this.a;
            this.g = zm.a;
            this.a = zm.c;
            this.b = 0;
            aac.a(iArr, objArr, i);
        }
        if (this.b > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final void a(int i) {
        int i2 = this.b;
        int[] iArr = this.g;
        if (iArr.length < i) {
            Object[] objArr = this.a;
            e(i);
            if (this.b > 0) {
                System.arraycopy(iArr, 0, this.g, 0, i2);
                System.arraycopy(objArr, 0, this.a, 0, i2 + i2);
            }
            aac.a(iArr, objArr, i2);
        }
        if (this.b != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public final int a(Object obj) {
        return obj != null ? a(obj, obj.hashCode()) : a();
    }

    /* Access modifiers changed, original: final */
    public final int b(Object obj) {
        int i = this.b;
        i += i;
        Object[] objArr = this.a;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    public final boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int a = a(obj);
        return a >= 0 ? this.a[(a + a) + 1] : obj2;
    }

    public final Object b(int i) {
        return this.a[i + i];
    }

    public final Object c(int i) {
        return this.a[(i + i) + 1];
    }

    public Object a(int i, Object obj) {
        i = (i + i) + 1;
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.b <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int a;
        int i;
        int i2 = this.b;
        if (obj == null) {
            a = a();
            i = 0;
        } else {
            a = obj.hashCode();
            i = a;
            a = a(obj, a);
        }
        if (a >= 0) {
            a = (a + a) + 1;
            Object[] objArr = this.a;
            Object obj3 = objArr[a];
            objArr[a] = obj2;
            return obj3;
        }
        a ^= -1;
        int[] iArr = this.g;
        int length = iArr.length;
        if (i2 >= length) {
            int i3 = 4;
            if (i2 >= 8) {
                i3 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i3 = 8;
            }
            Object[] objArr2 = this.a;
            e(i3);
            if (i2 == this.b) {
                int[] iArr2 = this.g;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    System.arraycopy(objArr2, 0, this.a, 0, objArr2.length);
                }
                aac.a(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (a < i2) {
            int[] iArr3 = this.g;
            int i4 = a + 1;
            System.arraycopy(iArr3, a, iArr3, i4, i2 - a);
            Object[] objArr3 = this.a;
            length = this.b - a;
            System.arraycopy(objArr3, a + a, objArr3, i4 + i4, length + length);
        }
        int i5 = this.b;
        if (i2 == i5) {
            int[] iArr4 = this.g;
            if (a < iArr4.length) {
                iArr4[a] = i;
                Object[] objArr4 = this.a;
                a += a;
                objArr4[a] = obj;
                objArr4[a + 1] = obj2;
                this.b = i5 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void a(aac aac) {
        int i = aac.b;
        a(this.b + i);
        int i2 = 0;
        if (this.b != 0) {
            while (i2 < i) {
                put(aac.b(i2), aac.c(i2));
                i2++;
            }
        } else if (i > 0) {
            System.arraycopy(aac.g, 0, this.g, 0, i);
            System.arraycopy(aac.a, 0, this.a, 0, i + i);
            this.b = i;
        }
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final Object remove(Object obj) {
        int a = a(obj);
        if (a < 0) {
            return null;
        }
        return d(a);
    }

    public final boolean remove(Object obj, Object obj2) {
        int a = a(obj);
        if (a >= 0) {
            Object c = c(a);
            if (obj2 == c || (obj2 != null && obj2.equals(c))) {
                d(a);
                return true;
            }
        }
        return false;
    }

    public Object d(int i) {
        Object[] objArr = this.a;
        int i2 = i + i;
        Object obj = objArr[i2 + 1];
        int i3 = this.b;
        int i4 = 0;
        if (i3 <= 1) {
            aac.a(this.g, objArr, i3);
            this.g = zm.a;
            this.a = zm.c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.g;
            int length = iArr.length;
            int i6 = 8;
            if (length <= 8 || i3 >= length / 3) {
                int i7;
                Object[] objArr2;
                if (i < i5) {
                    i7 = i + 1;
                    i4 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i4);
                    objArr2 = this.a;
                    System.arraycopy(objArr2, i7 + i7, objArr2, i2, i4 + i4);
                }
                objArr2 = this.a;
                i7 = i5 + i5;
                objArr2[i7] = null;
                objArr2[i7 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                e(i6);
                if (i3 == this.b) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.g, 0, i);
                        System.arraycopy(objArr, 0, this.a, 0, i2);
                    }
                    if (i < i5) {
                        i4 = i + 1;
                        int i8 = i5 - i;
                        System.arraycopy(iArr, i4, this.g, i, i8);
                        System.arraycopy(objArr, i4 + i4, this.a, i2, i8 + i8);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.b) {
            this.b = i4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final Object replace(Object obj, Object obj2) {
        int a = a(obj);
        if (a < 0) {
            return null;
        }
        return a(a, obj2);
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int a = a(obj);
        if (a >= 0) {
            Object c = c(a);
            if (c == obj2 || (obj2 != null && obj2.equals(c))) {
                a(a, obj3);
                return true;
            }
        }
        return false;
    }

    public final int size() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        int i;
        Object b;
        Object c;
        Object obj2;
        if (obj instanceof aac) {
            aac aac = (aac) obj;
            if (this.b == aac.b) {
                i = 0;
                while (i < this.b) {
                    try {
                        b = b(i);
                        c = c(i);
                        obj2 = aac.get(b);
                        if (c != null) {
                            if (!c.equals(obj2)) {
                                return false;
                            }
                        } else if (obj2 != null || !aac.containsKey(b)) {
                            return false;
                        }
                        i++;
                    } catch (ClassCastException | NullPointerException unused) {
                    }
                }
                return true;
            }
            return false;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.b == map.size()) {
                i = 0;
                while (i < this.b) {
                    try {
                        b = b(i);
                        c = c(i);
                        obj2 = map.get(b);
                        if (c != null) {
                            if (!c.equals(obj2)) {
                                return false;
                            }
                        } else if (obj2 != null || !map.containsKey(b)) {
                            return false;
                        }
                        i++;
                    } catch (ClassCastException | NullPointerException unused2) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.g;
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj != null ? obj.hashCode() : 0) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.b * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.b; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            aac b = b(i);
            String str = "(this Map)";
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append(str);
            }
            stringBuilder.append('=');
            b = c(i);
            if (b == this) {
                stringBuilder.append(str);
            } else {
                stringBuilder.append(b);
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
