package defpackage;

/* renamed from: anvl */
final class anvl {
    static int a(byte[] bArr, int i, anvo anvo) {
        int i2 = i + 1;
        i = bArr[i];
        if (i < (byte) 0) {
            return anvl.a(i, bArr, i2, anvo);
        }
        anvo.a = i;
        return i2;
    }

    static int a(int i, byte[] bArr, int i2, anvo anvo) {
        i &= 127;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b >= (byte) 0) {
            anvo.a = i | (b << 7);
            return i3;
        }
        i |= (b & 127) << 7;
        i2 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= (byte) 0) {
            anvo.a = i | (b2 << 14);
            return i2;
        }
        i |= (b2 & 127) << 14;
        i3 = i2 + 1;
        b = bArr[i2];
        if (b >= (byte) 0) {
            anvo.a = i | (b << 21);
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
                    anvo.a = i;
                    return i3;
                }
            }
        }
        anvo.a = i | (b2 << 28);
        return i2;
    }

    static int b(byte[] bArr, int i, anvo anvo) {
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
            anvo.b = j;
            return i;
        }
        anvo.b = j;
        return i2;
    }

    static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
    }

    static long b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
    }

    static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(anvl.b(bArr, i));
    }

    static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(anvl.a(bArr, i));
    }

    static int c(byte[] bArr, int i, anvo anvo) {
        i = anvl.a(bArr, i, anvo);
        int i2 = anvo.a;
        if (i2 < 0) {
            throw anyg.b();
        } else if (i2 != 0) {
            anvo.c = new String(bArr, i, i2, anxw.a);
            return i + i2;
        } else {
            anvo.c = "";
            return i;
        }
    }

    static int d(byte[] bArr, int i, anvo anvo) {
        i = anvl.a(bArr, i, anvo);
        int i2 = anvo.a;
        if (i2 < 0) {
            throw anyg.b();
        } else if (i2 != 0) {
            anvo.c = aobd.c(bArr, i, i2);
            return i + i2;
        } else {
            anvo.c = "";
            return i;
        }
    }

    static int e(byte[] bArr, int i, anvo anvo) {
        i = anvl.a(bArr, i, anvo);
        int i2 = anvo.a;
        if (i2 < 0) {
            throw anyg.b();
        } else if (i2 > bArr.length - i) {
            throw anyg.a();
        } else if (i2 == 0) {
            anvo.c = anvu.a;
            return i;
        } else {
            anvo.c = anvu.a(bArr, i, i2);
            return i + i2;
        }
    }

    static int a(anzz anzz, byte[] bArr, int i, int i2, anvo anvo) {
        int i3 = i + 1;
        i = bArr[i];
        if (i < 0) {
            i3 = anvl.a(i, bArr, i3, anvo);
            i = anvo.a;
        }
        int i4 = i3;
        if (i < 0 || i > i2 - i4) {
            throw anyg.a();
        }
        Object a = anzz.a();
        i += i4;
        anzz.a(a, bArr, i4, i, anvo);
        anzz.c(a);
        anvo.c = a;
        return i;
    }

    static int a(anzz anzz, byte[] bArr, int i, int i2, int i3, anvo anvo) {
        anzh anzh = (anzh) anzz;
        Object a = anzh.a();
        int a2 = anzh.a(a, bArr, i, i2, i3, anvo);
        anzh.c(a);
        anvo.c = a;
        return a2;
    }

    static int a(int i, byte[] bArr, int i2, int i3, anyd anyd, anvo anvo) {
        anxt anxt = (anxt) anyd;
        i2 = anvl.a(bArr, i2, anvo);
        anxt.d(anvo.a);
        while (i2 < i3) {
            int a = anvl.a(bArr, i2, anvo);
            if (i != anvo.a) {
                break;
            }
            i2 = anvl.a(bArr, a, anvo);
            anxt.d(anvo.a);
        }
        return i2;
    }

    static int a(byte[] bArr, int i, anyd anyd, anvo anvo) {
        anxt anxt = (anxt) anyd;
        i = anvl.a(bArr, i, anvo);
        int i2 = anvo.a + i;
        while (i < i2) {
            i = anvl.a(bArr, i, anvo);
            anxt.d(anvo.a);
        }
        if (i == i2) {
            return i;
        }
        throw anyg.a();
    }

    static int a(anzz anzz, int i, byte[] bArr, int i2, int i3, anyd anyd, anvo anvo) {
        i2 = anvl.a(anzz, bArr, i2, i3, anvo);
        anyd.add(anvo.c);
        while (i2 < i3) {
            int a = anvl.a(bArr, i2, anvo);
            if (i != anvo.a) {
                break;
            }
            i2 = anvl.a(anzz, bArr, a, i3, anvo);
            anyd.add(anvo.c);
        }
        return i2;
    }

    static int a(int i, byte[] bArr, int i2, int i3, aoau aoau, anvo anvo) {
        if (aobj.b(i) != 0) {
            int a = aobj.a(i);
            if (a == 0) {
                int b = anvl.b(bArr, i2, anvo);
                aoau.a(i, Long.valueOf(anvo.b));
                return b;
            } else if (a == 1) {
                aoau.a(i, Long.valueOf(anvl.b(bArr, i2)));
                return i2 + 8;
            } else if (a == 2) {
                i2 = anvl.a(bArr, i2, anvo);
                i3 = anvo.a;
                if (i3 < 0) {
                    throw anyg.b();
                } else if (i3 <= bArr.length - i2) {
                    if (i3 == 0) {
                        aoau.a(i, anvu.a);
                    } else {
                        aoau.a(i, anvu.a(bArr, i2, i3));
                    }
                    return i2 + i3;
                } else {
                    throw anyg.a();
                }
            } else if (a == 3) {
                a = (i & -8) | 4;
                Object a2 = aoau.a();
                int i4 = 0;
                while (i2 < i3) {
                    int a3 = anvl.a(bArr, i2, anvo);
                    i2 = anvo.a;
                    if (i2 == a) {
                        i4 = i2;
                        i2 = a3;
                        break;
                    }
                    i4 = i2;
                    i2 = anvl.a(i2, bArr, a3, i3, (aoau) a2, anvo);
                }
                if (i2 > i3 || r1 != a) {
                    throw anyg.i();
                }
                aoau.a(i, a2);
                return i2;
            } else if (a == 5) {
                aoau.a(i, Integer.valueOf(anvl.a(bArr, i2)));
                return i2 + 4;
            } else {
                throw anyg.d();
            }
        }
        throw anyg.d();
    }

    static int a(int i, byte[] bArr, int i2, int i3, anvo anvo) {
        if (aobj.b(i) != 0) {
            int a = aobj.a(i);
            if (a == 0) {
                return anvl.b(bArr, i2, anvo);
            }
            if (a == 1) {
                return i2 + 8;
            }
            if (a == 2) {
                return anvl.a(bArr, i2, anvo) + anvo.a;
            }
            if (a == 3) {
                i = (i & -8) | 4;
                a = 0;
                while (i2 < i3) {
                    i2 = anvl.a(bArr, i2, anvo);
                    a = anvo.a;
                    if (a == i) {
                        break;
                    }
                    i2 = anvl.a(a, bArr, i2, i3, anvo);
                }
                if (i2 <= i3 && r0 == i) {
                    return i2;
                }
                throw anyg.i();
            } else if (a == 5) {
                return i2 + 4;
            } else {
                throw anyg.d();
            }
        }
        throw anyg.d();
    }
}
