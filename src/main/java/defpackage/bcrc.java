package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bcrc */
public final class bcrc extends bcqs {
    public static final bcrc G = bcrc.b(bcpt.a);
    private static final ConcurrentHashMap H = new ConcurrentHashMap();
    public static final long serialVersionUID = -861407383323710522L;

    private static bcrc b(bcpt bcpt) {
        return bcrc.a(bcpt, 4);
    }

    /* Access modifiers changed, original: final */
    public final int M() {
        return -292275054;
    }

    /* Access modifiers changed, original: final */
    public final int N() {
        return 292278993;
    }

    /* Access modifiers changed, original: final */
    public final long O() {
        return 15778476000L;
    }

    /* Access modifiers changed, original: final */
    public final long P() {
        return 31083597720000L;
    }

    private static bcrc a(bcpt bcpt, int i) {
        if (bcpt == null) {
            bcpt = bcpt.a();
        }
        bcrc[] bcrcArr = (bcrc[]) H.get(bcpt);
        if (bcrcArr == null) {
            bcrcArr = new bcrc[7];
            bcrc[] bcrcArr2 = (bcrc[]) H.putIfAbsent(bcpt, bcrcArr);
            if (bcrcArr2 != null) {
                bcrcArr = bcrcArr2;
            }
        }
        int i2 = i - 1;
        try {
            bcrc bcrc = bcrcArr[i2];
            if (bcrc == null) {
                synchronized (bcrcArr) {
                    bcrc = bcrcArr[i2];
                    if (bcrc == null) {
                        bcrc bcrc2;
                        if (bcpt == bcpt.a) {
                            bcrc2 = new bcrc(null, i);
                        } else {
                            bcrc2 = new bcrc(bcrg.a(bcrc.a(bcpt.a, i), bcpt), i);
                        }
                        bcrcArr[i2] = bcrc2;
                        bcrc = bcrc2;
                    }
                }
            }
            return bcrc;
        } catch (ArrayIndexOutOfBoundsException unused) {
            StringBuilder stringBuilder = new StringBuilder(43);
            stringBuilder.append("Invalid min days in first week: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private bcrc(bcpl bcpl, int i) {
        super(bcpl, i);
    }

    private final Object readResolve() {
        bcpl bcpl = this.a;
        int i = this.F;
        if (i == 0) {
            i = 4;
        }
        if (bcpl != null) {
            return bcrc.a(bcpl.a(), i);
        }
        return bcrc.a(bcpt.a, i);
    }

    public final bcpl b() {
        return G;
    }

    public final bcpl a(bcpt bcpt) {
        return bcpt != super.a() ? bcrc.b(bcpt) : this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bcqn bcqn) {
        if (this.a == null) {
            bcqn.a = bcqp.n;
            bcqn.b = bcqp.o;
            bcqn.c = bcqp.p;
            bcqn.d = bcqp.q;
            bcqn.e = bcqp.r;
            bcqn.f = bcqp.s;
            bcqn.g = bcqp.t;
            bcqn.m = bcqp.u;
            bcqn.n = bcqp.v;
            bcqn.o = bcqp.w;
            bcqn.p = bcqp.x;
            bcqn.q = bcqp.y;
            bcqn.r = bcqp.z;
            bcqn.s = bcqp.A;
            bcqn.u = bcqp.B;
            bcqn.t = bcqp.C;
            bcqn.v = bcqp.D;
            bcqn.w = bcqp.E;
            bcqn.E = new bcqw(this);
            bcqn.F = new bcrd(bcqn.E, this);
            bcqn.H = new bcro(new bcrv(bcqn.F), bcpm.c);
            bcqn.G = new bcrv(new bcrz((bcro) bcqn.H), bcpm.d);
            bcqn.I = new bcqy(this);
            bcqn.x = new bcqz(this, bcqn.f);
            bcqn.y = new bcqq(this, bcqn.f);
            bcqn.z = new bcqt(this, bcqn.f);
            bcqn.D = new bcra(this);
            bcqn.B = new bcqx(this);
            bcqn.A = new bcqu(this, bcqn.g);
            bcqn.C = new bcrv(new bcrz(bcqn.B, bcpm.i), bcpm.i);
            bcqn.j = bcqn.E.d();
            bcqn.k = bcqn.H.d();
            bcqn.i = bcqn.D.d();
            bcqn.h = bcqn.B.d();
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean c(int i) {
        boolean z = false;
        if ((i & 3) == 0) {
            if (i % 100 == 0) {
                return i % 400 != 0 ? z : true;
            } else {
                z = true;
            }
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:5:0x001b, code skipped:
            if (c(r7) != false) goto L_0x000e;
     */
    public final long d(int r7) {
        /*
        r6 = this;
        r0 = r7 / 100;
        if (r7 >= 0) goto L_0x0011;
    L_0x0004:
        r1 = r7 + 3;
        r1 = r1 >> 2;
        r1 = r1 - r0;
        r0 = r0 + 3;
        r0 = r0 >> 2;
        r1 = r1 + r0;
    L_0x000e:
        r1 = r1 + -1;
        goto L_0x001e;
    L_0x0011:
        r1 = r7 >> 2;
        r1 = r1 - r0;
        r0 = r0 >> 2;
        r1 = r1 + r0;
        r0 = r6.c(r7);
        if (r0 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x000e;
    L_0x001e:
        r2 = (long) r7;
        r4 = 365; // 0x16d float:5.11E-43 double:1.803E-321;
        r2 = r2 * r4;
        r7 = -719527; // 0xfffffffffff50559 float:NaN double:NaN;
        r1 = r1 + r7;
        r0 = (long) r1;
        r2 = r2 + r0;
        r0 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r2 = r2 * r0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcrc.d(int):long");
    }

    public final /* synthetic */ String toString() {
        StringBuilder stringBuilder = new StringBuilder(60);
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            name = name.substring(lastIndexOf + 1);
        }
        stringBuilder.append(name);
        stringBuilder.append('[');
        bcpt a = super.a();
        if (a != null) {
            stringBuilder.append(a.d);
        }
        if (this.F != 4) {
            stringBuilder.append(",mdfw=");
            stringBuilder.append(this.F);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final /* synthetic */ int hashCode() {
        return ((getClass().getName().hashCode() * 11) + super.a().hashCode()) + this.F;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        boolean z = false;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                bcqp bcqp = (bcqp) obj;
                if (this.F == bcqp.L()) {
                    if (!super.a().equals(bcqp.a())) {
                        return false;
                    }
                }
            }
            return z;
        }
        z = true;
        return z;
    }

    public final /* bridge */ /* synthetic */ int L() {
        return this.F;
    }

    public final /* bridge */ /* synthetic */ bcpt a() {
        return super.a();
    }
}
