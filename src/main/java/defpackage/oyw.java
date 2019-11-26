package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: oyw */
public final class oyw {
    public static final byte[] a = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};
    public static final float[] b = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object c = new Object();
    private static int[] d = new int[10];

    public static int a(byte[] bArr, int i) {
        synchronized (c) {
            int length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                while (i2 < i - 2) {
                    if (bArr[i2] == (byte) 0 && bArr[i2 + 1] == (byte) 0 && bArr[i2 + 2] == (byte) 3) {
                        break;
                    }
                    i2++;
                }
                i2 = i;
                if (i2 < i) {
                    if (d.length <= i3) {
                        int[] iArr = d;
                        length = d.length;
                        d = Arrays.copyOf(iArr, length + length);
                    }
                    length = i3 + 1;
                    d[i3] = i2;
                    i2 += 3;
                    i3 = length;
                }
            }
            i -= i3;
            i2 = 0;
            int i4 = 0;
            length = 0;
            while (i2 < i3) {
                try {
                    int i5 = d[i2] - i4;
                    System.arraycopy(bArr, i4, bArr, length, i5);
                    length += i5;
                    int i6 = length + 1;
                    bArr[length] = (byte) 0;
                    length = i6 + 1;
                    bArr[i6] = (byte) 0;
                    i4 += i5 + 3;
                    i2++;
                } catch (Throwable th) {
                }
            }
            System.arraycopy(bArr, i4, bArr, length, i - length);
        }
        return i;
    }

    public static void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                int i4 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i4 == 0) {
                    i2++;
                }
                if (i4 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static boolean a(String str, byte b) {
        boolean z = true;
        if (!("video/avc".equals(str) && (b & 31) == 6)) {
            if (!"video/hevc".equals(str)) {
                z = false;
            } else if (((b & 126) >> 1) == 39) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    public static int b(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static int c(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011e  */
    public static defpackage.oyy a(byte[] r21, int r22, int r23) {
        /*
        r0 = new oyz;
        r1 = r21;
        r2 = r22;
        r3 = r23;
        r0.<init>(r1, r2, r3);
        r1 = 8;
        r0.a(r1);
        r3 = r0.c(r1);
        r4 = r0.c(r1);
        r5 = r0.c(r1);
        r6 = r0.e();
        r7 = 3;
        r9 = 1;
        r10 = 100;
        if (r3 != r10) goto L_0x0027;
    L_0x0026:
        goto L_0x004e;
    L_0x0027:
        r10 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        if (r3 == r10) goto L_0x004e;
    L_0x002b:
        r10 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r3 == r10) goto L_0x004e;
    L_0x002f:
        r10 = 244; // 0xf4 float:3.42E-43 double:1.206E-321;
        if (r3 == r10) goto L_0x004e;
    L_0x0033:
        r10 = 44;
        if (r3 == r10) goto L_0x004e;
    L_0x0037:
        r10 = 83;
        if (r3 == r10) goto L_0x004e;
    L_0x003b:
        r10 = 86;
        if (r3 == r10) goto L_0x004e;
    L_0x003f:
        r10 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        if (r3 == r10) goto L_0x004e;
    L_0x0043:
        r10 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r3 == r10) goto L_0x004e;
    L_0x0047:
        r10 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        if (r3 == r10) goto L_0x004e;
    L_0x004b:
        r10 = 1;
        r11 = 0;
        goto L_0x0074;
    L_0x004e:
        r10 = r0.e();
        if (r10 != r7) goto L_0x0059;
    L_0x0054:
        r11 = r0.b();
        goto L_0x005a;
    L_0x0059:
        r11 = 0;
    L_0x005a:
        r0.e();
        r0.e();
        r0.a();
        r12 = r0.b();
        if (r12 != 0) goto L_0x006a;
    L_0x0069:
        goto L_0x0074;
    L_0x006a:
        if (r10 == r7) goto L_0x006f;
    L_0x006c:
        r12 = 8;
        goto L_0x0071;
    L_0x006f:
        r12 = 12;
    L_0x0071:
        r13 = 0;
    L_0x0072:
        if (r13 < r12) goto L_0x0161;
    L_0x0074:
        r12 = r0.e();
        r12 = r12 + 4;
        r13 = r0.e();
        if (r13 != 0) goto L_0x008a;
    L_0x0080:
        r14 = r0.e();
        r14 = r14 + 4;
        r21 = r3;
    L_0x0088:
        r15 = 0;
        goto L_0x00b0;
    L_0x008a:
        if (r13 != r9) goto L_0x00ac;
    L_0x008c:
        r14 = r0.b();
        r0.d();
        r0.d();
        r15 = r0.e();
        r21 = r3;
        r2 = (long) r15;
        r15 = 0;
    L_0x009e:
        r7 = (long) r15;
        r17 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1));
        if (r17 >= 0) goto L_0x00a9;
    L_0x00a3:
        r0.e();
        r15 = r15 + 1;
        goto L_0x009e;
    L_0x00a9:
        r15 = r14;
        r14 = 0;
        goto L_0x00b0;
    L_0x00ac:
        r21 = r3;
        r14 = 0;
        goto L_0x0088;
    L_0x00b0:
        r0.e();
        r0.a();
        r2 = r0.e();
        r2 = r2 + r9;
        r3 = r0.e();
        r16 = r0.b();
        r7 = 2;
        r8 = 2 - r16;
        r3 = r3 + r9;
        r3 = r3 * r8;
        if (r16 != 0) goto L_0x00ce;
    L_0x00cb:
        r0.a();
    L_0x00ce:
        r0.a();
        r2 = r2 << 4;
        r3 = r3 << 4;
        r17 = r0.b();
        if (r17 == 0) goto L_0x0106;
    L_0x00db:
        r17 = r0.e();
        r18 = r0.e();
        r19 = r0.e();
        r20 = r0.e();
        if (r10 != 0) goto L_0x00ef;
    L_0x00ed:
        r7 = 1;
        goto L_0x00fa;
    L_0x00ef:
        r7 = 3;
        if (r10 != r7) goto L_0x00f4;
    L_0x00f2:
        r7 = 1;
        goto L_0x00f5;
    L_0x00f4:
        r7 = 2;
    L_0x00f5:
        if (r10 != r9) goto L_0x00f8;
    L_0x00f7:
        r9 = 2;
    L_0x00f8:
        r8 = r8 * r9;
    L_0x00fa:
        r17 = r17 + r18;
        r17 = r17 * r7;
        r2 = r2 - r17;
        r19 = r19 + r20;
        r19 = r19 * r8;
        r3 = r3 - r19;
    L_0x0106:
        r7 = r2;
        r8 = r3;
        r2 = r0.b();
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r2 == 0) goto L_0x0153;
    L_0x0110:
        r2 = r0.b();
        if (r2 == 0) goto L_0x0153;
    L_0x0116:
        r1 = r0.c(r1);
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r1 != r2) goto L_0x0132;
    L_0x011e:
        r2 = 16;
        r1 = r0.c(r2);
        r0 = r0.c(r2);
        if (r1 != 0) goto L_0x012b;
    L_0x012a:
        goto L_0x0153;
    L_0x012b:
        if (r0 == 0) goto L_0x0153;
    L_0x012d:
        r1 = (float) r1;
        r0 = (float) r0;
        r1 = r1 / r0;
        r9 = r1;
        goto L_0x0155;
    L_0x0132:
        r0 = b;
        r2 = r0.length;
        if (r1 >= r2) goto L_0x013b;
    L_0x0137:
        r0 = r0[r1];
        r9 = r0;
        goto L_0x0155;
    L_0x013b:
        r0 = new java.lang.StringBuilder;
        r2 = 46;
        r0.<init>(r2);
        r2 = "Unexpected aspect_ratio_idc value: ";
        r0.append(r2);
        r0.append(r1);
        r0 = r0.toString();
        r1 = "NalUnitUtil";
        defpackage.oyp.a(r1, r0);
    L_0x0153:
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x0155:
        r0 = new oyy;
        r2 = r0;
        r3 = r21;
        r10 = r11;
        r11 = r16;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
        return r0;
    L_0x0161:
        r21 = r3;
        r2 = 16;
        r3 = r0.b();
        if (r3 != 0) goto L_0x016c;
    L_0x016b:
        goto L_0x018c;
    L_0x016c:
        r3 = 6;
        if (r13 >= r3) goto L_0x0172;
    L_0x016f:
        r3 = 16;
        goto L_0x0174;
    L_0x0172:
        r3 = 64;
    L_0x0174:
        r8 = 0;
        r14 = 8;
        r15 = 8;
    L_0x0179:
        if (r8 >= r3) goto L_0x018c;
    L_0x017b:
        if (r14 == 0) goto L_0x0186;
    L_0x017d:
        r14 = r0.d();
        r14 = r14 + r15;
        r14 = r14 + 256;
        r14 = r14 % 256;
    L_0x0186:
        if (r14 == 0) goto L_0x0189;
    L_0x0188:
        r15 = r14;
    L_0x0189:
        r8 = r8 + 1;
        goto L_0x0179;
    L_0x018c:
        r13 = r13 + 1;
        r3 = r21;
        goto L_0x0072;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyw.a(byte[], int, int):oyy");
    }

    public static oyv d(byte[] bArr, int i) {
        oyz oyz = new oyz(bArr, 3, i);
        oyz.a(8);
        int e = oyz.e();
        i = oyz.e();
        oyz.a();
        return new oyv(e, i, oyz.b());
    }

    /* JADX WARNING: Missing block: B:56:0x0089, code skipped:
            r9 = true;
     */
    public static int a(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
        r0 = r10 - r9;
        r1 = 0;
        r2 = 1;
        if (r0 < 0) goto L_0x0008;
    L_0x0006:
        r3 = 1;
        goto L_0x0009;
    L_0x0008:
        r3 = 0;
    L_0x0009:
        defpackage.oxz.b(r3);
        if (r0 == 0) goto L_0x00be;
    L_0x000e:
        r3 = 2;
        if (r11 != 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0043;
    L_0x0012:
        r4 = r11[r1];
        if (r4 == 0) goto L_0x001c;
    L_0x0016:
        defpackage.oyw.a(r11);
        r9 = r9 + -3;
        return r9;
    L_0x001c:
        if (r0 <= r2) goto L_0x002d;
    L_0x001e:
        r4 = r11[r2];
        if (r4 == 0) goto L_0x002d;
    L_0x0022:
        r4 = r8[r9];
        if (r4 == r2) goto L_0x0027;
    L_0x0026:
        goto L_0x002d;
    L_0x0027:
        defpackage.oyw.a(r11);
        r9 = r9 + -2;
        return r9;
    L_0x002d:
        if (r0 <= r3) goto L_0x0043;
    L_0x002f:
        r4 = r11[r3];
        if (r4 == 0) goto L_0x0043;
    L_0x0033:
        r4 = r8[r9];
        if (r4 != 0) goto L_0x0043;
    L_0x0037:
        r4 = r9 + 1;
        r4 = r8[r4];
        if (r4 != r2) goto L_0x0043;
    L_0x003d:
        defpackage.oyw.a(r11);
        r9 = r9 + -1;
        return r9;
    L_0x0043:
        r4 = r10 + -1;
        r9 = r9 + r3;
    L_0x0046:
        if (r9 >= r4) goto L_0x0068;
    L_0x0048:
        r5 = r8[r9];
        r6 = r5 & 254;
        if (r6 != 0) goto L_0x0065;
    L_0x004e:
        r6 = r9 + -2;
        r7 = r8[r6];
        if (r7 != 0) goto L_0x0064;
    L_0x0054:
        r9 = r9 + -1;
        r9 = r8[r9];
        if (r9 == 0) goto L_0x005b;
    L_0x005a:
        goto L_0x0064;
    L_0x005b:
        if (r5 == r2) goto L_0x005e;
    L_0x005d:
        goto L_0x0064;
    L_0x005e:
        if (r11 == 0) goto L_0x0063;
    L_0x0060:
        defpackage.oyw.a(r11);
    L_0x0063:
        return r6;
    L_0x0064:
        r9 = r6;
    L_0x0065:
        r9 = r9 + 3;
        goto L_0x0046;
    L_0x0068:
        if (r11 == 0) goto L_0x00be;
    L_0x006a:
        if (r0 <= r3) goto L_0x007e;
    L_0x006c:
        r9 = r10 + -3;
        r9 = r8[r9];
        if (r9 != 0) goto L_0x007c;
    L_0x0072:
        r9 = r10 + -2;
        r9 = r8[r9];
        if (r9 != 0) goto L_0x007c;
    L_0x0078:
        r9 = r8[r4];
        if (r9 == r2) goto L_0x0089;
    L_0x007c:
        r9 = 0;
        goto L_0x009a;
    L_0x007e:
        if (r0 == r3) goto L_0x008b;
    L_0x0080:
        r9 = r11[r2];
        if (r9 == 0) goto L_0x007c;
    L_0x0084:
        r9 = r8[r4];
        if (r9 == r2) goto L_0x0089;
    L_0x0088:
        goto L_0x007c;
    L_0x0089:
        r9 = 1;
        goto L_0x009a;
    L_0x008b:
        r9 = r11[r3];
        if (r9 == 0) goto L_0x007c;
    L_0x008f:
        r9 = r10 + -2;
        r9 = r8[r9];
        if (r9 != 0) goto L_0x007c;
    L_0x0095:
        r9 = r8[r4];
        if (r9 == r2) goto L_0x0089;
    L_0x0099:
        goto L_0x007c;
    L_0x009a:
        r11[r1] = r9;
        if (r0 <= r2) goto L_0x00a9;
    L_0x009e:
        r9 = r10 + -2;
        r9 = r8[r9];
        if (r9 != 0) goto L_0x00b4;
    L_0x00a4:
        r9 = r8[r4];
        if (r9 == 0) goto L_0x00b2;
    L_0x00a8:
        goto L_0x00b4;
    L_0x00a9:
        r9 = r11[r3];
        if (r9 == 0) goto L_0x00b4;
    L_0x00ad:
        r9 = r8[r4];
        if (r9 == 0) goto L_0x00b2;
    L_0x00b1:
        goto L_0x00b4;
    L_0x00b2:
        r9 = 1;
        goto L_0x00b5;
    L_0x00b4:
        r9 = 0;
    L_0x00b5:
        r11[r2] = r9;
        r8 = r8[r4];
        if (r8 != 0) goto L_0x00bc;
    L_0x00bb:
        r1 = 1;
    L_0x00bc:
        r11[r3] = r1;
    L_0x00be:
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oyw.a(byte[], int, int, boolean[]):int");
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
