package defpackage;

/* renamed from: aika */
public final /* synthetic */ class aika {
    public static aikr a(aikc aikc, aizl aizl, aiku aiku, boolean z) {
        int max;
        aizn aizn = aizl.e;
        aiqq aiqq = aizl.f;
        aikr b = aiqq != null ? aiku.b(aiqq) : null;
        int i = 0;
        int a = aikc.a(0);
        int a2 = aikc.a(1);
        int ordinal = aizn.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                max = Math.max(aikc.e(), 0) - 1;
                if (z && a > 0) {
                    max = (max + a) % a;
                }
                if (xty.a(max, 0, a)) {
                    return aikc.a(0, max);
                }
                return null;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        if (b != null) {
                            int[] iArr = aikc.n;
                            int length = iArr.length;
                            while (i < length) {
                                a = iArr[i];
                                int a3 = aikc.a(a, b);
                                if (a3 != -1) {
                                    return aikc.a(a, a3);
                                }
                                i++;
                            }
                        }
                        return null;
                    } else if (ordinal != 5) {
                        return null;
                    } else {
                        return b;
                    }
                } else if (z || aikc.e() != a - 1 || a2 <= 0) {
                    return null;
                } else {
                    return aikc.a(1, 0);
                }
            } else if (aikc.e() == -1) {
                return null;
            }
        }
        max = aikc.e() + 1;
        if (z && a > 0) {
            max %= a;
        }
        if (xty.a(max, 0, a)) {
            return aikc.a(0, max);
        }
        if (aizn != aizn.NEXT || a2 <= 0) {
            return null;
        }
        return aikc.a(1, 0);
    }
}
