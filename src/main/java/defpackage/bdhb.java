package defpackage;

/* renamed from: bdhb */
public final class bdhb extends aoca {
    public float a;
    public int b;

    public bdhb() {
        this.a = 0.0f;
        this.b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhb) {
            bdhb bdhb = (bdhb) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(bdhb.a) && this.b == bdhb.b) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdhb.unknownFieldData);
                }
                aocb aocb2 = bdhb.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((getClass().getName().hashCode() + 527) * 31) + Float.floatToIntBits(this.a)) * 31) + this.b) * 31;
        aocb aocb = this.unknownFieldData;
        int i = 0;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        if (Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f)) {
            aoby.a(1, this.a);
        }
        int i = this.b;
        if (i != 0) {
            aoby.a(2, i);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += aoby.c(1);
        }
        int i = this.b;
        return i != 0 ? computeSerializedSize + aoby.c(2, i) : computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:20:0x004a, code skipped:
            return r6;
     */
    public final /* synthetic */ defpackage.aocf mergeFrom(defpackage.aobv r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        if (r0 == 0) goto L_0x004a;
    L_0x0006:
        r1 = 13;
        if (r0 == r1) goto L_0x0043;
    L_0x000a:
        r1 = 16;
        if (r0 == r1) goto L_0x0015;
    L_0x000e:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x0014:
        goto L_0x004a;
    L_0x0015:
        r1 = r7.b;
        r2 = r7.f();	 Catch:{ IllegalArgumentException -> 0x003c }
        if (r2 < 0) goto L_0x0023;
    L_0x001d:
        r3 = 2;
        if (r2 > r3) goto L_0x0023;
    L_0x0020:
        r6.b = r2;	 Catch:{ IllegalArgumentException -> 0x003c }
        goto L_0x0000;
    L_0x0023:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x003c }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x003c }
        r5 = 45;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x003c }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x003c }
        r2 = " is not a valid enum DimensionUnit";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x003c }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x003c }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x003c }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x003c }
    L_0x003c:
        r7.e(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0043:
        r0 = r7.b();
        r6.a = r0;
        goto L_0x0000;
    L_0x004a:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdhb.mergeFrom(aobv):aocf");
    }
}
