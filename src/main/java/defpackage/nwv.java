package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: nwv */
public final class nwv {
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

    public static byte[] a(nwz nwz) {
        int e = nwz.e();
        int i = nwz.b;
        nwz.d(e);
        byte[] bArr = nwz.a;
        byte[] bArr2 = new byte[(nwh.a.length + e)];
        System.arraycopy(nwh.a, 0, bArr2, 0, nwh.a.length);
        System.arraycopy(bArr, i, bArr2, nwh.a.length, e);
        return bArr2;
    }

    public static int b(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static int c(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010e  */
    public static defpackage.nwx a(defpackage.nxa r20) {
        /*
        r0 = r20;
        r1 = 8;
        r2 = r0.c(r1);
        r3 = 16;
        r0.b(r3);
        r5 = r20.e();
        r4 = 3;
        r6 = 0;
        r7 = 1;
        r8 = 100;
        if (r2 != r8) goto L_0x0019;
    L_0x0018:
        goto L_0x0040;
    L_0x0019:
        r8 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        if (r2 == r8) goto L_0x0040;
    L_0x001d:
        r8 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r2 == r8) goto L_0x0040;
    L_0x0021:
        r8 = 244; // 0xf4 float:3.42E-43 double:1.206E-321;
        if (r2 == r8) goto L_0x0040;
    L_0x0025:
        r8 = 44;
        if (r2 == r8) goto L_0x0040;
    L_0x0029:
        r8 = 83;
        if (r2 == r8) goto L_0x0040;
    L_0x002d:
        r8 = 86;
        if (r2 == r8) goto L_0x0040;
    L_0x0031:
        r8 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        if (r2 == r8) goto L_0x0040;
    L_0x0035:
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 == r8) goto L_0x0040;
    L_0x0039:
        r8 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        if (r2 == r8) goto L_0x0040;
    L_0x003d:
        r2 = 1;
        r9 = 0;
        goto L_0x0067;
    L_0x0040:
        r2 = r20.e();
        if (r2 != r4) goto L_0x004b;
    L_0x0046:
        r8 = r20.b();
        goto L_0x004c;
    L_0x004b:
        r8 = 0;
    L_0x004c:
        r20.e();
        r20.e();
        r0.b(r7);
        r9 = r20.b();
        if (r9 != 0) goto L_0x005c;
    L_0x005b:
        goto L_0x0066;
    L_0x005c:
        if (r2 == r4) goto L_0x0061;
    L_0x005e:
        r9 = 8;
        goto L_0x0063;
    L_0x0061:
        r9 = 12;
    L_0x0063:
        r10 = 0;
    L_0x0064:
        if (r10 < r9) goto L_0x014c;
    L_0x0066:
        r9 = r8;
    L_0x0067:
        r8 = r20.e();
        r11 = r8 + 4;
        r12 = r20.e();
        if (r12 != 0) goto L_0x007c;
    L_0x0073:
        r8 = r20.e();
        r8 = r8 + 4;
        r13 = r8;
    L_0x007a:
        r14 = 0;
        goto L_0x009e;
    L_0x007c:
        if (r12 != r7) goto L_0x009c;
    L_0x007e:
        r8 = r20.b();
        r20.d();
        r20.d();
        r10 = r20.e();
        r13 = (long) r10;
        r10 = 0;
    L_0x008e:
        r3 = (long) r10;
        r16 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1));
        if (r16 >= 0) goto L_0x0099;
    L_0x0093:
        r20.e();
        r10 = r10 + 1;
        goto L_0x008e;
    L_0x0099:
        r14 = r8;
        r13 = 0;
        goto L_0x009e;
    L_0x009c:
        r13 = 0;
        goto L_0x007a;
    L_0x009e:
        r20.e();
        r0.b(r7);
        r3 = r20.e();
        r3 = r3 + r7;
        r4 = r20.e();
        r10 = r20.b();
        r6 = 2;
        r8 = 2 - r10;
        r4 = r4 + r7;
        r4 = r4 * r8;
        if (r10 != 0) goto L_0x00bc;
    L_0x00b9:
        r0.b(r7);
    L_0x00bc:
        r0.b(r7);
        r3 = r3 << 4;
        r4 = r4 << 4;
        r16 = r20.b();
        if (r16 == 0) goto L_0x00f6;
    L_0x00c9:
        r16 = r20.e();
        r17 = r20.e();
        r18 = r20.e();
        r19 = r20.e();
        if (r2 != 0) goto L_0x00dd;
    L_0x00db:
        r6 = 1;
        goto L_0x00ea;
    L_0x00dd:
        r6 = 3;
        if (r2 != r6) goto L_0x00e2;
    L_0x00e0:
        r6 = 1;
        goto L_0x00e3;
    L_0x00e2:
        r6 = 2;
    L_0x00e3:
        if (r2 != r7) goto L_0x00e7;
    L_0x00e5:
        r15 = 2;
        goto L_0x00e8;
    L_0x00e7:
        r15 = 1;
    L_0x00e8:
        r8 = r8 * r15;
    L_0x00ea:
        r16 = r16 + r17;
        r16 = r16 * r6;
        r3 = r3 - r16;
        r18 = r18 + r19;
        r18 = r18 * r8;
        r4 = r4 - r18;
    L_0x00f6:
        r6 = r3;
        r7 = r4;
        r2 = r20.b();
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r2 == 0) goto L_0x0143;
    L_0x0100:
        r2 = r20.b();
        if (r2 == 0) goto L_0x0143;
    L_0x0106:
        r1 = r0.c(r1);
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r1 != r2) goto L_0x0122;
    L_0x010e:
        r4 = 16;
        r1 = r0.c(r4);
        r0 = r0.c(r4);
        if (r1 != 0) goto L_0x011b;
    L_0x011a:
        goto L_0x0143;
    L_0x011b:
        if (r0 == 0) goto L_0x0143;
    L_0x011d:
        r1 = (float) r1;
        r0 = (float) r0;
        r1 = r1 / r0;
        r8 = r1;
        goto L_0x0145;
    L_0x0122:
        r0 = b;
        r2 = r0.length;
        if (r1 >= r2) goto L_0x012b;
    L_0x0127:
        r0 = r0[r1];
        r8 = r0;
        goto L_0x0145;
    L_0x012b:
        r0 = new java.lang.StringBuilder;
        r2 = 46;
        r0.<init>(r2);
        r2 = "Unexpected aspect_ratio_idc value: ";
        r0.append(r2);
        r0.append(r1);
        r0 = r0.toString();
        r1 = "NalUnitUtil";
        android.util.Log.w(r1, r0);
    L_0x0143:
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x0145:
        r0 = new nwx;
        r4 = r0;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
        return r0;
    L_0x014c:
        r3 = 0;
        r4 = 16;
        r6 = 3;
        r11 = r20.b();
        if (r11 != 0) goto L_0x0157;
    L_0x0156:
        goto L_0x0177;
    L_0x0157:
        r11 = 6;
        if (r10 >= r11) goto L_0x015d;
    L_0x015a:
        r11 = 16;
        goto L_0x015f;
    L_0x015d:
        r11 = 64;
    L_0x015f:
        r12 = 0;
        r13 = 8;
        r14 = 8;
    L_0x0164:
        if (r12 >= r11) goto L_0x0177;
    L_0x0166:
        if (r13 == 0) goto L_0x0171;
    L_0x0168:
        r13 = r20.d();
        r13 = r13 + r14;
        r13 = r13 + 256;
        r13 = r13 % 256;
    L_0x0171:
        if (r13 == 0) goto L_0x0174;
    L_0x0173:
        r14 = r13;
    L_0x0174:
        r12 = r12 + 1;
        goto L_0x0164;
    L_0x0177:
        r10 = r10 + 1;
        r3 = 16;
        r4 = 3;
        r6 = 0;
        goto L_0x0064;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwv.a(nxa):nwx");
    }

    public static nwy b(nxa nxa) {
        int e = nxa.e();
        int e2 = nxa.e();
        nxa.b(1);
        return new nwy(e, e2, nxa.b());
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
        defpackage.nwf.b(r3);
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
        defpackage.nwv.a(r11);
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
        defpackage.nwv.a(r11);
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
        defpackage.nwv.a(r11);
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
        defpackage.nwv.a(r11);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwv.a(byte[], int, int, boolean[]):int");
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
