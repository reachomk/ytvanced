package defpackage;

/* renamed from: nsy */
final class nsy {
    private static final int[] a = new int[]{nxf.c("isom"), nxf.c("iso2"), nxf.c("iso3"), nxf.c("iso4"), nxf.c("iso5"), nxf.c("iso6"), nxf.c("avc1"), nxf.c("hvc1"), nxf.c("hev1"), nxf.c("mp41"), nxf.c("mp42"), nxf.c("3g2a"), nxf.c("3g2b"), nxf.c("3gr6"), nxf.c("3gs6"), nxf.c("3ge6"), nxf.c("3gg6"), nxf.c("M4V "), nxf.c("M4A "), nxf.c("f4v "), nxf.c("kddi"), nxf.c("M4VP"), nxf.c("qt  "), nxf.c("MSNV")};

    public static boolean a(nrb nrb, boolean z) {
        boolean z2;
        nrb nrb2 = nrb;
        long j = ((nqx) nrb2).b;
        long j2 = 4096;
        if (j != -1 && j <= 4096) {
            j2 = j;
        }
        int i = (int) j2;
        nwz nwz = new nwz(64);
        int i2 = 0;
        Object obj = null;
        while (i2 < i) {
            int i3;
            nrb2.c(nwz.a, 0, 8);
            nwz.c(0);
            long h = nwz.h();
            int j3 = nwz.j();
            if (h == 1) {
                nrb2.c(nwz.a, 8, 8);
                h = nwz.p();
                i3 = 16;
            } else {
                i3 = 8;
            }
            long j4 = (long) i3;
            if (h >= j4) {
                i2 += i3;
                if (j3 != nsg.E) {
                    if (j3 != nsg.N && j3 != nsg.P) {
                        int i4 = j3;
                        if ((((long) i2) + h) - j4 >= ((long) i)) {
                            break;
                        }
                        int i5 = (int) (h - j4);
                        i2 += i5;
                        if (i4 == nsg.d) {
                            if (i5 >= 8) {
                                Object obj2;
                                if (nwz.c() < i5) {
                                    nwz.a(new byte[i5], i5);
                                }
                                nrb2.c(nwz.a, 0, i5);
                                i5 >>= 2;
                                for (j3 = 0; j3 < i5; j3++) {
                                    if (j3 != 1) {
                                        int j5 = nwz.j();
                                        if ((j5 >>> 8) != nxf.c("3gp")) {
                                            int[] iArr = a;
                                            int length = iArr.length;
                                            int i6 = 0;
                                            while (i6 < length) {
                                                if (iArr[i6] != j5) {
                                                    i6++;
                                                }
                                            }
                                            continue;
                                        }
                                        obj2 = 1;
                                        break;
                                    }
                                    nwz.d(4);
                                }
                                obj2 = obj;
                                if (obj2 != null) {
                                    obj = obj2;
                                }
                            }
                            return false;
                        } else if (i5 != 0) {
                            nrb2.b(i5);
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                }
            } else {
                return false;
            }
        }
        z2 = false;
        if (obj == null || z != z2) {
            return false;
        }
        return true;
    }
}
