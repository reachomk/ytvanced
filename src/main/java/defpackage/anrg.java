package defpackage;

import java.nio.ByteBuffer;

/* renamed from: anrg */
public final class anrg extends anre {
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005d A:{RETURN} */
    public final int a(java.lang.CharSequence r9) {
        /*
        r8 = this;
        r0 = r9.length();
        r1 = 0;
        r2 = 0;
    L_0x0006:
        if (r2 >= r0) goto L_0x0013;
    L_0x0008:
        r3 = r9.charAt(r2);
        r4 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r3 >= r4) goto L_0x0013;
    L_0x0010:
        r2 = r2 + 1;
        goto L_0x0006;
    L_0x0013:
        r3 = r0;
    L_0x0014:
        if (r2 >= r0) goto L_0x005b;
    L_0x0016:
        r4 = r9.charAt(r2);
        r5 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        if (r4 >= r5) goto L_0x0026;
    L_0x001e:
        r4 = 127 - r4;
        r4 = r4 >>> 31;
        r3 = r3 + r4;
        r2 = r2 + 1;
        goto L_0x0014;
    L_0x0026:
        r4 = r9.length();
    L_0x002a:
        if (r2 < r4) goto L_0x002e;
    L_0x002c:
        r3 = r3 + r1;
        goto L_0x005b;
    L_0x002e:
        r6 = r9.charAt(r2);
        if (r6 >= r5) goto L_0x003a;
    L_0x0034:
        r6 = 127 - r6;
        r6 = r6 >>> 31;
        r1 = r1 + r6;
        goto L_0x0052;
    L_0x003a:
        r1 = r1 + 2;
        r7 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r6 >= r7) goto L_0x0042;
    L_0x0041:
        goto L_0x0052;
    L_0x0042:
        r7 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r6 <= r7) goto L_0x0048;
    L_0x0047:
        goto L_0x0052;
    L_0x0048:
        r6 = java.lang.Character.codePointAt(r9, r2);
        r7 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        if (r6 < r7) goto L_0x0055;
    L_0x0050:
        r2 = r2 + 1;
    L_0x0052:
        r2 = r2 + 1;
        goto L_0x002a;
    L_0x0055:
        r9 = new anrj;
        r9.<init>(r2, r4);
        throw r9;
    L_0x005b:
        if (r3 < r0) goto L_0x005e;
    L_0x005d:
        return r3;
    L_0x005e:
        r9 = new java.lang.IllegalArgumentException;
        r0 = new java.lang.StringBuilder;
        r1 = 54;
        r0.<init>(r1);
        r1 = "UTF-8 length does not fit in int: ";
        r0.append(r1);
        r1 = (long) r3;
        r3 = 4294967296; // 0x100000000 float:0.0 double:2.121995791E-314;
        r1 = r1 + r3;
        r0.append(r1);
        r0 = r0.toString();
        r9.<init>(r0);
        goto L_0x007f;
    L_0x007e:
        throw r9;
    L_0x007f:
        goto L_0x007e;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anrg.a(java.lang.CharSequence):int");
    }

    public final String a(ByteBuffer byteBuffer, int i, int i2) {
        String str = "Invalid UTF-8";
        char[] cArr;
        int i3;
        byte b;
        int i4;
        int i5;
        byte b2;
        int i6;
        int i7;
        int i8;
        if (byteBuffer.hasArray()) {
            byte[] array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + i;
            if (((arrayOffset | i2) | ((array.length - arrayOffset) - i2)) >= 0) {
                i = arrayOffset + i2;
                cArr = new char[i2];
                i3 = 0;
                while (arrayOffset < i) {
                    b = array[arrayOffset];
                    if (!anrh.a(b)) {
                        break;
                    }
                    arrayOffset++;
                    i4 = i3 + 1;
                    anrh.a(b, cArr, i3);
                    i3 = i4;
                }
                while (arrayOffset < i) {
                    i5 = arrayOffset + 1;
                    b2 = array[arrayOffset];
                    if (anrh.a(b2)) {
                        arrayOffset = i3 + 1;
                        anrh.a(b2, cArr, i3);
                        i3 = arrayOffset;
                        arrayOffset = i5;
                        while (arrayOffset < i) {
                            b = array[arrayOffset];
                            if (!anrh.a(b)) {
                                break;
                            }
                            arrayOffset++;
                            i4 = i3 + 1;
                            anrh.a(b, cArr, i3);
                            i3 = i4;
                        }
                    } else if (anrh.b(b2)) {
                        if (i5 < i) {
                            arrayOffset = i5 + 1;
                            i6 = i3 + 1;
                            anrh.a(b2, array[i5], cArr, i3);
                            i3 = i6;
                        } else {
                            throw new IllegalArgumentException(str);
                        }
                    } else if (anrh.c(b2)) {
                        if (i5 < i - 1) {
                            arrayOffset = i5 + 1;
                            i6 = arrayOffset + 1;
                            i7 = i3 + 1;
                            anrh.a(b2, array[i5], array[arrayOffset], cArr, i3);
                            arrayOffset = i6;
                            i3 = i7;
                        } else {
                            throw new IllegalArgumentException(str);
                        }
                    } else if (i5 < i - 2) {
                        arrayOffset = i5 + 1;
                        i6 = arrayOffset + 1;
                        i8 = i6 + 1;
                        anrh.a(b2, array[i5], array[arrayOffset], array[i6], cArr, i3);
                        i3 += 2;
                        arrayOffset = i8;
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                }
                return new String(cArr, 0, i3);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(array.length), Integer.valueOf(arrayOffset), Integer.valueOf(i2)}));
        } else if (((i | i2) | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i9 = i + i2;
            cArr = new char[i2];
            i3 = 0;
            while (i < i9) {
                b = byteBuffer.get(i);
                if (!anrh.a(b)) {
                    break;
                }
                i++;
                i4 = i3 + 1;
                anrh.a(b, cArr, i3);
                i3 = i4;
            }
            while (i < i9) {
                i5 = i + 1;
                b2 = byteBuffer.get(i);
                if (anrh.a(b2)) {
                    i = i3 + 1;
                    anrh.a(b2, cArr, i3);
                    i3 = i;
                    i = i5;
                    while (i < i9) {
                        b = byteBuffer.get(i);
                        if (!anrh.a(b)) {
                            break;
                        }
                        i++;
                        i4 = i3 + 1;
                        anrh.a(b, cArr, i3);
                        i3 = i4;
                    }
                } else if (anrh.b(b2)) {
                    if (i5 < i9) {
                        i = i5 + 1;
                        i6 = i3 + 1;
                        anrh.a(b2, byteBuffer.get(i5), cArr, i3);
                        i3 = i6;
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                } else if (anrh.c(b2)) {
                    if (i5 < i9 - 1) {
                        i = i5 + 1;
                        i6 = i + 1;
                        i7 = i3 + 1;
                        anrh.a(b2, byteBuffer.get(i5), byteBuffer.get(i), cArr, i3);
                        i = i6;
                        i3 = i7;
                    } else {
                        throw new IllegalArgumentException(str);
                    }
                } else if (i5 < i9 - 2) {
                    i = i5 + 1;
                    i6 = i + 1;
                    i8 = i6 + 1;
                    anrh.a(b2, byteBuffer.get(i5), byteBuffer.get(i), byteBuffer.get(i6), cArr, i3);
                    i3 += 2;
                    i = i8;
                } else {
                    throw new IllegalArgumentException(str);
                }
            }
            return new String(cArr, 0, i3);
        } else {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }
    }

    private static void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        char charAt;
        int max;
        char charAt2;
        StringBuilder stringBuilder;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i = 0;
        while (i < length) {
            try {
                charAt = charSequence.charAt(i);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i, (byte) charAt);
                i++;
            } catch (IndexOutOfBoundsException unused) {
                length = byteBuffer.position();
                max = Math.max(i, (position - byteBuffer.position()) + 1);
                charAt2 = charSequence.charAt(i);
                stringBuilder = new StringBuilder(37);
                stringBuilder.append("Failed writing ");
                stringBuilder.append(charAt2);
                stringBuilder.append(" at index ");
                stringBuilder.append(length + max);
                throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
            }
        }
        if (i != length) {
            position += i;
            while (i < length) {
                charAt = charSequence.charAt(i);
                int i2;
                if (charAt < 128) {
                    byteBuffer.put(position, (byte) charAt);
                } else if (charAt < 2048) {
                    i2 = position + 1;
                    try {
                        byteBuffer.put(position, (byte) ((charAt >>> 6) | 192));
                        byteBuffer.put(i2, (byte) ((charAt & 63) | 128));
                        position = i2;
                    } catch (IndexOutOfBoundsException unused2) {
                        position = i2;
                        length = byteBuffer.position();
                        max = Math.max(i, (position - byteBuffer.position()) + 1);
                        charAt2 = charSequence.charAt(i);
                        stringBuilder = new StringBuilder(37);
                        stringBuilder.append("Failed writing ");
                        stringBuilder.append(charAt2);
                        stringBuilder.append(" at index ");
                        stringBuilder.append(length + max);
                        throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                    }
                } else if (charAt >= 55296 && charAt <= 57343) {
                    i2 = i + 1;
                    if (i2 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i2);
                            if (Character.isSurrogatePair(charAt, charAt3)) {
                                i = Character.toCodePoint(charAt, charAt3);
                                int i3 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((i >>> 18) | 240));
                                    position = i3 + 1;
                                    byteBuffer.put(i3, (byte) (((i >>> 12) & 63) | 128));
                                    i3 = position + 1;
                                    byteBuffer.put(position, (byte) (((i >>> 6) & 63) | 128));
                                    byteBuffer.put(i3, (byte) ((i & 63) | 128));
                                    position = i3;
                                    i = i2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i3;
                                    i = i2;
                                    length = byteBuffer.position();
                                    max = Math.max(i, (position - byteBuffer.position()) + 1);
                                    charAt2 = charSequence.charAt(i);
                                    stringBuilder = new StringBuilder(37);
                                    stringBuilder.append("Failed writing ");
                                    stringBuilder.append(charAt2);
                                    stringBuilder.append(" at index ");
                                    stringBuilder.append(length + max);
                                    throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                                }
                            }
                            i = i2;
                        } catch (IndexOutOfBoundsException unused4) {
                            i = i2;
                            length = byteBuffer.position();
                            max = Math.max(i, (position - byteBuffer.position()) + 1);
                            charAt2 = charSequence.charAt(i);
                            stringBuilder = new StringBuilder(37);
                            stringBuilder.append("Failed writing ");
                            stringBuilder.append(charAt2);
                            stringBuilder.append(" at index ");
                            stringBuilder.append(length + max);
                            throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                        }
                    }
                    throw new anrj(i, length);
                } else {
                    i2 = position + 1;
                    byteBuffer.put(position, (byte) ((charAt >>> 12) | 224));
                    position = i2 + 1;
                    byteBuffer.put(i2, (byte) (((charAt >>> 6) & 63) | 128));
                    byteBuffer.put(position, (byte) ((charAt & 63) | 128));
                }
                i++;
                position++;
            }
            byteBuffer.position(position);
            return;
        }
        byteBuffer.position(position + i);
    }

    public final void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int i;
            int arrayOffset = byteBuffer.arrayOffset();
            byte[] array = byteBuffer.array();
            int position = byteBuffer.position() + arrayOffset;
            int remaining = byteBuffer.remaining();
            int length = charSequence.length();
            remaining += position;
            int i2 = 0;
            while (i2 < length) {
                i = i2 + position;
                if (i >= remaining) {
                    break;
                }
                char charAt = charSequence.charAt(i2);
                if (charAt >= 128) {
                    break;
                }
                array[i] = (byte) charAt;
                i2++;
            }
            if (i2 != length) {
                position += i2;
                while (i2 < length) {
                    int i3;
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 128 && position < remaining) {
                        i3 = position + 1;
                        array[position] = (byte) charAt2;
                    } else if (charAt2 < 2048 && position <= remaining - 2) {
                        i3 = position + 1;
                        array[position] = (byte) ((charAt2 >>> 6) | 960);
                        position = i3 + 1;
                        array[i3] = (byte) ((charAt2 & 63) | 128);
                        i2++;
                    } else if ((charAt2 < 55296 || charAt2 > 57343) && position <= remaining - 3) {
                        i3 = position + 1;
                        array[position] = (byte) ((charAt2 >>> 12) | 480);
                        position = i3 + 1;
                        array[i3] = (byte) (((charAt2 >>> 6) & 63) | 128);
                        i3 = position + 1;
                        array[position] = (byte) ((charAt2 & 63) | 128);
                    } else if (position <= remaining - 4) {
                        i3 = i2 + 1;
                        if (i3 != charSequence.length()) {
                            char charAt3 = charSequence.charAt(i3);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                i2 = Character.toCodePoint(charAt2, charAt3);
                                i = position + 1;
                                array[position] = (byte) ((i2 >>> 18) | 240);
                                position = i + 1;
                                array[i] = (byte) (((i2 >>> 12) & 63) | 128);
                                i = position + 1;
                                array[position] = (byte) (((i2 >>> 6) & 63) | 128);
                                position = i + 1;
                                array[i] = (byte) ((i2 & 63) | 128);
                                i2 = i3;
                                i2++;
                            } else {
                                i2 = i3;
                            }
                        }
                        throw new anrj(i2 - 1, length);
                    } else {
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            int i4 = i2 + 1;
                            if (i4 == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i4))) {
                                throw new anrj(i2, length);
                            }
                        }
                        StringBuilder stringBuilder = new StringBuilder(37);
                        stringBuilder.append("Failed writing ");
                        stringBuilder.append(charAt2);
                        stringBuilder.append(" at index ");
                        stringBuilder.append(position);
                        throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
                    }
                    position = i3;
                    i2++;
                }
            } else {
                position += length;
            }
            byteBuffer.position(position - arrayOffset);
            return;
        }
        anrg.b(charSequence, byteBuffer);
    }
}
