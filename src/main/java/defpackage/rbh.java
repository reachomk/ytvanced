package defpackage;

import java.security.Key;
import javax.crypto.Mac;

/* renamed from: rbh */
public final class rbh implements qva {
    private final Mac a;
    private final int b;
    private final String c;
    private final Key d;

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0040  */
    public rbh(java.lang.String r5, java.security.Key r6, int r7) {
        /*
        r4 = this;
        r4.<init>();
        r0 = 10;
        if (r7 < r0) goto L_0x0092;
    L_0x0007:
        r0 = r5.hashCode();
        r1 = -1823053428; // 0xffffffff9356698c float:-2.7062636E-27 double:NaN;
        r2 = 2;
        r3 = 1;
        if (r0 == r1) goto L_0x0031;
    L_0x0012:
        r1 = 392315118; // 0x176240ee float:7.310649E-25 double:1.93829422E-315;
        if (r0 == r1) goto L_0x0027;
    L_0x0017:
        r1 = 392317873; // 0x17624bb1 float:7.3120074E-25 double:1.938307833E-315;
        if (r0 == r1) goto L_0x001d;
    L_0x001c:
        goto L_0x003b;
    L_0x001d:
        r0 = "HMACSHA512";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x003b;
    L_0x0025:
        r0 = 2;
        goto L_0x003c;
    L_0x0027:
        r0 = "HMACSHA256";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x003b;
    L_0x002f:
        r0 = 1;
        goto L_0x003c;
    L_0x0031:
        r0 = "HMACSHA1";
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x003b;
    L_0x0039:
        r0 = 0;
        goto L_0x003c;
    L_0x003b:
        r0 = -1;
    L_0x003c:
        r1 = "tag size too big";
        if (r0 == 0) goto L_0x0072;
    L_0x0040:
        if (r0 == r3) goto L_0x0067;
    L_0x0042:
        if (r0 == r2) goto L_0x005c;
    L_0x0044:
        r6 = new java.security.NoSuchAlgorithmException;
        r7 = "unknown Hmac algorithm: ";
        r0 = r5.length();
        if (r0 != 0) goto L_0x0054;
    L_0x004e:
        r5 = new java.lang.String;
        r5.<init>(r7);
        goto L_0x0058;
    L_0x0054:
        r5 = r7.concat(r5);
    L_0x0058:
        r6.<init>(r5);
        throw r6;
    L_0x005c:
        r0 = 64;
        if (r7 > r0) goto L_0x0061;
    L_0x0060:
        goto L_0x0076;
    L_0x0061:
        r5 = new java.security.InvalidAlgorithmParameterException;
        r5.<init>(r1);
        throw r5;
    L_0x0067:
        r0 = 32;
        if (r7 > r0) goto L_0x006c;
    L_0x006b:
        goto L_0x0076;
    L_0x006c:
        r5 = new java.security.InvalidAlgorithmParameterException;
        r5.<init>(r1);
        throw r5;
    L_0x0072:
        r0 = 20;
        if (r7 > r0) goto L_0x008c;
    L_0x0076:
        r4.c = r5;
        r4.b = r7;
        r4.d = r6;
        r7 = defpackage.ray.b;
        r5 = r7.a(r5);
        r5 = (javax.crypto.Mac) r5;
        r4.a = r5;
        r5 = r4.a;
        r5.init(r6);
        return;
    L_0x008c:
        r5 = new java.security.InvalidAlgorithmParameterException;
        r5.<init>(r1);
        throw r5;
    L_0x0092:
        r5 = new java.security.InvalidAlgorithmParameterException;
        r6 = "tag size too small, need at least 10 bytes";
        r5.<init>(r6);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbh.<init>(java.lang.String, java.security.Key, int):void");
    }

    public final byte[] a(byte[] bArr) {
        Mac mac;
        try {
            mac = (Mac) this.a.clone();
        } catch (CloneNotSupportedException unused) {
            mac = (Mac) ray.b.a(this.c);
            mac.init(this.d);
        }
        mac.update(bArr);
        bArr = new byte[this.b];
        System.arraycopy(mac.doFinal(), 0, bArr, 0, this.b);
        return bArr;
    }
}
