package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: oid */
final class oid extends oii {
    public oyo a;
    private oic o;

    oid() {
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.a = null;
            this.o = null;
        }
    }

    private static boolean a(byte[] bArr) {
        return bArr[0] == (byte) -1;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    public final long a(defpackage.oza r17) {
        /*
        r16 = this;
        r0 = r17;
        r1 = r0.a;
        r1 = defpackage.oid.a(r1);
        if (r1 == 0) goto L_0x00b7;
    L_0x000a:
        r1 = r0.a;
        r2 = 2;
        r1 = r1[r2];
        r1 = r1 & 255;
        r2 = 4;
        r1 = r1 >> r2;
        r3 = -1;
        switch(r1) {
            case 1: goto L_0x00b3;
            case 2: goto L_0x00ac;
            case 3: goto L_0x00ac;
            case 4: goto L_0x00ac;
            case 5: goto L_0x00ac;
            case 6: goto L_0x001f;
            case 7: goto L_0x001f;
            case 8: goto L_0x0019;
            case 9: goto L_0x0019;
            case 10: goto L_0x0019;
            case 11: goto L_0x0019;
            case 12: goto L_0x0019;
            case 13: goto L_0x0019;
            case 14: goto L_0x0019;
            case 15: goto L_0x0019;
            default: goto L_0x0017;
        };
    L_0x0017:
        goto L_0x00b5;
    L_0x0019:
        r0 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r1 = r1 + -8;
        goto L_0x00b0;
    L_0x001f:
        r0.d(r2);
        r2 = r0.a;
        r4 = r0.b;
        r2 = r2[r4];
        r4 = (long) r2;
        r2 = 7;
        r6 = 7;
    L_0x002b:
        r7 = 6;
        r8 = 0;
        r9 = 1;
        if (r6 < 0) goto L_0x0049;
    L_0x0030:
        r10 = r9 << r6;
        r11 = (long) r10;
        r11 = r11 & r4;
        r13 = 0;
        r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1));
        if (r15 == 0) goto L_0x003d;
    L_0x003a:
        r6 = r6 + -1;
        goto L_0x002b;
    L_0x003d:
        if (r6 >= r7) goto L_0x0044;
    L_0x003f:
        r10 = r10 + r3;
        r10 = (long) r10;
        r4 = r4 & r10;
        r2 = r2 - r6;
        goto L_0x004a;
    L_0x0044:
        if (r6 == r2) goto L_0x0047;
    L_0x0046:
        goto L_0x0049;
    L_0x0047:
        r2 = 1;
        goto L_0x004a;
    L_0x0049:
        r2 = 0;
    L_0x004a:
        if (r2 == 0) goto L_0x0093;
    L_0x004c:
        r3 = 1;
    L_0x004d:
        if (r3 >= r2) goto L_0x007d;
    L_0x004f:
        r6 = r0.a;
        r10 = r0.b;
        r10 = r10 + r3;
        r6 = r6[r10];
        r10 = r6 & 192;
        r11 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r10 != r11) goto L_0x0064;
    L_0x005c:
        r4 = r4 << r7;
        r6 = r6 & 63;
        r10 = (long) r6;
        r4 = r4 | r10;
        r3 = r3 + 1;
        goto L_0x004d;
    L_0x0064:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r2 = 62;
        r1.<init>(r2);
        r2 = "Invalid UTF-8 sequence continuation byte: ";
        r1.append(r2);
        r1.append(r4);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x007d:
        r3 = r0.b;
        r3 = r3 + r2;
        r0.b = r3;
        if (r1 == r7) goto L_0x0089;
    L_0x0084:
        r1 = r17.e();
        goto L_0x008d;
    L_0x0089:
        r1 = r17.d();
    L_0x008d:
        r0.c(r8);
        r3 = r1 + 1;
        goto L_0x00b5;
    L_0x0093:
        r0 = new java.lang.NumberFormatException;
        r1 = new java.lang.StringBuilder;
        r2 = 55;
        r1.<init>(r2);
        r2 = "Invalid UTF-8 sequence first byte: ";
        r1.append(r2);
        r1.append(r4);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00ac:
        r0 = 576; // 0x240 float:8.07E-43 double:2.846E-321;
        r1 = r1 + -2;
    L_0x00b0:
        r3 = r0 << r1;
        goto L_0x00b5;
    L_0x00b3:
        r3 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
    L_0x00b5:
        r0 = (long) r3;
        return r0;
    L_0x00b7:
        r0 = -1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oid.a(oza):long");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(oza oza, long j, oil oil) {
        oza oza2 = oza;
        oil oil2 = oil;
        byte[] bArr = oza2.a;
        int i;
        if (this.a == null) {
            this.a = new oyo(bArr);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, oza2.c);
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            oyo oyo = this.a;
            i = oyo.c;
            int i2 = oyo.a;
            oil2.a = nzw.a(null, "audio/flac", -1, i * i2, oyo.b, i2, singletonList, null, null);
        } else {
            int i3 = 0;
            if ((bArr[0] & 127) == 3) {
                this.o = new oic(this);
                oic oic = this.o;
                oza2.d(1);
                i = oza.h() / 18;
                oic.a = new long[i];
                oic.b = new long[i];
                while (i3 < i) {
                    oic.a[i3] = oza.m();
                    oic.b[i3] = oza.m();
                    oza2.d(2);
                    i3++;
                }
            } else if (oid.a(bArr)) {
                oic oic2 = this.o;
                if (oic2 != null) {
                    oic2.c = j;
                    oil2.b = oic2;
                }
                return false;
            }
        }
        return true;
    }
}
