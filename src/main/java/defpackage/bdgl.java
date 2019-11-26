package defpackage;

/* renamed from: bdgl */
public final class bdgl extends aoca {
    public static final aobz a = aobz.a(bdgl.class, 1270370386);
    public bdgk[] b;
    public int c;
    public bdgy d;
    public azsr e;
    public int f;
    private float g;
    private float h;
    private bdgy i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    public bdgl() {
        if (bdgk.a == null) {
            synchronized (aocd.b) {
                if (bdgk.a == null) {
                    bdgk.a = new bdgk[0];
                }
            }
        }
        this.b = bdgk.a;
        this.c = 0;
        this.f = 1;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = null;
        this.d = null;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdgl) {
            bdgl bdgl = (bdgl) obj;
            if (aocd.a(this.b, bdgl.b) && this.c == bdgl.c && this.f == bdgl.f && Float.floatToIntBits(this.g) == Float.floatToIntBits(bdgl.g) && Float.floatToIntBits(this.h) == Float.floatToIntBits(bdgl.h)) {
                bdgy bdgy = this.i;
                if (bdgy == null) {
                    if (bdgl.i != null) {
                        return false;
                    }
                } else if (!bdgy.equals(bdgl.i)) {
                    return false;
                }
                bdgy = this.d;
                if (bdgy == null) {
                    if (bdgl.d != null) {
                        return false;
                    }
                } else if (!bdgy.equals(bdgl.d)) {
                    return false;
                }
                if (this.j == bdgl.j && this.k == bdgl.k && this.l == bdgl.l && this.m == bdgl.m) {
                    azsr azsr = this.e;
                    if (azsr == null) {
                        if (bdgl.e != null) {
                            return false;
                        }
                    } else if (!azsr.equals(bdgl.e)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(bdgl.unknownFieldData);
                    }
                    aocb aocb2 = bdgl.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + aocd.a(this.b)) * 31) + this.c) * 31;
        int i = this.f;
        int i2 = 0;
        if (i == 0) {
            i = 0;
        }
        int floatToIntBits = Float.floatToIntBits(this.g);
        int floatToIntBits2 = Float.floatToIntBits(this.h);
        bdgy bdgy = this.i;
        hashCode = (((((hashCode + i) * 31) + floatToIntBits) * 31) + floatToIntBits2) * 31;
        i = bdgy != null ? bdgy.hashCode() : 0;
        bdgy bdgy2 = this.d;
        hashCode = (((hashCode + i) * 31) + (bdgy2 != null ? bdgy2.hashCode() : 0)) * 31;
        floatToIntBits = 1237;
        hashCode = (((((hashCode + (!this.j ? 1237 : 1231)) * 31) + (!this.k ? 1237 : 1231)) * 31) + (!this.l ? 1237 : 1231)) * 31;
        if (this.m) {
            floatToIntBits = 1231;
        }
        azsr azsr = this.e;
        hashCode = (((hashCode + floatToIntBits) * 31) + (azsr != null ? azsr.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i2 = this.unknownFieldData.hashCode();
        }
        return hashCode + i2;
    }

    public final void writeTo(aoby aoby) {
        int i;
        bdgk[] bdgkArr = this.b;
        if (bdgkArr != null && bdgkArr.length > 0) {
            i = 0;
            while (true) {
                bdgk[] bdgkArr2 = this.b;
                if (i >= bdgkArr2.length) {
                    break;
                }
                aocf aocf = bdgkArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        i = this.c;
        if (i != 0) {
            aoby.a(2, i);
        }
        if (Float.floatToIntBits(this.g) != Float.floatToIntBits(0.0f)) {
            aoby.a(3, this.g);
        }
        if (Float.floatToIntBits(this.h) != Float.floatToIntBits(0.0f)) {
            aoby.a(4, this.h);
        }
        aocf aocf2 = this.i;
        if (aocf2 != null) {
            aoby.a(5, aocf2);
        }
        aocf2 = this.d;
        if (aocf2 != null) {
            aoby.a(6, aocf2);
        }
        if (this.j) {
            aoby.a(7, true);
        }
        if (this.k) {
            aoby.a(8, true);
        }
        if (this.l) {
            aoby.a(9, true);
        }
        if (this.m) {
            aoby.a(10, true);
        }
        anze anze = this.e;
        if (anze != null) {
            aoby.a(11, anze);
        }
        i = this.f;
        if (!(i == 1 || i == 0)) {
            aoby.a(12, i - 1);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        bdgk[] bdgkArr = this.b;
        if (bdgkArr != null && bdgkArr.length > 0) {
            i = 0;
            while (true) {
                bdgk[] bdgkArr2 = this.b;
                if (i >= bdgkArr2.length) {
                    break;
                }
                aocf aocf = bdgkArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(1, aocf);
                }
                i++;
            }
        }
        i = this.c;
        if (i != 0) {
            computeSerializedSize += aoby.c(2, i);
        }
        if (Float.floatToIntBits(this.g) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(3);
        }
        if (Float.floatToIntBits(this.h) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(4);
        }
        aocf aocf2 = this.i;
        if (aocf2 != null) {
            computeSerializedSize += aoby.b(5, aocf2);
        }
        aocf2 = this.d;
        if (aocf2 != null) {
            computeSerializedSize += aoby.b(6, aocf2);
        }
        if (this.j) {
            computeSerializedSize += aoby.d(7);
        }
        if (this.k) {
            computeSerializedSize += aoby.d(8);
        }
        if (this.l) {
            computeSerializedSize += aoby.d(9);
        }
        if (this.m) {
            computeSerializedSize += aoby.d(10);
        }
        anze anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        i = this.f;
        return (i == 1 || i == 0) ? computeSerializedSize : computeSerializedSize + aoby.c(12, i - 1);
    }

    /* JADX WARNING: Missing block: B:52:0x0109, code skipped:
            return r6;
     */
    public final /* synthetic */ defpackage.aocf mergeFrom(defpackage.aobv r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        r1 = 2;
        r2 = 0;
        switch(r0) {
            case 0: goto L_0x0109;
            case 10: goto L_0x00d1;
            case 16: goto L_0x00a2;
            case 29: goto L_0x009a;
            case 37: goto L_0x0092;
            case 42: goto L_0x0080;
            case 50: goto L_0x006f;
            case 56: goto L_0x0068;
            case 64: goto L_0x0061;
            case 72: goto L_0x005a;
            case 80: goto L_0x0053;
            case 90: goto L_0x002d;
            case 96: goto L_0x0011;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x000f:
        goto L_0x0109;
    L_0x0011:
        r3 = r7.b;
        r4 = r7.f();
        r5 = 1;
        if (r4 == 0) goto L_0x0023;
    L_0x001a:
        if (r4 == r5) goto L_0x0023;
    L_0x001c:
        r7.e(r3);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0023:
        if (r4 == 0) goto L_0x0029;
    L_0x0025:
        if (r4 == r5) goto L_0x002a;
    L_0x0027:
        r1 = 0;
        goto L_0x002a;
    L_0x0029:
        r1 = 1;
    L_0x002a:
        r6.f = r1;
        goto L_0x0000;
    L_0x002d:
        r0 = defpackage.azsr.a;
        r0 = r0.getParserForType();
        r0 = r7.a(r0);
        r0 = (defpackage.azsr) r0;
        r1 = r6.e;
        if (r1 == 0) goto L_0x0050;
    L_0x003d:
        r1 = r1.toBuilder();
        r1 = (defpackage.anxo) r1;
        r1 = (defpackage.azsq) r1;
        r1.mergeFrom(r0);
        r0 = r1.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.azsr) r0;
    L_0x0050:
        r6.e = r0;
        goto L_0x0000;
    L_0x0053:
        r0 = r7.c();
        r6.m = r0;
        goto L_0x0000;
    L_0x005a:
        r0 = r7.c();
        r6.l = r0;
        goto L_0x0000;
    L_0x0061:
        r0 = r7.c();
        r6.k = r0;
        goto L_0x0000;
    L_0x0068:
        r0 = r7.c();
        r6.j = r0;
        goto L_0x0000;
    L_0x006f:
        r0 = r6.d;
        if (r0 != 0) goto L_0x007a;
    L_0x0073:
        r0 = new bdgy;
        r0.<init>();
        r6.d = r0;
    L_0x007a:
        r0 = r6.d;
        r7.a(r0);
        goto L_0x0000;
    L_0x0080:
        r0 = r6.i;
        if (r0 != 0) goto L_0x008b;
    L_0x0084:
        r0 = new bdgy;
        r0.<init>();
        r6.i = r0;
    L_0x008b:
        r0 = r6.i;
        r7.a(r0);
        goto L_0x0000;
    L_0x0092:
        r0 = r7.b();
        r6.h = r0;
        goto L_0x0000;
    L_0x009a:
        r0 = r7.b();
        r6.g = r0;
        goto L_0x0000;
    L_0x00a2:
        r2 = r7.b;
        r3 = r7.f();	 Catch:{ IllegalArgumentException -> 0x00c9 }
        if (r3 < 0) goto L_0x00b0;
    L_0x00aa:
        if (r3 > r1) goto L_0x00b0;
    L_0x00ac:
        r6.c = r3;	 Catch:{ IllegalArgumentException -> 0x00c9 }
        goto L_0x0000;
    L_0x00b0:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00c9 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00c9 }
        r5 = 57;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00c9 }
        r4.append(r3);	 Catch:{ IllegalArgumentException -> 0x00c9 }
        r3 = " is not a valid enum CollectionTypeOrientation";
        r4.append(r3);	 Catch:{ IllegalArgumentException -> 0x00c9 }
        r3 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x00c9 }
        r1.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00c9 }
        throw r1;	 Catch:{ IllegalArgumentException -> 0x00c9 }
    L_0x00c9:
        r7.e(r2);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x00d1:
        r0 = 10;
        r0 = defpackage.aock.a(r7, r0);
        r1 = r6.b;
        if (r1 == 0) goto L_0x00dd;
    L_0x00db:
        r3 = r1.length;
        goto L_0x00de;
    L_0x00dd:
        r3 = 0;
    L_0x00de:
        r0 = r0 + r3;
        r0 = new defpackage.bdgk[r0];
        if (r3 == 0) goto L_0x00e6;
    L_0x00e3:
        java.lang.System.arraycopy(r1, r2, r0, r2, r3);
    L_0x00e6:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r3 >= r1) goto L_0x00fb;
    L_0x00eb:
        r1 = new bdgk;
        r1.<init>();
        r0[r3] = r1;
        r7.a(r1);
        r7.a();
        r3 = r3 + 1;
        goto L_0x00e6;
    L_0x00fb:
        r1 = new bdgk;
        r1.<init>();
        r0[r3] = r1;
        r7.a(r1);
        r6.b = r0;
        goto L_0x0000;
    L_0x0109:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdgl.mergeFrom(aobv):aocf");
    }
}
