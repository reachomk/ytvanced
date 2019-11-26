package defpackage;

/* renamed from: zr */
public final class zr implements Cloneable {
    private static final Object a = new Object();
    private boolean b;
    private long[] c;
    private Object[] d;
    private int e;

    public zr() {
        this(10);
    }

    public zr(int i) {
        this.b = false;
        if (i == 0) {
            this.c = zm.b;
            this.d = zm.c;
            return;
        }
        i = zm.b(i);
        this.c = new long[i];
        this.d = new Object[i];
    }

    /* renamed from: a */
    public final zr clone() {
        try {
            zr zrVar = (zr) super.clone();
            zrVar.c = (long[]) this.c.clone();
            zrVar.d = (Object[]) this.d.clone();
            return zrVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final Object a(long j) {
        return a(j, null);
    }

    public final Object a(long j, Object obj) {
        int a = zm.a(this.c, this.e, j);
        if (a >= 0) {
            Object[] objArr = this.d;
            if (objArr[a] != a) {
                return objArr[a];
            }
        }
        return obj;
    }

    public final void b(long j) {
        int a = zm.a(this.c, this.e, j);
        if (a >= 0) {
            Object[] objArr = this.d;
            Object obj = objArr[a];
            Object obj2 = a;
            if (obj != obj2) {
                objArr[a] = obj2;
                this.b = true;
            }
        }
    }

    public final void a(int i) {
        Object[] objArr = this.d;
        Object obj = objArr[i];
        Object obj2 = a;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.b = true;
        }
    }

    private final void d() {
        int i = this.e;
        long[] jArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final void b(long j, Object obj) {
        int a = zm.a(this.c, this.e, j);
        if (a < 0) {
            Object[] objArr;
            long[] jArr;
            a ^= -1;
            if (a < this.e) {
                objArr = this.d;
                if (objArr[a] == a) {
                    this.c[a] = j;
                    objArr[a] = obj;
                    return;
                }
            }
            if (this.b && this.e >= this.c.length) {
                d();
                a = zm.a(this.c, this.e, j) ^ -1;
            }
            int i = this.e;
            if (i >= this.c.length) {
                i = zm.b(i + 1);
                jArr = new long[i];
                objArr = new Object[i];
                long[] jArr2 = this.c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.c = jArr;
                this.d = objArr;
            }
            i = this.e - a;
            if (i != 0) {
                jArr = this.c;
                int i2 = a + 1;
                System.arraycopy(jArr, a, jArr, i2, i);
                objArr = this.d;
                System.arraycopy(objArr, a, objArr, i2, this.e - a);
            }
            this.c[a] = j;
            this.d[a] = obj;
            this.e++;
            return;
        }
        this.d[a] = obj;
    }

    public final int b() {
        if (this.b) {
            d();
        }
        return this.e;
    }

    public final long b(int i) {
        if (this.b) {
            d();
        }
        return this.c[i];
    }

    public final Object c(int i) {
        if (this.b) {
            d();
        }
        return this.d[i];
    }

    public final int c(long j) {
        if (this.b) {
            d();
        }
        return zm.a(this.c, this.e, j);
    }

    public final int a(Object obj) {
        int i = 0;
        if (this.b) {
            d();
        }
        while (i < this.e) {
            if (this.d[i] == obj) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void c() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public final void c(long j, Object obj) {
        int i = this.e;
        if (i == 0 || j > this.c[i - 1]) {
            if (this.b && i >= this.c.length) {
                d();
            }
            i = this.e;
            if (i >= this.c.length) {
                int b = zm.b(i + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                long[] jArr2 = this.c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.c = jArr;
                this.d = objArr;
            }
            this.c[i] = j;
            this.d[i] = obj;
            this.e = i + 1;
            return;
        }
        b(j, obj);
    }

    public final String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(b(i));
            stringBuilder.append('=');
            zr c = c(i);
            if (c == this) {
                stringBuilder.append("(this Map)");
            } else {
                stringBuilder.append(c);
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
