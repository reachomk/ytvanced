package defpackage;

import java.util.Arrays;

/* renamed from: rds */
final class rds extends rdp {
    private final byte[] d;
    private int e;
    private int f;
    private int g;
    private final int h;
    private int i;
    private int j = Integer.MAX_VALUE;

    public final int a() {
        if (t()) {
            this.i = 0;
            return 0;
        }
        int v = v();
        this.i = v;
        if ((v >>> 3) != 0) {
            return v;
        }
        throw rfk.d();
    }

    public final void a(int i) {
        if (this.i != i) {
            throw rfk.e();
        }
    }

    public final boolean b(int i) {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.e - this.g >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.d;
                    int i4 = this.g;
                    this.g = i4 + 1;
                    if (bArr[i4] < (byte) 0) {
                        i3++;
                    }
                }
                throw rfk.c();
            }
            while (i3 < 10) {
                if (A() < (byte) 0) {
                    i3++;
                }
            }
            throw rfk.c();
            return true;
        } else if (i2 == 1) {
            e(8);
            return true;
        } else if (i2 == 2) {
            e(v());
            return true;
        } else if (i2 == 3) {
            do {
                i2 = a();
                if (i2 == 0) {
                    break;
                }
            } while (b(i2));
            a(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                e(4);
                return true;
            }
            throw rfk.f();
        }
    }

    public final double b() {
        return Double.longBitsToDouble(y());
    }

    public final float c() {
        return Float.intBitsToFloat(x());
    }

    public final long d() {
        return w();
    }

    public final long e() {
        return w();
    }

    public final int f() {
        return v();
    }

    public final long g() {
        return y();
    }

    public final int h() {
        return x();
    }

    public final boolean i() {
        return w() != 0;
    }

    public final String j() {
        int v = v();
        if (v > 0) {
            int i = this.e;
            int i2 = this.g;
            if (v <= i - i2) {
                String str = new String(this.d, i2, v, rfc.a);
                this.g += v;
                return str;
            }
        }
        if (v == 0) {
            return "";
        }
        if (v < 0) {
            throw rfk.b();
        }
        throw rfk.a();
    }

    public final String k() {
        int v = v();
        if (v > 0) {
            int i = this.e;
            int i2 = this.g;
            if (v <= i - i2) {
                if (rib.a(this.d, i2, i2 + v)) {
                    i = this.g;
                    this.g = i + v;
                    return new String(this.d, i, v, rfc.a);
                }
                throw rfk.i();
            }
        }
        if (v == 0) {
            return "";
        }
        if (v <= 0) {
            throw rfk.b();
        }
        throw rfk.a();
    }

    public final rgh a(rgu rgu, reg reg) {
        int v = v();
        if (this.a < this.b) {
            v = c(v);
            this.a++;
            rgh rgh = (rgh) rgu.a(this, reg);
            a(0);
            this.a--;
            d(v);
            return rgh;
        }
        throw rfk.g();
    }

    public final rdg l() {
        int i;
        int i2;
        int v = v();
        if (v > 0) {
            i = this.e;
            i2 = this.g;
            if (v <= i - i2) {
                rdg a = rdg.a(this.d, i2, v);
                this.g += v;
                return a;
            }
        }
        if (v == 0) {
            return rdg.a;
        }
        byte[] copyOfRange;
        if (v > 0) {
            i = this.e;
            i2 = this.g;
            if (v <= i - i2) {
                v += i2;
                this.g = v;
                copyOfRange = Arrays.copyOfRange(this.d, i2, v);
                return rdg.b(copyOfRange);
            }
        }
        if (v > 0) {
            throw rfk.a();
        } else if (v == 0) {
            copyOfRange = rfc.b;
            return rdg.b(copyOfRange);
        } else {
            throw rfk.b();
        }
    }

    public final int m() {
        return v();
    }

    public final int n() {
        return v();
    }

    public final int o() {
        return x();
    }

    public final long p() {
        return y();
    }

    public final int q() {
        return rdp.f(v());
    }

    public final long r() {
        return rdp.a(w());
    }

    /* JADX WARNING: Missing block: B:23:0x0057, code skipped:
            if (r2[r3] >= (byte) 0) goto L_0x0065;
     */
    private final int v() {
        /*
        r5 = this;
        r0 = r5.g;
        r1 = r5.e;
        if (r1 == r0) goto L_0x006b;
    L_0x0006:
        r2 = r5.d;
        r3 = r0 + 1;
        r0 = r2[r0];
        if (r0 >= 0) goto L_0x0068;
    L_0x000e:
        r1 = r1 - r3;
        r4 = 9;
        if (r1 < r4) goto L_0x006b;
    L_0x0013:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 7;
        r0 = r0 ^ r3;
        if (r0 < 0) goto L_0x0063;
    L_0x001c:
        r3 = r1 + 1;
        r1 = r2[r1];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 >= 0) goto L_0x005f;
    L_0x0025:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 21;
        r0 = r0 ^ r3;
        if (r0 < 0) goto L_0x005a;
    L_0x002e:
        r3 = r1 + 1;
        r1 = r2[r1];
        r4 = r1 << 28;
        r0 = r0 ^ r4;
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r4;
        if (r1 >= 0) goto L_0x0061;
    L_0x003b:
        r1 = r3 + 1;
        r3 = r2[r3];
        if (r3 >= 0) goto L_0x0065;
    L_0x0041:
        r3 = r1 + 1;
        r1 = r2[r1];
        if (r1 >= 0) goto L_0x0061;
    L_0x0047:
        r1 = r3 + 1;
        r3 = r2[r3];
        if (r3 >= 0) goto L_0x0065;
    L_0x004d:
        r3 = r1 + 1;
        r1 = r2[r1];
        if (r1 >= 0) goto L_0x0061;
    L_0x0053:
        r1 = r3 + 1;
        r2 = r2[r3];
        if (r2 < 0) goto L_0x006b;
    L_0x0059:
        goto L_0x0065;
    L_0x005a:
        r2 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r2;
        goto L_0x0065;
    L_0x005f:
        r0 = r0 ^ 16256;
    L_0x0061:
        r1 = r3;
        goto L_0x0065;
    L_0x0063:
        r0 = r0 ^ -128;
    L_0x0065:
        r5.g = r1;
        return r0;
    L_0x0068:
        r5.g = r3;
        return r0;
    L_0x006b:
        r0 = r5.s();
        r1 = (int) r0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rds.v():int");
    }

    /* JADX WARNING: Missing block: B:23:0x007f, code skipped:
            if (((long) r2[r3]) >= 0) goto L_0x0094;
     */
    private final long w() {
        /*
        r11 = this;
        r0 = r11.g;
        r1 = r11.e;
        if (r1 == r0) goto L_0x00b1;
    L_0x0006:
        r2 = r11.d;
        r3 = r0 + 1;
        r0 = r2[r0];
        if (r0 >= 0) goto L_0x00ad;
    L_0x000e:
        r1 = r1 - r3;
        r4 = 9;
        if (r1 < r4) goto L_0x00b1;
    L_0x0013:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 7;
        r0 = r0 ^ r3;
        if (r0 < 0) goto L_0x00a4;
    L_0x001c:
        r3 = r1 + 1;
        r1 = r2[r1];
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 >= 0) goto L_0x00a0;
    L_0x0025:
        r1 = r3 + 1;
        r3 = r2[r3];
        r3 = r3 << 21;
        r0 = r0 ^ r3;
        if (r0 < 0) goto L_0x009b;
    L_0x002e:
        r3 = r1 + 1;
        r4 = (long) r0;
        r0 = r2[r1];
        r0 = (long) r0;
        r6 = 28;
        r0 = r0 << r6;
        r0 = r0 ^ r4;
        r4 = 0;
        r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r6 >= 0) goto L_0x0096;
    L_0x003e:
        r6 = r3 + 1;
        r3 = r2[r3];
        r7 = (long) r3;
        r3 = 35;
        r7 = r7 << r3;
        r0 = r0 ^ r7;
        r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r3 < 0) goto L_0x008e;
    L_0x004b:
        r3 = r6 + 1;
        r6 = r2[r6];
        r6 = (long) r6;
        r8 = 42;
        r6 = r6 << r8;
        r0 = r0 ^ r6;
        r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r6 >= 0) goto L_0x0088;
    L_0x0058:
        r6 = r3 + 1;
        r3 = r2[r3];
        r7 = (long) r3;
        r3 = 49;
        r7 = r7 << r3;
        r0 = r0 ^ r7;
        r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r3 < 0) goto L_0x0082;
    L_0x0065:
        r3 = r6 + 1;
        r6 = r2[r6];
        r6 = (long) r6;
        r8 = 56;
        r6 = r6 << r8;
        r0 = r0 ^ r6;
        r6 = 71499008037633920; // 0xfe03f80fe03f80 float:2.2112565E-29 double:6.838959413692434E-304;
        r0 = r0 ^ r6;
        r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r6 >= 0) goto L_0x00aa;
    L_0x0078:
        r6 = r3 + 1;
        r2 = r2[r3];
        r2 = (long) r2;
        r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r7 < 0) goto L_0x00b1;
    L_0x0081:
        goto L_0x0094;
    L_0x0082:
        r2 = -558586000294016; // 0xfffe03f80fe03f80 float:2.2112565E-29 double:NaN;
        goto L_0x0093;
    L_0x0088:
        r4 = 4363953127296; // 0x3f80fe03f80 float:2.2112565E-29 double:2.1560793202584E-311;
        goto L_0x0099;
    L_0x008e:
        r2 = -34093383808; // 0xfffffff80fe03f80 float:2.2112565E-29 double:NaN;
    L_0x0093:
        r0 = r0 ^ r2;
    L_0x0094:
        r3 = r6;
        goto L_0x00aa;
    L_0x0096:
        r4 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
    L_0x0099:
        r0 = r0 ^ r4;
        goto L_0x00aa;
    L_0x009b:
        r2 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r2;
        goto L_0x00a6;
    L_0x00a0:
        r0 = r0 ^ 16256;
        r0 = (long) r0;
        goto L_0x00aa;
    L_0x00a4:
        r0 = r0 ^ -128;
    L_0x00a6:
        r2 = (long) r0;
        r9 = r2;
        r3 = r1;
        r0 = r9;
    L_0x00aa:
        r11.g = r3;
        return r0;
    L_0x00ad:
        r11.g = r3;
        r0 = (long) r0;
        return r0;
    L_0x00b1:
        r0 = r11.s();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rds.w():long");
    }

    /* Access modifiers changed, original: final */
    public final long s() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = A();
            j |= ((long) (A & 127)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw rfk.c();
    }

    private final int x() {
        int i = this.g;
        if (this.e - i >= 4) {
            byte[] bArr = this.d;
            this.g = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
        }
        throw rfk.a();
    }

    private final long y() {
        int i = this.g;
        if (this.e - i >= 8) {
            byte[] bArr = this.d;
            this.g = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
        }
        throw rfk.a();
    }

    public final int c(int i) {
        if (i >= 0) {
            i += u();
            int i2 = this.j;
            if (i <= i2) {
                this.j = i;
                z();
                return i2;
            }
            throw rfk.a();
        }
        throw rfk.b();
    }

    private final void z() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = i - this.h;
        int i3 = this.j;
        if (i2 > i3) {
            i2 -= i3;
            this.f = i2;
            this.e = i - i2;
            return;
        }
        this.f = 0;
    }

    public final void d(int i) {
        this.j = i;
        z();
    }

    public final boolean t() {
        return this.g == this.e;
    }

    public final int u() {
        return this.g - this.h;
    }

    private final byte A() {
        int i = this.g;
        if (i != this.e) {
            byte[] bArr = this.d;
            this.g = i + 1;
            return bArr[i];
        }
        throw rfk.a();
    }

    public final void e(int i) {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = this.g;
            if (i <= i2 - i3) {
                this.g = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw rfk.b();
        }
        throw rfk.a();
    }

    /* synthetic */ rds(byte[] bArr, int i, int i2) {
        super();
        this.d = bArr;
        this.e = i2 + i;
        this.g = i;
        this.h = i;
    }
}
