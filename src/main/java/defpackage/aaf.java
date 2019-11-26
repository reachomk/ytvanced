package defpackage;

/* renamed from: aaf */
public final class aaf implements Cloneable {
    private static final Object d = new Object();
    public boolean a;
    public Object[] b;
    public int c;
    private int[] e;

    public aaf() {
        this(10);
    }

    public aaf(int i) {
        this.a = false;
        if (i == 0) {
            this.e = zm.a;
            this.b = zm.c;
            return;
        }
        i = zm.a(i);
        this.e = new int[i];
        this.b = new Object[i];
    }

    /* renamed from: a */
    public final aaf clone() {
        try {
            aaf aaf = (aaf) super.clone();
            aaf.e = (int[]) this.e.clone();
            aaf.b = (Object[]) this.b.clone();
            return aaf;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final Object a(int i) {
        return a(i, null);
    }

    public final Object a(int i, Object obj) {
        i = zm.a(this.e, this.c, i);
        if (i >= 0) {
            Object[] objArr = this.b;
            if (objArr[i] != d) {
                return objArr[i];
            }
        }
        return obj;
    }

    public final void b(int i) {
        i = zm.a(this.e, this.c, i);
        if (i >= 0) {
            Object[] objArr = this.b;
            Object obj = objArr[i];
            Object obj2 = d;
            if (obj != obj2) {
                objArr[i] = obj2;
                this.a = true;
            }
        }
    }

    public final void c(int i) {
        Object[] objArr = this.b;
        Object obj = objArr[i];
        Object obj2 = d;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.a = true;
        }
    }

    public final void b() {
        int i = this.c;
        int[] iArr = this.e;
        Object[] objArr = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != d) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.a = false;
        this.c = i2;
    }

    public final void b(int i, Object obj) {
        int a = zm.a(this.e, this.c, i);
        if (a < 0) {
            Object[] objArr;
            int[] iArr;
            a ^= -1;
            if (a < this.c) {
                objArr = this.b;
                if (objArr[a] == d) {
                    this.e[a] = i;
                    objArr[a] = obj;
                    return;
                }
            }
            if (this.a && this.c >= this.e.length) {
                b();
                a = zm.a(this.e, this.c, i) ^ -1;
            }
            int i2 = this.c;
            if (i2 >= this.e.length) {
                i2 = zm.a(i2 + 1);
                iArr = new int[i2];
                objArr = new Object[i2];
                int[] iArr2 = this.e;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.b;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.e = iArr;
                this.b = objArr;
            }
            i2 = this.c - a;
            if (i2 != 0) {
                iArr = this.e;
                int i3 = a + 1;
                System.arraycopy(iArr, a, iArr, i3, i2);
                objArr = this.b;
                System.arraycopy(objArr, a, objArr, i3, this.c - a);
            }
            this.e[a] = i;
            this.b[a] = obj;
            this.c++;
            return;
        }
        this.b[a] = obj;
    }

    public final int c() {
        if (this.a) {
            b();
        }
        return this.c;
    }

    public final int d(int i) {
        if (this.a) {
            b();
        }
        return this.e[i];
    }

    public final Object e(int i) {
        if (this.a) {
            b();
        }
        return this.b[i];
    }

    public final int f(int i) {
        if (this.a) {
            b();
        }
        return zm.a(this.e, this.c, i);
    }

    public final void d() {
        int i = this.c;
        Object[] objArr = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.c = 0;
        this.a = false;
    }

    public final void c(int i, Object obj) {
        int i2 = this.c;
        if (i2 == 0 || i > this.e[i2 - 1]) {
            if (this.a && i2 >= this.e.length) {
                b();
            }
            i2 = this.c;
            if (i2 >= this.e.length) {
                int a = zm.a(i2 + 1);
                int[] iArr = new int[a];
                Object[] objArr = new Object[a];
                int[] iArr2 = this.e;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.b;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.e = iArr;
                this.b = objArr;
            }
            this.e[i2] = i;
            this.b[i2] = obj;
            this.c = i2 + 1;
            return;
        }
        b(i, obj);
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.c * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.c; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(d(i));
            stringBuilder.append('=');
            aaf e = e(i);
            if (e == this) {
                stringBuilder.append("(this Map)");
            } else {
                stringBuilder.append(e);
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
