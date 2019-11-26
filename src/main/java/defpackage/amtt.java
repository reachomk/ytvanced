package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: amtt */
public final class amtt extends AbstractMap implements amsp, Serializable {
    public transient Object[] a;
    public transient Object[] b;
    public transient int c;
    public transient int d;
    public transient int e;
    public transient int[] f;
    public transient amsp g;
    private transient int[] h;
    private transient int[] i;
    private transient int[] j;
    private transient int[] k;
    private transient int l;
    private transient int[] m;
    private transient Set n;
    private transient Set o;
    private transient Set p;

    public amtt() {
        c();
    }

    private final void c() {
        amss.a(16, "expectedSize");
        int b = amud.b(16);
        this.c = 0;
        this.a = new Object[16];
        this.b = new Object[16];
        this.h = amtt.a(b);
        this.i = amtt.a(b);
        this.j = amtt.a(16);
        this.k = amtt.a(16);
        this.e = -2;
        this.l = -2;
        this.m = amtt.a(16);
        this.f = amtt.a(16);
    }

    private static int[] a(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static int[] a(int[] iArr, int i) {
        int length = iArr.length;
        iArr = Arrays.copyOf(iArr, i);
        Arrays.fill(iArr, length, i, -1);
        return iArr;
    }

    public final int size() {
        return this.c;
    }

    private final void b(int i) {
        int length = this.j.length;
        if (length < i) {
            length = amuj.a(length, i);
            this.a = Arrays.copyOf(this.a, length);
            this.b = Arrays.copyOf(this.b, length);
            this.j = amtt.a(this.j, length);
            this.k = amtt.a(this.k, length);
            this.m = amtt.a(this.m, length);
            this.f = amtt.a(this.f, length);
        }
        if (this.h.length < i) {
            i = amud.b(i);
            this.h = amtt.a(i);
            this.i = amtt.a(i);
            for (i = 0; i < this.c; i++) {
                length = c(amud.a(this.a[i]));
                int[] iArr = this.j;
                int[] iArr2 = this.h;
                iArr[i] = iArr2[length];
                iArr2[length] = i;
                length = c(amud.a(this.b[i]));
                iArr = this.k;
                iArr2 = this.i;
                iArr[i] = iArr2[length];
                iArr2[length] = i;
            }
        }
    }

    private final int c(int i) {
        return i & (this.h.length - 1);
    }

    /* Access modifiers changed, original: final */
    public final int a(Object obj) {
        return a(obj, amud.a(obj));
    }

    /* Access modifiers changed, original: final */
    public final int a(Object obj, int i) {
        return a(obj, i, this.h, this.j, this.a);
    }

    /* Access modifiers changed, original: final */
    public final int b(Object obj) {
        return b(obj, amud.a(obj));
    }

    /* Access modifiers changed, original: final */
    public final int b(Object obj, int i) {
        return a(obj, i, this.i, this.k, this.b);
    }

    private final int a(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        i = iArr[c(i)];
        while (i != -1) {
            if (amqq.a(objArr[i], obj)) {
                return i;
            }
            i = iArr2[i];
        }
        return -1;
    }

    public final boolean containsKey(Object obj) {
        return a(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        return b(obj) != -1;
    }

    public final Object get(Object obj) {
        int a = a(obj);
        return a != -1 ? this.b[a] : null;
    }

    public final Object put(Object obj, Object obj2) {
        int a = amud.a(obj);
        int a2 = a(obj, a);
        if (a2 != -1) {
            obj = this.b[a2];
            if (!amqq.a(obj, obj2)) {
                a(a2, obj2);
                return obj;
            }
        }
        a2 = amud.a(obj2);
        amqw.a(b(obj2, a2) == -1, "Value already present: %s", obj2);
        b(this.c + 1);
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = obj;
        this.b[i] = obj2;
        d(i, a);
        e(this.c, a2);
        c(this.l, this.c);
        c(this.c, -2);
        this.c++;
        this.d++;
        obj2 = null;
        return obj2;
    }

    /* Access modifiers changed, original: final */
    public final Object a(Object obj, Object obj2) {
        int a = amud.a(obj);
        int b = b(obj, a);
        if (b != -1) {
            obj = this.a[b];
            if (amqq.a(obj, obj2)) {
                return obj2;
            }
            b(b, obj2);
            return obj;
        }
        int i;
        b = this.l;
        int a2 = amud.a(obj2);
        amqw.a(a(obj2, a2) == -1, "Key already present: %s", obj2);
        b(this.c + 1);
        Object[] objArr = this.a;
        int i2 = this.c;
        objArr[i2] = obj2;
        this.b[i2] = obj;
        d(i2, a2);
        e(this.c, a);
        if (b != -2) {
            i = this.f[b];
        } else {
            i = this.e;
        }
        c(b, this.c);
        c(this.c, i);
        this.c++;
        this.d++;
        return null;
    }

    private final void c(int i, int i2) {
        if (i != -2) {
            this.f[i] = i2;
        } else {
            this.e = i2;
        }
        if (i2 == -2) {
            this.l = i;
        } else {
            this.m[i2] = i;
        }
    }

    private final void d(int i, int i2) {
        amqw.a(i != -1);
        i2 = c(i2);
        int[] iArr = this.j;
        int[] iArr2 = this.h;
        iArr[i] = iArr2[i2];
        iArr2[i2] = i;
    }

    private final void e(int i, int i2) {
        amqw.a(i != -1);
        i2 = c(i2);
        int[] iArr = this.k;
        int[] iArr2 = this.i;
        iArr[i] = iArr2[i2];
        iArr2[i2] = i;
    }

    private final void f(int i, int i2) {
        amqw.a(i != -1);
        i2 = c(i2);
        int[] iArr = this.h;
        int i3 = iArr[i2];
        if (i3 == i) {
            int[] iArr2 = this.j;
            iArr[i2] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        i2 = this.j[i3];
        while (true) {
            int i4 = i3;
            i3 = i2;
            i2 = i4;
            if (i3 == -1) {
                String valueOf = String.valueOf(this.a[i]);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 32);
                stringBuilder.append("Expected to find entry with key ");
                stringBuilder.append(valueOf);
                throw new AssertionError(stringBuilder.toString());
            } else if (i3 != i) {
                i2 = this.j[i3];
            } else {
                iArr = this.j;
                iArr[i2] = iArr[i];
                iArr[i] = -1;
                return;
            }
        }
    }

    private final void g(int i, int i2) {
        amqw.a(i != -1);
        i2 = c(i2);
        int[] iArr = this.i;
        int i3 = iArr[i2];
        if (i3 == i) {
            int[] iArr2 = this.k;
            iArr[i2] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        i2 = this.k[i3];
        while (true) {
            int i4 = i3;
            i3 = i2;
            i2 = i4;
            if (i3 == -1) {
                String valueOf = String.valueOf(this.b[i]);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 34);
                stringBuilder.append("Expected to find entry with value ");
                stringBuilder.append(valueOf);
                throw new AssertionError(stringBuilder.toString());
            } else if (i3 != i) {
                i2 = this.k[i3];
            } else {
                iArr = this.k;
                iArr[i2] = iArr[i];
                iArr[i] = -1;
                return;
            }
        }
    }

    public final void a(int i, Object obj) {
        amqw.a(i != -1);
        int a = amud.a(obj);
        if (b(obj, a) == -1) {
            g(i, amud.a(this.b[i]));
            this.b[i] = obj;
            e(i, a);
            return;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 30);
        stringBuilder.append("Value already present in map: ");
        stringBuilder.append(valueOf);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void b(int i, Object obj) {
        amqw.a(i != -1);
        int a = a(obj, amud.a(obj));
        int i2 = this.l;
        if (a == -1) {
            int i3 = i2 == i ? this.m[i] : i2 != this.c ? i2 : a;
            if (i == -2) {
                a = this.f[-2];
            } else if (this.c != -2) {
                a = -2;
            }
            c(this.m[i], this.f[i]);
            f(i, amud.a(this.a[i]));
            this.a[i] = obj;
            d(i, amud.a(obj));
            c(i3, i);
            c(i, a);
            return;
        }
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 28);
        stringBuilder.append("Key already present in map: ");
        stringBuilder.append(valueOf);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final Object remove(Object obj) {
        int a = amud.a(obj);
        int a2 = a(obj, a);
        if (a2 == -1) {
            return null;
        }
        Object obj2 = this.b[a2];
        a(a2, a);
        return obj2;
    }

    private final void a(int i, int i2, int i3) {
        amqw.a(i != -1);
        f(i, i2);
        g(i, i3);
        c(this.m[i], this.f[i]);
        i2 = this.c - 1;
        if (i2 != i) {
            int i4;
            i3 = this.m[i2];
            int i5 = this.f[i2];
            c(i3, i);
            c(i, i5);
            Object[] objArr = this.a;
            Object obj = objArr[i2];
            Object[] objArr2 = this.b;
            Object obj2 = objArr2[i2];
            objArr[i] = obj;
            objArr2[i] = obj2;
            i3 = c(amud.a(obj));
            int[] iArr = this.h;
            int i6 = iArr[i3];
            if (i6 == i2) {
                iArr[i3] = i;
            } else {
                i3 = this.j[i6];
                while (true) {
                    i4 = i6;
                    i6 = i3;
                    i3 = i4;
                    if (i6 == i2) {
                        break;
                    }
                    i3 = this.j[i6];
                }
                this.j[i3] = i;
            }
            int[] iArr2 = this.j;
            iArr2[i] = iArr2[i2];
            iArr2[i2] = -1;
            i3 = c(amud.a(obj2));
            iArr = this.i;
            i6 = iArr[i3];
            if (i6 == i2) {
                iArr[i3] = i;
            } else {
                i3 = this.k[i6];
                while (true) {
                    i4 = i6;
                    i6 = i3;
                    i3 = i4;
                    if (i6 == i2) {
                        break;
                    }
                    i3 = this.k[i6];
                }
                this.k[i3] = i;
            }
            iArr2 = this.k;
            iArr2[i] = iArr2[i2];
            iArr2[i2] = -1;
        }
        i2 = this.c - 1;
        this.a[i2] = null;
        this.b[i2] = null;
        this.c = i2;
        this.d++;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, int i2) {
        a(i, i2, amud.a(this.b[i]));
    }

    /* Access modifiers changed, original: final */
    public final void b(int i, int i2) {
        a(i, amud.a(this.a[i]), i2);
    }

    public final void clear() {
        Arrays.fill(this.a, 0, this.c, null);
        Arrays.fill(this.b, 0, this.c, null);
        Arrays.fill(this.h, -1);
        Arrays.fill(this.i, -1);
        Arrays.fill(this.j, 0, this.c, -1);
        Arrays.fill(this.k, 0, this.c, -1);
        Arrays.fill(this.m, 0, this.c, -1);
        Arrays.fill(this.f, 0, this.c, -1);
        this.c = 0;
        this.e = -2;
        this.l = -2;
        this.d++;
    }

    public final Set keySet() {
        Set set = this.n;
        if (set != null) {
            return set;
        }
        amtz amtz = new amtz(this);
        this.n = amtz;
        return amtz;
    }

    /* renamed from: b */
    public final Set values() {
        Set set = this.o;
        if (set != null) {
            return set;
        }
        amuc amuc = new amuc(this);
        this.o = amuc;
        return amuc;
    }

    public final Set entrySet() {
        Set set = this.p;
        if (set != null) {
            return set;
        }
        amty amty = new amty(this);
        this.p = amty;
        return amty;
    }

    public final amsp a() {
        amsp amsp = this.g;
        if (amsp != null) {
            return amsp;
        }
        amtx amtx = new amtx(this);
        this.g = amtx;
        return amtx;
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.c);
        for (Entry entry : entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        c();
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }
}
