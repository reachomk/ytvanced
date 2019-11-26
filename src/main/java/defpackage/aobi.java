package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aobi */
final class aobi extends aobf {
    aobi() {
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:24:0x004e, code skipped:
            if (r13[r14] <= (byte) -65) goto L_0x0088;
     */
    /* JADX WARNING: Missing block: B:41:0x007c, code skipped:
            if (r13[r14] <= (byte) -65) goto L_0x0088;
     */
    /* JADX WARNING: Missing block: B:45:0x0086, code skipped:
            if (r13[r14] <= (byte) -65) goto L_0x0088;
     */
    public final int a(int r12, byte[] r13, int r14, int r15) {
        /*
        r11 = this;
        r0 = -19;
        r1 = -16;
        r2 = -62;
        r3 = 0;
        r4 = -96;
        r5 = -32;
        r6 = -65;
        r7 = -1;
        if (r12 != 0) goto L_0x0013;
    L_0x0010:
        r12 = r14;
        goto L_0x0088;
    L_0x0013:
        if (r14 >= r15) goto L_0x00f8;
    L_0x0015:
        r8 = (byte) r12;
        if (r8 < r5) goto L_0x0080;
    L_0x0018:
        if (r8 < r1) goto L_0x0057;
    L_0x001a:
        r9 = r12 >> 8;
        r9 = r9 ^ r7;
        r9 = (byte) r9;
        if (r9 == 0) goto L_0x0024;
    L_0x0020:
        r12 = r12 >> 16;
        r12 = (byte) r12;
        goto L_0x002c;
    L_0x0024:
        r12 = r14 + 1;
        r9 = r13[r14];
        if (r12 >= r15) goto L_0x0052;
    L_0x002a:
        r14 = r12;
        r12 = 0;
    L_0x002c:
        if (r12 != 0) goto L_0x003d;
    L_0x002e:
        r12 = r14 + 1;
        r14 = r13[r14];
        if (r12 >= r15) goto L_0x0038;
    L_0x0034:
        r10 = r14;
        r14 = r12;
        r12 = r10;
        goto L_0x003d;
    L_0x0038:
        r12 = defpackage.aobd.a(r8, r9, r14);
        return r12;
    L_0x003d:
        if (r9 > r6) goto L_0x0051;
    L_0x003f:
        r8 = r8 << 28;
        r9 = r9 + 112;
        r8 = r8 + r9;
        r8 = r8 >> 30;
        if (r8 != 0) goto L_0x0051;
    L_0x0048:
        if (r12 > r6) goto L_0x0051;
    L_0x004a:
        r12 = r14 + 1;
        r14 = r13[r14];
        if (r14 > r6) goto L_0x0051;
    L_0x0050:
        goto L_0x0088;
    L_0x0051:
        return r7;
    L_0x0052:
        r12 = defpackage.aobd.a(r8, r9);
        return r12;
    L_0x0057:
        r12 = r12 >> 8;
        r12 = r12 ^ r7;
        r12 = (byte) r12;
        if (r12 != 0) goto L_0x006c;
    L_0x005d:
        r12 = r14 + 1;
        r14 = r13[r14];
        if (r12 >= r15) goto L_0x0067;
    L_0x0063:
        r10 = r14;
        r14 = r12;
        r12 = r10;
        goto L_0x006c;
    L_0x0067:
        r12 = defpackage.aobd.a(r8, r14);
        return r12;
    L_0x006c:
        if (r12 > r6) goto L_0x007f;
    L_0x006e:
        if (r8 != r5) goto L_0x0072;
    L_0x0070:
        if (r12 < r4) goto L_0x007f;
    L_0x0072:
        if (r8 == r0) goto L_0x0075;
    L_0x0074:
        goto L_0x0078;
    L_0x0075:
        if (r12 < r4) goto L_0x0078;
    L_0x0077:
        goto L_0x007f;
    L_0x0078:
        r12 = r14 + 1;
        r14 = r13[r14];
        if (r14 > r6) goto L_0x007f;
    L_0x007e:
        goto L_0x0088;
    L_0x007f:
        return r7;
    L_0x0080:
        if (r8 < r2) goto L_0x00f7;
    L_0x0082:
        r12 = r14 + 1;
        r14 = r13[r14];
        if (r14 > r6) goto L_0x00f7;
    L_0x0088:
        if (r12 >= r15) goto L_0x0091;
    L_0x008a:
        r14 = r13[r12];
        if (r14 < 0) goto L_0x0091;
    L_0x008e:
        r12 = r12 + 1;
        goto L_0x0088;
    L_0x0091:
        if (r12 < r15) goto L_0x0096;
    L_0x0093:
        r7 = 0;
        goto L_0x00f7;
    L_0x0096:
        if (r12 >= r15) goto L_0x0093;
    L_0x0098:
        r14 = r12 + 1;
        r12 = r13[r12];
        if (r12 >= 0) goto L_0x00f5;
    L_0x009e:
        if (r12 >= r5) goto L_0x00ad;
    L_0x00a0:
        if (r14 >= r15) goto L_0x00ab;
    L_0x00a2:
        if (r12 < r2) goto L_0x00f7;
    L_0x00a4:
        r12 = r14 + 1;
        r14 = r13[r14];
        if (r14 <= r6) goto L_0x0096;
    L_0x00aa:
        goto L_0x00f7;
    L_0x00ab:
        r7 = r12;
        goto L_0x00f7;
    L_0x00ad:
        if (r12 < r1) goto L_0x00d4;
    L_0x00af:
        r8 = r15 + -2;
        if (r14 >= r8) goto L_0x00cf;
    L_0x00b3:
        r8 = r14 + 1;
        r14 = r13[r14];
        if (r14 > r6) goto L_0x00f7;
    L_0x00b9:
        r12 = r12 << 28;
        r14 = r14 + 112;
        r12 = r12 + r14;
        r12 = r12 >> 30;
        if (r12 != 0) goto L_0x00f7;
    L_0x00c2:
        r12 = r8 + 1;
        r14 = r13[r8];
        if (r14 > r6) goto L_0x00f7;
    L_0x00c8:
        r14 = r12 + 1;
        r12 = r13[r12];
        if (r12 > r6) goto L_0x00f7;
    L_0x00ce:
        goto L_0x00f5;
    L_0x00cf:
        r3 = defpackage.aobd.b(r13, r14, r15);
        goto L_0x00f3;
    L_0x00d4:
        r8 = r15 + -1;
        if (r14 >= r8) goto L_0x00ef;
    L_0x00d8:
        r8 = r14 + 1;
        r14 = r13[r14];
        if (r14 > r6) goto L_0x00f7;
    L_0x00de:
        if (r12 != r5) goto L_0x00e2;
    L_0x00e0:
        if (r14 < r4) goto L_0x00f7;
    L_0x00e2:
        if (r12 == r0) goto L_0x00e5;
    L_0x00e4:
        goto L_0x00e8;
    L_0x00e5:
        if (r14 < r4) goto L_0x00e8;
    L_0x00e7:
        goto L_0x00f7;
    L_0x00e8:
        r12 = r8 + 1;
        r14 = r13[r8];
        if (r14 <= r6) goto L_0x0096;
    L_0x00ee:
        goto L_0x00f7;
    L_0x00ef:
        r3 = defpackage.aobd.b(r13, r14, r15);
    L_0x00f3:
        r7 = r3;
        goto L_0x00f7;
    L_0x00f5:
        r12 = r14;
        goto L_0x0096;
    L_0x00f7:
        return r7;
    L_0x00f8:
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aobi.a(int, byte[], int, int):int");
    }

    /* Access modifiers changed, original: final */
    public final String b(byte[] bArr, int i, int i2) {
        if (((i | i2) | ((bArr.length - i) - i2)) >= 0) {
            byte b;
            int i3;
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (i < i4) {
                b = bArr[i];
                if (!aobg.a(b)) {
                    break;
                }
                i++;
                i3 = i5 + 1;
                aobg.a(b, cArr, i5);
                i5 = i3;
            }
            while (i < i4) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                int i7;
                if (aobg.a(b2)) {
                    i3 = i5 + 1;
                    aobg.a(b2, cArr, i5);
                    i = i6;
                    while (true) {
                        i5 = i3;
                        if (i < i4) {
                            b = bArr[i];
                            if (!aobg.a(b)) {
                                break;
                            }
                            i++;
                            i3 = i5 + 1;
                            aobg.a(b, cArr, i5);
                        } else {
                            break;
                        }
                    }
                } else if (aobg.b(b2)) {
                    if (i6 < i4) {
                        i3 = i6 + 1;
                        i7 = i5 + 1;
                        aobg.a(b2, bArr[i6], cArr, i5);
                        i = i3;
                        i5 = i7;
                    } else {
                        throw anyg.j();
                    }
                } else if (aobg.c(b2)) {
                    if (i6 < i4 - 1) {
                        i3 = i6 + 1;
                        i7 = i3 + 1;
                        int i8 = i5 + 1;
                        aobg.a(b2, bArr[i6], bArr[i3], cArr, i5);
                        i = i7;
                        i5 = i8;
                    } else {
                        throw anyg.j();
                    }
                } else if (i6 < i4 - 2) {
                    i3 = i6 + 1;
                    i7 = i3 + 1;
                    int i9 = i7 + 1;
                    aobg.a(b2, bArr[i6], bArr[i3], bArr[i7], cArr, i5);
                    i5 += 2;
                    i = i9;
                } else {
                    throw anyg.j();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* Access modifiers changed, original: final */
    public final String a(ByteBuffer byteBuffer, int i, int i2) {
        return aobf.b(byteBuffer, i, i2);
    }

    /* Access modifiers changed, original: final */
    public final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int length = charSequence.length();
        i2 += i;
        int i4 = 0;
        while (i4 < length) {
            i3 = i4 + i;
            if (i3 >= i2) {
                break;
            }
            char charAt = charSequence.charAt(i4);
            if (charAt >= 128) {
                break;
            }
            bArr[i3] = (byte) charAt;
            i4++;
        }
        if (i4 == length) {
            return i + length;
        }
        i += i4;
        while (i4 < length) {
            int i5;
            char charAt2 = charSequence.charAt(i4);
            if (charAt2 < 128 && i < i2) {
                i5 = i + 1;
                bArr[i] = (byte) charAt2;
            } else if (charAt2 < 2048 && i <= i2 - 2) {
                i5 = i + 1;
                bArr[i] = (byte) ((charAt2 >>> 6) | 960);
                i = i5 + 1;
                bArr[i5] = (byte) ((charAt2 & 63) | 128);
                i4++;
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i <= i2 - 3) {
                i5 = i + 1;
                bArr[i] = (byte) ((charAt2 >>> 12) | 480);
                i = i5 + 1;
                bArr[i5] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i5 = i + 1;
                bArr[i] = (byte) ((charAt2 & 63) | 128);
            } else if (i <= i2 - 4) {
                i5 = i4 + 1;
                if (i5 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i5);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        i4 = Character.toCodePoint(charAt2, charAt3);
                        i3 = i + 1;
                        bArr[i] = (byte) ((i4 >>> 18) | 240);
                        i = i3 + 1;
                        bArr[i3] = (byte) (((i4 >>> 12) & 63) | 128);
                        i3 = i + 1;
                        bArr[i] = (byte) (((i4 >>> 6) & 63) | 128);
                        i = i3 + 1;
                        bArr[i3] = (byte) ((i4 & 63) | 128);
                        i4 = i5;
                        i4++;
                    } else {
                        i4 = i5;
                    }
                }
                throw new aobh(i4 - 1, length);
            } else {
                if (charAt2 >= 55296 && charAt2 <= 57343) {
                    int i6 = i4 + 1;
                    if (i6 == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i6))) {
                        throw new aobh(i4, length);
                    }
                }
                StringBuilder stringBuilder = new StringBuilder(37);
                stringBuilder.append("Failed writing ");
                stringBuilder.append(charAt2);
                stringBuilder.append(" at index ");
                stringBuilder.append(i);
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
            i = i5;
            i4++;
        }
        return i;
    }

    /* Access modifiers changed, original: final */
    public final void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        aobf.b(charSequence, byteBuffer);
    }
}
