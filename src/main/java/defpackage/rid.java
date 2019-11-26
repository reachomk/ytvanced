package defpackage;

import java.nio.ByteBuffer;

/* renamed from: rid */
final class rid extends rie {
    rid() {
    }

    /* Access modifiers changed, original: final */
    public final int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= (byte) 0) {
            i++;
        }
        if (i < i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < (byte) 0) {
                    if (b >= (byte) -32) {
                        byte b2;
                        if (b >= (byte) -16) {
                            if (i3 >= i2 - 2) {
                                return rib.b(bArr, i3, i2);
                            }
                            int i4 = i3 + 1;
                            b2 = bArr[i3];
                            if (b2 <= (byte) -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                                i = i4 + 1;
                                if (bArr[i4] <= (byte) -65) {
                                    i3 = i + 1;
                                    if (bArr[i] > (byte) -65) {
                                    }
                                }
                            }
                            return -1;
                        } else if (i3 >= i2 - 1) {
                            return rib.b(bArr, i3, i2);
                        } else {
                            int i5 = i3 + 1;
                            b2 = bArr[i3];
                            if (b2 <= (byte) -65 && ((b != (byte) -32 || b2 >= (byte) -96) && (b != (byte) -19 || b2 < (byte) -96))) {
                                i = i5 + 1;
                                if (bArr[i5] <= (byte) -65) {
                                }
                            }
                            return -1;
                        }
                    } else if (i3 >= i2) {
                        return b;
                    } else {
                        if (b >= (byte) -62) {
                            i = i3 + 1;
                            if (bArr[i3] <= (byte) -65) {
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
        }
        return 0;
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
                throw new rig(i4 - 1, length);
            } else {
                if (charAt2 >= 55296 && charAt2 <= 57343) {
                    int i6 = i4 + 1;
                    if (i6 == charSequence.length() || !Character.isSurrogatePair(charAt2, charSequence.charAt(i6))) {
                        throw new rig(i4, length);
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
        rie.b(charSequence, byteBuffer);
    }
}
