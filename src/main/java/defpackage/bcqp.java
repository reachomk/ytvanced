package defpackage;

/* renamed from: bcqp */
abstract class bcqp extends bcqk {
    public static final bcpn A = new bcru(bcpm.q, q, s);
    public static final bcpn B = new bcru(bcpm.n, q, r);
    public static final bcpn C = new bcsd(A, bcpm.p);
    public static final bcpn D = new bcsd(B, bcpm.o);
    public static final bcpn E = new bcqo();
    public static final bcpx n = bcrs.a;
    public static final bcpx o = new bcrw(bcpw.k, 1000);
    public static final bcpx p = new bcrw(bcpw.j, 60000);
    public static final bcpx q = new bcrw(bcpw.i, 3600000);
    public static final bcpx r = new bcrw(bcpw.h, 43200000);
    public static final bcpx s = new bcrw(bcpw.g, 86400000);
    public static final long serialVersionUID = 8283225332206808863L;
    public static final bcpx t = new bcrw(bcpw.f, 604800000);
    public static final bcpn u = new bcru(bcpm.w, n, o);
    public static final bcpn v = new bcru(bcpm.v, n, s);
    public static final bcpn w = new bcru(bcpm.u, o, p);
    public static final bcpn x = new bcru(bcpm.t, o, s);
    public static final bcpn y = new bcru(bcpm.s, p, q);
    public static final bcpn z = new bcru(bcpm.r, p, s);
    public final int F;
    private final transient bcqr[] G = new bcqr[1024];

    bcqp(bcpl bcpl, int i) {
        super(bcpl, null);
        if (i <= 0 || i > 7) {
            StringBuilder stringBuilder = new StringBuilder(43);
            stringBuilder.append("Invalid min days in first week: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.F = i;
    }

    public int L() {
        throw null;
    }

    public abstract int M();

    public abstract int N();

    public abstract long O();

    public abstract long P();

    public abstract int a(int i, int i2);

    public abstract int a(long j, int i);

    /* Access modifiers changed, original: protected */
    public void a(bcqn bcqn) {
        throw null;
    }

    public abstract long b(int i, int i2);

    /* Access modifiers changed, original: 0000 */
    public int c(long j, int i) {
        throw null;
    }

    public abstract boolean c(int i);

    public abstract long d(int i);

    public abstract long d(long j, int i);

    public bcpt a() {
        bcpl bcpl = this.a;
        if (bcpl == null) {
            return bcpt.a;
        }
        return bcpl.a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bcqp bcqp = (bcqp) obj;
            return L() == bcqp.L() && a().equals(bcqp.a());
        }
    }

    public int hashCode() {
        return ((getClass().getName().hashCode() * 11) + a().hashCode()) + L();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        stringBuilder.append(name);
        stringBuilder.append('[');
        bcpt a = a();
        if (a != null) {
            stringBuilder.append(a.d);
        }
        if (L() != 4) {
            stringBuilder.append(",mdfw=");
            stringBuilder.append(L());
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    public final int a(int i) {
        return (int) ((e(i + 1) - e(i)) / 604800000);
    }

    private final long e(int i) {
        long b = b(i);
        i = bcqp.d(b);
        return i <= 8 - this.F ? b - (((long) (i - 1)) * 86400000) : b + (((long) (8 - i)) * 86400000);
    }

    /* Access modifiers changed, original: final */
    public final long b(int i) {
        int i2 = i & 1023;
        bcqr bcqr = this.G[i2];
        if (bcqr == null || bcqr.a != i) {
            bcqr = new bcqr(i, d(i));
            this.G[i2] = bcqr;
        }
        return bcqr.b;
    }

    /* Access modifiers changed, original: final */
    public final long a(int i, int i2, int i3) {
        return (b(i) + b(i, i2)) + (((long) (i3 - 1)) * 86400000);
    }

    /* Access modifiers changed, original: final */
    public final int a(long j) {
        O();
        long P = (j >> 1) + P();
        if (P < 0) {
            P -= 15778475999L;
        }
        int i = (int) (P / 15778476000L);
        long b = b(i);
        long j2 = j - b;
        if (j2 < 0) {
            i--;
        } else {
            long j3 = 31536000000L;
            if (j2 >= 31536000000L) {
                if (c(i)) {
                    j3 = 31622400000L;
                }
                if (b + j3 <= j) {
                    return i + 1;
                }
            }
        }
        return i;
    }

    /* Access modifiers changed, original: final */
    public final int a(long j, int i, int i2) {
        return ((int) ((j - (b(i) + b(i, i2))) / 86400000)) + 1;
    }

    /* Access modifiers changed, original: final */
    public final int b(long j, int i) {
        return ((int) ((j - b(i)) / 86400000)) + 1;
    }

    /* Access modifiers changed, original: final */
    public final int b(long j) {
        int a = a(j);
        int e = e(j, a);
        if (e == 1) {
            return a(j + 604800000);
        }
        return e > 51 ? a(j - 1209600000) : a;
    }

    /* Access modifiers changed, original: final */
    public final int c(long j) {
        return e(j, a(j));
    }

    private final int e(long j, int i) {
        long e = e(i);
        if (j < e) {
            return a(i - 1);
        }
        if (j < e(i + 1)) {
            return ((int) ((j - e) / 604800000)) + 1;
        }
        return 1;
    }

    static int d(long j) {
        if (j < 0) {
            j = (j - 86399999) / 86400000;
            if (j < -3) {
                return ((int) ((j + 4) % 7)) + 7;
            }
        }
        j /= 86400000;
        return ((int) ((j + 3) % 7)) + 1;
    }

    static int e(long j) {
        if (j < 0) {
            return ((int) ((j + 1) % 86400000)) + 86399999;
        }
        return (int) (j % 86400000);
    }

    /* Access modifiers changed, original: final */
    public final int f(long j) {
        int a = a(j);
        return a(a, a(j, a));
    }
}
