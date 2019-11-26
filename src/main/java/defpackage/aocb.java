package defpackage;

/* renamed from: aocb */
public final class aocb implements Cloneable {
    public static final aoce a = new aoce();
    public boolean b;
    public aoce[] c;
    private int[] d;
    private int e;

    aocb() {
        this(10);
    }

    private aocb(int i) {
        this.b = false;
        i = aocb.d(i);
        this.d = new int[i];
        this.c = new aoce[i];
        this.e = 0;
    }

    /* Access modifiers changed, original: final */
    public final aoce a(int i) {
        i = c(i);
        if (i >= 0) {
            aoce[] aoceArr = this.c;
            if (aoceArr[i] != a) {
                return aoceArr[i];
            }
        }
        return null;
    }

    private final void d() {
        int i = this.e;
        int[] iArr = this.d;
        aoce[] aoceArr = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            aoce aoce = aoceArr[i3];
            if (aoce != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    aoceArr[i2] = aoce;
                    aoceArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, aoce aoce) {
        int c = c(i);
        if (c < 0) {
            aoce[] aoceArr;
            int[] iArr;
            c ^= -1;
            if (c < this.e) {
                aoceArr = this.c;
                if (aoceArr[c] == a) {
                    this.d[c] = i;
                    aoceArr[c] = aoce;
                    return;
                }
            }
            if (this.b && this.e >= this.d.length) {
                d();
                c = c(i) ^ -1;
            }
            int i2 = this.e;
            if (i2 >= this.d.length) {
                i2 = aocb.d(i2 + 1);
                iArr = new int[i2];
                aoceArr = new aoce[i2];
                int[] iArr2 = this.d;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                aoce[] aoceArr2 = this.c;
                System.arraycopy(aoceArr2, 0, aoceArr, 0, aoceArr2.length);
                this.d = iArr;
                this.c = aoceArr;
            }
            i2 = this.e - c;
            if (i2 != 0) {
                iArr = this.d;
                int i3 = c + 1;
                System.arraycopy(iArr, c, iArr, i3, i2);
                aoceArr = this.c;
                System.arraycopy(aoceArr, c, aoceArr, i3, this.e - c);
            }
            this.d[c] = i;
            this.c[c] = aoce;
            this.e++;
            return;
        }
        this.c[c] = aoce;
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        if (this.b) {
            d();
        }
        return this.e;
    }

    public final boolean b() {
        return a() == 0;
    }

    /* Access modifiers changed, original: final */
    public final aoce b(int i) {
        if (this.b) {
            d();
        }
        return this.c[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aocb) {
            aocb aocb = (aocb) obj;
            if (a() == aocb.a()) {
                int[] iArr = this.d;
                int[] iArr2 = aocb.d;
                int i = this.e;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                }
                aoce[] aoceArr = this.c;
                aoce[] aoceArr2 = aocb.c;
                int i3 = this.e;
                i = 0;
                while (i < i3) {
                    if (aoceArr[i].equals(aoceArr2[i])) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 17;
        if (this.b) {
            d();
        }
        while (i < this.e) {
            i2 = (((i2 * 31) + this.d[i]) * 31) + this.c[i].hashCode();
            i++;
        }
        return i2;
    }

    private static int d(int i) {
        i <<= 2;
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                i = i3;
                break;
            }
        }
        return i / 4;
    }

    public final int c(int i) {
        int i2 = this.e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.d[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    /* renamed from: c */
    public final aocb clone() {
        int a = a();
        aocb aocb = new aocb(a);
        int i = 0;
        System.arraycopy(this.d, 0, aocb.d, 0, a);
        while (i < a) {
            aoce aoce = this.c[i];
            if (aoce != null) {
                aocb.c[i] = (aoce) aoce.clone();
            }
            i++;
        }
        aocb.e = a;
        return aocb;
    }
}
