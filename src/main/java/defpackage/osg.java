package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;

/* renamed from: osg */
final class osg {
    private static final byte[] h = new byte[]{(byte) 0, (byte) 7, (byte) 8, (byte) 15};
    private static final byte[] i = new byte[]{(byte) 0, (byte) 119, (byte) -120, (byte) -1};
    private static final byte[] j = new byte[]{(byte) 0, (byte) 17, (byte) 34, (byte) 51, (byte) 68, (byte) 85, (byte) 102, (byte) 119, (byte) -120, (byte) -103, (byte) -86, (byte) -69, (byte) -52, (byte) -35, (byte) -18, (byte) -1};
    public final Paint a = new Paint();
    public final Paint b;
    public final Canvas c;
    public final osi d;
    public final osf e;
    public final oso f;
    public Bitmap g;

    public osg(int i, int i2) {
        this.a.setStyle(Style.FILL_AND_STROKE);
        this.a.setXfermode(new PorterDuffXfermode(Mode.SRC));
        this.a.setPathEffect(null);
        this.b = new Paint();
        this.b.setStyle(Style.FILL);
        this.b.setXfermode(new PorterDuffXfermode(Mode.DST_OVER));
        this.b.setPathEffect(null);
        this.c = new Canvas();
        this.d = new osi(719, 575, 0, 719, 0, 575);
        this.e = new osf(0, osg.a(), osg.b(), osg.c());
        this.f = new oso(i, i2);
    }

    private static int a(int i, int i2, int i3, int i4) {
        return (((i << 24) | (i2 << 16)) | (i3 << 8)) | i4;
    }

    public static osf a(oyx oyx, int i) {
        oyx oyx2 = oyx;
        int i2 = 8;
        int c = oyx2.c(8);
        oyx2.b(8);
        int i3 = i - 2;
        int[] a = osg.a();
        int[] b = osg.b();
        int[] c2 = osg.c();
        while (i3 > 0) {
            int c3;
            int c4;
            int c5;
            int i4;
            int c6 = oyx2.c(i2);
            int c7 = oyx2.c(i2);
            i3 -= 2;
            int[] iArr = (c7 & 128) == 0 ? (c7 & 64) == 0 ? c2 : b : a;
            if ((c7 & 1) != 0) {
                c7 = oyx2.c(i2);
                c3 = oyx2.c(i2);
                c4 = oyx2.c(i2);
                c5 = oyx2.c(i2);
                i3 -= 4;
            } else {
                i3 -= 2;
                c4 = oyx2.c(4) << 4;
                c5 = oyx2.c(2) << 6;
                c7 = oyx2.c(6) << 2;
                c3 = oyx2.c(4) << 4;
            }
            if (c7 == 0) {
                c5 = 255;
            }
            if (c7 == 0) {
                c4 = 0;
            }
            if (c7 == 0) {
                i4 = c;
                c3 = 0;
            } else {
                i4 = c;
            }
            double d = (double) c7;
            double d2 = (double) (c3 - 128);
            double d3 = (double) (c4 - 128);
            byte b2 = (byte) (255 - (c5 & 255));
            Double.isNaN(d2);
            double d4 = 1.402d * d2;
            Double.isNaN(d);
            int[] iArr2 = iArr;
            c7 = ozp.a((int) (d + d4), 0, 255);
            Double.isNaN(d3);
            d4 = 0.34414d * d3;
            Double.isNaN(d);
            d4 = d - d4;
            Double.isNaN(d2);
            int a2 = ozp.a((int) (d4 - (d2 * 0.71414d)), 0, 255);
            Double.isNaN(d3);
            d3 *= 1.772d;
            Double.isNaN(d);
            iArr2[c6] = osg.a(b2, c7, a2, ozp.a((int) (d + d3), 0, 255));
            c = i4;
            i2 = 8;
        }
        return new osf(c, a, b, c2);
    }

    public static osh a(oyx oyx) {
        byte[] bArr;
        int c = oyx.c(16);
        oyx.b(4);
        int c2 = oyx.c(2);
        boolean e = oyx.e();
        oyx.b(1);
        byte[] bArr2 = null;
        if (c2 == 1) {
            oyx.b(oyx.c(8) << 4);
        } else if (c2 == 0) {
            int c3 = oyx.c(16);
            int c4 = oyx.c(16);
            if (c3 > 0) {
                byte[] bArr3 = new byte[c3];
                oyx.c(bArr3, c3);
                bArr2 = bArr3;
            }
            if (c4 > 0) {
                bArr = new byte[c4];
                oyx.c(bArr, c4);
                return new osh(c, e, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new osh(c, e, bArr2, bArr);
    }

    private static int[] a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i >= 8) {
                int i2 = 127;
                int i3 = (i & 1) == 0 ? 0 : 127;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = osg.a(255, i3, i4, i2);
            } else {
                iArr[i] = osg.a(255, (i & 1) == 0 ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            }
        }
        return iArr;
    }

    private static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = 255;
            int i3;
            int i4;
            if (i >= 8) {
                i3 = i & 136;
                int i5 = 170;
                int i6 = 85;
                if (i3 == 0) {
                    i4 = ((i & 1) == 0 ? 0 : 85) + ((i & 16) != 0 ? 170 : 0);
                    i3 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i6 = 0;
                    }
                    if ((i & 64) == 0) {
                        i5 = 0;
                    }
                    iArr[i] = osg.a(255, i4, i3, i6 + i5);
                } else if (i3 != 8) {
                    i5 = 43;
                    if (i3 == 128) {
                        i4 = (((i & 1) == 0 ? 0 : 43) + 127) + ((i & 16) != 0 ? 85 : 0);
                        i3 = (((i & 2) != 0 ? 43 : 0) + 127) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i5 = 0;
                        }
                        i5 += 127;
                        if ((i & 64) == 0) {
                            i6 = 0;
                        }
                        iArr[i] = osg.a(255, i4, i3, i5 + i6);
                    } else if (i3 == 136) {
                        i4 = ((i & 1) == 0 ? 0 : 43) + ((i & 16) != 0 ? 85 : 0);
                        i3 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i5 = 0;
                        }
                        if ((i & 64) == 0) {
                            i6 = 0;
                        }
                        iArr[i] = osg.a(255, i4, i3, i5 + i6);
                    }
                } else {
                    i4 = ((i & 1) == 0 ? 0 : 85) + ((i & 16) != 0 ? 170 : 0);
                    i2 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i6 = 0;
                    }
                    if ((i & 64) == 0) {
                        i5 = 0;
                    }
                    iArr[i] = osg.a(127, i4, i2, i6 + i5);
                }
            } else {
                i4 = (i & 1) == 0 ? 0 : 255;
                i3 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = osg.a(63, i4, i3, i2);
            }
        }
        return iArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ff A:{LOOP_END, LOOP:3: B:83:0x0162->B:113:0x01ff} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01f9 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01f9 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ff A:{LOOP_END, LOOP:3: B:83:0x0162->B:113:0x01ff} */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d2 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ff A:{LOOP_END, LOOP:3: B:83:0x0162->B:113:0x01ff} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01f9 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d2 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01f9 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ff A:{LOOP_END, LOOP:3: B:83:0x0162->B:113:0x01ff} */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d2 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01ff A:{LOOP_END, LOOP:3: B:83:0x0162->B:113:0x01ff} */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01f9 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0140 A:{LOOP_END, LOOP:2: B:37:0x00a0->B:70:0x0140} */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x013a A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x013a A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0140 A:{LOOP_END, LOOP:2: B:37:0x00a0->B:70:0x0140} */
    public static void a(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
        r0 = r25;
        r7 = r28;
        r8 = new oyx;
        r1 = r23;
        r8.<init>(r1);
        r1 = r26;
        r12 = r27;
        r10 = 0;
        r11 = 0;
    L_0x0011:
        r2 = r8.a();
        if (r2 == 0) goto L_0x0209;
    L_0x0017:
        r13 = 8;
        r2 = r8.c(r13);
        r3 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
        if (r2 == r3) goto L_0x0203;
    L_0x0021:
        r14 = 3;
        r15 = 4;
        r6 = 1;
        r5 = 2;
        r16 = 0;
        switch(r2) {
            case 16: goto L_0x0146;
            case 17: goto L_0x0094;
            case 18: goto L_0x0041;
            default: goto L_0x002a;
        };
    L_0x002a:
        switch(r2) {
            case 32: goto L_0x003b;
            case 33: goto L_0x0035;
            case 34: goto L_0x002e;
            default: goto L_0x002d;
        };
    L_0x002d:
        goto L_0x0011;
    L_0x002e:
        r2 = 16;
        r2 = defpackage.osg.a(r2, r13, r8);
        goto L_0x0039;
    L_0x0035:
        r2 = defpackage.osg.a(r15, r13, r8);
    L_0x0039:
        r11 = r2;
        goto L_0x0011;
    L_0x003b:
        r2 = defpackage.osg.a(r15, r15, r8);
        r10 = r2;
        goto L_0x0011;
    L_0x0041:
        r14 = r1;
        r1 = 0;
    L_0x0043:
        r2 = r8.c(r13);
        if (r2 == 0) goto L_0x004d;
    L_0x0049:
        r17 = r1;
        r15 = 1;
        goto L_0x0070;
    L_0x004d:
        r2 = r8.e();
        r3 = 7;
        if (r2 != 0) goto L_0x0064;
    L_0x0054:
        r2 = r8.c(r3);
        if (r2 != 0) goto L_0x005f;
    L_0x005a:
        r2 = 0;
        r15 = 0;
        r17 = 1;
        goto L_0x0070;
    L_0x005f:
        r17 = r1;
        r15 = r2;
        r2 = 0;
        goto L_0x0070;
    L_0x0064:
        r2 = r8.c(r3);
        r3 = r8.c(r13);
        r17 = r1;
        r15 = r2;
        r2 = r3;
    L_0x0070:
        if (r15 != 0) goto L_0x0074;
    L_0x0072:
        r9 = 1;
        goto L_0x008b;
    L_0x0074:
        if (r7 == 0) goto L_0x0072;
    L_0x0076:
        r1 = r24[r2];
        r7.setColor(r1);
        r2 = (float) r14;
        r3 = (float) r12;
        r1 = r14 + r15;
        r4 = (float) r1;
        r1 = r12 + 1;
        r5 = (float) r1;
        r1 = r29;
        r9 = 1;
        r6 = r28;
        r1.drawRect(r2, r3, r4, r5, r6);
    L_0x008b:
        r14 = r14 + r15;
        if (r17 == 0) goto L_0x0090;
    L_0x008e:
        r1 = r14;
        goto L_0x0011;
    L_0x0090:
        r1 = r17;
        r6 = 1;
        goto L_0x0043;
    L_0x0094:
        r9 = 1;
        if (r0 != r14) goto L_0x009c;
    L_0x0097:
        r2 = j;
        r17 = r2;
        goto L_0x009e;
    L_0x009c:
        r17 = 0;
    L_0x009e:
        r4 = r1;
        r6 = 0;
    L_0x00a0:
        r1 = r8.c(r15);
        if (r1 == 0) goto L_0x00ad;
    L_0x00a6:
        r2 = r1;
        r19 = r6;
    L_0x00a9:
        r18 = 1;
        goto L_0x010d;
    L_0x00ad:
        r1 = r8.e();
        if (r1 != 0) goto L_0x00c7;
    L_0x00b3:
        r1 = r8.c(r14);
        if (r1 == 0) goto L_0x00c1;
    L_0x00b9:
        r1 = r1 + 2;
        r18 = r1;
        r19 = r6;
        r2 = 0;
        goto L_0x010d;
    L_0x00c1:
        r2 = 0;
        r18 = 0;
        r19 = 1;
        goto L_0x010d;
    L_0x00c7:
        r1 = r8.e();
        if (r1 != 0) goto L_0x00db;
    L_0x00cd:
        r1 = r8.c(r5);
        r1 = r1 + r15;
        r2 = r8.c(r15);
    L_0x00d6:
        r18 = r1;
        r19 = r6;
        goto L_0x010d;
    L_0x00db:
        r1 = r8.c(r5);
        if (r1 == 0) goto L_0x0109;
    L_0x00e1:
        if (r1 == r9) goto L_0x0103;
    L_0x00e3:
        if (r1 == r5) goto L_0x00f8;
    L_0x00e5:
        if (r1 == r14) goto L_0x00ed;
    L_0x00e7:
        r19 = r6;
        r2 = 0;
        r18 = 0;
        goto L_0x010d;
    L_0x00ed:
        r1 = r8.c(r13);
        r1 = r1 + 25;
        r2 = r8.c(r15);
        goto L_0x00d6;
    L_0x00f8:
        r1 = r8.c(r15);
        r1 = r1 + 9;
        r2 = r8.c(r15);
        goto L_0x00d6;
    L_0x0103:
        r19 = r6;
        r2 = 0;
        r18 = 2;
        goto L_0x010d;
    L_0x0109:
        r19 = r6;
        r2 = 0;
        goto L_0x00a9;
    L_0x010d:
        if (r18 != 0) goto L_0x0113;
    L_0x010f:
        r21 = r4;
        r15 = 2;
        goto L_0x0136;
    L_0x0113:
        if (r7 == 0) goto L_0x010f;
    L_0x0115:
        if (r17 == 0) goto L_0x0119;
    L_0x0117:
        r2 = r17[r2];
    L_0x0119:
        r1 = r24[r2];
        r7.setColor(r1);
        r2 = (float) r4;
        r3 = (float) r12;
        r1 = r4 + r18;
        r6 = (float) r1;
        r1 = r12 + 1;
        r1 = (float) r1;
        r20 = r1;
        r1 = r29;
        r21 = r4;
        r4 = r6;
        r6 = 2;
        r5 = r20;
        r15 = 2;
        r6 = r28;
        r1.drawRect(r2, r3, r4, r5, r6);
    L_0x0136:
        r4 = r21 + r18;
        if (r19 == 0) goto L_0x0140;
    L_0x013a:
        r8.f();
        r1 = r4;
        goto L_0x0011;
    L_0x0140:
        r6 = r19;
        r5 = 2;
        r15 = 4;
        goto L_0x00a0;
    L_0x0146:
        r9 = 1;
        r15 = 2;
        if (r0 != r14) goto L_0x0154;
    L_0x014a:
        if (r11 != 0) goto L_0x0151;
    L_0x014c:
        r2 = i;
    L_0x014e:
        r17 = r2;
        goto L_0x0160;
    L_0x0151:
        r17 = r11;
        goto L_0x0160;
    L_0x0154:
        if (r0 != r15) goto L_0x015e;
    L_0x0156:
        if (r10 != 0) goto L_0x015b;
    L_0x0158:
        r2 = h;
        goto L_0x014e;
    L_0x015b:
        r17 = r10;
        goto L_0x0160;
    L_0x015e:
        r17 = 0;
    L_0x0160:
        r5 = r1;
        r6 = 0;
    L_0x0162:
        r1 = r8.c(r15);
        if (r1 == 0) goto L_0x016f;
    L_0x0168:
        r2 = r1;
        r19 = r6;
        r4 = 4;
    L_0x016c:
        r18 = 1;
        goto L_0x01cb;
    L_0x016f:
        r1 = r8.e();
        if (r1 == 0) goto L_0x0184;
    L_0x0175:
        r1 = r8.c(r14);
        r1 = r1 + r14;
        r2 = r8.c(r15);
    L_0x017e:
        r18 = r1;
        r19 = r6;
        r4 = 4;
        goto L_0x01cb;
    L_0x0184:
        r1 = r8.e();
        if (r1 != 0) goto L_0x01c6;
    L_0x018a:
        r1 = r8.c(r15);
        if (r1 == 0) goto L_0x01bf;
    L_0x0190:
        if (r1 == r9) goto L_0x01b8;
    L_0x0192:
        if (r1 == r15) goto L_0x01a8;
    L_0x0194:
        if (r1 == r14) goto L_0x019d;
    L_0x0196:
        r19 = r6;
        r2 = 0;
        r4 = 4;
        r18 = 0;
        goto L_0x01cb;
    L_0x019d:
        r1 = r8.c(r13);
        r1 = r1 + 29;
        r2 = r8.c(r15);
        goto L_0x017e;
    L_0x01a8:
        r4 = 4;
        r1 = r8.c(r4);
        r1 = r1 + 12;
        r2 = r8.c(r15);
        r18 = r1;
        r19 = r6;
        goto L_0x01cb;
    L_0x01b8:
        r4 = 4;
        r19 = r6;
        r2 = 0;
        r18 = 2;
        goto L_0x01cb;
    L_0x01bf:
        r4 = 4;
        r2 = 0;
        r18 = 0;
        r19 = 1;
        goto L_0x01cb;
    L_0x01c6:
        r4 = 4;
        r19 = r6;
        r2 = 0;
        goto L_0x016c;
    L_0x01cb:
        if (r18 != 0) goto L_0x01d2;
    L_0x01cd:
        r22 = r5;
        r21 = 4;
        goto L_0x01f5;
    L_0x01d2:
        if (r7 == 0) goto L_0x01cd;
    L_0x01d4:
        if (r17 == 0) goto L_0x01d8;
    L_0x01d6:
        r2 = r17[r2];
    L_0x01d8:
        r1 = r24[r2];
        r7.setColor(r1);
        r2 = (float) r5;
        r3 = (float) r12;
        r1 = r5 + r18;
        r6 = (float) r1;
        r1 = r12 + 1;
        r1 = (float) r1;
        r20 = r1;
        r1 = r29;
        r21 = 4;
        r4 = r6;
        r22 = r5;
        r5 = r20;
        r6 = r28;
        r1.drawRect(r2, r3, r4, r5, r6);
    L_0x01f5:
        r5 = r22 + r18;
        if (r19 == 0) goto L_0x01ff;
    L_0x01f9:
        r8.f();
        r1 = r5;
        goto L_0x0011;
    L_0x01ff:
        r6 = r19;
        goto L_0x0162;
    L_0x0203:
        r12 = r12 + 2;
        r1 = r26;
        goto L_0x0011;
    L_0x0209:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.osg.a(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static byte[] a(int i, int i2, oyx oyx) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) oyx.c(i2);
        }
        return bArr;
    }
}
