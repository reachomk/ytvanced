package defpackage;

import android.content.Context;

/* renamed from: qcj */
public final class qcj {
    private final Context a;

    public qcj(Context context) {
        this.a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c0 A:{SYNTHETIC, Splitter:B:73:0x01c0} */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01f0 A:{Catch:{ IOException -> 0x03c6, rkd -> 0x03d2, RuntimeException -> 0x03c7, GeneralSecurityException -> 0x03db }} */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e9 A:{Catch:{ IOException -> 0x03c6, rkd -> 0x03d2, RuntimeException -> 0x03c7, GeneralSecurityException -> 0x03db }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x01b9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x03c6 */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03d2 A:{Catch:{ IOException -> 0x03c6, rkd -> 0x03d2, RuntimeException -> 0x03c7, GeneralSecurityException -> 0x03db }, Splitter:B:3:0x000e, ExcHandler: rkd (r0_37 'e' rkd A:{Catch:{  }})} */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03c7 A:{Splitter:B:137:0x03c3, ExcHandler: RuntimeException (e java.lang.RuntimeException)} */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03d2 A:{Catch:{ IOException -> 0x03c6, rkd -> 0x03d2, RuntimeException -> 0x03c7, GeneralSecurityException -> 0x03db }, Splitter:B:3:0x000e, ExcHandler: rkd (r0_37 'e' rkd A:{Catch:{  }})} */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03c7 A:{Splitter:B:137:0x03c3, ExcHandler: RuntimeException (e java.lang.RuntimeException)} */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03d2 A:{Catch:{ IOException -> 0x03c6, rkd -> 0x03d2, RuntimeException -> 0x03c7, GeneralSecurityException -> 0x03db }, Splitter:B:3:0x000e, ExcHandler: rkd (r0_37 'e' rkd A:{Catch:{  }})} */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03c7 A:{Splitter:B:137:0x03c3, ExcHandler: RuntimeException (e java.lang.RuntimeException)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:141:0x03c7, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:146:0x03d2, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:148:0x03da, code skipped:
            throw new java.security.GeneralSecurityException("Package is not signed", r0);
     */
    public final boolean a(java.io.File r21) {
        /*
        r20 = this;
        r1 = 0;
        r0 = new android.content.pm.PackageInfo;	 Catch:{ GeneralSecurityException -> 0x03db }
        r0.<init>();	 Catch:{ GeneralSecurityException -> 0x03db }
        r2 = "com.google.ccc.abuse.droidguard";
        r0.packageName = r2;	 Catch:{ GeneralSecurityException -> 0x03db }
        r2 = r21.getAbsolutePath();	 Catch:{ GeneralSecurityException -> 0x03db }
        r3 = new java.io.RandomAccessFile;	 Catch:{ rkd -> 0x03d2, IOException -> 0x03c9, RuntimeException -> 0x03c7 }
        r4 = "r";
        r3.<init>(r2, r4);	 Catch:{ rkd -> 0x03d2, IOException -> 0x03c9, RuntimeException -> 0x03c7 }
        r4 = r3.length();	 Catch:{ all -> 0x03c2 }
        r6 = 22;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 < 0) goto L_0x002d;
    L_0x001f:
        r2 = defpackage.rko.a(r3, r1);	 Catch:{ all -> 0x03c2 }
        if (r2 != 0) goto L_0x002e;
    L_0x0025:
        r2 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r2 = defpackage.rko.a(r3, r2);	 Catch:{ all -> 0x03c2 }
        goto L_0x002e;
    L_0x002d:
        r2 = 0;
    L_0x002e:
        if (r2 == 0) goto L_0x03a0;
    L_0x0030:
        r4 = r2.first;	 Catch:{ all -> 0x03c2 }
        r13 = r4;
        r13 = (java.nio.ByteBuffer) r13;	 Catch:{ all -> 0x03c2 }
        r2 = r2.second;	 Catch:{ all -> 0x03c2 }
        r2 = (java.lang.Long) r2;	 Catch:{ all -> 0x03c2 }
        r11 = r2.longValue();	 Catch:{ all -> 0x03c2 }
        r4 = -20;
        r4 = r4 + r11;
        r6 = 0;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 < 0) goto L_0x005b;
    L_0x0046:
        r3.seek(r4);	 Catch:{ all -> 0x03c2 }
        r2 = r3.readInt();	 Catch:{ all -> 0x03c2 }
        r4 = 1347094023; // 0x504b0607 float:1.36246794E10 double:6.655528785E-315;
        if (r2 == r4) goto L_0x0053;
    L_0x0052:
        goto L_0x005b;
    L_0x0053:
        r0 = new rkd;	 Catch:{ all -> 0x03c2 }
        r2 = "ZIP64 APK not supported";
        r0.<init>(r2);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x005b:
        defpackage.rko.a(r13);	 Catch:{ all -> 0x03c2 }
        r2 = r13.position();	 Catch:{ all -> 0x03c2 }
        r4 = 16;
        r2 = r2 + r4;
        r9 = defpackage.rko.a(r13, r2);	 Catch:{ all -> 0x03c2 }
        r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r2 >= 0) goto L_0x037f;
    L_0x006d:
        defpackage.rko.a(r13);	 Catch:{ all -> 0x03c2 }
        r2 = r13.position();	 Catch:{ all -> 0x03c2 }
        r2 = r2 + 12;
        r14 = defpackage.rko.a(r13, r2);	 Catch:{ all -> 0x03c2 }
        r14 = r14 + r9;
        r2 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1));
        if (r2 != 0) goto L_0x0377;
    L_0x007f:
        r14 = 32;
        r2 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1));
        if (r2 < 0) goto L_0x035e;
    L_0x0085:
        r2 = 24;
        r2 = java.nio.ByteBuffer.allocate(r2);	 Catch:{ all -> 0x03c2 }
        r5 = java.nio.ByteOrder.LITTLE_ENDIAN;	 Catch:{ all -> 0x03c2 }
        r2.order(r5);	 Catch:{ all -> 0x03c2 }
        r5 = r2.capacity();	 Catch:{ all -> 0x03c2 }
        r14 = (long) r5;	 Catch:{ all -> 0x03c2 }
        r14 = r9 - r14;
        r3.seek(r14);	 Catch:{ all -> 0x03c2 }
        r5 = r2.array();	 Catch:{ all -> 0x03c2 }
        r8 = r2.arrayOffset();	 Catch:{ all -> 0x03c2 }
        r14 = r2.capacity();	 Catch:{ all -> 0x03c2 }
        r3.readFully(r5, r8, r14);	 Catch:{ all -> 0x03c2 }
        r5 = 8;
        r14 = r2.getLong(r5);	 Catch:{ all -> 0x03c2 }
        r16 = 2334950737559900225; // 0x20676953204b5041 float:1.7221323E-19 double:1.3968830566012645E-152;
        r8 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));
        if (r8 != 0) goto L_0x0356;
    L_0x00b8:
        r14 = r2.getLong(r4);	 Catch:{ all -> 0x03c2 }
        r16 = 3617552046287187010; // 0x3234206b636f6c42 float:4.4165726E21 double:7.465385175170059E-67;
        r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));
        if (r4 != 0) goto L_0x0356;
    L_0x00c5:
        r14 = r2.getLong(r1);	 Catch:{ all -> 0x03c2 }
        r2 = r2.capacity();	 Catch:{ all -> 0x03c2 }
        r1 = (long) r2;	 Catch:{ all -> 0x03c2 }
        r8 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1));
        if (r8 < 0) goto L_0x033d;
    L_0x00d2:
        r1 = 2147483639; // 0x7ffffff7 float:NaN double:1.060997891E-314;
        r8 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1));
        if (r8 > 0) goto L_0x033d;
    L_0x00d9:
        r1 = 8;
        r1 = r1 + r14;
        r2 = (int) r1;	 Catch:{ all -> 0x03c2 }
        r4 = (long) r2;	 Catch:{ all -> 0x03c2 }
        r4 = r9 - r4;
        r16 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r16 < 0) goto L_0x0320;
    L_0x00e4:
        r2 = java.nio.ByteBuffer.allocate(r2);	 Catch:{ all -> 0x03c2 }
        r6 = java.nio.ByteOrder.LITTLE_ENDIAN;	 Catch:{ all -> 0x03c2 }
        r2.order(r6);	 Catch:{ all -> 0x03c2 }
        r3.seek(r4);	 Catch:{ all -> 0x03c2 }
        r6 = r2.array();	 Catch:{ all -> 0x03c2 }
        r7 = r2.arrayOffset();	 Catch:{ all -> 0x03c2 }
        r1 = r2.capacity();	 Catch:{ all -> 0x03c2 }
        r3.readFully(r6, r7, r1);	 Catch:{ all -> 0x03c2 }
        r1 = 0;
        r6 = r2.getLong(r1);	 Catch:{ all -> 0x03c2 }
        r17 = r4;
        r1 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1));
        if (r1 != 0) goto L_0x02ff;
    L_0x010a:
        r1 = java.lang.Long.valueOf(r17);	 Catch:{ all -> 0x03c2 }
        r1 = android.util.Pair.create(r2, r1);	 Catch:{ all -> 0x03c2 }
        r2 = r1.first;	 Catch:{ all -> 0x03c2 }
        r2 = (java.nio.ByteBuffer) r2;	 Catch:{ all -> 0x03c2 }
        r1 = r1.second;	 Catch:{ all -> 0x03c2 }
        r1 = (java.lang.Long) r1;	 Catch:{ all -> 0x03c2 }
        r7 = r1.longValue();	 Catch:{ all -> 0x03c2 }
        r1 = r2.order();	 Catch:{ all -> 0x03c2 }
        r5 = java.nio.ByteOrder.LITTLE_ENDIAN;	 Catch:{ all -> 0x03c2 }
        if (r1 != r5) goto L_0x02f7;
    L_0x0126:
        r1 = r2.capacity();	 Catch:{ all -> 0x03c2 }
        r5 = r1 + -24;
        r1 = 8;
        if (r5 < r1) goto L_0x02d9;
    L_0x0130:
        r6 = r2.capacity();	 Catch:{ all -> 0x03c2 }
        r14 = r2.capacity();	 Catch:{ all -> 0x03c2 }
        if (r5 > r14) goto L_0x02b8;
    L_0x013a:
        r6 = r2.limit();	 Catch:{ all -> 0x03c2 }
        r14 = r2.position();	 Catch:{ all -> 0x03c2 }
        r4 = 0;
        r2.position(r4);	 Catch:{ all -> 0x02ac }
        r2.limit(r5);	 Catch:{ all -> 0x02ac }
        r1 = 8;
        r2.position(r1);	 Catch:{ all -> 0x02ac }
        r5 = r2.slice();	 Catch:{ all -> 0x02ac }
        r15 = r2.order();	 Catch:{ all -> 0x02ac }
        r5.order(r15);	 Catch:{ all -> 0x02ac }
        r4 = 0;
        r2.position(r4);	 Catch:{ all -> 0x02a7 }
        r2.limit(r6);	 Catch:{ all -> 0x02a7 }
        r2.position(r14);	 Catch:{ all -> 0x02a7 }
        r2 = 0;
    L_0x0164:
        r6 = r5.hasRemaining();	 Catch:{ all -> 0x02a7 }
        if (r6 == 0) goto L_0x029d;
    L_0x016a:
        r14 = 1;
        r2 = r2 + r14;
        r6 = r5.remaining();	 Catch:{ all -> 0x02a7 }
        r1 = 8;
        if (r6 < r1) goto L_0x0281;
    L_0x0174:
        r6 = r2;
        r1 = r5.getLong();	 Catch:{ all -> 0x02a7 }
        r17 = 4;
        r15 = " size out of range: ";
        r4 = "APK Signing Block entry #";
        r19 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1));
        if (r19 < 0) goto L_0x0262;
    L_0x0183:
        r17 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r19 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1));
        if (r19 > 0) goto L_0x0262;
    L_0x018a:
        r2 = (int) r1;
        r1 = r5.position();	 Catch:{ all -> 0x02a7 }
        r1 = r1 + r2;
        r14 = r5.remaining();	 Catch:{ all -> 0x02a7 }
        if (r2 > r14) goto L_0x0237;
    L_0x0196:
        r4 = r5.getInt();	 Catch:{ all -> 0x02a7 }
        r14 = 1896449818; // 0x7109871a float:6.810044E29 double:9.36970704E-315;
        if (r4 != r14) goto L_0x022f;
    L_0x019f:
        r2 = r2 + -4;
        r6 = defpackage.qjg.a(r5, r2);	 Catch:{ all -> 0x02a7 }
        r1 = new rcj;	 Catch:{ all -> 0x02a7 }
        r5 = r1;
        r5.<init>(r6, r7, r9, r11, r13);	 Catch:{ all -> 0x02a7 }
        r2 = r3.getChannel();	 Catch:{ all -> 0x02a7 }
        r1 = defpackage.qjg.a(r2, r1);	 Catch:{ all -> 0x02a7 }
        r3.close();	 Catch:{ all -> 0x02a7 }
        r3.close();	 Catch:{ IOException -> 0x01b9, rkd -> 0x03d2, RuntimeException -> 0x03c7 }
    L_0x01b9:
        r2 = r1.length;	 Catch:{ GeneralSecurityException -> 0x022a }
        r2 = new android.content.pm.Signature[r2];	 Catch:{ GeneralSecurityException -> 0x022a }
        r3 = 0;
    L_0x01bd:
        r4 = r1.length;	 Catch:{ GeneralSecurityException -> 0x022a }
        if (r3 >= r4) goto L_0x01d3;
    L_0x01c0:
        r5 = new android.content.pm.Signature;	 Catch:{ GeneralSecurityException -> 0x03db }
        r4 = r1[r3];	 Catch:{ GeneralSecurityException -> 0x03db }
        r6 = 0;
        r7 = r4[r6];	 Catch:{ GeneralSecurityException -> 0x03db }
        r6 = r7.getEncoded();	 Catch:{ GeneralSecurityException -> 0x03db }
        r5.<init>(r6);	 Catch:{ GeneralSecurityException -> 0x03db }
        r2[r3] = r5;	 Catch:{ GeneralSecurityException -> 0x03db }
        r3 = r3 + 1;
        goto L_0x01bd;
    L_0x01d3:
        r0.signatures = r2;	 Catch:{ GeneralSecurityException -> 0x022a }
        r14 = r20;
        r1 = r14.a;	 Catch:{ GeneralSecurityException -> 0x03db }
        r1 = defpackage.psk.a(r1);	 Catch:{ GeneralSecurityException -> 0x03db }
        r1 = r1.a;	 Catch:{ GeneralSecurityException -> 0x03db }
        r1 = defpackage.psl.b(r1);	 Catch:{ GeneralSecurityException -> 0x03db }
        r2 = r0.signatures;	 Catch:{ GeneralSecurityException -> 0x03db }
        r2 = r2.length;	 Catch:{ GeneralSecurityException -> 0x03db }
        r3 = 1;
        if (r2 == r3) goto L_0x01f0;
    L_0x01e9:
        r0 = "single cert required";
        r0 = defpackage.qca.a(r0);	 Catch:{ GeneralSecurityException -> 0x03db }
        goto L_0x0227;
    L_0x01f0:
        r2 = new qbr;	 Catch:{ GeneralSecurityException -> 0x03db }
        r3 = r0.signatures;	 Catch:{ GeneralSecurityException -> 0x03db }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ GeneralSecurityException -> 0x03db }
        r3 = r3.toByteArray();	 Catch:{ GeneralSecurityException -> 0x03db }
        r2.<init>(r3);	 Catch:{ GeneralSecurityException -> 0x03db }
        r3 = r0.packageName;	 Catch:{ GeneralSecurityException -> 0x03db }
        r5 = defpackage.qbq.a(r3, r2, r1);	 Catch:{ GeneralSecurityException -> 0x03db }
        r6 = r5.b;	 Catch:{ GeneralSecurityException -> 0x03db }
        if (r6 == 0) goto L_0x0226;
    L_0x0208:
        r6 = r0.applicationInfo;	 Catch:{ GeneralSecurityException -> 0x03db }
        if (r6 == 0) goto L_0x0226;
    L_0x020c:
        r0 = r0.applicationInfo;	 Catch:{ GeneralSecurityException -> 0x03db }
        r0 = r0.flags;	 Catch:{ GeneralSecurityException -> 0x03db }
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x0226;
    L_0x0214:
        if (r1 == 0) goto L_0x021f;
    L_0x0216:
        r1 = 0;
        r0 = defpackage.qbq.a(r3, r2, r1);	 Catch:{ GeneralSecurityException -> 0x03db }
        r0 = r0.b;	 Catch:{ GeneralSecurityException -> 0x03db }
        if (r0 == 0) goto L_0x0226;
    L_0x021f:
        r0 = "debuggable release cert app rejected";
        r0 = defpackage.qca.a(r0);	 Catch:{ GeneralSecurityException -> 0x03db }
        goto L_0x0227;
    L_0x0226:
        r0 = r5;
    L_0x0227:
        r0 = r0.b;	 Catch:{ GeneralSecurityException -> 0x03db }
        return r0;
    L_0x022a:
        r0 = move-exception;
        r14 = r20;
        goto L_0x03dc;
    L_0x022f:
        r14 = r20;
        r5.position(r1);	 Catch:{ all -> 0x03c2 }
        r2 = r6;
        goto L_0x0164;
    L_0x0237:
        r14 = r20;
        r0 = new rkd;	 Catch:{ all -> 0x03c2 }
        r1 = r5.remaining();	 Catch:{ all -> 0x03c2 }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03c2 }
        r7 = 91;
        r5.<init>(r7);	 Catch:{ all -> 0x03c2 }
        r5.append(r4);	 Catch:{ all -> 0x03c2 }
        r5.append(r6);	 Catch:{ all -> 0x03c2 }
        r5.append(r15);	 Catch:{ all -> 0x03c2 }
        r5.append(r2);	 Catch:{ all -> 0x03c2 }
        r2 = ", available: ";
        r5.append(r2);	 Catch:{ all -> 0x03c2 }
        r5.append(r1);	 Catch:{ all -> 0x03c2 }
        r1 = r5.toString();	 Catch:{ all -> 0x03c2 }
        r0.<init>(r1);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x0262:
        r14 = r20;
        r0 = new rkd;	 Catch:{ all -> 0x03c2 }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03c2 }
        r7 = 76;
        r5.<init>(r7);	 Catch:{ all -> 0x03c2 }
        r5.append(r4);	 Catch:{ all -> 0x03c2 }
        r5.append(r6);	 Catch:{ all -> 0x03c2 }
        r5.append(r15);	 Catch:{ all -> 0x03c2 }
        r5.append(r1);	 Catch:{ all -> 0x03c2 }
        r1 = r5.toString();	 Catch:{ all -> 0x03c2 }
        r0.<init>(r1);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x0281:
        r14 = r20;
        r6 = r2;
        r0 = new rkd;	 Catch:{ all -> 0x03c2 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03c2 }
        r2 = 70;
        r1.<init>(r2);	 Catch:{ all -> 0x03c2 }
        r2 = "Insufficient data to read size of APK Signing Block entry #";
        r1.append(r2);	 Catch:{ all -> 0x03c2 }
        r1.append(r6);	 Catch:{ all -> 0x03c2 }
        r1 = r1.toString();	 Catch:{ all -> 0x03c2 }
        r0.<init>(r1);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x029d:
        r14 = r20;
        r0 = new rkd;	 Catch:{ all -> 0x03c2 }
        r1 = "No APK Signature Scheme v2 block in APK Signing Block";
        r0.<init>(r1);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x02a7:
        r0 = move-exception;
        r14 = r20;
        goto L_0x03c3;
    L_0x02ac:
        r0 = move-exception;
        r1 = 0;
        r2.position(r1);	 Catch:{ all -> 0x03c2 }
        r2.limit(r6);	 Catch:{ all -> 0x03c2 }
        r2.position(r14);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x02b8:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x03c2 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03c2 }
        r2 = 41;
        r1.<init>(r2);	 Catch:{ all -> 0x03c2 }
        r2 = "end > capacity: ";
        r1.append(r2);	 Catch:{ all -> 0x03c2 }
        r1.append(r5);	 Catch:{ all -> 0x03c2 }
        r2 = " > ";
        r1.append(r2);	 Catch:{ all -> 0x03c2 }
        r1.append(r6);	 Catch:{ all -> 0x03c2 }
        r1 = r1.toString();	 Catch:{ all -> 0x03c2 }
        r0.<init>(r1);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x02d9:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x03c2 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03c2 }
        r2 = 38;
        r1.<init>(r2);	 Catch:{ all -> 0x03c2 }
        r2 = "end < start: ";
        r1.append(r2);	 Catch:{ all -> 0x03c2 }
        r1.append(r5);	 Catch:{ all -> 0x03c2 }
        r2 = " < 8";
        r1.append(r2);	 Catch:{ all -> 0x03c2 }
        r1 = r1.toString();	 Catch:{ all -> 0x03c2 }
        r0.<init>(r1);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x02f7:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x03c2 }
        r1 = "ByteBuffer byte order must be little endian";
        r0.<init>(r1);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x02ff:
        r0 = new rkd;	 Catch:{ all -> 0x03c2 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03c2 }
        r2 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r1.<init>(r2);	 Catch:{ all -> 0x03c2 }
        r2 = "APK Signing Block sizes in header and footer do not match: ";
        r1.append(r2);	 Catch:{ all -> 0x03c2 }
        r1.append(r6);	 Catch:{ all -> 0x03c2 }
        r2 = " vs ";
        r1.append(r2);	 Catch:{ all -> 0x03c2 }
        r1.append(r14);	 Catch:{ all -> 0x03c2 }
        r1 = r1.toString();	 Catch:{ all -> 0x03c2 }
        r0.<init>(r1);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x0320:
        r17 = r4;
        r0 = new rkd;	 Catch:{ all -> 0x03c2 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03c2 }
        r2 = 59;
        r1.<init>(r2);	 Catch:{ all -> 0x03c2 }
        r2 = "APK Signing Block offset out of range: ";
        r1.append(r2);	 Catch:{ all -> 0x03c2 }
        r9 = r17;
        r1.append(r9);	 Catch:{ all -> 0x03c2 }
        r1 = r1.toString();	 Catch:{ all -> 0x03c2 }
        r0.<init>(r1);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x033d:
        r0 = new rkd;	 Catch:{ all -> 0x03c2 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03c2 }
        r2 = 57;
        r1.<init>(r2);	 Catch:{ all -> 0x03c2 }
        r2 = "APK Signing Block size out of range: ";
        r1.append(r2);	 Catch:{ all -> 0x03c2 }
        r1.append(r14);	 Catch:{ all -> 0x03c2 }
        r1 = r1.toString();	 Catch:{ all -> 0x03c2 }
        r0.<init>(r1);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x0356:
        r0 = new rkd;	 Catch:{ all -> 0x03c2 }
        r1 = "No APK Signing Block before ZIP Central Directory";
        r0.<init>(r1);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x035e:
        r0 = new rkd;	 Catch:{ all -> 0x03c2 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03c2 }
        r2 = 87;
        r1.<init>(r2);	 Catch:{ all -> 0x03c2 }
        r2 = "APK too small for APK Signing Block. ZIP Central Directory offset: ";
        r1.append(r2);	 Catch:{ all -> 0x03c2 }
        r1.append(r9);	 Catch:{ all -> 0x03c2 }
        r1 = r1.toString();	 Catch:{ all -> 0x03c2 }
        r0.<init>(r1);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x0377:
        r0 = new rkd;	 Catch:{ all -> 0x03c2 }
        r1 = "ZIP Central Directory is not immediately followed by End of Central Directory";
        r0.<init>(r1);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x037f:
        r0 = new rkd;	 Catch:{ all -> 0x03c2 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03c2 }
        r2 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r1.<init>(r2);	 Catch:{ all -> 0x03c2 }
        r2 = "ZIP Central Directory offset out of range: ";
        r1.append(r2);	 Catch:{ all -> 0x03c2 }
        r1.append(r9);	 Catch:{ all -> 0x03c2 }
        r2 = ". ZIP End of Central Directory offset: ";
        r1.append(r2);	 Catch:{ all -> 0x03c2 }
        r1.append(r11);	 Catch:{ all -> 0x03c2 }
        r1 = r1.toString();	 Catch:{ all -> 0x03c2 }
        r0.<init>(r1);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x03a0:
        r0 = new rkd;	 Catch:{ all -> 0x03c2 }
        r1 = r3.length();	 Catch:{ all -> 0x03c2 }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03c2 }
        r6 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r5.<init>(r6);	 Catch:{ all -> 0x03c2 }
        r6 = "Not an APK file: ZIP End of Central Directory record not found in file with ";
        r5.append(r6);	 Catch:{ all -> 0x03c2 }
        r5.append(r1);	 Catch:{ all -> 0x03c2 }
        r1 = " bytes";
        r5.append(r1);	 Catch:{ all -> 0x03c2 }
        r1 = r5.toString();	 Catch:{ all -> 0x03c2 }
        r0.<init>(r1);	 Catch:{ all -> 0x03c2 }
        throw r0;	 Catch:{ all -> 0x03c2 }
    L_0x03c2:
        r0 = move-exception;
    L_0x03c3:
        r3.close();	 Catch:{ IOException -> 0x03c6, rkd -> 0x03d2, RuntimeException -> 0x03c7 }
    L_0x03c6:
        throw r0;	 Catch:{ rkd -> 0x03d2, IOException -> 0x03c9, RuntimeException -> 0x03c7 }
    L_0x03c7:
        r0 = move-exception;
        goto L_0x03ca;
    L_0x03c9:
        r0 = move-exception;
    L_0x03ca:
        r1 = new java.security.GeneralSecurityException;	 Catch:{ GeneralSecurityException -> 0x03db }
        r2 = "Failed to verify signatures";
        r1.<init>(r2, r0);	 Catch:{ GeneralSecurityException -> 0x03db }
        throw r1;	 Catch:{ GeneralSecurityException -> 0x03db }
    L_0x03d2:
        r0 = move-exception;
        r1 = new java.security.GeneralSecurityException;	 Catch:{ GeneralSecurityException -> 0x03db }
        r2 = "Package is not signed";
        r1.<init>(r2, r0);	 Catch:{ GeneralSecurityException -> 0x03db }
        throw r1;	 Catch:{ GeneralSecurityException -> 0x03db }
    L_0x03db:
        r0 = move-exception;
    L_0x03dc:
        r1 = r21.getAbsolutePath();
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 37;
        r3.<init>(r2);
        r2 = "APK at ";
        r3.append(r2);
        r3.append(r1);
        r1 = " failed signature verification";
        r3.append(r1);
        r1 = r3.toString();
        r2 = "DG";
        android.util.Log.e(r2, r1, r0);
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qcj.a(java.io.File):boolean");
    }
}
