package defpackage;

/* renamed from: ohu */
final class ohu {
    private static final int[] a = new int[]{ozp.f("isom"), ozp.f("iso2"), ozp.f("iso3"), ozp.f("iso4"), ozp.f("iso5"), ozp.f("iso6"), ozp.f("avc1"), ozp.f("hvc1"), ozp.f("hev1"), ozp.f("av01"), ozp.f("mp41"), ozp.f("mp42"), ozp.f("3g2a"), ozp.f("3g2b"), ozp.f("3gr6"), ozp.f("3gs6"), ozp.f("3ge6"), ozp.f("3gg6"), ozp.f("M4V "), ozp.f("M4A "), ozp.f("f4v "), ozp.f("kddi"), ozp.f("M4VP"), ozp.f("qt  "), ozp.f("MSNV"), ozp.f("dby1")};

    public static boolean a(ofp ofp, boolean z) {
        boolean z2;
        boolean z3;
        ofp ofp2 = ofp;
        long j = ((ofl) ofp2).b;
        long j2 = 4096;
        long j3 = -1;
        if (j != -1 && j <= 4096) {
            j2 = j;
        }
        int i = (int) j2;
        oza oza = new oza(64);
        int i2 = 0;
        int i3 = i;
        i = 0;
        Object obj = null;
        while (i < i3) {
            long m;
            oza.a(8);
            ofp2.c(oza.a, i2, 8);
            long i4 = oza.i();
            int k = oza.k();
            int i5 = 16;
            if (i4 == 1) {
                ofp2.c(oza.a, 8, 8);
                oza.b(16);
                m = oza.m();
            } else {
                long j4;
                if (i4 == 0) {
                    j4 = i4;
                    m = ((ofl) ofp2).b;
                    if (m != j3) {
                        m = (m - ofp.b()) + 8;
                        i5 = 8;
                    }
                } else {
                    j4 = i4;
                }
                m = j4;
                i5 = 8;
            }
            if (j != j3 && ((long) i) + m > j) {
                return i2;
            }
            j3 = (long) i5;
            if (m >= j3) {
                i += i5;
                if (k != ogy.Q) {
                    if (k != ogy.X && k != ogy.Z) {
                        int i6 = i3;
                        long j5 = m;
                        if ((((long) i) + m) - j3 >= ((long) i6)) {
                            break;
                        }
                        int i7 = (int) (j5 - j3);
                        i += i7;
                        if (k == ogy.a) {
                            if (i7 < 8) {
                                return false;
                            }
                            Object obj2;
                            oza.a(i7);
                            ofp2.c(oza.a, 0, i7);
                            int i8 = i7 >> 2;
                            for (i7 = 0; i7 < i8; i7++) {
                                if (i7 != 1) {
                                    i2 = oza.k();
                                    if ((i2 >>> 8) != ozp.f("3gp")) {
                                        int[] iArr = a;
                                        int length = iArr.length;
                                        int i9 = 0;
                                        while (i9 < length) {
                                            if (iArr[i9] != i2) {
                                                i9++;
                                            }
                                        }
                                        continue;
                                    }
                                    obj2 = 1;
                                    break;
                                }
                                oza.d(4);
                            }
                            obj2 = obj;
                            if (obj2 == null) {
                                return false;
                            }
                            obj = obj2;
                        } else if (i7 != 0) {
                            ofp2.b(i7);
                        }
                        i3 = i6;
                        j3 = -1;
                        i2 = 0;
                    } else {
                        z2 = false;
                        z3 = true;
                        break;
                    }
                }
                i3 += (int) m;
                if (j != -1 && ((long) i3) > j) {
                    i3 = (int) j;
                }
                j3 = -1;
            } else {
                return false;
            }
        }
        z2 = false;
        z3 = false;
        return (obj == null || z != z3) ? z2 : true;
    }
}
