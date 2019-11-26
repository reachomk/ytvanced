package defpackage;

import java.util.Arrays;

/* renamed from: rjx */
public final class rjx extends rio implements Cloneable {
    public long a = 0;
    public long b = 0;
    public int c = 0;
    public byte[] d;
    public long e;
    public byte[] f;
    public boolean g;
    private long h = 0;
    private String i = "";
    private String j = "";
    private int k = 0;
    private boolean l = false;
    private rka[] m;
    private byte[] n;
    private rjg o;
    private String p;
    private String q;
    private rjv r;
    private String s;
    private rjy t;
    private String u;
    private int v;
    private int[] w;
    private long x;
    private rji y;

    public rjx() {
        if (rka.a == null) {
            synchronized (ris.b) {
                if (rka.a == null) {
                    rka.a = new rka[0];
                }
            }
        }
        this.m = rka.a;
        this.n = riv.e;
        this.o = null;
        this.d = riv.e;
        this.p = "";
        this.q = "";
        this.r = null;
        this.s = "";
        this.e = 180000;
        this.t = null;
        this.f = riv.e;
        this.u = "";
        this.v = 0;
        this.w = riv.a;
        this.x = 0;
        this.y = null;
        this.g = false;
        this.V = null;
        this.W = -1;
    }

    private final rjx e() {
        try {
            rjx rjx = (rjx) super.clone();
            rka[] rkaArr = this.m;
            if (rkaArr != null) {
                int length = rkaArr.length;
                if (length > 0) {
                    rjx.m = new rka[length];
                    length = 0;
                    while (true) {
                        rka[] rkaArr2 = this.m;
                        if (length >= rkaArr2.length) {
                            break;
                        }
                        rka rka = rkaArr2[length];
                        if (rka != null) {
                            rjx.m[length] = rka.clone();
                        }
                        length++;
                    }
                }
            }
            rjg rjg = this.o;
            if (rjg != null) {
                rjx.o = rjg;
            }
            rjv rjv = this.r;
            if (rjv != null) {
                rjx.r = rjv.clone();
            }
            rjy rjy = this.t;
            if (rjy != null) {
                rjx.t = rjy.clone();
            }
            int[] iArr = this.w;
            if (iArr != null && iArr.length > 0) {
                rjx.w = (int[]) iArr.clone();
            }
            rji rji = this.y;
            if (rji != null) {
                rjx.y = rji;
            }
            return rjx;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rjx) {
            rjx rjx = (rjx) obj;
            if (this.a == rjx.a && this.b == rjx.b && this.h == rjx.h) {
                String str = this.i;
                if (str == null) {
                    if (rjx.i != null) {
                        return false;
                    }
                } else if (!str.equals(rjx.i)) {
                    return false;
                }
                if (this.c == rjx.c) {
                    str = this.j;
                    if (str == null) {
                        if (rjx.j != null) {
                            return false;
                        }
                    } else if (!str.equals(rjx.j)) {
                        return false;
                    }
                    if (this.k == rjx.k && this.l == rjx.l && ris.a(this.m, rjx.m) && Arrays.equals(this.n, rjx.n)) {
                        rjg rjg = this.o;
                        if (rjg == null) {
                            if (rjx.o != null) {
                                return false;
                            }
                        } else if (!rjg.equals(rjx.o)) {
                            return false;
                        }
                        if (Arrays.equals(this.d, rjx.d)) {
                            str = this.p;
                            if (str == null) {
                                if (rjx.p != null) {
                                    return false;
                                }
                            } else if (!str.equals(rjx.p)) {
                                return false;
                            }
                            str = this.q;
                            if (str == null) {
                                if (rjx.q != null) {
                                    return false;
                                }
                            } else if (!str.equals(rjx.q)) {
                                return false;
                            }
                            rjv rjv = this.r;
                            if (rjv == null) {
                                if (rjx.r != null) {
                                    return false;
                                }
                            } else if (!rjv.equals(rjx.r)) {
                                return false;
                            }
                            str = this.s;
                            if (str == null) {
                                if (rjx.s != null) {
                                    return false;
                                }
                            } else if (!str.equals(rjx.s)) {
                                return false;
                            }
                            if (this.e == rjx.e) {
                                rjy rjy = this.t;
                                if (rjy == null) {
                                    if (rjx.t != null) {
                                        return false;
                                    }
                                } else if (!rjy.equals(rjx.t)) {
                                    return false;
                                }
                                if (Arrays.equals(this.f, rjx.f)) {
                                    str = this.u;
                                    if (str == null) {
                                        if (rjx.u != null) {
                                            return false;
                                        }
                                    } else if (!str.equals(rjx.u)) {
                                        return false;
                                    }
                                    if (this.v == rjx.v && ris.a(this.w, rjx.w) && this.x == rjx.x) {
                                        rji rji = this.y;
                                        if (rji == null) {
                                            if (rjx.y != null) {
                                                return false;
                                            }
                                        } else if (!rji.equals(rjx.y)) {
                                            return false;
                                        }
                                        if (this.g == rjx.g) {
                                            riq riq = this.V;
                                            if (riq != null && !riq.a()) {
                                                return this.V.equals(rjx.V);
                                            }
                                            riq riq2 = rjx.V;
                                            return riq2 == null || riq2.a();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        long j = this.a;
        long j2 = this.b;
        long j3 = this.h;
        hashCode = (((((((hashCode + 527) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31;
        String str = this.i;
        int i = 0;
        hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.c) * 31;
        str = this.j;
        hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.k) * 31;
        int i2 = 1237;
        int i3 = !this.l ? 1237 : 1231;
        int a = ris.a(this.m);
        int hashCode2 = Arrays.hashCode(this.n);
        rjg rjg = this.o;
        hashCode = (((((((((hashCode + i3) * 31) + a) * 31) + hashCode2) * 31) + (rjg != null ? rjg.hashCode() : 0)) * 31) + Arrays.hashCode(this.d)) * 31;
        str = this.p;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.q;
        i3 = str != null ? str.hashCode() : 0;
        rjv rjv = this.r;
        hashCode = (((hashCode + i3) * 31) + (rjv != null ? rjv.hashCode() : 0)) * 31;
        str = this.s;
        i3 = str != null ? str.hashCode() : 0;
        j3 = this.e;
        rjy rjy = this.t;
        hashCode = (((((((hashCode + i3) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (rjy != null ? rjy.hashCode() : 0)) * 31) + Arrays.hashCode(this.f)) * 31;
        str = this.u;
        i3 = str != null ? str.hashCode() : 0;
        a = this.v;
        hashCode2 = ris.a(this.w);
        long j4 = this.x;
        rji rji = this.y;
        hashCode = (((((((((hashCode + i3) * 31) + a) * 31) + hashCode2) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + (rji != null ? rji.hashCode() : 0)) * 31;
        if (this.g) {
            i2 = 1231;
        }
        hashCode = (hashCode + i2) * 31;
        riq riq = this.V;
        if (!(riq == null || riq.a())) {
            i = this.V.hashCode();
        }
        return hashCode + i;
    }

    public final void a(rim rim) {
        int i;
        long j = this.a;
        if (j != 0) {
            rim.a(1, j);
        }
        String str = this.i;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            rim.a(2, this.i);
        }
        rka[] rkaArr = this.m;
        int i2 = 0;
        if (rkaArr != null && rkaArr.length > 0) {
            i = 0;
            while (true) {
                rka[] rkaArr2 = this.m;
                if (i >= rkaArr2.length) {
                    break;
                }
                riu riu = rkaArr2[i];
                if (riu != null) {
                    rim.a(3, riu);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.n, riv.e)) {
            rim.a(4, this.n);
        }
        if (!Arrays.equals(this.d, riv.e)) {
            rim.a(6, this.d);
        }
        riu riu2 = this.r;
        if (riu2 != null) {
            rim.a(7, riu2);
        }
        str = this.p;
        if (!(str == null || str.equals(str2))) {
            rim.a(8, this.p);
        }
        rgh rgh = this.o;
        if (rgh != null) {
            rim.a(9, rgh);
        }
        if (this.l) {
            rim.a(10, true);
        }
        i = this.c;
        if (i != 0) {
            rim.a(11, i);
        }
        i = this.k;
        if (i != 0) {
            rim.a(12, i);
        }
        str = this.q;
        if (!(str == null || str.equals(str2))) {
            rim.a(13, this.q);
        }
        str = this.s;
        if (!(str == null || str.equals(str2))) {
            rim.a(14, this.s);
        }
        long j2 = this.e;
        if (j2 != 180000) {
            rim.c(15, 0);
            rim.a(rim.c(j2));
        }
        riu2 = this.t;
        if (riu2 != null) {
            rim.a(16, riu2);
        }
        j2 = this.b;
        if (j2 != 0) {
            rim.a(17, j2);
        }
        if (!Arrays.equals(this.f, riv.e)) {
            rim.a(18, this.f);
        }
        i = this.v;
        if (i != 0) {
            rim.a(19, i);
        }
        int[] iArr = this.w;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                iArr = this.w;
                if (i2 >= iArr.length) {
                    break;
                }
                rim.a(20, iArr[i2]);
                i2++;
            }
        }
        long j3 = this.h;
        if (j3 != 0) {
            rim.a(21, j3);
        }
        j3 = this.x;
        if (j3 != 0) {
            rim.a(22, j3);
        }
        rgh = this.y;
        if (rgh != null) {
            rim.a(23, rgh);
        }
        str = this.u;
        if (!(str == null || str.equals(str2))) {
            rim.a(24, this.u);
        }
        if (this.g) {
            rim.a(25, true);
        }
        str = this.j;
        if (!(str == null || str.equals(str2))) {
            rim.a(26, this.j);
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int i;
        int a = super.a();
        long j = this.a;
        if (j != 0) {
            a += rim.b(1, j);
        }
        String str = this.i;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            a += rim.b(2, this.i);
        }
        rka[] rkaArr = this.m;
        int i2 = 0;
        if (rkaArr != null && rkaArr.length > 0) {
            i = a;
            a = 0;
            while (true) {
                rka[] rkaArr2 = this.m;
                if (a >= rkaArr2.length) {
                    break;
                }
                riu riu = rkaArr2[a];
                if (riu != null) {
                    i += rim.b(3, riu);
                }
                a++;
            }
            a = i;
        }
        if (!Arrays.equals(this.n, riv.e)) {
            a += rim.b(4, this.n);
        }
        if (!Arrays.equals(this.d, riv.e)) {
            a += rim.b(6, this.d);
        }
        riu riu2 = this.r;
        if (riu2 != null) {
            a += rim.b(7, riu2);
        }
        str = this.p;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(8, this.p);
        }
        rgh rgh = this.o;
        if (rgh != null) {
            a += rdt.c(9, rgh);
        }
        if (this.l) {
            a += rim.b(10) + 1;
        }
        i = this.c;
        if (i != 0) {
            a += rim.b(11, i);
        }
        i = this.k;
        if (i != 0) {
            a += rim.b(12, i);
        }
        str = this.q;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(13, this.q);
        }
        str = this.s;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(14, this.s);
        }
        long j2 = this.e;
        if (j2 != 180000) {
            a += rim.b(15) + rim.b(rim.c(j2));
        }
        riu2 = this.t;
        if (riu2 != null) {
            a += rim.b(16, riu2);
        }
        j2 = this.b;
        if (j2 != 0) {
            a += rim.b(17, j2);
        }
        if (!Arrays.equals(this.f, riv.e)) {
            a += rim.b(18, this.f);
        }
        i = this.v;
        if (i != 0) {
            a += rim.b(19, i);
        }
        int[] iArr = this.w;
        if (iArr != null && iArr.length > 0) {
            int length;
            i = 0;
            while (true) {
                int[] iArr2 = this.w;
                length = iArr2.length;
                if (i2 >= length) {
                    break;
                }
                i += rim.a(iArr2[i2]);
                i2++;
            }
            a = (a + i) + (length + length);
        }
        long j3 = this.h;
        if (j3 != 0) {
            a += rim.b(21, j3);
        }
        j3 = this.x;
        if (j3 != 0) {
            a += rim.b(22, j3);
        }
        rgh = this.y;
        if (rgh != null) {
            a += rdt.c(23, rgh);
        }
        str = this.u;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(24, this.u);
        }
        if (this.g) {
            a += rim.b(25) + 1;
        }
        str = this.j;
        return (str == null || str.equals(str2)) ? a : a + rim.b(26, this.j);
    }

    public final /* synthetic */ rio b() {
        return e();
    }

    public final /* synthetic */ riu c() {
        return e();
    }

    public final /* synthetic */ Object clone() {
        return e();
    }
}
