package defpackage;

/* renamed from: bdgh */
public final class bdgh extends aoca {
    public static volatile bdgh[] a;
    public int b;
    public int c;
    public String d;
    public float e;
    public int f;
    public int g;
    private int h;
    private int i;
    private boolean j;
    private int k;

    public bdgh() {
        this.h = -1;
        this.b = 0;
        this.c = 0;
        this.d = "";
        this.e = 0.0f;
        this.f = 0;
        this.g = 0;
        this.j = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdgh) {
            bdgh bdgh = (bdgh) obj;
            if (this.b == bdgh.b && this.c == bdgh.c) {
                String str = this.d;
                if (str == null) {
                    if (bdgh.d != null) {
                        return false;
                    }
                } else if (!str.equals(bdgh.d)) {
                    return false;
                }
                if (Float.floatToIntBits(this.e) == Float.floatToIntBits(bdgh.e) && this.f == bdgh.f && this.g == bdgh.g && this.i == bdgh.i && this.k == bdgh.k && this.j == bdgh.j) {
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(bdgh.unknownFieldData);
                    }
                    aocb aocb2 = bdgh.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        int i = 0;
        hashCode = (((((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Float.floatToIntBits(this.e)) * 31) + this.f) * 31) + this.g) * 31) + this.i) * 31;
        int i2 = this.k;
        if (i2 == 0) {
            i2 = 0;
        }
        hashCode = (((hashCode + i2) * 31) + (!this.j ? 1237 : 1231)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i = this.b;
        if (i != 0) {
            aoby.b(1, i);
        }
        i = this.c;
        if (i != 0) {
            aoby.b(2, i);
        }
        String str = this.d;
        if (!(str == null || str.equals(""))) {
            aoby.a(3, this.d);
        }
        if (Float.floatToIntBits(this.e) != Float.floatToIntBits(0.0f)) {
            aoby.a(4, this.e);
        }
        i = this.f;
        if (i != 0) {
            aoby.b(5, i);
        }
        i = this.g;
        if (i != 0) {
            aoby.a(6, i);
        }
        if (this.h == 0) {
            aoby.b(7, this.i);
        }
        if (this.h == 1) {
            i = this.k;
            if (i != 0) {
                aoby.a(8, i - 1);
            }
        }
        if (this.j) {
            aoby.a(9, true);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.b;
        if (i != 0) {
            computeSerializedSize += aoby.d(1, i);
        }
        i = this.c;
        if (i != 0) {
            computeSerializedSize += aoby.d(2, i);
        }
        String str = this.d;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(3, this.d);
        }
        if (Float.floatToIntBits(this.e) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(4);
        }
        i = this.f;
        if (i != 0) {
            computeSerializedSize += aoby.d(5, i);
        }
        i = this.g;
        if (i != 0) {
            computeSerializedSize += aoby.c(6, i);
        }
        if (this.h == 0) {
            computeSerializedSize += aoby.d(7, this.i);
        }
        if (this.h == 1) {
            i = this.k;
            if (i != 0) {
                computeSerializedSize += aoby.c(8, i - 1);
            }
        }
        return this.j ? computeSerializedSize + aoby.d(9) : computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:54:0x00c8, code skipped:
            return r7;
     */
    public final /* synthetic */ defpackage.aocf mergeFrom(defpackage.aobv r8) {
        /*
        r7 = this;
    L_0x0000:
        r0 = r8.a();
        if (r0 == 0) goto L_0x00c8;
    L_0x0006:
        r1 = 8;
        if (r0 == r1) goto L_0x00c0;
    L_0x000a:
        r2 = 16;
        if (r0 == r2) goto L_0x00b8;
    L_0x000e:
        r2 = 26;
        if (r0 == r2) goto L_0x00b0;
    L_0x0012:
        r2 = 37;
        if (r0 == r2) goto L_0x00a8;
    L_0x0016:
        r2 = 40;
        if (r0 == r2) goto L_0x00a0;
    L_0x001a:
        r2 = 48;
        r3 = 3;
        if (r0 == r2) goto L_0x0072;
    L_0x001f:
        r2 = 56;
        r4 = 0;
        if (r0 == r2) goto L_0x0069;
    L_0x0024:
        r2 = 64;
        if (r0 == r2) goto L_0x003b;
    L_0x0028:
        r1 = 72;
        if (r0 == r1) goto L_0x0034;
    L_0x002c:
        r0 = super.storeUnknownField(r8, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x0032:
        goto L_0x00c8;
    L_0x0034:
        r0 = r8.c();
        r7.j = r0;
        goto L_0x0000;
    L_0x003b:
        r2 = 1;
        r7.h = r2;
        r5 = r8.b;
        r6 = r8.f();
        switch(r6) {
            case 0: goto L_0x004e;
            case 1: goto L_0x004e;
            case 2: goto L_0x004e;
            case 3: goto L_0x004e;
            case 4: goto L_0x004e;
            case 5: goto L_0x004e;
            case 6: goto L_0x004e;
            case 7: goto L_0x004e;
            case 8: goto L_0x004e;
            case 9: goto L_0x004e;
            default: goto L_0x0047;
        };
    L_0x0047:
        r8.e(r5);
        r7.storeUnknownField(r8, r0);
        goto L_0x0000;
    L_0x004e:
        switch(r6) {
            case 0: goto L_0x0065;
            case 1: goto L_0x0063;
            case 2: goto L_0x0061;
            case 3: goto L_0x005f;
            case 4: goto L_0x005d;
            case 5: goto L_0x005b;
            case 6: goto L_0x0059;
            case 7: goto L_0x0066;
            case 8: goto L_0x0056;
            case 9: goto L_0x0053;
            default: goto L_0x0051;
        };
    L_0x0051:
        r1 = 0;
        goto L_0x0066;
    L_0x0053:
        r1 = 10;
        goto L_0x0066;
    L_0x0056:
        r1 = 9;
        goto L_0x0066;
    L_0x0059:
        r1 = 7;
        goto L_0x0066;
    L_0x005b:
        r1 = 6;
        goto L_0x0066;
    L_0x005d:
        r1 = 5;
        goto L_0x0066;
    L_0x005f:
        r1 = 4;
        goto L_0x0066;
    L_0x0061:
        r1 = 3;
        goto L_0x0066;
    L_0x0063:
        r1 = 2;
        goto L_0x0066;
    L_0x0065:
        r1 = 1;
    L_0x0066:
        r7.k = r1;
        goto L_0x0000;
    L_0x0069:
        r0 = r8.f();
        r7.i = r0;
        r7.h = r4;
        goto L_0x0000;
    L_0x0072:
        r1 = r8.b;
        r2 = r8.f();	 Catch:{ IllegalArgumentException -> 0x0098 }
        if (r2 < 0) goto L_0x007f;
    L_0x007a:
        if (r2 > r3) goto L_0x007f;
    L_0x007c:
        r7.g = r2;	 Catch:{ IllegalArgumentException -> 0x0098 }
        goto L_0x0000;
    L_0x007f:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0098 }
        r5 = 46;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0098 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = " is not a valid enum UnderlineStyle";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0098 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0098 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0098 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0098 }
    L_0x0098:
        r8.e(r1);
        r7.storeUnknownField(r8, r0);
        goto L_0x0000;
    L_0x00a0:
        r0 = r8.f();
        r7.f = r0;
        goto L_0x0000;
    L_0x00a8:
        r0 = r8.b();
        r7.e = r0;
        goto L_0x0000;
    L_0x00b0:
        r0 = r8.d();
        r7.d = r0;
        goto L_0x0000;
    L_0x00b8:
        r0 = r8.f();
        r7.c = r0;
        goto L_0x0000;
    L_0x00c0:
        r0 = r8.f();
        r7.b = r0;
        goto L_0x0000;
    L_0x00c8:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdgh.mergeFrom(aobv):aocf");
    }
}
