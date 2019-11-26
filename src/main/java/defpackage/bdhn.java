package defpackage;

/* renamed from: bdhn */
public final class bdhn extends aoca {
    public static final aobz a = aobz.a(bdhn.class, 1270370762);
    public bdhi b;
    public bdhi c;
    public bdhi d;
    public int e;
    public azsr f;
    public azsr g;
    private float h;
    private int i;

    public bdhn() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.h = 0.0f;
        this.i = 1;
        this.f = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhn) {
            bdhn bdhn = (bdhn) obj;
            bdhi bdhi = this.b;
            if (bdhi == null) {
                if (bdhn.b != null) {
                    return false;
                }
            } else if (!bdhi.equals(bdhn.b)) {
                return false;
            }
            bdhi = this.c;
            if (bdhi == null) {
                if (bdhn.c != null) {
                    return false;
                }
            } else if (!bdhi.equals(bdhn.c)) {
                return false;
            }
            bdhi = this.d;
            if (bdhi == null) {
                if (bdhn.d != null) {
                    return false;
                }
            } else if (!bdhi.equals(bdhn.d)) {
                return false;
            }
            if (this.e == bdhn.e && Float.floatToIntBits(this.h) == Float.floatToIntBits(bdhn.h) && this.i == bdhn.i) {
                azsr azsr = this.f;
                if (azsr == null) {
                    if (bdhn.f != null) {
                        return false;
                    }
                } else if (!azsr.equals(bdhn.f)) {
                    return false;
                }
                azsr = this.g;
                if (azsr == null) {
                    if (bdhn.g != null) {
                        return false;
                    }
                } else if (!azsr.equals(bdhn.g)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdhn.unknownFieldData);
                }
                aocb aocb2 = bdhn.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        bdhi bdhi = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = bdhi != null ? bdhi.hashCode() : 0;
        bdhi bdhi2 = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdhi2 != null ? bdhi2.hashCode() : 0;
        bdhi2 = this.d;
        hashCode = (((((((hashCode + hashCode2) * 31) + (bdhi2 != null ? bdhi2.hashCode() : 0)) * 31) + this.e) * 31) + Float.floatToIntBits(this.h)) * 31;
        hashCode2 = this.i;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        azsr azsr = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = azsr != null ? azsr.hashCode() : 0;
        azsr = this.g;
        hashCode = (((hashCode + hashCode2) * 31) + (azsr != null ? azsr.hashCode() : 0)) * 31;
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
        int i = this.e;
        if (i != 0) {
            aoby.a(4, i);
        }
        if (Float.floatToIntBits(this.h) != Float.floatToIntBits(0.0f)) {
            aoby.a(5, this.h);
        }
        i = this.i;
        if (!(i == 1 || i == 0)) {
            aoby.a(7, i - 1);
        }
        anze anze = this.f;
        if (anze != null) {
            aoby.a(8, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(9, anze);
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
        int i = this.e;
        if (i != 0) {
            computeSerializedSize += aoby.c(4, i);
        }
        if (Float.floatToIntBits(this.h) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(5);
        }
        i = this.i;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(7, i - 1);
        }
        anze anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        anze = this.g;
        return anze != null ? computeSerializedSize + anwm.c(9, anze) : computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:63:0x010c, code skipped:
            return r6;
     */
    public final /* synthetic */ defpackage.aocf mergeFrom(defpackage.aobv r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        if (r0 == 0) goto L_0x010c;
    L_0x0006:
        r1 = 10;
        if (r0 == r1) goto L_0x00fa;
    L_0x000a:
        r1 = 18;
        if (r0 == r1) goto L_0x00e8;
    L_0x000e:
        r1 = 26;
        if (r0 == r1) goto L_0x00d6;
    L_0x0012:
        r1 = 32;
        r2 = 2;
        if (r0 == r1) goto L_0x00a7;
    L_0x0017:
        r1 = 45;
        if (r0 == r1) goto L_0x009f;
    L_0x001b:
        r1 = 56;
        if (r0 == r1) goto L_0x007b;
    L_0x001f:
        r1 = 66;
        if (r0 == r1) goto L_0x0055;
    L_0x0023:
        r1 = 74;
        if (r0 == r1) goto L_0x002f;
    L_0x0027:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x002d:
        goto L_0x010c;
    L_0x002f:
        r0 = defpackage.azsr.a;
        r0 = r0.getParserForType();
        r0 = r7.a(r0);
        r0 = (defpackage.azsr) r0;
        r1 = r6.g;
        if (r1 == 0) goto L_0x0052;
    L_0x003f:
        r1 = r1.toBuilder();
        r1 = (defpackage.anxo) r1;
        r1 = (defpackage.azsq) r1;
        r1.mergeFrom(r0);
        r0 = r1.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.azsr) r0;
    L_0x0052:
        r6.g = r0;
        goto L_0x0000;
    L_0x0055:
        r0 = defpackage.azsr.a;
        r0 = r0.getParserForType();
        r0 = r7.a(r0);
        r0 = (defpackage.azsr) r0;
        r1 = r6.f;
        if (r1 == 0) goto L_0x0078;
    L_0x0065:
        r1 = r1.toBuilder();
        r1 = (defpackage.anxo) r1;
        r1 = (defpackage.azsq) r1;
        r1.mergeFrom(r0);
        r0 = r1.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.azsr) r0;
    L_0x0078:
        r6.f = r0;
        goto L_0x0000;
    L_0x007b:
        r1 = r7.b;
        r3 = r7.f();
        r4 = 1;
        if (r3 == 0) goto L_0x0090;
    L_0x0084:
        if (r3 == r4) goto L_0x0090;
    L_0x0086:
        if (r3 == r2) goto L_0x0090;
    L_0x0088:
        r7.e(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0090:
        if (r3 == 0) goto L_0x009a;
    L_0x0092:
        if (r3 == r4) goto L_0x009b;
    L_0x0094:
        if (r3 == r2) goto L_0x0098;
    L_0x0096:
        r2 = 0;
        goto L_0x009b;
    L_0x0098:
        r2 = 3;
        goto L_0x009b;
    L_0x009a:
        r2 = 1;
    L_0x009b:
        r6.i = r2;
        goto L_0x0000;
    L_0x009f:
        r0 = r7.b();
        r6.h = r0;
        goto L_0x0000;
    L_0x00a7:
        r1 = r7.b;
        r3 = r7.f();	 Catch:{ IllegalArgumentException -> 0x00ce }
        if (r3 < 0) goto L_0x00b5;
    L_0x00af:
        if (r3 > r2) goto L_0x00b5;
    L_0x00b1:
        r6.e = r3;	 Catch:{ IllegalArgumentException -> 0x00ce }
        goto L_0x0000;
    L_0x00b5:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00ce }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00ce }
        r5 = 51;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x00ce }
        r4.append(r3);	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = " is not a valid enum ImageTransitionType";
        r4.append(r3);	 Catch:{ IllegalArgumentException -> 0x00ce }
        r3 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x00ce }
        r2.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x00ce }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x00ce }
    L_0x00ce:
        r7.e(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x00d6:
        r0 = r6.d;
        if (r0 != 0) goto L_0x00e1;
    L_0x00da:
        r0 = new bdhi;
        r0.<init>();
        r6.d = r0;
    L_0x00e1:
        r0 = r6.d;
        r7.a(r0);
        goto L_0x0000;
    L_0x00e8:
        r0 = r6.c;
        if (r0 != 0) goto L_0x00f3;
    L_0x00ec:
        r0 = new bdhi;
        r0.<init>();
        r6.c = r0;
    L_0x00f3:
        r0 = r6.c;
        r7.a(r0);
        goto L_0x0000;
    L_0x00fa:
        r0 = r6.b;
        if (r0 != 0) goto L_0x0105;
    L_0x00fe:
        r0 = new bdhi;
        r0.<init>();
        r6.b = r0;
    L_0x0105:
        r0 = r6.b;
        r7.a(r0);
        goto L_0x0000;
    L_0x010c:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdhn.mergeFrom(aobv):aocf");
    }
}
