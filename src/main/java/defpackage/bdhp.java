package defpackage;

/* renamed from: bdhp */
public final class bdhp extends aoca {
    public static final aobz a = aobz.a(bdhp.class, 1350183970);
    public bdgy b;
    public bdhb c;
    public bdhb d;
    public bdhb e;
    public bdhb f;
    public bdhb g;
    public bdhb h;
    public bdgy i;
    public bdgy j;
    public int k;
    public int l;
    public int m;
    public float n;
    public float o;
    public bdhb p;
    public int q;
    public int r;
    public float s;
    public int t;
    public int u;

    public bdhp() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0.0f;
        this.o = 1.0f;
        this.p = null;
        this.q = 0;
        this.r = 0;
        this.s = 0.0f;
        this.u = 1;
        this.t = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhp) {
            bdhp bdhp = (bdhp) obj;
            bdgy bdgy = this.b;
            if (bdgy == null) {
                if (bdhp.b != null) {
                    return false;
                }
            } else if (!bdgy.equals(bdhp.b)) {
                return false;
            }
            bdhb bdhb = this.c;
            if (bdhb == null) {
                if (bdhp.c != null) {
                    return false;
                }
            } else if (!bdhb.equals(bdhp.c)) {
                return false;
            }
            bdhb = this.d;
            if (bdhb == null) {
                if (bdhp.d != null) {
                    return false;
                }
            } else if (!bdhb.equals(bdhp.d)) {
                return false;
            }
            bdhb = this.e;
            if (bdhb == null) {
                if (bdhp.e != null) {
                    return false;
                }
            } else if (!bdhb.equals(bdhp.e)) {
                return false;
            }
            bdhb = this.f;
            if (bdhb == null) {
                if (bdhp.f != null) {
                    return false;
                }
            } else if (!bdhb.equals(bdhp.f)) {
                return false;
            }
            bdhb = this.g;
            if (bdhb == null) {
                if (bdhp.g != null) {
                    return false;
                }
            } else if (!bdhb.equals(bdhp.g)) {
                return false;
            }
            bdhb = this.h;
            if (bdhb == null) {
                if (bdhp.h != null) {
                    return false;
                }
            } else if (!bdhb.equals(bdhp.h)) {
                return false;
            }
            bdgy = this.i;
            if (bdgy == null) {
                if (bdhp.i != null) {
                    return false;
                }
            } else if (!bdgy.equals(bdhp.i)) {
                return false;
            }
            bdgy = this.j;
            if (bdgy == null) {
                if (bdhp.j != null) {
                    return false;
                }
            } else if (!bdgy.equals(bdhp.j)) {
                return false;
            }
            if (this.k == bdhp.k && this.l == bdhp.l && this.m == bdhp.m && Float.floatToIntBits(this.n) == Float.floatToIntBits(bdhp.n) && Float.floatToIntBits(this.o) == Float.floatToIntBits(bdhp.o)) {
                bdhb = this.p;
                if (bdhb == null) {
                    if (bdhp.p != null) {
                        return false;
                    }
                } else if (!bdhb.equals(bdhp.p)) {
                    return false;
                }
                if (this.q == bdhp.q && this.r == bdhp.r && Float.floatToIntBits(this.s) == Float.floatToIntBits(bdhp.s) && this.u == bdhp.u && this.t == bdhp.t) {
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(bdhp.unknownFieldData);
                    }
                    aocb aocb2 = bdhp.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        bdgy bdgy = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = bdgy != null ? bdgy.hashCode() : 0;
        bdhb bdhb = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdhb != null ? bdhb.hashCode() : 0;
        bdhb = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdhb != null ? bdhb.hashCode() : 0;
        bdhb = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdhb != null ? bdhb.hashCode() : 0;
        bdhb = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdhb != null ? bdhb.hashCode() : 0;
        bdhb = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdhb != null ? bdhb.hashCode() : 0;
        bdhb = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdhb != null ? bdhb.hashCode() : 0;
        bdgy bdgy2 = this.i;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdgy2 != null ? bdgy2.hashCode() : 0;
        bdgy2 = this.j;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdgy2 != null ? bdgy2.hashCode() : 0;
        int i2 = this.k;
        int i3 = this.l;
        int i4 = this.m;
        int floatToIntBits = Float.floatToIntBits(this.n);
        int floatToIntBits2 = Float.floatToIntBits(this.o);
        bdhb bdhb2 = this.p;
        hashCode = (((((((((((((((((((hashCode + hashCode2) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + floatToIntBits) * 31) + floatToIntBits2) * 31) + (bdhb2 != null ? bdhb2.hashCode() : 0)) * 31) + this.q) * 31) + this.r) * 31) + Float.floatToIntBits(this.s)) * 31;
        hashCode2 = this.u;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        hashCode = (((hashCode + hashCode2) * 31) + this.t) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(1, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        aocf = this.d;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        aocf = this.e;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        aocf = this.f;
        if (aocf != null) {
            aoby.a(5, aocf);
        }
        aocf = this.g;
        if (aocf != null) {
            aoby.a(6, aocf);
        }
        aocf = this.h;
        if (aocf != null) {
            aoby.a(7, aocf);
        }
        aocf = this.i;
        if (aocf != null) {
            aoby.a(8, aocf);
        }
        aocf = this.j;
        if (aocf != null) {
            aoby.a(9, aocf);
        }
        int i = this.k;
        if (i != 0) {
            aoby.a(10, i);
        }
        i = this.l;
        if (i != 0) {
            aoby.a(11, i);
        }
        i = this.m;
        if (i != 0) {
            aoby.a(12, i);
        }
        if (Float.floatToIntBits(this.n) != Float.floatToIntBits(0.0f)) {
            aoby.a(13, this.n);
        }
        if (Float.floatToIntBits(this.o) != Float.floatToIntBits(1.0f)) {
            aoby.a(14, this.o);
        }
        aocf = this.p;
        if (aocf != null) {
            aoby.a(15, aocf);
        }
        i = this.q;
        if (i != 0) {
            aoby.a(16, i);
        }
        i = this.r;
        if (i != 0) {
            aoby.a(17, i);
        }
        if (Float.floatToIntBits(this.s) != Float.floatToIntBits(0.0f)) {
            aoby.a(18, this.s);
        }
        i = this.u;
        if (!(i == 1 || i == 0)) {
            aoby.a(19, i - 1);
        }
        i = this.t;
        if (i != 0) {
            aoby.a(20, i);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(1, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        aocf = this.d;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        aocf = this.e;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        aocf = this.f;
        if (aocf != null) {
            computeSerializedSize += aoby.b(5, aocf);
        }
        aocf = this.g;
        if (aocf != null) {
            computeSerializedSize += aoby.b(6, aocf);
        }
        aocf = this.h;
        if (aocf != null) {
            computeSerializedSize += aoby.b(7, aocf);
        }
        aocf = this.i;
        if (aocf != null) {
            computeSerializedSize += aoby.b(8, aocf);
        }
        aocf = this.j;
        if (aocf != null) {
            computeSerializedSize += aoby.b(9, aocf);
        }
        int i = this.k;
        if (i != 0) {
            computeSerializedSize += aoby.c(10, i);
        }
        i = this.l;
        if (i != 0) {
            computeSerializedSize += aoby.c(11, i);
        }
        i = this.m;
        if (i != 0) {
            computeSerializedSize += aoby.c(12, i);
        }
        if (Float.floatToIntBits(this.n) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(13);
        }
        if (Float.floatToIntBits(this.o) != Float.floatToIntBits(1.0f)) {
            computeSerializedSize += aoby.c(14);
        }
        aocf = this.p;
        if (aocf != null) {
            computeSerializedSize += aoby.b(15, aocf);
        }
        i = this.q;
        if (i != 0) {
            computeSerializedSize += aoby.c(16, i);
        }
        i = this.r;
        if (i != 0) {
            computeSerializedSize += aoby.c(17, i);
        }
        if (Float.floatToIntBits(this.s) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(18);
        }
        i = this.u;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(19, i - 1);
        }
        i = this.t;
        return i != 0 ? computeSerializedSize + aoby.c(20, i) : computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:11:0x0038, code skipped:
            throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* JADX WARNING: Missing block: B:40:0x0099, code skipped:
            throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* JADX WARNING: Missing block: B:78:0x0145, code skipped:
            throw new java.lang.IllegalArgumentException(r4.toString());
     */
    /* JADX WARNING: Missing block: B:117:0x01f0, code skipped:
            return r8;
     */
    public final /* synthetic */ defpackage.aocf mergeFrom(defpackage.aobv r9) {
        /*
        r8 = this;
    L_0x0000:
        r0 = r9.a();
        r1 = 40;
        r2 = 5;
        r3 = 4;
        r4 = 3;
        r5 = 2;
        switch(r0) {
            case 0: goto L_0x01f0;
            case 10: goto L_0x01de;
            case 18: goto L_0x01cc;
            case 26: goto L_0x01ba;
            case 34: goto L_0x01a8;
            case 42: goto L_0x0196;
            case 50: goto L_0x0184;
            case 58: goto L_0x0172;
            case 66: goto L_0x0160;
            case 74: goto L_0x014e;
            case 80: goto L_0x011f;
            case 88: goto L_0x00f0;
            case 96: goto L_0x00da;
            case 109: goto L_0x00d2;
            case 117: goto L_0x00ca;
            case 122: goto L_0x00b8;
            case 128: goto L_0x00a2;
            case 136: goto L_0x0075;
            case 149: goto L_0x006e;
            case 152: goto L_0x0040;
            case 160: goto L_0x0015;
            default: goto L_0x000d;
        };
    L_0x000d:
        r0 = super.storeUnknownField(r9, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x0013:
        goto L_0x01f0;
    L_0x0015:
        r2 = r9.b;
        r3 = r9.f();	 Catch:{ IllegalArgumentException -> 0x0039 }
        if (r3 < 0) goto L_0x0022;
    L_0x001d:
        if (r3 > r4) goto L_0x0022;
    L_0x001f:
        r8.t = r3;	 Catch:{ IllegalArgumentException -> 0x0039 }
        goto L_0x0000;
    L_0x0022:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0039 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0039 }
        r5.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0039 }
        r5.append(r3);	 Catch:{ IllegalArgumentException -> 0x0039 }
        r1 = " is not a valid enum FlexWrap";
        r5.append(r1);	 Catch:{ IllegalArgumentException -> 0x0039 }
        r1 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x0039 }
        r4.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0039 }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x0039 }
    L_0x0039:
        r9.e(r2);
        r8.storeUnknownField(r9, r0);
        goto L_0x0000;
    L_0x0040:
        r1 = r9.b;
        r6 = r9.f();
        r7 = 1;
        if (r6 == 0) goto L_0x0058;
    L_0x0049:
        if (r6 == r7) goto L_0x0058;
    L_0x004b:
        if (r6 == r5) goto L_0x0058;
    L_0x004d:
        if (r6 == r4) goto L_0x0058;
    L_0x004f:
        if (r6 == r3) goto L_0x0058;
    L_0x0051:
        r9.e(r1);
        r8.storeUnknownField(r9, r0);
        goto L_0x0000;
    L_0x0058:
        if (r6 == 0) goto L_0x006a;
    L_0x005a:
        if (r6 == r7) goto L_0x0068;
    L_0x005c:
        if (r6 == r5) goto L_0x0066;
    L_0x005e:
        if (r6 == r4) goto L_0x0064;
    L_0x0060:
        if (r6 == r3) goto L_0x006b;
    L_0x0062:
        r2 = 0;
        goto L_0x006b;
    L_0x0064:
        r2 = 4;
        goto L_0x006b;
    L_0x0066:
        r2 = 3;
        goto L_0x006b;
    L_0x0068:
        r2 = 2;
        goto L_0x006b;
    L_0x006a:
        r2 = 1;
    L_0x006b:
        r8.u = r2;
        goto L_0x0000;
    L_0x006e:
        r0 = r9.b();
        r8.s = r0;
        goto L_0x0000;
    L_0x0075:
        r2 = r9.b;
        r3 = r9.f();	 Catch:{ IllegalArgumentException -> 0x009a }
        if (r3 < 0) goto L_0x0083;
    L_0x007d:
        if (r3 > r5) goto L_0x0083;
    L_0x007f:
        r8.r = r3;	 Catch:{ IllegalArgumentException -> 0x009a }
        goto L_0x0000;
    L_0x0083:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x009a }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x009a }
        r5.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x009a }
        r5.append(r3);	 Catch:{ IllegalArgumentException -> 0x009a }
        r1 = " is not a valid enum Position";
        r5.append(r1);	 Catch:{ IllegalArgumentException -> 0x009a }
        r1 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x009a }
        r4.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x009a }
        throw r4;	 Catch:{ IllegalArgumentException -> 0x009a }
    L_0x009a:
        r9.e(r2);
        r8.storeUnknownField(r9, r0);
        goto L_0x0000;
    L_0x00a2:
        r1 = r9.b;
        r2 = r9.f();	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r2 = defpackage.bdhm.a(r2);	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r8.q = r2;	 Catch:{ IllegalArgumentException -> 0x00b0 }
        goto L_0x0000;
    L_0x00b0:
        r9.e(r1);
        r8.storeUnknownField(r9, r0);
        goto L_0x0000;
    L_0x00b8:
        r0 = r8.p;
        if (r0 != 0) goto L_0x00c3;
    L_0x00bc:
        r0 = new bdhb;
        r0.<init>();
        r8.p = r0;
    L_0x00c3:
        r0 = r8.p;
        r9.a(r0);
        goto L_0x0000;
    L_0x00ca:
        r0 = r9.b();
        r8.o = r0;
        goto L_0x0000;
    L_0x00d2:
        r0 = r9.b();
        r8.n = r0;
        goto L_0x0000;
    L_0x00da:
        r1 = r9.b;
        r2 = r9.f();	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r2 = defpackage.bdhm.a(r2);	 Catch:{ IllegalArgumentException -> 0x00e8 }
        r8.m = r2;	 Catch:{ IllegalArgumentException -> 0x00e8 }
        goto L_0x0000;
    L_0x00e8:
        r9.e(r1);
        r8.storeUnknownField(r9, r0);
        goto L_0x0000;
    L_0x00f0:
        r1 = r9.b;
        r3 = r9.f();	 Catch:{ IllegalArgumentException -> 0x0117 }
        if (r3 < 0) goto L_0x00fe;
    L_0x00f8:
        if (r3 > r2) goto L_0x00fe;
    L_0x00fa:
        r8.l = r3;	 Catch:{ IllegalArgumentException -> 0x0117 }
        goto L_0x0000;
    L_0x00fe:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0117 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0117 }
        r5 = 46;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0117 }
        r4.append(r3);	 Catch:{ IllegalArgumentException -> 0x0117 }
        r3 = " is not a valid enum JustifyContent";
        r4.append(r3);	 Catch:{ IllegalArgumentException -> 0x0117 }
        r3 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0117 }
        r2.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0117 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0117 }
    L_0x0117:
        r9.e(r1);
        r8.storeUnknownField(r9, r0);
        goto L_0x0000;
    L_0x011f:
        r1 = r9.b;
        r2 = r9.f();	 Catch:{ IllegalArgumentException -> 0x0146 }
        if (r2 < 0) goto L_0x012d;
    L_0x0127:
        if (r2 > r3) goto L_0x012d;
    L_0x0129:
        r8.k = r2;	 Catch:{ IllegalArgumentException -> 0x0146 }
        goto L_0x0000;
    L_0x012d:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0146 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0146 }
        r5 = 45;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0146 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0146 }
        r2 = " is not a valid enum FlexDirection";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0146 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0146 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0146 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0146 }
    L_0x0146:
        r9.e(r1);
        r8.storeUnknownField(r9, r0);
        goto L_0x0000;
    L_0x014e:
        r0 = r8.j;
        if (r0 != 0) goto L_0x0159;
    L_0x0152:
        r0 = new bdgy;
        r0.<init>();
        r8.j = r0;
    L_0x0159:
        r0 = r8.j;
        r9.a(r0);
        goto L_0x0000;
    L_0x0160:
        r0 = r8.i;
        if (r0 != 0) goto L_0x016b;
    L_0x0164:
        r0 = new bdgy;
        r0.<init>();
        r8.i = r0;
    L_0x016b:
        r0 = r8.i;
        r9.a(r0);
        goto L_0x0000;
    L_0x0172:
        r0 = r8.h;
        if (r0 != 0) goto L_0x017d;
    L_0x0176:
        r0 = new bdhb;
        r0.<init>();
        r8.h = r0;
    L_0x017d:
        r0 = r8.h;
        r9.a(r0);
        goto L_0x0000;
    L_0x0184:
        r0 = r8.g;
        if (r0 != 0) goto L_0x018f;
    L_0x0188:
        r0 = new bdhb;
        r0.<init>();
        r8.g = r0;
    L_0x018f:
        r0 = r8.g;
        r9.a(r0);
        goto L_0x0000;
    L_0x0196:
        r0 = r8.f;
        if (r0 != 0) goto L_0x01a1;
    L_0x019a:
        r0 = new bdhb;
        r0.<init>();
        r8.f = r0;
    L_0x01a1:
        r0 = r8.f;
        r9.a(r0);
        goto L_0x0000;
    L_0x01a8:
        r0 = r8.e;
        if (r0 != 0) goto L_0x01b3;
    L_0x01ac:
        r0 = new bdhb;
        r0.<init>();
        r8.e = r0;
    L_0x01b3:
        r0 = r8.e;
        r9.a(r0);
        goto L_0x0000;
    L_0x01ba:
        r0 = r8.d;
        if (r0 != 0) goto L_0x01c5;
    L_0x01be:
        r0 = new bdhb;
        r0.<init>();
        r8.d = r0;
    L_0x01c5:
        r0 = r8.d;
        r9.a(r0);
        goto L_0x0000;
    L_0x01cc:
        r0 = r8.c;
        if (r0 != 0) goto L_0x01d7;
    L_0x01d0:
        r0 = new bdhb;
        r0.<init>();
        r8.c = r0;
    L_0x01d7:
        r0 = r8.c;
        r9.a(r0);
        goto L_0x0000;
    L_0x01de:
        r0 = r8.b;
        if (r0 != 0) goto L_0x01e9;
    L_0x01e2:
        r0 = new bdgy;
        r0.<init>();
        r8.b = r0;
    L_0x01e9:
        r0 = r8.b;
        r9.a(r0);
        goto L_0x0000;
    L_0x01f0:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdhp.mergeFrom(aobv):aocf");
    }
}
