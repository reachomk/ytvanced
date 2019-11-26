package defpackage;

import java.nio.ByteBuffer;

/* renamed from: anwk */
final class anwk extends anwf {
    private final ByteBuffer e;
    private final boolean f;
    private final long g;
    private long h;
    private long i;
    private final long j;
    private int k;
    private int l;
    private int m = Integer.MAX_VALUE;

    public final int a() {
        if (u()) {
            this.l = 0;
            return 0;
        }
        int t = t();
        this.l = t;
        if (aobj.b(t) != 0) {
            return this.l;
        }
        throw anyg.d();
    }

    public final void a(int i) {
        if (this.l != i) {
            throw anyg.e();
        }
    }

    public final boolean b(int i) {
        int a = aobj.a(i);
        int i2 = 0;
        if (a == 0) {
            if (C() < 10) {
                while (i2 < 10) {
                    if (A() < (byte) 0) {
                        i2++;
                    }
                }
                throw anyg.c();
            }
            while (i2 < 10) {
                long j = this.i;
                this.i = 1 + j;
                if (aoax.a(j) < (byte) 0) {
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
        if (t > 0 && t <= C()) {
            byte[] bArr = new byte[t];
            long j = (long) t;
            aoax.a(this.i, bArr, j);
            String str = new String(bArr, anxw.a);
            this.i += j;
            return str;
        } else if (t == 0) {
            return "";
        } else {
            if (t < 0) {
                throw anyg.b();
            }
            throw anyg.a();
        }
    }

    public final String k() {
        int t = t();
        if (t > 0 && t <= C()) {
            String b;
            int b2 = b(this.i);
            ByteBuffer byteBuffer = this.e;
            aobf aobf = aobd.a;
            if (byteBuffer.hasArray()) {
                b = aobf.b(byteBuffer.array(), byteBuffer.arrayOffset() + b2, t);
            } else if (byteBuffer.isDirect()) {
                b = aobf.a(byteBuffer, b2, t);
            } else {
                b = aobf.b(byteBuffer, b2, t);
            }
            this.i += (long) t;
            return b;
        } else if (t == 0) {
            return "";
        } else {
            if (t <= 0) {
                throw anyg.b();
            }
            throw anyg.a();
        }
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
        if (t > 0 && t <= C()) {
            byte[] bArr = new byte[t];
            long j = (long) t;
            aoax.a(this.i, bArr, j);
            this.i += j;
            return anvu.b(bArr);
        } else if (t == 0) {
            return anvu.a;
        } else {
            if (t < 0) {
                throw anyg.b();
            }
            throw anyg.a();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x004c */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:11:0x0050, code skipped:
            throw defpackage.anyg.a();
     */
    /* JADX WARNING: Missing block: B:12:0x0051, code skipped:
            r10.e.position(r0);
            r10.e.limit(r8);
     */
    public final byte[] m() {
        /*
        r10 = this;
        r0 = r10.t();
        if (r0 < 0) goto L_0x005c;
    L_0x0006:
        r1 = r10.C();
        if (r0 > r1) goto L_0x005c;
    L_0x000c:
        r1 = new byte[r0];
        r2 = r10.i;
        r4 = (long) r0;
        r6 = r2 + r4;
        r0 = r10.e;
        r0 = r0.position();
        r8 = r10.e;
        r8 = r8.limit();
        r9 = r10.e;	 Catch:{ IllegalArgumentException -> 0x004c }
        r2 = r10.b(r2);	 Catch:{ IllegalArgumentException -> 0x004c }
        r9.position(r2);	 Catch:{ IllegalArgumentException -> 0x004c }
        r2 = r10.e;	 Catch:{ IllegalArgumentException -> 0x004c }
        r3 = r10.b(r6);	 Catch:{ IllegalArgumentException -> 0x004c }
        r2.limit(r3);	 Catch:{ IllegalArgumentException -> 0x004c }
        r2 = r10.e;	 Catch:{ IllegalArgumentException -> 0x004c }
        r2 = r2.slice();	 Catch:{ IllegalArgumentException -> 0x004c }
        r3 = r10.e;
        r3.position(r0);
        r0 = r10.e;
        r0.limit(r8);
        r2.get(r1);
        r2 = r10.i;
        r2 = r2 + r4;
        r10.i = r2;
        goto L_0x0062;
    L_0x004a:
        r1 = move-exception;
        goto L_0x0051;
    L_0x004c:
        r1 = defpackage.anyg.a();	 Catch:{ all -> 0x004a }
        throw r1;	 Catch:{ all -> 0x004a }
    L_0x0051:
        r2 = r10.e;
        r2.position(r0);
        r0 = r10.e;
        r0.limit(r8);
        throw r1;
    L_0x005c:
        if (r0 > 0) goto L_0x0068;
    L_0x005e:
        if (r0 != 0) goto L_0x0063;
    L_0x0060:
        r1 = defpackage.anxw.b;
    L_0x0062:
        return r1;
    L_0x0063:
        r0 = defpackage.anyg.b();
        throw r0;
    L_0x0068:
        r0 = defpackage.anyg.a();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anwk.m():byte[]");
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

    /* JADX WARNING: Missing block: B:25:0x0074, code skipped:
            if (defpackage.aoax.a(r4) >= (byte) 0) goto L_0x0082;
     */
    public final int t() {
        /*
        r10 = this;
        r0 = r10.i;
        r2 = r10.h;
        r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r4 == 0) goto L_0x0085;
    L_0x0008:
        r2 = 1;
        r4 = r0 + r2;
        r0 = defpackage.aoax.a(r0);
        if (r0 < 0) goto L_0x0015;
    L_0x0012:
        r10.i = r4;
        return r0;
    L_0x0015:
        r6 = r10.h;
        r6 = r6 - r4;
        r8 = 9;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 < 0) goto L_0x0085;
    L_0x001e:
        r6 = r4 + r2;
        r1 = defpackage.aoax.a(r4);
        r1 = r1 << 7;
        r0 = r0 ^ r1;
        if (r0 < 0) goto L_0x0080;
    L_0x0029:
        r4 = r6 + r2;
        r1 = defpackage.aoax.a(r6);
        r1 = r1 << 14;
        r0 = r0 ^ r1;
        if (r0 >= 0) goto L_0x007c;
    L_0x0034:
        r6 = r4 + r2;
        r1 = defpackage.aoax.a(r4);
        r1 = r1 << 21;
        r0 = r0 ^ r1;
        if (r0 < 0) goto L_0x0077;
    L_0x003f:
        r4 = r6 + r2;
        r1 = defpackage.aoax.a(r6);
        r6 = r1 << 28;
        r0 = r0 ^ r6;
        r6 = 266354560; // 0xfe03f80 float:2.2112565E-29 double:1.315966377E-315;
        r0 = r0 ^ r6;
        if (r1 >= 0) goto L_0x007e;
    L_0x004e:
        r6 = r4 + r2;
        r1 = defpackage.aoax.a(r4);
        if (r1 >= 0) goto L_0x0082;
    L_0x0056:
        r4 = r6 + r2;
        r1 = defpackage.aoax.a(r6);
        if (r1 >= 0) goto L_0x007e;
    L_0x005e:
        r6 = r4 + r2;
        r1 = defpackage.aoax.a(r4);
        if (r1 >= 0) goto L_0x0082;
    L_0x0066:
        r4 = r6 + r2;
        r1 = defpackage.aoax.a(r6);
        if (r1 >= 0) goto L_0x007e;
    L_0x006e:
        r6 = r4 + r2;
        r1 = defpackage.aoax.a(r4);
        if (r1 < 0) goto L_0x0085;
    L_0x0076:
        goto L_0x0082;
    L_0x0077:
        r1 = -2080896; // 0xffffffffffe03f80 float:NaN double:NaN;
        r0 = r0 ^ r1;
        goto L_0x0082;
    L_0x007c:
        r0 = r0 ^ 16256;
    L_0x007e:
        r6 = r4;
        goto L_0x0082;
    L_0x0080:
        r0 = r0 ^ -128;
    L_0x0082:
        r10.i = r6;
        return r0;
    L_0x0085:
        r0 = r10.x();
        r1 = (int) r0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anwk.t():int");
    }

    private final long w() {
        long j = this.i;
        if (this.h != j) {
            long j2 = j + 1;
            byte a = aoax.a(j);
            if (a >= (byte) 0) {
                this.i = j2;
                return (long) a;
            } else if (this.h - j2 >= 9) {
                long j3 = j2 + 1;
                int a2 = a ^ (aoax.a(j2) << 7);
                if (a2 >= 0) {
                    j2 = j3 + 1;
                    a2 ^= aoax.a(j3) << 14;
                    if (a2 < 0) {
                        j3 = j2 + 1;
                        a2 ^= aoax.a(j2) << 21;
                        if (a2 >= 0) {
                            long j4;
                            j2 = j3 + 1;
                            j = ((long) a2) ^ (((long) aoax.a(j3)) << 28);
                            if (j < 0) {
                                long j5 = j2 + 1;
                                j ^= ((long) aoax.a(j2)) << 35;
                                if (j >= 0) {
                                    j2 = j5 + 1;
                                    j ^= ((long) aoax.a(j5)) << 42;
                                    if (j < 0) {
                                        j5 = j2 + 1;
                                        j ^= ((long) aoax.a(j2)) << 49;
                                        if (j >= 0) {
                                            j2 = j5 + 1;
                                            j = (j ^ (((long) aoax.a(j5)) << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                j4 = 1 + j2;
                                                if (((long) aoax.a(j2)) >= 0) {
                                                    j2 = j4;
                                                }
                                            }
                                        } else {
                                            j4 = -558586000294016L;
                                        }
                                    } else {
                                        j4 = 4363953127296L;
                                    }
                                } else {
                                    j4 = -34093383808L;
                                }
                                j ^= j4;
                                j2 = j5;
                            } else {
                                j4 = 266354560;
                            }
                            j ^= j4;
                        } else {
                            a2 ^= -2080896;
                        }
                    } else {
                        j = (long) (a2 ^ 16256);
                    }
                    this.i = j2;
                    return j;
                }
                a2 ^= -128;
                j = (long) a2;
                j2 = j3;
                this.i = j2;
                return j;
            }
        }
        return x();
    }

    private final long x() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte A = A();
            j |= ((long) (A & 127)) << i;
            if ((A & 128) == 0) {
                return j;
            }
        }
        throw anyg.c();
    }

    private final int y() {
        long j = this.i;
        if (this.h - j >= 4) {
            this.i = 4 + j;
            return ((aoax.a(j + 3) & 255) << 24) | (((aoax.a(j) & 255) | ((aoax.a(1 + j) & 255) << 8)) | ((aoax.a(2 + j) & 255) << 16));
        }
        throw anyg.a();
    }

    private final long z() {
        long j = this.i;
        if (this.h - j >= 8) {
            this.i = 8 + j;
            return ((((long) aoax.a(j + 7)) & 255) << 56) | (((((((((long) aoax.a(j)) & 255) | ((((long) aoax.a(1 + j)) & 255) << 8)) | ((((long) aoax.a(2 + j)) & 255) << 16)) | ((((long) aoax.a(3 + j)) & 255) << 24)) | ((((long) aoax.a(4 + j)) & 255) << 32)) | ((((long) aoax.a(5 + j)) & 255) << 40)) | ((((long) aoax.a(6 + j)) & 255) << 48));
        }
        throw anyg.a();
    }

    public final int c(int i) {
        if (i >= 0) {
            i += v();
            int i2 = this.m;
            if (i <= i2) {
                this.m = i;
                B();
                return i2;
            }
            throw anyg.a();
        }
        throw anyg.b();
    }

    public final void d(int i) {
        this.m = i;
        B();
    }

    public final boolean u() {
        return this.i == this.h;
    }

    public final int v() {
        return (int) (this.i - this.j);
    }

    private final byte A() {
        long j = this.i;
        if (j != this.h) {
            this.i = 1 + j;
            return aoax.a(j);
        }
        throw anyg.a();
    }

    public final void e(int i) {
        if (i >= 0 && i <= C()) {
            this.i += (long) i;
        } else if (i < 0) {
            throw anyg.b();
        } else {
            throw anyg.a();
        }
    }

    private final void B() {
        long j = this.h + ((long) this.k);
        this.h = j;
        int i = (int) (j - this.j);
        int i2 = this.m;
        if (i > i2) {
            i -= i2;
            this.k = i;
            this.h = j - ((long) i);
            return;
        }
        this.k = 0;
    }

    private final int C() {
        return (int) (this.h - this.i);
    }

    private final int b(long j) {
        return (int) (j - this.g);
    }

    /* synthetic */ anwk(ByteBuffer byteBuffer) {
        super();
        this.e = byteBuffer;
        long a = aoax.a(byteBuffer);
        this.g = a;
        this.h = a + ((long) byteBuffer.limit());
        a = this.g + ((long) byteBuffer.position());
        this.i = a;
        this.j = a;
        this.f = false;
    }
}
