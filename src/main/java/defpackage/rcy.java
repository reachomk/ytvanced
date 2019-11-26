package defpackage;

/* renamed from: rcy */
final class rcy {
    static int a(byte[] bArr, int i, rcx rcx) {
        int i2 = i + 1;
        i = bArr[i];
        if (i < (byte) 0) {
            return rcy.a(i, bArr, i2, rcx);
        }
        rcx.a = i;
        return i2;
    }

    static int a(int i, byte[] bArr, int i2, rcx rcx) {
        i &= 127;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b >= (byte) 0) {
            rcx.a = i | (b << 7);
            return i3;
        }
        i |= (b & 127) << 7;
        i2 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= (byte) 0) {
            rcx.a = i | (b2 << 14);
            return i2;
        }
        i |= (b2 & 127) << 14;
        i3 = i2 + 1;
        b = bArr[i2];
        if (b >= (byte) 0) {
            rcx.a = i | (b << 21);
            return i3;
        }
        i |= (b & 127) << 21;
        i2 = i3 + 1;
        b2 = bArr[i3];
        if (b2 < (byte) 0) {
            i |= (b2 & 127) << 28;
            while (true) {
                i3 = i2 + 1;
                if (bArr[i2] < (byte) 0) {
                    i2 = i3;
                } else {
                    rcx.a = i;
                    return i3;
                }
            }
        }
        rcx.a = i | (b2 << 28);
        return i2;
    }

    static int b(byte[] bArr, int i, rcx rcx) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
            i = i2 + 1;
            byte b = bArr[i2];
            j = (j & 127) | (((long) (b & 127)) << 7);
            int i3 = 7;
            while (b < (byte) 0) {
                i2 = i + 1;
                byte b2 = bArr[i];
                i3 += 7;
                j |= ((long) (b2 & 127)) << i3;
                int i4 = i2;
                b = b2;
                i = i4;
            }
            rcx.b = j;
            return i;
        }
        rcx.b = j;
        return i2;
    }

    static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    static long b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(rcy.b(bArr, i));
    }

    static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(rcy.a(bArr, i));
    }

    static int c(byte[] bArr, int i, rcx rcx) {
        i = rcy.a(bArr, i, rcx);
        int i2 = rcx.a;
        if (i2 < 0) {
            throw rfk.b();
        } else if (i2 != 0) {
            rcx.c = new String(bArr, i, i2, rfc.a);
            return i + i2;
        } else {
            rcx.c = "";
            return i;
        }
    }

    static int d(byte[] bArr, int i, rcx rcx) {
        i = rcy.a(bArr, i, rcx);
        int i2 = rcx.a;
        if (i2 < 0) {
            throw rfk.b();
        } else if (i2 != 0) {
            int i3 = i + i2;
            if (rib.a(bArr, i, i3)) {
                rcx.c = new String(bArr, i, i2, rfc.a);
                return i3;
            }
            throw rfk.i();
        } else {
            rcx.c = "";
            return i;
        }
    }

    static int e(byte[] bArr, int i, rcx rcx) {
        i = rcy.a(bArr, i, rcx);
        int i2 = rcx.a;
        if (i2 < 0) {
            throw rfk.b();
        } else if (i2 > bArr.length - i) {
            throw rfk.a();
        } else if (i2 == 0) {
            rcx.c = rdg.a;
            return i;
        } else {
            rcx.c = rdg.a(bArr, i, i2);
            return i + i2;
        }
    }

    static int a(int i, byte[] bArr, int i2, int i3, rfi rfi, rcx rcx) {
        rez rez = (rez) rfi;
        i2 = rcy.a(bArr, i2, rcx);
        rez.c(rcx.a);
        while (i2 < i3) {
            int a = rcy.a(bArr, i2, rcx);
            if (i != rcx.a) {
                break;
            }
            i2 = rcy.a(bArr, a, rcx);
            rez.c(rcx.a);
        }
        return i2;
    }

    static int a(byte[] bArr, int i, rfi rfi, rcx rcx) {
        rez rez = (rez) rfi;
        i = rcy.a(bArr, i, rcx);
        int i2 = rcx.a + i;
        while (i < i2) {
            i = rcy.a(bArr, i, rcx);
            rez.c(rcx.a);
        }
        if (i == i2) {
            return i;
        }
        throw rfk.a();
    }

    static int a(int i, byte[] bArr, int i2, int i3, rhs rhs, rcx rcx) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b = rcy.b(bArr, i2, rcx);
                rhs.a(i, Long.valueOf(rcx.b));
                return b;
            } else if (i4 == 1) {
                rhs.a(i, Long.valueOf(rcy.b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                i2 = rcy.a(bArr, i2, rcx);
                i3 = rcx.a;
                if (i3 < 0) {
                    throw rfk.b();
                } else if (i3 <= bArr.length - i2) {
                    if (i3 == 0) {
                        rhs.a(i, rdg.a);
                    } else {
                        rhs.a(i, rdg.a(bArr, i2, i3));
                    }
                    return i2 + i3;
                } else {
                    throw rfk.a();
                }
            } else if (i4 == 3) {
                i4 = (i & -8) | 4;
                Object a = rhs.a();
                int i5 = 0;
                while (i2 < i3) {
                    int a2 = rcy.a(bArr, i2, rcx);
                    i2 = rcx.a;
                    if (i2 == i4) {
                        i5 = i2;
                        i2 = a2;
                        break;
                    }
                    i5 = i2;
                    i2 = rcy.a(i2, bArr, a2, i3, (rhs) a, rcx);
                }
                if (i2 > i3 || r1 != i4) {
                    throw rfk.h();
                }
                rhs.a(i, a);
                return i2;
            } else if (i4 == 5) {
                rhs.a(i, Integer.valueOf(rcy.a(bArr, i2)));
                return i2 + 4;
            } else {
                throw rfk.d();
            }
        }
        throw rfk.d();
    }

    static int a(int i, byte[] bArr, int i2, int i3, rcx rcx) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return rcy.b(bArr, i2, rcx);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return rcy.a(bArr, i2, rcx) + rcx.a;
            }
            if (i4 == 3) {
                i = (i & -8) | 4;
                i4 = 0;
                while (i2 < i3) {
                    i2 = rcy.a(bArr, i2, rcx);
                    i4 = rcx.a;
                    if (i4 == i) {
                        break;
                    }
                    i2 = rcy.a(i4, bArr, i2, i3, rcx);
                }
                if (i2 <= i3 && r0 == i) {
                    return i2;
                }
                throw rfk.h();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw rfk.d();
            }
        }
        throw rfk.d();
    }
}
