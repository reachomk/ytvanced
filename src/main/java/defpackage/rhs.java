package defpackage;

import java.util.Arrays;

/* renamed from: rhs */
public final class rhs {
    public static final rhs a = new rhs(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    static rhs a() {
        return new rhs();
    }

    static rhs a(rhs rhs, rhs rhs2) {
        int i = rhs.b + rhs2.b;
        int[] copyOf = Arrays.copyOf(rhs.c, i);
        System.arraycopy(rhs2.c, 0, copyOf, rhs.b, rhs2.b);
        Object[] copyOf2 = Arrays.copyOf(rhs.d, i);
        System.arraycopy(rhs2.d, 0, copyOf2, rhs.b, rhs2.b);
        return new rhs(i, copyOf, copyOf2, true);
    }

    private rhs() {
        this(0, new int[8], new Object[8], true);
    }

    private rhs(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final void b() {
        this.f = false;
    }

    public final void a(rik rik) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int i3 = i2 >>> 3;
                i2 &= 7;
                if (i2 == 0) {
                    rik.a(i3, ((Long) obj).longValue());
                } else if (i2 == 1) {
                    rik.d(i3, ((Long) obj).longValue());
                } else if (i2 == 2) {
                    rik.a(i3, (rdg) obj);
                } else if (i2 == 3) {
                    rdz rdz = (rdz) rik;
                    rdz.a.a(i3, 3);
                    ((rhs) obj).a(rik);
                    rdz.a.a(i3, 4);
                } else if (i2 == 5) {
                    rik.d(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(rfk.f());
                }
            }
        }
    }

    public final int c() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.b; i++) {
            int i3 = this.c[i];
            int i4 = i3 >>> 3;
            i3 &= 7;
            if (i3 == 0) {
                i3 = rdt.e(i4, ((Long) this.d[i]).longValue());
            } else if (i3 == 1) {
                ((Long) this.d[i]).longValue();
                i3 = rdt.g(i4);
            } else if (i3 == 2) {
                i3 = rdt.c(i4, (rdg) this.d[i]);
            } else if (i3 == 3) {
                i3 = rdt.l(i4);
                i3 = (i3 + i3) + ((rhs) this.d[i]).c();
            } else if (i3 == 5) {
                ((Integer) this.d[i]).intValue();
                i3 = rdt.e(i4);
            } else {
                throw new IllegalStateException(rfk.f());
            }
            i2 += i3;
        }
        this.e = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof rhs)) {
            rhs rhs = (rhs) obj;
            int i = this.b;
            if (i == rhs.b) {
                int[] iArr = this.c;
                int[] iArr2 = rhs.c;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                }
                Object[] objArr = this.d;
                Object[] objArr2 = rhs.d;
                int i3 = this.b;
                int i4 = 0;
                while (i4 < i3) {
                    if (objArr[i4].equals(objArr2[i4])) {
                        i4++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        i2 = (i2 + i4) * 31;
        Object[] objArr = this.d;
        for (int i6 = 0; i6 < this.b; i6++) {
            i3 = (i3 * 31) + objArr[i6].hashCode();
        }
        return i2 + i3;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, Object obj) {
        if (this.f) {
            int i2 = this.b;
            int[] iArr = this.c;
            if (i2 == iArr.length) {
                i2 += i2 >= 4 ? i2 >> 1 : 8;
                this.c = Arrays.copyOf(iArr, i2);
                this.d = Arrays.copyOf(this.d, i2);
            }
            int[] iArr2 = this.c;
            int i3 = this.b;
            iArr2[i3] = i;
            this.d[i3] = obj;
            this.b = i3 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
