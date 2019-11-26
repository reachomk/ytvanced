package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aobk */
final class aobk extends aobf {
    aobk() {
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:42:0x009f, code skipped:
            if (defpackage.aoax.a(r1, r4) <= (byte) -65) goto L_0x00b6;
     */
    /* JADX WARNING: Missing block: B:48:0x00b0, code skipped:
            if (defpackage.aoax.a(r1, r4) <= (byte) -65) goto L_0x00b6;
     */
    /* JADX WARNING: Missing block: B:77:0x00fd, code skipped:
            r18 = r8;
     */
    public final int a(int r27, byte[] r28, int r29, int r30) {
        /*
        r26 = this;
        r0 = r27;
        r1 = r28;
        r2 = r29;
        r3 = r30;
        r4 = r1.length;
        r5 = r2 | r3;
        r6 = r4 - r3;
        r5 = r5 | r6;
        r6 = 2;
        if (r5 < 0) goto L_0x0155;
    L_0x0011:
        r4 = (long) r2;
        r2 = (long) r3;
        r9 = -19;
        r10 = -16;
        r11 = -62;
        r12 = 16;
        r13 = -96;
        r14 = -32;
        r15 = -65;
        r16 = 1;
        r18 = -1;
        if (r0 == 0) goto L_0x00b5;
    L_0x0027:
        r19 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r19 >= 0) goto L_0x00b4;
    L_0x002b:
        r8 = (byte) r0;
        if (r8 < r14) goto L_0x00a8;
    L_0x002e:
        if (r8 >= r10) goto L_0x0061;
    L_0x0030:
        r0 = r0 >> 8;
        r0 = r0 ^ -1;
        r0 = (byte) r0;
        if (r0 != 0) goto L_0x0049;
    L_0x0037:
        r20 = r4 + r16;
        r0 = defpackage.aoax.a(r1, r4);
        r4 = (r20 > r2 ? 1 : (r20 == r2 ? 0 : -1));
        if (r4 >= 0) goto L_0x0044;
    L_0x0041:
        r4 = r20;
        goto L_0x0049;
    L_0x0044:
        r0 = defpackage.aobd.a(r8, r0);
        return r0;
    L_0x0049:
        if (r0 > r15) goto L_0x0060;
    L_0x004b:
        if (r8 != r14) goto L_0x004f;
    L_0x004d:
        if (r0 < r13) goto L_0x0060;
    L_0x004f:
        if (r8 == r9) goto L_0x0052;
    L_0x0051:
        goto L_0x0055;
    L_0x0052:
        if (r0 < r13) goto L_0x0055;
    L_0x0054:
        goto L_0x0060;
    L_0x0055:
        r20 = r4 + r16;
        r0 = defpackage.aoax.a(r1, r4);
        if (r0 > r15) goto L_0x0060;
    L_0x005d:
        r7 = r20;
        goto L_0x00b6;
    L_0x0060:
        return r18;
    L_0x0061:
        r20 = r0 >> 8;
        r7 = r20 ^ -1;
        r7 = (byte) r7;
        if (r7 == 0) goto L_0x006b;
    L_0x0068:
        r0 = r0 >> r12;
        r0 = (byte) r0;
        goto L_0x0078;
    L_0x006b:
        r22 = r4 + r16;
        r7 = defpackage.aoax.a(r1, r4);
        r0 = (r22 > r2 ? 1 : (r22 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x00a3;
    L_0x0075:
        r4 = r22;
        r0 = 0;
    L_0x0078:
        if (r0 != 0) goto L_0x008c;
    L_0x007a:
        r22 = r4 + r16;
        r0 = defpackage.aoax.a(r1, r4);
        r4 = (r22 > r2 ? 1 : (r22 == r2 ? 0 : -1));
        if (r4 >= 0) goto L_0x0087;
    L_0x0084:
        r4 = r22;
        goto L_0x008c;
    L_0x0087:
        r0 = defpackage.aobd.a(r8, r7, r0);
        return r0;
    L_0x008c:
        if (r7 > r15) goto L_0x00a2;
    L_0x008e:
        r8 = r8 << 28;
        r7 = r7 + 112;
        r8 = r8 + r7;
        r7 = r8 >> 30;
        if (r7 != 0) goto L_0x00a2;
    L_0x0097:
        if (r0 > r15) goto L_0x00a2;
    L_0x0099:
        r7 = r4 + r16;
        r0 = defpackage.aoax.a(r1, r4);
        if (r0 > r15) goto L_0x00a2;
    L_0x00a1:
        goto L_0x00b6;
    L_0x00a2:
        return r18;
    L_0x00a3:
        r0 = defpackage.aobd.a(r8, r7);
        return r0;
    L_0x00a8:
        if (r8 < r11) goto L_0x00b3;
    L_0x00aa:
        r7 = r4 + r16;
        r0 = defpackage.aoax.a(r1, r4);
        if (r0 > r15) goto L_0x00b3;
    L_0x00b2:
        goto L_0x00b6;
    L_0x00b3:
        return r18;
    L_0x00b4:
        return r0;
    L_0x00b5:
        r7 = r4;
    L_0x00b6:
        r2 = r2 - r7;
        r0 = (int) r2;
        if (r0 < r12) goto L_0x00cd;
    L_0x00ba:
        r3 = r7;
        r2 = 0;
    L_0x00bc:
        if (r2 >= r0) goto L_0x00cb;
    L_0x00be:
        r22 = r3 + r16;
        r3 = defpackage.aoax.a(r1, r3);
        if (r3 < 0) goto L_0x00ce;
    L_0x00c6:
        r2 = r2 + 1;
        r3 = r22;
        goto L_0x00bc;
    L_0x00cb:
        r2 = r0;
        goto L_0x00ce;
    L_0x00cd:
        r2 = 0;
    L_0x00ce:
        r0 = r0 - r2;
        r2 = (long) r2;
        r7 = r7 + r2;
    L_0x00d1:
        r2 = 0;
    L_0x00d2:
        if (r0 <= 0) goto L_0x00e3;
    L_0x00d4:
        r2 = r7 + r16;
        r4 = defpackage.aoax.a(r1, r7);
        if (r4 < 0) goto L_0x00e1;
    L_0x00dc:
        r0 = r0 + -1;
        r7 = r2;
        r2 = r4;
        goto L_0x00d2;
    L_0x00e1:
        r8 = r4;
        goto L_0x00e8;
    L_0x00e3:
        r24 = r7;
        r8 = r2;
        r2 = r24;
    L_0x00e8:
        if (r0 == 0) goto L_0x0152;
    L_0x00ea:
        r0 = r0 + -1;
        if (r8 >= r14) goto L_0x0100;
    L_0x00ee:
        if (r0 == 0) goto L_0x00fd;
    L_0x00f0:
        r0 = r0 + -1;
        if (r8 < r11) goto L_0x0154;
    L_0x00f4:
        r7 = r2 + r16;
        r2 = defpackage.aoax.a(r1, r2);
        if (r2 <= r15) goto L_0x00d1;
    L_0x00fc:
        goto L_0x0154;
    L_0x00fd:
        r18 = r8;
        goto L_0x0154;
    L_0x0100:
        if (r8 >= r10) goto L_0x0126;
    L_0x0102:
        if (r0 < r6) goto L_0x0121;
    L_0x0104:
        r0 = r0 + -2;
        r4 = r2 + r16;
        r2 = defpackage.aoax.a(r1, r2);
        if (r2 > r15) goto L_0x0154;
    L_0x010e:
        if (r8 != r14) goto L_0x0112;
    L_0x0110:
        if (r2 < r13) goto L_0x0154;
    L_0x0112:
        if (r8 == r9) goto L_0x0115;
    L_0x0114:
        goto L_0x0118;
    L_0x0115:
        if (r2 < r13) goto L_0x0118;
    L_0x0117:
        goto L_0x0154;
    L_0x0118:
        r7 = r4 + r16;
        r2 = defpackage.aoax.a(r1, r4);
        if (r2 <= r15) goto L_0x00d1;
    L_0x0120:
        goto L_0x0154;
    L_0x0121:
        r8 = defpackage.aobk.a(r1, r8, r2, r0);
        goto L_0x00fd;
    L_0x0126:
        r4 = 3;
        if (r0 < r4) goto L_0x014d;
    L_0x0129:
        r0 = r0 + -3;
        r4 = r2 + r16;
        r2 = defpackage.aoax.a(r1, r2);
        if (r2 > r15) goto L_0x0154;
    L_0x0133:
        r3 = r8 << 28;
        r2 = r2 + 112;
        r3 = r3 + r2;
        r2 = r3 >> 30;
        if (r2 != 0) goto L_0x0154;
    L_0x013c:
        r2 = r4 + r16;
        r4 = defpackage.aoax.a(r1, r4);
        if (r4 > r15) goto L_0x0154;
    L_0x0144:
        r7 = r2 + r16;
        r2 = defpackage.aoax.a(r1, r2);
        if (r2 <= r15) goto L_0x00d1;
    L_0x014c:
        goto L_0x0154;
    L_0x014d:
        r8 = defpackage.aobk.a(r1, r8, r2, r0);
        goto L_0x00fd;
    L_0x0152:
        r18 = 0;
    L_0x0154:
        return r18;
    L_0x0155:
        r0 = new java.lang.ArrayIndexOutOfBoundsException;
        r1 = 3;
        r1 = new java.lang.Object[r1];
        r4 = java.lang.Integer.valueOf(r4);
        r5 = 0;
        r1[r5] = r4;
        r2 = java.lang.Integer.valueOf(r29);
        r4 = 1;
        r1[r4] = r2;
        r2 = java.lang.Integer.valueOf(r30);
        r1[r6] = r2;
        r2 = "Array length=%d, index=%d, limit=%d";
        r1 = java.lang.String.format(r2, r1);
        r0.<init>(r1);
        goto L_0x0179;
    L_0x0178:
        throw r0;
    L_0x0179:
        goto L_0x0178;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aobk.a(int, byte[], int, int):int");
    }

    /* Access modifiers changed, original: final */
    public final String b(byte[] bArr, int i, int i2) {
        if (((i | i2) | ((bArr.length - i) - i2)) >= 0) {
            byte a;
            int i3;
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (i < i4) {
                a = aoax.a(bArr, (long) i);
                if (!aobg.a(a)) {
                    break;
                }
                i++;
                i3 = i5 + 1;
                aobg.a(a, cArr, i5);
                i5 = i3;
            }
            while (i < i4) {
                int i6 = i + 1;
                byte a2 = aoax.a(bArr, (long) i);
                int i7;
                if (aobg.a(a2)) {
                    i3 = i5 + 1;
                    aobg.a(a2, cArr, i5);
                    i = i6;
                    while (true) {
                        i5 = i3;
                        if (i >= i4) {
                            break;
                        }
                        a = aoax.a(bArr, (long) i);
                        if (!aobg.a(a)) {
                            break;
                        }
                        i++;
                        i3 = i5 + 1;
                        aobg.a(a, cArr, i5);
                    }
                } else if (aobg.b(a2)) {
                    if (i6 < i4) {
                        i3 = i6 + 1;
                        i7 = i5 + 1;
                        aobg.a(a2, aoax.a(bArr, (long) i6), cArr, i5);
                        i = i3;
                        i5 = i7;
                    } else {
                        throw anyg.j();
                    }
                } else if (aobg.c(a2)) {
                    if (i6 < i4 - 1) {
                        i3 = i6 + 1;
                        i7 = i3 + 1;
                        int i8 = i5 + 1;
                        aobg.a(a2, aoax.a(bArr, (long) i6), aoax.a(bArr, (long) i3), cArr, i5);
                        i = i7;
                        i5 = i8;
                    } else {
                        throw anyg.j();
                    }
                } else if (i6 < i4 - 2) {
                    i3 = i6 + 1;
                    i7 = i3 + 1;
                    int i9 = i7 + 1;
                    aobg.a(a2, aoax.a(bArr, (long) i6), aoax.a(bArr, (long) i3), aoax.a(bArr, (long) i7), cArr, i5);
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
        int i3 = i;
        int i4 = i2;
        if (((i3 | i4) | ((byteBuffer.limit() - i3) - i4)) >= 0) {
            byte a;
            long a2 = aoax.a(byteBuffer) + ((long) i3);
            long j = ((long) i4) + a2;
            char[] cArr = new char[i4];
            i4 = 0;
            while (a2 < j) {
                a = aoax.a(a2);
                if (!aobg.a(a)) {
                    break;
                }
                a2++;
                int i5 = i4 + 1;
                aobg.a(a, cArr, i4);
                i4 = i5;
            }
            while (a2 < j) {
                long j2 = a2 + 1;
                a = aoax.a(a2);
                long j3;
                if (aobg.a(a)) {
                    int i6 = i4 + 1;
                    aobg.a(a, cArr, i4);
                    while (j2 < j) {
                        byte a3 = aoax.a(j2);
                        if (!aobg.a(a3)) {
                            break;
                        }
                        j2++;
                        int i7 = i6 + 1;
                        aobg.a(a3, cArr, i6);
                        i6 = i7;
                    }
                    i4 = i6;
                    a2 = j2;
                } else if (aobg.b(a)) {
                    if (j2 < j) {
                        a2 = j2 + 1;
                        int i8 = i4 + 1;
                        aobg.a(a, aoax.a(j2), cArr, i4);
                        i4 = i8;
                    } else {
                        throw anyg.j();
                    }
                } else if (aobg.c(a)) {
                    if (j2 < -1 + j) {
                        a2 = j2 + 1;
                        j3 = a2 + 1;
                        int i9 = i4 + 1;
                        aobg.a(a, aoax.a(j2), aoax.a(a2), cArr, i4);
                        a2 = j3;
                        i4 = i9;
                    } else {
                        throw anyg.j();
                    }
                } else if (j2 < -2 + j) {
                    a2 = j2 + 1;
                    j3 = a2 + 1;
                    long j4 = j3 + 1;
                    aobg.a(a, aoax.a(j2), aoax.a(a2), aoax.a(j3), cArr, i4);
                    i4 += 2;
                    a2 = j4;
                } else {
                    throw anyg.j();
                }
            }
            return new String(cArr, 0, i4);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* Access modifiers changed, original: final */
    public final int a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        CharSequence charSequence2 = charSequence;
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        long j = (long) i3;
        long j2 = ((long) i4) + j;
        int length = charSequence.length();
        String str = " at index ";
        String str2 = "Failed writing ";
        if (length > i4 || bArr2.length - i4 < i3) {
            char charAt = charSequence2.charAt(length - 1);
            StringBuilder stringBuilder = new StringBuilder(37);
            stringBuilder.append(str2);
            stringBuilder.append(charAt);
            stringBuilder.append(str);
            stringBuilder.append(i3 + i4);
            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
        }
        char c;
        long j3;
        char charAt2;
        i3 = 0;
        while (true) {
            c = 128;
            j3 = 1;
            if (i3 >= length) {
                break;
            }
            charAt2 = charSequence2.charAt(i3);
            if (charAt2 >= 128) {
                break;
            }
            j3 = 1 + j;
            aoax.a(bArr2, j, (byte) charAt2);
            i3++;
            j = j3;
        }
        if (i3 == length) {
            return (int) j;
        }
        while (i3 < length) {
            long j4;
            long j5;
            charAt2 = charSequence2.charAt(i3);
            long j6;
            long j7;
            if (charAt2 < c && j < j2) {
                j6 = j + j3;
                aoax.a(bArr2, j, (byte) charAt2);
                j = j3;
                j4 = j6;
            } else if (charAt2 < 2048 && j <= -2 + j2) {
                j6 = j + j3;
                aoax.a(bArr2, j, (byte) ((charAt2 >>> 6) | 960));
                j7 = j6 + j3;
                aoax.a(bArr2, j6, (byte) ((charAt2 & 63) | 128));
                j4 = j7;
                j = j3;
                i3++;
                c = 128;
                j5 = j;
                j = j4;
                j3 = j5;
            } else if ((charAt2 < 55296 || charAt2 > 57343) && j <= -3 + j2) {
                j6 = j + j3;
                aoax.a(bArr2, j, (byte) ((charAt2 >>> 12) | 480));
                j7 = j6 + j3;
                aoax.a(bArr2, j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                long j8 = j7 + 1;
                aoax.a(bArr2, j7, (byte) ((charAt2 & 63) | 128));
                j4 = j8;
                j = 1;
            } else if (j <= -4 + j2) {
                i4 = i3 + 1;
                if (i4 != length) {
                    char charAt3 = charSequence2.charAt(i4);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        i3 = Character.toCodePoint(charAt2, charAt3);
                        long j9 = j + 1;
                        aoax.a(bArr2, j, (byte) ((i3 >>> 18) | 240));
                        j = j9 + 1;
                        aoax.a(bArr2, j9, (byte) (((i3 >>> 12) & 63) | 128));
                        j6 = j + 1;
                        aoax.a(bArr2, j, (byte) (((i3 >>> 6) & 63) | 128));
                        j = 1;
                        j4 = j6 + 1;
                        aoax.a(bArr2, j6, (byte) ((i3 & 63) | 128));
                        i3 = i4;
                        i3++;
                        c = 128;
                        j5 = j;
                        j = j4;
                        j3 = j5;
                    } else {
                        i3 = i4;
                    }
                }
                throw new aobh(i3 - 1, length);
            } else {
                if (charAt2 >= 55296 && charAt2 <= 57343) {
                    int i5 = i3 + 1;
                    if (i5 == length || !Character.isSurrogatePair(charAt2, charSequence2.charAt(i5))) {
                        throw new aobh(i3, length);
                    }
                }
                StringBuilder stringBuilder2 = new StringBuilder(46);
                stringBuilder2.append(str2);
                stringBuilder2.append(charAt2);
                stringBuilder2.append(str);
                stringBuilder2.append(j);
                throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
            }
            i3++;
            c = 128;
            j5 = j;
            j = j4;
            j3 = j5;
        }
        return (int) j;
    }

    /* Access modifiers changed, original: final */
    public final void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        CharSequence charSequence2 = charSequence;
        ByteBuffer byteBuffer2 = byteBuffer;
        long a = aoax.a(byteBuffer);
        long position = ((long) byteBuffer.position()) + a;
        long limit = ((long) byteBuffer.limit()) + a;
        int length = charSequence.length();
        String str = " at index ";
        String str2 = "Failed writing ";
        int i;
        if (((long) length) <= limit - position) {
            char c;
            char charAt;
            int i2 = 0;
            while (true) {
                c = 128;
                if (i2 >= length) {
                    break;
                }
                charAt = charSequence2.charAt(i2);
                if (charAt >= 128) {
                    break;
                }
                long j = 1 + position;
                aoax.a(position, (byte) charAt);
                i2++;
                position = j;
            }
            if (i2 != length) {
                while (i2 < length) {
                    long j2;
                    charAt = charSequence2.charAt(i2);
                    long j3;
                    long j4;
                    if (charAt < c && position < limit) {
                        long j5 = position + 1;
                        aoax.a(position, (byte) charAt);
                        position = j5;
                        j2 = a;
                    } else if (charAt >= 2048 || position > limit - 2) {
                        j2 = a;
                        if ((charAt < 55296 || charAt > 57343) && position <= limit - 3) {
                            j3 = position + 1;
                            aoax.a(position, (byte) ((charAt >>> 12) | 480));
                            j4 = j3 + 1;
                            aoax.a(j3, (byte) (((charAt >>> 6) & 63) | 128));
                            j3 = j4 + 1;
                            aoax.a(j4, (byte) ((charAt & 63) | 128));
                            position = j3;
                        } else if (position <= limit - 4) {
                            i = i2 + 1;
                            if (i != length) {
                                char charAt2 = charSequence2.charAt(i);
                                if (Character.isSurrogatePair(charAt, charAt2)) {
                                    int toCodePoint = Character.toCodePoint(charAt, charAt2);
                                    long j6 = position + 1;
                                    aoax.a(position, (byte) ((toCodePoint >>> 18) | 240));
                                    j4 = j6 + 1;
                                    aoax.a(j6, (byte) (((toCodePoint >>> 12) & 63) | 128));
                                    j6 = j4 + 1;
                                    aoax.a(j4, (byte) (((toCodePoint >>> 6) & 63) | 128));
                                    j4 = j6 + 1;
                                    aoax.a(j6, (byte) ((toCodePoint & 63) | 128));
                                    i2 = i;
                                    position = j4;
                                }
                            } else {
                                i = i2;
                            }
                            throw new aobh(i - 1, length);
                        } else {
                            if (charAt >= 55296 && charAt <= 57343) {
                                i = i2 + 1;
                                if (i == length || !Character.isSurrogatePair(charAt, charSequence2.charAt(i))) {
                                    throw new aobh(i2, length);
                                }
                            }
                            StringBuilder stringBuilder = new StringBuilder(46);
                            stringBuilder.append(str2);
                            stringBuilder.append(charAt);
                            stringBuilder.append(str);
                            stringBuilder.append(position);
                            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                        }
                    } else {
                        j2 = a;
                        j3 = position + 1;
                        aoax.a(position, (byte) ((charAt >>> 6) | 960));
                        j4 = j3 + 1;
                        aoax.a(j3, (byte) ((charAt & 63) | 128));
                        position = j4;
                    }
                    i2++;
                    byteBuffer2 = byteBuffer;
                    a = j2;
                    c = 128;
                }
                byteBuffer.position((int) (position - a));
                return;
            }
            byteBuffer2.position((int) (position - a));
            return;
        }
        char charAt3 = charSequence2.charAt(length - 1);
        i = byteBuffer.limit();
        StringBuilder stringBuilder2 = new StringBuilder(37);
        stringBuilder2.append(str2);
        stringBuilder2.append(charAt3);
        stringBuilder2.append(str);
        stringBuilder2.append(i);
        throw new ArrayIndexOutOfBoundsException(stringBuilder2.toString());
    }

    private static int a(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return aobd.a(i);
        }
        if (i2 == 1) {
            return aobd.a(i, aoax.a(bArr, j));
        }
        if (i2 == 2) {
            return aobd.a(i, aoax.a(bArr, j), aoax.a(bArr, j + 1));
        }
        throw new AssertionError();
    }
}
