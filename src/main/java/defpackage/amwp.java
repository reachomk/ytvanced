package defpackage;

import java.util.Iterator;

/* renamed from: amwp */
public final class amwp extends amuw {
    public static final amwp a = new amwp(new Object[0], 0, null, 0, 0);
    private final transient Object[] b;
    private final transient Object[] c;
    private final transient int d;
    private final transient int e;
    private final transient int f;

    amwp(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.b = objArr;
        this.c = objArr2;
        this.d = i2;
        this.e = i;
        this.f = i3;
    }

    /* Access modifiers changed, original: final */
    public final int c() {
        return 0;
    }

    /* Access modifiers changed, original: final */
    public final boolean f() {
        return false;
    }

    /* Access modifiers changed, original: final */
    public final boolean g() {
        return true;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.c;
        if (obj != null && objArr != null) {
            int a = amud.a(obj);
            while (true) {
                a &= this.d;
                Object obj2 = objArr[a];
                if (obj2 == null) {
                    break;
                } else if (obj2.equals(obj)) {
                    return true;
                } else {
                    a++;
                }
            }
        }
        return false;
    }

    public final int size() {
        return this.f;
    }

    public final amxo a() {
        return (amxn) e().listIterator();
    }

    /* Access modifiers changed, original: final */
    public final Object[] b() {
        return this.b;
    }

    /* Access modifiers changed, original: final */
    public final int d() {
        return this.f;
    }

    /* Access modifiers changed, original: final */
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.f);
        return i + this.f;
    }

    /* Access modifiers changed, original: final */
    public final amul h() {
        return amul.b(this.b, this.f);
    }

    public final int hashCode() {
        return this.e;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
