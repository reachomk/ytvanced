package defpackage;

import java.nio.ByteBuffer;

/* renamed from: rif */
final class rif extends rie {
    rif() {
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:35:0x006e, code skipped:
            return -1;
     */
    /* JADX WARNING: Missing block: B:56:0x00b3, code skipped:
            return -1;
     */
    public final int a(byte[] r13, int r14, int r15) {
        /*
        r12 = this;
        r0 = r13.length;
        r1 = r14 | r15;
        r2 = r0 - r15;
        r1 = r1 | r2;
        r2 = 2;
        r3 = 3;
        r4 = 0;
        if (r1 < 0) goto L_0x00b6;
    L_0x000b:
        r0 = (long) r14;
        r14 = (long) r15;
        r14 = r14 - r0;
        r15 = (int) r14;
        r14 = 16;
        r5 = 1;
        if (r15 < r14) goto L_0x0027;
    L_0x0015:
        r7 = r0;
        r14 = 0;
    L_0x0017:
        if (r14 >= r15) goto L_0x0025;
    L_0x0019:
        r9 = r7 + r5;
        r7 = defpackage.rhv.a(r13, r7);
        if (r7 < 0) goto L_0x0028;
    L_0x0021:
        r14 = r14 + 1;
        r7 = r9;
        goto L_0x0017;
    L_0x0025:
        r14 = r15;
        goto L_0x0028;
    L_0x0027:
        r14 = 0;
    L_0x0028:
        r15 = r15 - r14;
        r7 = (long) r14;
        r0 = r0 + r7;
    L_0x002b:
        r14 = 0;
    L_0x002c:
        if (r15 <= 0) goto L_0x003b;
    L_0x002e:
        r7 = r0 + r5;
        r14 = defpackage.rhv.a(r13, r0);
        if (r14 < 0) goto L_0x003a;
    L_0x0036:
        r15 = r15 + -1;
        r0 = r7;
        goto L_0x002c;
    L_0x003a:
        r0 = r7;
    L_0x003b:
        if (r15 == 0) goto L_0x00b5;
    L_0x003d:
        r15 = r15 + -1;
        r7 = -32;
        r8 = -65;
        r9 = -1;
        if (r14 < r7) goto L_0x00a0;
    L_0x0046:
        r10 = -16;
        if (r14 >= r10) goto L_0x0074;
    L_0x004a:
        if (r15 < r2) goto L_0x006f;
    L_0x004c:
        r15 = r15 + -2;
        r10 = r0 + r5;
        r0 = defpackage.rhv.a(r13, r0);
        if (r0 > r8) goto L_0x006e;
    L_0x0056:
        r1 = -96;
        if (r14 == r7) goto L_0x005b;
    L_0x005a:
        goto L_0x005d;
    L_0x005b:
        if (r0 < r1) goto L_0x006e;
    L_0x005d:
        r7 = -19;
        if (r14 == r7) goto L_0x0062;
    L_0x0061:
        goto L_0x0065;
    L_0x0062:
        if (r0 < r1) goto L_0x0065;
    L_0x0064:
        goto L_0x006e;
    L_0x0065:
        r0 = r10 + r5;
        r14 = defpackage.rhv.a(r13, r10);
        if (r14 > r8) goto L_0x006e;
    L_0x006d:
        goto L_0x002b;
    L_0x006e:
        return r9;
    L_0x006f:
        r13 = defpackage.rif.a(r13, r14, r0, r15);
        return r13;
    L_0x0074:
        if (r15 < r3) goto L_0x009b;
    L_0x0076:
        r15 = r15 + -3;
        r10 = r0 + r5;
        r0 = defpackage.rhv.a(r13, r0);
        if (r0 > r8) goto L_0x009a;
    L_0x0080:
        r14 = r14 << 28;
        r0 = r0 + 112;
        r14 = r14 + r0;
        r14 = r14 >> 30;
        if (r14 != 0) goto L_0x009a;
    L_0x0089:
        r0 = r10 + r5;
        r14 = defpackage.rhv.a(r13, r10);
        if (r14 > r8) goto L_0x009a;
    L_0x0091:
        r10 = r0 + r5;
        r14 = defpackage.rhv.a(r13, r0);
        if (r14 > r8) goto L_0x009a;
    L_0x0099:
        goto L_0x00b0;
    L_0x009a:
        return r9;
    L_0x009b:
        r13 = defpackage.rif.a(r13, r14, r0, r15);
        return r13;
    L_0x00a0:
        if (r15 == 0) goto L_0x00b4;
    L_0x00a2:
        r15 = r15 + -1;
        r7 = -62;
        if (r14 < r7) goto L_0x00b3;
    L_0x00a8:
        r10 = r0 + r5;
        r14 = defpackage.rhv.a(r13, r0);
        if (r14 > r8) goto L_0x00b3;
    L_0x00b0:
        r0 = r10;
        goto L_0x002b;
    L_0x00b3:
        return r9;
    L_0x00b4:
        return r14;
    L_0x00b5:
        return r4;
    L_0x00b6:
        r13 = new java.lang.ArrayIndexOutOfBoundsException;
        r1 = new java.lang.Object[r3];
        r0 = java.lang.Integer.valueOf(r0);
        r1[r4] = r0;
        r14 = java.lang.Integer.valueOf(r14);
        r0 = 1;
        r1[r0] = r14;
        r14 = java.lang.Integer.valueOf(r15);
        r1[r2] = r14;
        r14 = "Array length=%d, index=%d, limit=%d";
        r14 = java.lang.String.format(r14, r1);
        r13.<init>(r14);
        goto L_0x00d8;
    L_0x00d7:
        throw r13;
    L_0x00d8:
        goto L_0x00d7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rif.a(byte[], int, int):int");
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
            rhv.a(bArr2, j, (byte) charAt2);
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
                rhv.a(bArr2, j, (byte) charAt2);
                j = j3;
                j4 = j6;
            } else if (charAt2 < 2048 && j <= -2 + j2) {
                j6 = j + j3;
                rhv.a(bArr2, j, (byte) ((charAt2 >>> 6) | 960));
                j7 = j6 + j3;
                rhv.a(bArr2, j6, (byte) ((charAt2 & 63) | 128));
                j4 = j7;
                j = j3;
                i3++;
                c = 128;
                j5 = j;
                j = j4;
                j3 = j5;
            } else if ((charAt2 < 55296 || charAt2 > 57343) && j <= -3 + j2) {
                j6 = j + j3;
                rhv.a(bArr2, j, (byte) ((charAt2 >>> 12) | 480));
                j7 = j6 + j3;
                rhv.a(bArr2, j6, (byte) (((charAt2 >>> 6) & 63) | 128));
                long j8 = j7 + 1;
                rhv.a(bArr2, j7, (byte) ((charAt2 & 63) | 128));
                j4 = j8;
                j = 1;
            } else if (j <= -4 + j2) {
                i4 = i3 + 1;
                if (i4 != length) {
                    char charAt3 = charSequence2.charAt(i4);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        i3 = Character.toCodePoint(charAt2, charAt3);
                        long j9 = j + 1;
                        rhv.a(bArr2, j, (byte) ((i3 >>> 18) | 240));
                        j = j9 + 1;
                        rhv.a(bArr2, j9, (byte) (((i3 >>> 12) & 63) | 128));
                        j6 = j + 1;
                        rhv.a(bArr2, j, (byte) (((i3 >>> 6) & 63) | 128));
                        j = 1;
                        j4 = j6 + 1;
                        rhv.a(bArr2, j6, (byte) ((i3 & 63) | 128));
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
                throw new rig(i3 - 1, length);
            } else {
                if (charAt2 >= 55296 && charAt2 <= 57343) {
                    int i5 = i3 + 1;
                    if (i5 == length || !Character.isSurrogatePair(charAt2, charSequence2.charAt(i5))) {
                        throw new rig(i3, length);
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
        long a = rhv.a(byteBuffer);
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
                rhv.a(position, (byte) charAt);
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
                        rhv.a(position, (byte) charAt);
                        position = j5;
                        j2 = a;
                    } else if (charAt >= 2048 || position > limit - 2) {
                        j2 = a;
                        if ((charAt < 55296 || charAt > 57343) && position <= limit - 3) {
                            j3 = position + 1;
                            rhv.a(position, (byte) ((charAt >>> 12) | 480));
                            j4 = j3 + 1;
                            rhv.a(j3, (byte) (((charAt >>> 6) & 63) | 128));
                            j3 = j4 + 1;
                            rhv.a(j4, (byte) ((charAt & 63) | 128));
                            position = j3;
                        } else if (position <= limit - 4) {
                            i = i2 + 1;
                            if (i != length) {
                                char charAt2 = charSequence2.charAt(i);
                                if (Character.isSurrogatePair(charAt, charAt2)) {
                                    int toCodePoint = Character.toCodePoint(charAt, charAt2);
                                    long j6 = position + 1;
                                    rhv.a(position, (byte) ((toCodePoint >>> 18) | 240));
                                    j4 = j6 + 1;
                                    rhv.a(j6, (byte) (((toCodePoint >>> 12) & 63) | 128));
                                    j6 = j4 + 1;
                                    rhv.a(j4, (byte) (((toCodePoint >>> 6) & 63) | 128));
                                    j4 = j6 + 1;
                                    rhv.a(j6, (byte) ((toCodePoint & 63) | 128));
                                    i2 = i;
                                    position = j4;
                                }
                            } else {
                                i = i2;
                            }
                            throw new rig(i - 1, length);
                        } else {
                            if (charAt >= 55296 && charAt <= 57343) {
                                i = i2 + 1;
                                if (i == length || !Character.isSurrogatePair(charAt, charSequence2.charAt(i))) {
                                    throw new rig(i2, length);
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
                        rhv.a(position, (byte) ((charAt >>> 6) | 960));
                        j4 = j3 + 1;
                        rhv.a(j3, (byte) ((charAt & 63) | 128));
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
            return rib.a(i);
        }
        if (i2 == 1) {
            return rib.a(i, rhv.a(bArr, j));
        }
        if (i2 == 2) {
            return rib.a(i, rhv.a(bArr, j), rhv.a(bArr, j + 1));
        }
        throw new AssertionError();
    }
}
