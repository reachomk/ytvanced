package defpackage;

/* renamed from: ubu */
public final class ubu {
    public static final Object a = new Object();
    public int b;
    private int c;
    private int[] d;
    private Object[] e;

    public ubu() {
        a();
    }

    public final void a() {
        this.c = 0;
        this.d = new int[ubs.a[this.c]];
        this.e = new Object[ubs.a[this.c]];
    }

    public final Object a(int i, Object obj) {
        uhy.a(obj);
        int d = d(i);
        Object[] objArr = this.e;
        Object obj2 = objArr[d];
        if (obj2 != null && obj2 != a) {
            return objArr[d];
        }
        int[] iArr = this.d;
        iArr[d] = i;
        boolean z = true;
        i = this.b + 1;
        this.b = i;
        this.e[d] = obj;
        if (i > (iArr.length >> 1)) {
            if (this.c < ubs.a.length - 1) {
                int[] iArr2 = this.d;
                Object[] objArr2 = this.e;
                this.c++;
                this.d = new int[ubs.a[this.c]];
                this.e = new Object[ubs.a[this.c]];
                d = this.b;
                int length = iArr2.length;
                this.b = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj3 = objArr2[i2];
                    if (!(obj3 == null || obj3 == a)) {
                        a(iArr2[i2], objArr2[i2]);
                    }
                }
                if (d != this.b) {
                    z = false;
                }
                uhy.b(z);
            } else {
                throw new IllegalStateException("Too many items, you'd better use array map instead.");
            }
        }
        return null;
    }

    public final Object a(int i) {
        i = d(i);
        Object[] objArr = this.e;
        Object obj = objArr[i];
        if (obj != null) {
            Object obj2 = a;
            if (obj != obj2) {
                obj = objArr[i];
                objArr[i] = obj2;
                this.b--;
                return obj;
            }
        }
        return null;
    }

    public final Object b(int i) {
        Object obj = this.e[d(i)];
        return obj == a ? null : obj;
    }

    private final int d(int i) {
        int length = this.d.length;
        int a = (ubs.a(i) & Integer.MAX_VALUE) % length;
        Object obj = null;
        int i2 = 0;
        while (true) {
            Object[] objArr = this.e;
            if (objArr[a] != a) {
                if (objArr[a] == null) {
                    return obj == null ? a : i2;
                } else {
                    if (this.d[a] == i) {
                        return a;
                    }
                }
            } else if (obj == null) {
                obj = 1;
                i2 = a;
            }
            a++;
            if (a >= length) {
                a = 0;
            }
        }
    }

    public final boolean c(int i) {
        Object b = b(i);
        return (b == null || b == a) ? false : true;
    }

    public final ubw b() {
        return new ubw(this.d, this.e);
    }
}
