package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: omk */
public final class omk implements olk {
    public static final int a = ozp.f("ID3");
    private final omn b;

    public omk() {
        this(null);
    }

    private static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static int b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public omk(omn omn) {
        this.b = null;
    }

    public final olj a(olp olp) {
        ByteBuffer byteBuffer = olp.b;
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ab  */
    public final defpackage.olj a(byte[] r13, int r14) {
        /*
        r12 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = new oza;
        r1.<init>(r13, r14);
        r13 = r1.b();
        r14 = 2;
        r2 = 10;
        r3 = 0;
        r4 = 1;
        r5 = 4;
        r6 = "Id3Decoder";
        r7 = 0;
        if (r13 >= r2) goto L_0x0021;
    L_0x0019:
        r13 = "Data too short to be an ID3 tag";
        defpackage.oyp.a(r6, r13);
    L_0x001e:
        r10 = r7;
        goto L_0x00a9;
    L_0x0021:
        r13 = r1.h();
        r8 = a;
        if (r13 == r8) goto L_0x0040;
    L_0x0029:
        r8 = new java.lang.StringBuilder;
        r9 = 59;
        r8.<init>(r9);
        r9 = "Unexpected first three bytes of ID3 tag header: ";
        r8.append(r9);
        r8.append(r13);
        r13 = r8.toString();
        defpackage.oyp.a(r6, r13);
        goto L_0x001e;
    L_0x0040:
        r13 = r1.d();
        r1.d(r4);
        r8 = r1.d();
        r9 = r1.n();
        if (r13 != r14) goto L_0x005b;
    L_0x0051:
        r10 = r8 & 64;
        if (r10 == 0) goto L_0x009a;
    L_0x0055:
        r13 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
        defpackage.oyp.a(r6, r13);
        goto L_0x001e;
    L_0x005b:
        r10 = 3;
        if (r13 != r10) goto L_0x006c;
    L_0x005e:
        r10 = r8 & 64;
        if (r10 == 0) goto L_0x009a;
    L_0x0062:
        r10 = r1.k();
        r1.d(r10);
        r10 = r10 + r5;
        r9 = r9 - r10;
        goto L_0x009a;
    L_0x006c:
        if (r13 == r5) goto L_0x0085;
    L_0x006e:
        r8 = new java.lang.StringBuilder;
        r9 = 57;
        r8.<init>(r9);
        r9 = "Skipped ID3 tag with unsupported majorVersion=";
        r8.append(r9);
        r8.append(r13);
        r13 = r8.toString();
        defpackage.oyp.a(r6, r13);
        goto L_0x001e;
    L_0x0085:
        r10 = r8 & 64;
        if (r10 != 0) goto L_0x008a;
    L_0x0089:
        goto L_0x0094;
    L_0x008a:
        r10 = r1.n();
        r11 = r10 + -4;
        r1.d(r11);
        r9 = r9 - r10;
    L_0x0094:
        r10 = r8 & 16;
        if (r10 == 0) goto L_0x009a;
    L_0x0098:
        r9 = r9 + -10;
    L_0x009a:
        if (r13 >= r5) goto L_0x00a3;
    L_0x009c:
        r8 = r8 & 128;
        if (r8 != 0) goto L_0x00a1;
    L_0x00a0:
        goto L_0x00a3;
    L_0x00a1:
        r8 = 1;
        goto L_0x00a4;
    L_0x00a3:
        r8 = 0;
    L_0x00a4:
        r10 = new omm;
        r10.<init>(r13, r8, r9);
    L_0x00a9:
        if (r10 == 0) goto L_0x0107;
    L_0x00ab:
        r13 = r1.b;
        r8 = r10.a;
        if (r8 != r14) goto L_0x00b2;
    L_0x00b1:
        r2 = 6;
    L_0x00b2:
        r14 = r10.c;
        r8 = r10.b;
        if (r8 == 0) goto L_0x00bc;
    L_0x00b8:
        r14 = defpackage.omk.a(r1, r14);
    L_0x00bc:
        r13 = r13 + r14;
        r1.b(r13);
        r13 = r10.a;
        r13 = defpackage.omk.a(r1, r13, r2, r3);
        if (r13 == 0) goto L_0x00c9;
    L_0x00c8:
        goto L_0x00d5;
    L_0x00c9:
        r13 = r10.a;
        if (r13 == r5) goto L_0x00ce;
    L_0x00cd:
        goto L_0x00ef;
    L_0x00ce:
        r13 = defpackage.omk.a(r1, r5, r2, r4);
        if (r13 == 0) goto L_0x00ef;
    L_0x00d4:
        r3 = 1;
    L_0x00d5:
        r13 = r1.b();
        if (r13 < r2) goto L_0x00e9;
    L_0x00db:
        r13 = r10.a;
        r14 = r12.b;
        r13 = defpackage.omk.a(r13, r1, r3, r2, r14);
        if (r13 == 0) goto L_0x00d5;
    L_0x00e5:
        r0.add(r13);
        goto L_0x00d5;
    L_0x00e9:
        r13 = new olj;
        r13.<init>(r0);
        return r13;
    L_0x00ef:
        r13 = r10.a;
        r14 = new java.lang.StringBuilder;
        r0 = 56;
        r14.<init>(r0);
        r0 = "Failed to validate ID3 tag with majorVersion=";
        r14.append(r0);
        r14.append(r13);
        r13 = r14.toString();
        defpackage.oyp.a(r6, r13);
    L_0x0107:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.omk.a(byte[], int):olj");
    }

    private static boolean a(oza oza, int i, int i2, boolean z) {
        boolean z2;
        oza oza2 = oza;
        int i3 = i;
        int i4 = oza2.b;
        while (true) {
            try {
                int i5 = true;
                if (oza.b() >= i2) {
                    int k;
                    long i6;
                    int e;
                    z2 = false;
                    if (i3 >= 3) {
                        k = oza.k();
                        i6 = oza.i();
                        e = oza.e();
                    } else {
                        k = oza.h();
                        i6 = (long) oza.h();
                        e = 0;
                    }
                    if (k == 0 && i6 == 0 && e == 0) {
                        oza2.c(i4);
                        return true;
                    }
                    int i7;
                    if (i3 == 4 && !z) {
                        if ((8421504 & i6) == 0) {
                            i6 = (((i6 >> 24) & 255) << 21) | (((i6 & 255) | (((i6 >> 8) & 255) << 7)) | (((i6 >> 16) & 255) << 14));
                        } else {
                            oza2.c(i4);
                            return z2;
                        }
                    }
                    if (i3 == 4) {
                        if ((e & 64) == 0) {
                            i5 = false;
                        }
                        i7 = e & 1;
                    } else if (i3 == 3) {
                        i7 = (e & 32) != 0 ? 1 : 0;
                        if ((e & 128) != 0) {
                            i5 = i7;
                            i7 = 1;
                        } else {
                            i5 = i7;
                            i7 = 0;
                        }
                    } else {
                        i7 = 0;
                        i5 = 0;
                    }
                    if (i7 != 0) {
                        i5 += 4;
                    }
                    if (i6 >= ((long) i5)) {
                        if (((long) oza.b()) < i6) {
                            break;
                        }
                        oza2.d((int) i6);
                    } else {
                        oza2.c(i4);
                        return z2;
                    }
                }
                oza2.c(i4);
                return true;
            } finally {
                oza2.c(i4);
            }
        }
        return z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:243:0x04cf A:{Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }} */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04cf A:{Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }} */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04cf A:{Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }} */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04cf A:{Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }} */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04cf A:{Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }} */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0333 A:{Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }} */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02fc A:{Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }} */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04cf A:{Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }} */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04cf A:{Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }} */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04cf A:{Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }} */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04cf A:{Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }} */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04cf A:{Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }} */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0145 A:{Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }} */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0500 A:{PHI: r19 , Splitter:B:163:0x02d1, ExcHandler: all (th java.lang.Throwable)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:143:0x0255, code skipped:
            if (r13 == 67) goto L_0x0257;
     */
    /* JADX WARNING: Missing block: B:249:0x0500, code skipped:
            r0 = th;
     */
    /* JADX WARNING: Missing block: B:250:0x0501, code skipped:
            r2 = r19;
     */
    /* JADX WARNING: Missing block: B:251:0x0504, code skipped:
            r1 = r16;
     */
    private static defpackage.omp a(int r30, defpackage.oza r31, boolean r32, int r33, defpackage.omn r34) {
        /*
        r0 = r30;
        r7 = r31;
        r8 = r31.d();
        r9 = r31.d();
        r10 = r31.d();
        r11 = 3;
        if (r0 < r11) goto L_0x0019;
    L_0x0013:
        r1 = r31.d();
        r13 = r1;
        goto L_0x001a;
    L_0x0019:
        r13 = 0;
    L_0x001a:
        r14 = 4;
        if (r0 != r14) goto L_0x0039;
    L_0x001d:
        r1 = r31.o();
        if (r32 != 0) goto L_0x0044;
    L_0x0023:
        r2 = r1 & 255;
        r3 = r1 >> 8;
        r3 = r3 & 255;
        r3 = r3 << 7;
        r2 = r2 | r3;
        r3 = r1 >> 16;
        r3 = r3 & 255;
        r3 = r3 << 14;
        r2 = r2 | r3;
        r1 = r1 >>> 24;
        r1 = r1 << 21;
        r1 = r1 | r2;
        goto L_0x0044;
    L_0x0039:
        if (r0 == r11) goto L_0x0040;
    L_0x003b:
        r1 = r31.h();
        goto L_0x0044;
    L_0x0040:
        r1 = r31.o();
    L_0x0044:
        r15 = r1;
        if (r0 < r11) goto L_0x004d;
    L_0x0047:
        r1 = r31.e();
        r6 = r1;
        goto L_0x004e;
    L_0x004d:
        r6 = 0;
    L_0x004e:
        r5 = 0;
        if (r8 != 0) goto L_0x0062;
    L_0x0051:
        if (r9 != 0) goto L_0x0062;
    L_0x0053:
        if (r10 != 0) goto L_0x0062;
    L_0x0055:
        if (r13 != 0) goto L_0x0062;
    L_0x0057:
        if (r15 != 0) goto L_0x0062;
    L_0x0059:
        if (r6 == 0) goto L_0x005c;
    L_0x005b:
        goto L_0x0062;
    L_0x005c:
        r0 = r7.c;
        r7.c(r0);
        return r5;
    L_0x0062:
        r1 = r7.b;
        r4 = r1 + r15;
        r1 = r7.c;
        r3 = "Id3Decoder";
        if (r4 <= r1) goto L_0x0077;
    L_0x006c:
        r0 = "Frame size exceeds remaining tag data";
        defpackage.oyp.a(r3, r0);
        r0 = r7.c;
        r7.c(r0);
        return r5;
    L_0x0077:
        if (r34 == 0) goto L_0x0092;
    L_0x0079:
        r1 = r34;
        r2 = r30;
        r16 = r3;
        r3 = r8;
        r12 = r4;
        r4 = r9;
        r14 = r5;
        r5 = r10;
        r17 = r6;
        r6 = r13;
        r1 = r1.a(r2, r3, r4, r5, r6);
        if (r1 == 0) goto L_0x008e;
    L_0x008d:
        goto L_0x0098;
    L_0x008e:
        r7.c(r12);
        return r14;
    L_0x0092:
        r16 = r3;
        r12 = r4;
        r14 = r5;
        r17 = r6;
    L_0x0098:
        r1 = 1;
        if (r0 != r11) goto L_0x00b4;
    L_0x009b:
        r2 = r17;
        r3 = r2 & 128;
        if (r3 == 0) goto L_0x00a3;
    L_0x00a1:
        r3 = 1;
        goto L_0x00a4;
    L_0x00a3:
        r3 = 0;
    L_0x00a4:
        r4 = r2 & 64;
        if (r4 == 0) goto L_0x00aa;
    L_0x00a8:
        r4 = 1;
        goto L_0x00ab;
    L_0x00aa:
        r4 = 0;
    L_0x00ab:
        r2 = r2 & 32;
        if (r2 == 0) goto L_0x00b1;
    L_0x00af:
        r2 = 1;
        goto L_0x00b2;
    L_0x00b1:
        r2 = 0;
    L_0x00b2:
        r5 = r3;
        goto L_0x00e2;
    L_0x00b4:
        r2 = r17;
        r3 = 4;
        if (r0 != r3) goto L_0x00de;
    L_0x00b9:
        r3 = r2 & 64;
        if (r3 == 0) goto L_0x00bf;
    L_0x00bd:
        r3 = 1;
        goto L_0x00c0;
    L_0x00bf:
        r3 = 0;
    L_0x00c0:
        r4 = r2 & 8;
        if (r4 == 0) goto L_0x00c6;
    L_0x00c4:
        r4 = 1;
        goto L_0x00c7;
    L_0x00c6:
        r4 = 0;
    L_0x00c7:
        r5 = r2 & 4;
        if (r5 == 0) goto L_0x00cd;
    L_0x00cb:
        r5 = 1;
        goto L_0x00ce;
    L_0x00cd:
        r5 = 0;
    L_0x00ce:
        r6 = r2 & 2;
        if (r6 == 0) goto L_0x00d4;
    L_0x00d2:
        r6 = 1;
        goto L_0x00d5;
    L_0x00d4:
        r6 = 0;
    L_0x00d5:
        r2 = r2 & r1;
        r29 = r5;
        r5 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r29;
        goto L_0x00e3;
    L_0x00de:
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
    L_0x00e2:
        r6 = 0;
    L_0x00e3:
        if (r3 == 0) goto L_0x00eb;
    L_0x00e5:
        r2 = r12;
        r0 = r14;
        r1 = r16;
        goto L_0x0517;
    L_0x00eb:
        if (r4 != 0) goto L_0x00e5;
    L_0x00ed:
        if (r2 == 0) goto L_0x00f4;
    L_0x00ef:
        r15 = r15 + -1;
        r7.d(r1);
    L_0x00f4:
        if (r5 == 0) goto L_0x00fc;
    L_0x00f6:
        r15 = r15 + -4;
        r2 = 4;
        r7.d(r2);
    L_0x00fc:
        if (r6 == 0) goto L_0x0102;
    L_0x00fe:
        r15 = defpackage.omk.a(r7, r15);
    L_0x0102:
        r2 = 84;
        r3 = 88;
        r4 = 2;
        if (r8 != r2) goto L_0x0143;
    L_0x0109:
        if (r9 != r3) goto L_0x0143;
    L_0x010b:
        if (r10 != r3) goto L_0x0143;
    L_0x010d:
        if (r0 == r4) goto L_0x0112;
    L_0x010f:
        if (r13 == r3) goto L_0x0112;
    L_0x0111:
        goto L_0x0143;
    L_0x0112:
        if (r15 > 0) goto L_0x0115;
    L_0x0114:
        goto L_0x016d;
    L_0x0115:
        r1 = r31.d();	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r2 = defpackage.omk.a(r1);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r3 = r15 + -1;
        r4 = new byte[r3];	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r5 = 0;
        r7.a(r4, r5, r3);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r3 = defpackage.omk.a(r4, r5, r1);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r6 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r6.<init>(r4, r5, r3, r2);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r5 = defpackage.omk.b(r1);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r3 = r3 + r5;
        r1 = defpackage.omk.a(r4, r3, r1);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r1 = defpackage.omk.a(r4, r3, r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r5 = new omu;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r2 = "TXXX";
        r5.<init>(r2, r6, r1);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        goto L_0x0169;
    L_0x0143:
        if (r8 != r2) goto L_0x017b;
    L_0x0145:
        r1 = defpackage.omk.a(r0, r2, r9, r10, r13);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        if (r15 <= 0) goto L_0x016d;
    L_0x014b:
        r2 = r31.d();	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r3 = defpackage.omk.a(r2);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r4 = r15 + -1;
        r5 = new byte[r4];	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r6 = 0;
        r7.a(r5, r6, r4);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r2 = defpackage.omk.a(r5, r6, r2);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r4 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r4.<init>(r5, r6, r2, r3);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r5 = new omu;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r5.<init>(r1, r14, r4);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
    L_0x0169:
        r19 = r12;
        goto L_0x04ca;
    L_0x016d:
        r19 = r12;
        r5 = r14;
        goto L_0x04ca;
    L_0x0172:
        r0 = move-exception;
        r2 = r12;
        goto L_0x0513;
    L_0x0176:
        r2 = r12;
        r1 = r16;
        goto L_0x0508;
    L_0x017b:
        r5 = 87;
        r6 = "ISO-8859-1";
        if (r8 != r5) goto L_0x01ba;
    L_0x0181:
        if (r9 != r3) goto L_0x01ba;
    L_0x0183:
        if (r10 != r3) goto L_0x01ba;
    L_0x0185:
        if (r0 == r4) goto L_0x018a;
    L_0x0187:
        if (r13 == r3) goto L_0x018a;
    L_0x0189:
        goto L_0x01ba;
    L_0x018a:
        if (r15 <= 0) goto L_0x016d;
    L_0x018c:
        r1 = r31.d();	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r2 = defpackage.omk.a(r1);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r3 = r15 + -1;
        r4 = new byte[r3];	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r5 = 0;
        r7.a(r4, r5, r3);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r3 = defpackage.omk.a(r4, r5, r1);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r11 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r11.<init>(r4, r5, r3, r2);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r1 = defpackage.omk.b(r1);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r3 = r3 + r1;
        r1 = defpackage.omk.b(r4, r3);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r1 = defpackage.omk.a(r4, r3, r1, r6);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r5 = new omw;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r2 = "WXXX";
        r5.<init>(r2, r11, r1);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        goto L_0x0169;
    L_0x01ba:
        if (r8 == r5) goto L_0x04ae;
    L_0x01bc:
        r3 = 80;
        if (r8 == r3) goto L_0x01c1;
    L_0x01c0:
        goto L_0x01e9;
    L_0x01c1:
        r5 = 82;
        if (r9 != r5) goto L_0x01e9;
    L_0x01c5:
        r5 = 73;
        if (r10 != r5) goto L_0x01e9;
    L_0x01c9:
        r5 = 86;
        if (r13 != r5) goto L_0x01e9;
    L_0x01cd:
        r2 = new byte[r15];	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r3 = 0;
        r7.a(r2, r3, r15);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r4 = defpackage.omk.b(r2, r3);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r5 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r5.<init>(r2, r3, r4, r6);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r4 = r4 + r1;
        r1 = r2.length;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r1 = defpackage.omk.b(r2, r4, r1);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r2 = new oms;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r2.<init>(r5, r1);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r5 = r2;
        goto L_0x0169;
    L_0x01e9:
        r5 = 71;
        if (r8 == r5) goto L_0x01ee;
    L_0x01ed:
        goto L_0x023c;
    L_0x01ee:
        r5 = 69;
        if (r9 != r5) goto L_0x023c;
    L_0x01f2:
        r5 = 79;
        if (r10 != r5) goto L_0x023c;
    L_0x01f6:
        r5 = 66;
        if (r13 == r5) goto L_0x01fc;
    L_0x01fa:
        if (r0 != r4) goto L_0x023c;
    L_0x01fc:
        r2 = r31.d();	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r3 = defpackage.omk.a(r2);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r4 = r15 + -1;
        r5 = new byte[r4];	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r11 = 0;
        r7.a(r5, r11, r4);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r4 = defpackage.omk.b(r5, r11);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r14 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r14.<init>(r5, r11, r4, r6);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r4 = r4 + r1;
        r1 = defpackage.omk.a(r5, r4, r2);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r4 = defpackage.omk.a(r5, r4, r1, r3);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r6 = defpackage.omk.b(r2);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r1 = r1 + r6;
        r6 = defpackage.omk.a(r5, r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r1 = defpackage.omk.a(r5, r1, r6, r3);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r2 = defpackage.omk.b(r2);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r6 = r6 + r2;
        r2 = r5.length;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r2 = defpackage.omk.b(r5, r6, r2);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r5 = new omi;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r5.<init>(r14, r4, r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        goto L_0x0169;
    L_0x023c:
        r5 = 67;
        if (r0 != r4) goto L_0x024b;
    L_0x0240:
        if (r8 == r3) goto L_0x0244;
    L_0x0242:
        goto L_0x02e5;
    L_0x0244:
        r14 = 73;
        if (r9 != r14) goto L_0x02e5;
    L_0x0248:
        if (r10 != r5) goto L_0x02e5;
    L_0x024a:
        goto L_0x0257;
    L_0x024b:
        r14 = 65;
        if (r8 != r14) goto L_0x02e5;
    L_0x024f:
        if (r9 != r3) goto L_0x02e5;
    L_0x0251:
        r14 = 73;
        if (r10 != r14) goto L_0x02e5;
    L_0x0255:
        if (r13 != r5) goto L_0x02e5;
    L_0x0257:
        r1 = r31.d();	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r2 = defpackage.omk.a(r1);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r3 = r15 + -1;
        r5 = new byte[r3];	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r14 = 0;
        r7.a(r5, r14, r3);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        if (r0 != r4) goto L_0x0296;
    L_0x0269:
        r3 = "image/";
        r4 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r4.<init>(r5, r14, r11, r6);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r4 = defpackage.ozp.d(r4);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r6 = r4.length();	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        if (r6 != 0) goto L_0x0284;
    L_0x027e:
        r4 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r4.<init>(r3);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        goto L_0x0288;
    L_0x0284:
        r4 = r3.concat(r4);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
    L_0x0288:
        r3 = "image/jpg";
        r3 = r3.equals(r4);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        if (r3 != 0) goto L_0x0291;
    L_0x0290:
        goto L_0x0293;
    L_0x0291:
        r4 = "image/jpeg";
    L_0x0293:
        r3 = r4;
        r4 = 2;
        goto L_0x02bf;
    L_0x0296:
        r3 = 0;
        r4 = defpackage.omk.b(r5, r3);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r11 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r11.<init>(r5, r3, r4, r6);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r3 = defpackage.ozp.d(r11);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r6 = 47;
        r6 = r3.indexOf(r6);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r11 = -1;
        if (r6 != r11) goto L_0x02bf;
    L_0x02ad:
        r6 = "image/";
        r11 = r3.length();	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        if (r11 != 0) goto L_0x02bb;
    L_0x02b5:
        r3 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r3.<init>(r6);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        goto L_0x02bf;
    L_0x02bb:
        r3 = r6.concat(r3);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
    L_0x02bf:
        r6 = r4 + 1;
        r6 = r5[r6];	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r6 = r6 & 255;
        r11 = 2;
        r4 = r4 + r11;
        r11 = defpackage.omk.a(r5, r4, r1);	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r14 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0176, all -> 0x0172 }
        r19 = r12;
        r12 = r11 - r4;
        r14.<init>(r5, r4, r12, r2);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r1 = defpackage.omk.b(r1);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r11 = r11 + r1;
        r1 = r5.length;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r1 = defpackage.omk.b(r5, r11, r1);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5 = new oly;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5.<init>(r3, r14, r6, r1);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        goto L_0x04ca;
    L_0x02e5:
        r19 = r12;
        if (r8 != r5) goto L_0x0336;
    L_0x02e9:
        r4 = 79;
        if (r9 != r4) goto L_0x0336;
    L_0x02ed:
        r4 = 77;
        if (r10 != r4) goto L_0x0336;
    L_0x02f1:
        r4 = 77;
        if (r13 == r4) goto L_0x02f9;
    L_0x02f5:
        r4 = 2;
        if (r0 == r4) goto L_0x02f9;
    L_0x02f8:
        goto L_0x0336;
    L_0x02f9:
        r1 = 4;
        if (r15 < r1) goto L_0x0333;
    L_0x02fc:
        r1 = r31.d();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r2 = defpackage.omk.a(r1);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3 = new byte[r11];	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r4 = 0;
        r7.a(r3, r4, r11);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5.<init>(r3, r4, r11);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3 = r15 + -4;
        r6 = new byte[r3];	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r7.a(r6, r4, r3);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3 = defpackage.omk.a(r6, r4, r1);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r11 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r11.<init>(r6, r4, r3, r2);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r4 = defpackage.omk.b(r1);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3 = r3 + r4;
        r1 = defpackage.omk.a(r6, r3, r1);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r1 = defpackage.omk.a(r6, r3, r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r2 = new omg;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r2.<init>(r5, r11, r1);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        goto L_0x04c9;
    L_0x0333:
        r5 = 0;
        goto L_0x04ca;
    L_0x0336:
        if (r8 != r5) goto L_0x03ae;
    L_0x0338:
        r4 = 72;
        if (r9 != r4) goto L_0x03ae;
    L_0x033c:
        r4 = 65;
        if (r10 != r4) goto L_0x03ae;
    L_0x0340:
        if (r13 == r3) goto L_0x0343;
    L_0x0342:
        goto L_0x03ae;
    L_0x0343:
        r2 = r7.b;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3 = r7.a;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3 = defpackage.omk.b(r3, r2);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r4 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5 = r7.a;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r11 = r3 - r2;
        r4.<init>(r5, r2, r11, r6);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3 = r3 + r1;
        r7.c(r3);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r22 = r31.k();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r23 = r31.k();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5 = r31.i();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r11 = 4294967295; // 0xffffffff float:NaN double:2.1219957905E-314;
        r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1));
        if (r1 == 0) goto L_0x036e;
    L_0x036d:
        goto L_0x0370;
    L_0x036e:
        r5 = -1;
    L_0x0370:
        r24 = r5;
        r5 = r31.i();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r11 = 4294967295; // 0xffffffff float:NaN double:2.1219957905E-314;
        r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1));
        if (r1 == 0) goto L_0x0380;
    L_0x037f:
        goto L_0x0382;
    L_0x0380:
        r5 = -1;
    L_0x0382:
        r26 = r5;
        r1 = new java.util.ArrayList;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r1.<init>();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r2 = r2 + r15;
    L_0x038a:
        r3 = r7.b;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        if (r3 >= r2) goto L_0x0398;
    L_0x038e:
        r3 = defpackage.omk.a(r30, r31, r32, r33, r34);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        if (r3 == 0) goto L_0x038a;
    L_0x0394:
        r1.add(r3);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        goto L_0x038a;
    L_0x0398:
        r2 = r1.size();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r2 = new defpackage.omp[r2];	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r1.toArray(r2);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r1 = new omc;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r20 = r1;
        r21 = r4;
        r28 = r2;
        r20.<init>(r21, r22, r23, r24, r26, r28);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        goto L_0x049c;
    L_0x03ae:
        if (r8 != r5) goto L_0x0441;
    L_0x03b0:
        if (r9 != r2) goto L_0x0441;
    L_0x03b2:
        r3 = 79;
        if (r10 != r3) goto L_0x0441;
    L_0x03b6:
        if (r13 == r5) goto L_0x03ba;
    L_0x03b8:
        goto L_0x0441;
    L_0x03ba:
        r2 = r7.b;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3 = r7.a;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3 = defpackage.omk.b(r3, r2);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r4 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5 = r7.a;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r11 = r3 - r2;
        r4.<init>(r5, r2, r11, r6);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3 = r3 + r1;
        r7.c(r3);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3 = r31.d();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5 = r3 & 2;
        if (r5 == 0) goto L_0x03da;
    L_0x03d7:
        r22 = 1;
        goto L_0x03dc;
    L_0x03da:
        r22 = 0;
    L_0x03dc:
        r3 = r3 & r1;
        r5 = r31.d();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r11 = new java.lang.String[r5];	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r12 = 0;
    L_0x03e4:
        if (r12 < r5) goto L_0x0419;
    L_0x03e6:
        r5 = new java.util.ArrayList;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5.<init>();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r2 = r2 + r15;
    L_0x03ec:
        r6 = r7.b;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        if (r6 >= r2) goto L_0x03fa;
    L_0x03f0:
        r6 = defpackage.omk.a(r30, r31, r32, r33, r34);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        if (r6 == 0) goto L_0x03ec;
    L_0x03f6:
        r5.add(r6);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        goto L_0x03ec;
    L_0x03fa:
        r2 = r5.size();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r2 = new defpackage.omp[r2];	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5.toArray(r2);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5 = new ome;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        if (r3 != 0) goto L_0x040a;
    L_0x0407:
        r23 = 0;
        goto L_0x040c;
    L_0x040a:
        r23 = 1;
    L_0x040c:
        r20 = r5;
        r21 = r4;
        r24 = r11;
        r25 = r2;
        r20.<init>(r21, r22, r23, r24, r25);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        goto L_0x04ca;
    L_0x0419:
        r14 = r7.b;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r1 = r7.a;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r1 = defpackage.omk.b(r1, r14);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r18 = r2;
        r2 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r20 = r3;
        r3 = r7.a;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r21 = r4;
        r4 = r1 - r14;
        r2.<init>(r3, r14, r4, r6);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r11[r12] = r2;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r1 = r1 + 1;
        r7.c(r1);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r12 = r12 + 1;
        r2 = r18;
        r3 = r20;
        r4 = r21;
        r1 = 1;
        goto L_0x03e4;
    L_0x0441:
        r1 = 77;
        if (r8 != r1) goto L_0x049e;
    L_0x0445:
        r1 = 76;
        if (r9 != r1) goto L_0x049e;
    L_0x0449:
        r1 = 76;
        if (r10 != r1) goto L_0x049e;
    L_0x044d:
        if (r13 != r2) goto L_0x049e;
    L_0x044f:
        r21 = r31.e();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r22 = r31.h();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r23 = r31.h();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r1 = r31.d();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r2 = r31.d();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3 = new oyx;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3.<init>();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r4 = r7.a;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5 = r7.c;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3.a(r4, r5);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r4 = r7.b;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r4 = r4 << r11;
        r3.a(r4);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r4 = r15 + -10;
        r4 = r4 << r11;
        r5 = r1 + r2;
        r4 = r4 / r5;
        r5 = new int[r4];	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r6 = new int[r4];	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r11 = 0;
    L_0x0480:
        if (r11 >= r4) goto L_0x0491;
    L_0x0482:
        r12 = r3.c(r1);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r14 = r3.c(r2);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5[r11] = r12;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r6[r11] = r14;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r11 = r11 + 1;
        goto L_0x0480;
    L_0x0491:
        r1 = new omq;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r20 = r1;
        r24 = r5;
        r25 = r6;
        r20.<init>(r21, r22, r23, r24, r25);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
    L_0x049c:
        r5 = r1;
        goto L_0x04ca;
    L_0x049e:
        r1 = defpackage.omk.a(r0, r8, r9, r10, r13);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r2 = new byte[r15];	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3 = 0;
        r7.a(r2, r3, r15);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5 = new oma;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5.<init>(r1, r2);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        goto L_0x04ca;
    L_0x04ae:
        r19 = r12;
        r1 = defpackage.omk.a(r0, r5, r9, r10, r13);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r2 = new byte[r15];	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3 = 0;
        r7.a(r2, r3, r15);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r4 = defpackage.omk.b(r2, r3);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r5.<init>(r2, r3, r4, r6);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r2 = new omw;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r3 = 0;
        r2.<init>(r1, r3, r5);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
    L_0x04c9:
        r5 = r2;
    L_0x04ca:
        if (r5 == 0) goto L_0x04cf;
    L_0x04cc:
        r2 = r19;
        goto L_0x04fc;
    L_0x04cf:
        r0 = defpackage.omk.a(r0, r8, r9, r10, r13);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r1 = java.lang.String.valueOf(r0);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r1 = r1.length();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r1 = r1 + 50;
        r2 = new java.lang.StringBuilder;	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r2.<init>(r1);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r1 = "Failed to decode frame: id=";
        r2.append(r1);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r2.append(r0);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r0 = ", frameSize=";
        r2.append(r0);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r2.append(r15);	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r0 = r2.toString();	 Catch:{ UnsupportedEncodingException -> 0x0504, all -> 0x0500 }
        r1 = r16;
        defpackage.oyp.a(r1, r0);	 Catch:{ UnsupportedEncodingException -> 0x0506, all -> 0x0500 }
        goto L_0x04cc;
    L_0x04fc:
        r7.c(r2);
        return r5;
    L_0x0500:
        r0 = move-exception;
        r2 = r19;
        goto L_0x0513;
    L_0x0504:
        r1 = r16;
    L_0x0506:
        r2 = r19;
    L_0x0508:
        r0 = "Unsupported character encoding";
        defpackage.oyp.a(r1, r0);	 Catch:{ all -> 0x0512 }
        r7.c(r2);
        r0 = 0;
        return r0;
    L_0x0512:
        r0 = move-exception;
    L_0x0513:
        r7.c(r2);
        throw r0;
    L_0x0517:
        r3 = "Skipping unsupported compressed or encrypted frame";
        defpackage.oyp.a(r1, r3);
        r7.c(r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.omk.a(int, oza, boolean, int, omn):omp");
    }

    private static int a(oza oza, int i) {
        byte[] bArr = oza.a;
        int i2 = oza.b;
        int i3 = i;
        i = i2;
        while (true) {
            int i4 = i + 1;
            if (i4 >= i2 + i3) {
                return i3;
            }
            if ((bArr[i] & 255) == 255 && bArr[i4] == (byte) 0) {
                System.arraycopy(bArr, i + 2, bArr, i4, (i3 - (i - i2)) - 2);
                i3--;
            }
            i = i4;
        }
    }

    private static String a(int i, int i2, int i3, int i4, int i5) {
        if (i != 2) {
            return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
        }
        return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
    }

    private static int a(byte[] bArr, int i, int i2) {
        i = omk.b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return i;
        }
        while (true) {
            i2 = bArr.length;
            if (i >= i2 - 1) {
                return i2;
            }
            if (i % 2 == 0 && bArr[i + 1] == (byte) 0) {
                return i;
            }
            i = omk.b(bArr, i + 1);
        }
    }

    private static int b(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == (byte) 0) {
                return i;
            }
            i++;
        }
    }

    private static byte[] b(byte[] bArr, int i, int i2) {
        if (i2 > i) {
            return Arrays.copyOfRange(bArr, i, i2);
        }
        return ozp.f;
    }

    private static String a(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }
}
