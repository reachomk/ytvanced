package defpackage;

import java.util.Arrays;

/* renamed from: anwi */
final class anwi extends anwf {
    private final byte[] e;
    private final boolean f;
    private int g;
    private int h;
    private int i;
    private final int j;
    private int k;
    private int l = Integer.MAX_VALUE;

    public final int a() {
        if (u()) {
            this.k = 0;
            return 0;
        }
        int t = t();
        this.k = t;
        if (aobj.b(t) != 0) {
            return this.k;
        }
        throw anyg.d();
    }

    public final void a(int i) {
        if (this.k != i) {
            throw anyg.e();
        }
    }

    public final boolean b(int i) {
        int a = aobj.a(i);
        int i2 = 0;
        if (a == 0) {
            if (this.g - this.i < 10) {
                while (i2 < 10) {
                    if (B() < (byte) 0) {
                        i2++;
                    }
                }
                throw anyg.c();
            }
            while (i2 < 10) {
                byte[] bArr = this.e;
                int i3 = this.i;
                this.i = i3 + 1;
                if (bArr[i3] < (byte) 0) {
                    i2++;
                }
            }
            throw anyg.c();
            return true;
        } else if (a == 1) {
            e(8);
            return true;
        } else if (a == 2) {
            e(t());
            return true;
        } else if (a == 3) {
            do {
                a = a();
                if (a == 0) {
                    break;
                }
            } while (b(a));
            a(aobj.a(aobj.b(i), 4));
            return true;
        } else if (a == 4) {
            return false;
        } else {
            if (a == 5) {
                e(4);
                return true;
            }
            throw anyg.f();
        }
    }

    public final double b() {
        return Double.longBitsToDouble(z());
    }

    public final float c() {
        return Float.intBitsToFloat(y());
    }

    public final long d() {
        return w();
    }

    public final long e() {
        return w();
    }

    public final int f() {
        return t();
    }

    public final long g() {
        return z();
    }

    public final int h() {
        return y();
    }

    public final boolean i() {
        return w() != 0;
    }

    public final String j() {
        int t = t();
        if (t > 0) {
            int i = this.g;
            int i2 = this.i;
            if (t <= i - i2) {
                String str = new String(this.e, i2, t, anxw.a);
                this.i += t;
                return str;
            }
        }
        if (t == 0) {
            return "";
        }
        if (t < 0) {
            throw anyg.b();
        }
        throw anyg.a();
    }

    public final String k() {
        int t = t();
        if (t > 0) {
            int i = this.g;
            int i2 = this.i;
            if (t <= i - i2) {
                String c = aobd.c(this.e, i2, t);
                this.i += t;
                return c;
            }
        }
        if (t == 0) {
            return "";
        }
        if (t <= 0) {
            throw anyg.b();
        }
        throw anyg.a();
    }

    public final anze a(int i, anzq anzq, anxa anxa) {
        int i2 = this.a;
        if (i2 < this.b) {
            this.a = i2 + 1;
            anze anze = (anze) anzq.b(this, anxa);
            a(aobj.a(i, 4));
            this.a--;
            return anze;
        }
        throw anyg.g();
    }

    public final anxl a(anxl anxl, anxa anxa) {
        int t = t();
        if (this.a < this.b) {
            t = c(t);
            this.a++;
            anxl = anxl.parsePartialFrom(anxl, (anwf) this, anxa);
            a(0);
            this.a--;
            d(t);
            return anxl;
        }
        throw anyg.g();
    }

    public final anze a(anzq anzq, anxa anxa) {
        int t = t();
        if (this.a < this.b) {
            t = c(t);
            this.a++;
            anze anze = (anze) anzq.b(this, anxa);
            a(0);
            this.a--;
            d(t);
            return anze;
        }
        throw anyg.g();
    }

    public final anvu l() {
        int t = t();
        if (t > 0) {
            int i = this.g;
            int i2 = this.i;
            if (t <= i - i2) {
                anvu a = anvu.a(this.e, i2, t);
                this.i += t;
                return a;
            }
        }
        if (t == 0) {
            return anvu.a;
        }
        return anvu.b(g(t));
    }

    public final byte[] m() {
        return g(t());
    }

    public final int n() {
        return t();
    }

    public final int o() {
        return t();
    }

    public final int p() {
        return y();
    }

    public final long q() {
        return z();
    }

    public final int r() {
        return anwf.f(t());
    }

    public final long s() {
        return anwf.a(w());
    }

    /* JADX WARNING: Missing block: B:23:0x0057, code skipped:
            if (r2[r3] >= (byte) 0) goto L_0x0065;
     */
    public final int t() {
        /*
        r5 = this;
        r0 = r5.i;
        r1 = r5.g;
        if (r1 == r0) goto L_0x006b;
    L_0x0006:
        r2 = r5.e;
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
        r5.i = r1;
        return r0;
    L_0x0068:
        r5.i = r3;
        return r0;
    L_0x006b:
        r0 = r5.x();
        r1 = (int) r0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anwi.t():int");
    }

    /* JADX WARNING: Missing block: B:23:0x007f, code skipped:
            if (((long) r2[r3]) >= 0) goto L_0x0094;
     */
    private final long w() {
        /*
        r11 = this;
        r0 = r11.i;
        r1 = r11.g;
        if (r1 == r0) goto L_0x00b1;
    L_0x0006:
        r2 = r11.e;
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
        r11.i = r3;
        return r0;
    L_0x00ad:
        r11.i = r3;
        r0 = (long) r0;
        return r0;
    L_0x00b1:
        r0 = r11.x();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anwi.w():long");
    }

    private final long x() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte B = B();
            j |= ((long) (B & 127)) << i;
            if ((B & 128) == 0) {
                return j;
            }
        }
        throw anyg.c();
    }

    private final int y() {
        int i = this.i;
        if (this.g - i >= 4) {
            byte[] bArr = this.e;
            this.i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8)) | ((bArr[i + 2] & 255) << 16));
        }
        throw anyg.a();
    }

    private final long z() {
        int i = this.i;
        if (this.g - i >= 8) {
            byte[] bArr = this.e;
            this.i = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((((((((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8)) | ((((long) bArr[i + 2]) & 255) << 16)) | ((((long) bArr[i + 3]) & 255) << 24)) | ((((long) bArr[i + 4]) & 255) << 32)) | ((((long) bArr[i + 5]) & 255) << 40)) | ((((long) bArr[i + 6]) & 255) << 48));
        }
        throw anyg.a();
    }

    public final int c(int i) {
        if (i >= 0) {
            i += v();
            int i2 = this.l;
            if (i <= i2) {
                this.l = i;
                A();
                return i2;
            }
            throw anyg.a();
        }
        throw anyg.b();
    }

    private final void A() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = i - this.j;
        int i3 = this.l;
        if (i2 > i3) {
            i2 -= i3;
            this.h = i2;
            this.g = i - i2;
            return;
        }
        this.h = 0;
    }

    public final void d(int i) {
        this.l = i;
        A();
    }

    public final boolean u() {
        return this.i == this.g;
    }

    public final int v() {
        return this.i - this.j;
    }

    private final byte B() {
        int i = this.i;
        if (i != this.g) {
            byte[] bArr = this.e;
            this.i = i + 1;
            return bArr[i];
        }
        throw anyg.a();
    }

    private final byte[] g(int i) {
        if (i > 0) {
            int i2 = this.g;
            int i3 = this.i;
            if (i <= i2 - i3) {
                i += i3;
                this.i = i;
                return Arrays.copyOfRange(this.e, i3, i);
            }
        }
        if (i > 0) {
            throw anyg.a();
        } else if (i == 0) {
            return anxw.b;
        } else {
            throw anyg.b();
        }
    }

    public final void e(int i) {
        if (i >= 0) {
            int i2 = this.g;
            int i3 = this.i;
            if (i <= i2 - i3) {
                this.i = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw anyg.b();
        }
        throw anyg.a();
    }

    /* synthetic */ anwi(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.e = bArr;
        this.g = i2 + i;
        this.i = i;
        this.j = i;
        this.f = z;
    }
}
