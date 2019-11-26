package defpackage;

import java.util.Arrays;

/* renamed from: aoau */
public final class aoau {
    public static final aoau a = new aoau(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    static aoau a() {
        return new aoau();
    }

    static aoau a(aoau aoau, aoau aoau2) {
        int i = aoau.b + aoau2.b;
        int[] copyOf = Arrays.copyOf(aoau.c, i);
        System.arraycopy(aoau2.c, 0, copyOf, aoau.b, aoau2.b);
        Object[] copyOf2 = Arrays.copyOf(aoau.d, i);
        System.arraycopy(aoau2.d, 0, copyOf2, aoau.b, aoau2.b);
        return new aoau(i, copyOf, copyOf2, true);
    }

    private aoau() {
        this(0, new int[8], new Object[8], true);
    }

    private aoau(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final void b() {
        this.f = false;
    }

    public final void a(aobl aobl) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int b = aobj.b(i2);
                i2 = aobj.a(i2);
                if (i2 == 0) {
                    aobl.a(b, ((Long) obj).longValue());
                } else if (i2 == 1) {
                    aobl.d(b, ((Long) obj).longValue());
                } else if (i2 == 2) {
                    aobl.a(b, (anvu) obj);
                } else if (i2 == 3) {
                    anwu anwu = (anwu) aobl;
                    anwu.a.b(b, 3);
                    ((aoau) obj).a(aobl);
                    anwu.a.b(b, 4);
                } else if (i2 == 5) {
                    aobl.d(b, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(anyg.f());
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
            int b = aobj.b(i3);
            i3 = aobj.a(i3);
            if (i3 == 0) {
                i3 = anwm.e(b, ((Long) this.d[i]).longValue());
            } else if (i3 == 1) {
                ((Long) this.d[i]).longValue();
                i3 = anwm.j(b);
            } else if (i3 == 2) {
                i3 = anwm.c(b, (anvu) this.d[i]);
            } else if (i3 == 3) {
                i3 = anwm.o(b);
                i3 = (i3 + i3) + ((aoau) this.d[i]).c();
            } else if (i3 == 5) {
                ((Integer) this.d[i]).intValue();
                i3 = anwm.h(b);
            } else {
                throw new IllegalStateException(anyg.f());
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
        if (obj != null && (obj instanceof aoau)) {
            aoau aoau = (aoau) obj;
            int i = this.b;
            if (i == aoau.b) {
                int[] iArr = this.c;
                int[] iArr2 = aoau.c;
                for (int i2 = 0; i2 < i; i2++) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                }
                Object[] objArr = this.d;
                Object[] objArr2 = aoau.d;
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
