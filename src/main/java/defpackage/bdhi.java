package defpackage;

/* renamed from: bdhi */
public final class bdhi extends aoca {
    public bdhk[] a;
    public int b;
    public bdhl c;

    public bdhi() {
        if (bdhk.a == null) {
            synchronized (aocd.b) {
                if (bdhk.a == null) {
                    bdhk.a = new bdhk[0];
                }
            }
        }
        this.a = bdhk.a;
        this.b = 0;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhi) {
            bdhi bdhi = (bdhi) obj;
            if (aocd.a(this.a, bdhi.a) && this.b == bdhi.b) {
                bdhl bdhl = this.c;
                if (bdhl == null) {
                    if (bdhi.c != null) {
                        return false;
                    }
                } else if (!bdhl.equals(bdhi.c)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(bdhi.unknownFieldData);
                }
                aocb aocb2 = bdhi.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.a);
        int i = this.b;
        bdhl bdhl = this.c;
        hashCode = (((((hashCode + 527) * 31) + a) * 31) + i) * 31;
        a = 0;
        hashCode = (hashCode + (bdhl != null ? bdhl.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        int i;
        bdhk[] bdhkArr = this.a;
        if (bdhkArr != null && bdhkArr.length > 0) {
            i = 0;
            while (true) {
                bdhk[] bdhkArr2 = this.a;
                if (i >= bdhkArr2.length) {
                    break;
                }
                aocf aocf = bdhkArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        i = this.b;
        if (i != 0) {
            aoby.a(2, i);
        }
        aocf aocf2 = this.c;
        if (aocf2 != null) {
            aoby.a(3, aocf2);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        bdhk[] bdhkArr = this.a;
        if (bdhkArr != null && bdhkArr.length > 0) {
            i = 0;
            while (true) {
                bdhk[] bdhkArr2 = this.a;
                if (i >= bdhkArr2.length) {
                    break;
                }
                aocf aocf = bdhkArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(1, aocf);
                }
                i++;
            }
        }
        i = this.b;
        if (i != 0) {
            computeSerializedSize += aoby.c(2, i);
        }
        aocf aocf2 = this.c;
        return aocf2 != null ? computeSerializedSize + aoby.b(3, aocf2) : computeSerializedSize;
    }

    /* JADX WARNING: Missing block: B:36:0x0090, code skipped:
            return r6;
     */
    public final /* synthetic */ defpackage.aocf mergeFrom(defpackage.aobv r7) {
        /*
        r6 = this;
    L_0x0000:
        r0 = r7.a();
        if (r0 == 0) goto L_0x0090;
    L_0x0006:
        r1 = 10;
        if (r0 == r1) goto L_0x0059;
    L_0x000a:
        r1 = 16;
        if (r0 == r1) goto L_0x002b;
    L_0x000e:
        r1 = 26;
        if (r0 == r1) goto L_0x001a;
    L_0x0012:
        r0 = super.storeUnknownField(r7, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x0018:
        goto L_0x0090;
    L_0x001a:
        r0 = r6.c;
        if (r0 != 0) goto L_0x0025;
    L_0x001e:
        r0 = new bdhl;
        r0.<init>();
        r6.c = r0;
    L_0x0025:
        r0 = r6.c;
        r7.a(r0);
        goto L_0x0000;
    L_0x002b:
        r1 = r7.b;
        r2 = r7.f();	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r2 < 0) goto L_0x0039;
    L_0x0033:
        r3 = 4;
        if (r2 > r3) goto L_0x0039;
    L_0x0036:
        r6.b = r2;	 Catch:{ IllegalArgumentException -> 0x0052 }
        goto L_0x0000;
    L_0x0039:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0052 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0052 }
        r5 = 43;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r2 = " is not a valid enum ContentMode";
        r4.append(r2);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r2 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0052 }
        r3.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0052 }
        throw r3;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0052:
        r7.e(r1);
        r6.storeUnknownField(r7, r0);
        goto L_0x0000;
    L_0x0059:
        r0 = defpackage.aock.a(r7, r1);
        r1 = r6.a;
        r2 = 0;
        if (r1 == 0) goto L_0x0064;
    L_0x0062:
        r3 = r1.length;
        goto L_0x0065;
    L_0x0064:
        r3 = 0;
    L_0x0065:
        r0 = r0 + r3;
        r0 = new defpackage.bdhk[r0];
        if (r3 == 0) goto L_0x006d;
    L_0x006a:
        java.lang.System.arraycopy(r1, r2, r0, r2, r3);
    L_0x006d:
        r1 = r0.length;
        r1 = r1 + -1;
        if (r3 >= r1) goto L_0x0082;
    L_0x0072:
        r1 = new bdhk;
        r1.<init>();
        r0[r3] = r1;
        r7.a(r1);
        r7.a();
        r3 = r3 + 1;
        goto L_0x006d;
    L_0x0082:
        r1 = new bdhk;
        r1.<init>();
        r0[r3] = r1;
        r7.a(r1);
        r6.a = r0;
        goto L_0x0000;
    L_0x0090:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdhi.mergeFrom(aobv):aocf");
    }
}
