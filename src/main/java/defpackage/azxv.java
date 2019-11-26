package defpackage;

import java.util.Arrays;

/* renamed from: azxv */
public final class azxv extends aoca {
    public static volatile azxv[] a;
    public int b;
    public byte[] c;
    public byte[] d;
    private int e;

    public azxv() {
        this.b = 1;
        this.c = aock.c;
        this.d = aock.c;
        this.e = 1;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final void writeTo(aoby aoby) {
        int i = this.b;
        if (i != 1) {
            aoby.a(1, i);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(2, this.c);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(3, this.d);
        }
        i = this.e;
        if (!(i == 1 || i == 0)) {
            aoby.a(4, i - 1);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.b;
        if (i != 1) {
            computeSerializedSize += aoby.c(1, i);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            computeSerializedSize += aoby.b(2, this.c);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            computeSerializedSize += aoby.b(3, this.d);
        }
        i = this.e;
        return (i == 1 || i == 0) ? computeSerializedSize : computeSerializedSize + aoby.c(4, i - 1);
    }

    /* JADX WARNING: Missing block: B:42:0x008b, code skipped:
            return r7;
     */
    public final /* synthetic */ defpackage.aocf mergeFrom(defpackage.aobv r8) {
        /*
        r7 = this;
    L_0x0000:
        r0 = r8.a();
        if (r0 == 0) goto L_0x008b;
    L_0x0006:
        r1 = 8;
        r2 = 2;
        if (r0 == r1) goto L_0x005d;
    L_0x000b:
        r1 = 18;
        if (r0 == r1) goto L_0x0056;
    L_0x000f:
        r1 = 26;
        if (r0 == r1) goto L_0x004f;
    L_0x0013:
        r1 = 32;
        if (r0 == r1) goto L_0x001f;
    L_0x0017:
        r0 = super.storeUnknownField(r8, r0);
        if (r0 != 0) goto L_0x0000;
    L_0x001d:
        goto L_0x008b;
    L_0x001f:
        r1 = r8.b;
        r3 = r8.f();
        r4 = 4;
        r5 = 3;
        r6 = 1;
        if (r3 == 0) goto L_0x0039;
    L_0x002a:
        if (r3 == r6) goto L_0x0039;
    L_0x002c:
        if (r3 == r2) goto L_0x0039;
    L_0x002e:
        if (r3 == r5) goto L_0x0039;
    L_0x0030:
        if (r3 == r4) goto L_0x0039;
    L_0x0032:
        r8.e(r1);
        r7.storeUnknownField(r8, r0);
        goto L_0x0000;
    L_0x0039:
        if (r3 == 0) goto L_0x004b;
    L_0x003b:
        if (r3 == r6) goto L_0x004c;
    L_0x003d:
        if (r3 == r2) goto L_0x0049;
    L_0x003f:
        if (r3 == r5) goto L_0x0047;
    L_0x0041:
        if (r3 == r4) goto L_0x0045;
    L_0x0043:
        r2 = 0;
        goto L_0x004c;
    L_0x0045:
        r2 = 5;
        goto L_0x004c;
    L_0x0047:
        r2 = 4;
        goto L_0x004c;
    L_0x0049:
        r2 = 3;
        goto L_0x004c;
    L_0x004b:
        r2 = 1;
    L_0x004c:
        r7.e = r2;
        goto L_0x0000;
    L_0x004f:
        r0 = r8.e();
        r7.d = r0;
        goto L_0x0000;
    L_0x0056:
        r0 = r8.e();
        r7.c = r0;
        goto L_0x0000;
    L_0x005d:
        r1 = r8.b;
        r3 = r8.f();	 Catch:{ IllegalArgumentException -> 0x0083 }
        if (r3 <= 0) goto L_0x006a;
    L_0x0065:
        if (r3 > r2) goto L_0x006a;
    L_0x0067:
        r7.b = r3;	 Catch:{ IllegalArgumentException -> 0x0083 }
        goto L_0x0000;
    L_0x006a:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0083 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0083 }
        r5 = 45;
        r4.<init>(r5);	 Catch:{ IllegalArgumentException -> 0x0083 }
        r4.append(r3);	 Catch:{ IllegalArgumentException -> 0x0083 }
        r3 = " is not a valid enum EllipticCurve";
        r4.append(r3);	 Catch:{ IllegalArgumentException -> 0x0083 }
        r3 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0083 }
        r2.<init>(r3);	 Catch:{ IllegalArgumentException -> 0x0083 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0083 }
    L_0x0083:
        r8.e(r1);
        r7.storeUnknownField(r8, r0);
        goto L_0x0000;
    L_0x008b:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azxv.mergeFrom(aobv):aocf");
    }
}
