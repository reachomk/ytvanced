package defpackage;

/* renamed from: bdgf */
public final class bdgf extends aoca {
    public String a = "";
    public float b = 0.0f;
    public int c = 0;
    public int d = 0;
    public bdge[] e;
    public bdgh[] f;
    public boolean g;

    public bdgf() {
        if (bdge.a == null) {
            synchronized (aocd.b) {
                if (bdge.a == null) {
                    bdge.a = new bdge[0];
                }
            }
        }
        this.e = bdge.a;
        if (bdgh.a == null) {
            synchronized (aocd.b) {
                if (bdgh.a == null) {
                    bdgh.a = new bdgh[0];
                }
            }
        }
        this.f = bdgh.a;
        this.g = true;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdgf) {
            bdgf bdgf = (bdgf) obj;
            String str = this.a;
            if (str == null) {
                if (bdgf.a != null) {
                    return false;
                }
            } else if (!str.equals(bdgf.a)) {
                return false;
            }
            if (Float.floatToIntBits(this.b) == Float.floatToIntBits(bdgf.b) && this.c == bdgf.c && this.d == bdgf.d && aocd.a(this.e, bdgf.e) && aocd.a(this.f, bdgf.f) && this.g == bdgf.g) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdgf.unknownFieldData);
                }
                aocb aocb2 = bdgf.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (((((((((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + this.d) * 31) + aocd.a(this.e)) * 31) + aocd.a(this.f)) * 31) + (!this.g ? 1237 : 1231)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf;
        String str = this.a;
        if (!(str == null || str.equals(""))) {
            aoby.a(1, this.a);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            aoby.a(2, this.b);
        }
        int i = this.c;
        if (i != 0) {
            aoby.a(3, i);
        }
        i = this.d;
        if (i != 0) {
            aoby.a(4, i);
        }
        bdge[] bdgeArr = this.e;
        if (bdgeArr != null && bdgeArr.length > 0) {
            i = 0;
            while (true) {
                bdge[] bdgeArr2 = this.e;
                if (i >= bdgeArr2.length) {
                    break;
                }
                aocf = bdgeArr2[i];
                if (aocf != null) {
                    aoby.a(5, aocf);
                }
                i++;
            }
        }
        bdgh[] bdghArr = this.f;
        if (bdghArr != null && bdghArr.length > 0) {
            i = 0;
            while (true) {
                bdgh[] bdghArr2 = this.f;
                if (i >= bdghArr2.length) {
                    break;
                }
                aocf = bdghArr2[i];
                if (aocf != null) {
                    aoby.a(6, aocf);
                }
                i++;
            }
        }
        if (!this.g) {
            aoby.a(7, false);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(1, this.a);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(2);
        }
        int i = this.c;
        if (i != 0) {
            computeSerializedSize += aoby.c(3, i);
        }
        i = this.d;
        if (i != 0) {
            computeSerializedSize += aoby.c(4, i);
        }
        bdge[] bdgeArr = this.e;
        int i2 = 0;
        if (bdgeArr != null && bdgeArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                bdge[] bdgeArr2 = this.e;
                if (computeSerializedSize >= bdgeArr2.length) {
                    break;
                }
                aocf aocf = bdgeArr2[computeSerializedSize];
                if (aocf != null) {
                    i += aoby.b(5, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        bdgh[] bdghArr = this.f;
        if (bdghArr != null && bdghArr.length > 0) {
            while (true) {
                bdghArr = this.f;
                if (i2 >= bdghArr.length) {
                    break;
                }
                aocf aocf2 = bdghArr[i2];
                if (aocf2 != null) {
                    computeSerializedSize += aoby.b(6, aocf2);
                }
                i2++;
            }
        }
        return !this.g ? computeSerializedSize + aoby.d(7) : computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:48:0x00c4, code skipped:
            throw new java.lang.IllegalArgumentException(r5.toString());
     */
    /* JADX WARNING: Missing block: B:63:0x010a, code skipped:
            return r6;
     */
    public final /* synthetic */ defpackage.aocf mergeFrom(defpackage.aobv r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        if (r0 == 0) goto L_0x010a;
    L_0x0006:
        r1 = 10;
        if (r0 == r1) goto L_0x0102;
    L_0x000a:
        r1 = 21;
        if (r0 == r1) goto L_0x00fa;
    L_0x000e:
        r1 = 24;
        r2 = 45;
        r3 = 5;
        if (r0 == r1) goto L_0x00cd;
    L_0x0015:
        r1 = 32;
        if (r0 == r1) goto L_0x00a0;
    L_0x0019:
        r1 = 42;
        r2 = 0;
        if (r0 == r1) goto L_0x006a;
    L_0x001e:
        r1 = 50;
        if (r0 == r1) goto L_0x0035;
    L_0x0022:
        r1 = 56;
        if (r0 == r1) goto L_0x002e;
    L_0x0026:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x002c:
        goto L_0x010a;
    L_0x002e:
        r0 = r7.c();
        r6.g = r0;
        goto L_0x0000;
    L_0x0035:
        r0 = defpackage.aock.a(r7, r1);
        r1 = r6.f;
        if (r1 == 0) goto L_0x003f;
    L_0x003d:
        r3 = r1.length;
        goto L_0x0040;
    L_0x003f:
        r3 = 0;
    L_0x0040:
        r0 = r0 + r3;
        r0 = new defpackage.bdgh[r0];
        if (r3 == 0) goto L_0x0048;
    L_0x0045:
        java.lang.System.arraycopy(r1, r2, r0, r2, r3);
    L_0x0048:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r3 >= r1) goto L_0x005d;
    L_0x004d:
        r1 = new bdgh;
        r1.<init>();
        r0[r3] = r1;
        r7.a(r1);
        r7.a();
        r3 = r3 + 1;
        goto L_0x0048;
    L_0x005d:
        r1 = new bdgh;
        r1.<init>();
        r0[r3] = r1;
        r7.a(r1);
        r6.f = r0;
        goto L_0x0000;
    L_0x006a:
        r0 = defpackage.aock.a(r7, r1);
        r1 = r6.e;
        if (r1 == 0) goto L_0x0074;
    L_0x0072:
        r3 = r1.length;
        goto L_0x0075;
    L_0x0074:
        r3 = 0;
    L_0x0075:
        r0 = r0 + r3;
        r0 = new defpackage.bdge[r0];
        if (r3 == 0) goto L_0x007d;
    L_0x007a:
        java.lang.System.arraycopy(r1, r2, r0, r2, r3);
    L_0x007d:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r3 >= r1) goto L_0x0092;
    L_0x0082:
        r1 = new bdge;
        r1.<init>();
        r0[r3] = r1;
        r7.a(r1);
        r7.a();
        r3 = r3 + 1;
        goto L_0x007d;
    L_0x0092:
        r1 = new bdge;
        r1.<init>();
        r0[r3] = r1;
        r7.a(r1);
        r6.e = r0;
        goto L_0x0000;
    L_0x00a0:
        r1 = r7.b;
        r4 = r7.f();	 Catch:{ IllegalArgumentException -> 0x00c5 }
        if (r4 < 0) goto L_0x00ae;
    L_0x00a8:
        if (r4 > r3) goto L_0x00ae;
    L_0x00aa:
        r6.d = r4;	 Catch:{ IllegalArgumentException -> 0x00c5 }
        goto L_0x0000;
    L_0x00ae:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r5.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r5.append(r4);	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r2 = " is not a valid enum LineBreakMode";
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x00c5 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00c5 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00c5 }
    L_0x00c5:
        r7.e(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x00cd:
        r1 = r7.b;
        r4 = r7.f();	 Catch:{ IllegalArgumentException -> 0x00f2 }
        if (r4 < 0) goto L_0x00db;
    L_0x00d5:
        if (r4 > r3) goto L_0x00db;
    L_0x00d7:
        r6.c = r4;	 Catch:{ IllegalArgumentException -> 0x00f2 }
        goto L_0x0000;
    L_0x00db:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r5.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r5.append(r4);	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r2 = " is not a valid enum TextAlignment";
        r5.append(r2);	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r2 = r5.toString();	 Catch:{ IllegalArgumentException -> 0x00f2 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x00f2 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x00f2 }
    L_0x00f2:
        r7.e(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x00fa:
        r0 = r7.b();
        r6.b = r0;
        goto L_0x0000;
    L_0x0102:
        r0 = r7.d();
        r6.a = r0;
        goto L_0x0000;
    L_0x010a:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdgf.mergeFrom(aobv):aocf");
    }
}
