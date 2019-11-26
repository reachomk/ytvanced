package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aobf */
abstract class aobf {
    aobf() {
    }

    public abstract int a(int i, byte[] bArr, int i2, int i3);

    public abstract int a(CharSequence charSequence, byte[] bArr, int i, int i2);

    public abstract String a(ByteBuffer byteBuffer, int i, int i2);

    public abstract void a(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract String b(byte[] bArr, int i, int i2);

    /* Access modifiers changed, original: final */
    public final boolean a(byte[] bArr, int i, int i2) {
        return a(0, bArr, i, i2) == 0;
    }

    static String b(ByteBuffer byteBuffer, int i, int i2) {
        if (((i | i2) | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3;
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (i < i4) {
                byte b = byteBuffer.get(i);
                if (!aobg.a(b)) {
                    break;
                }
                i++;
                i3 = i5 + 1;
                aobg.a(b, cArr, i5);
                i5 = i3;
            }
            int i6 = i5;
            while (i < i4) {
                i5 = i + 1;
                byte b2 = byteBuffer.get(i);
                int i7;
                if (aobg.a(b2)) {
                    i7 = i6 + 1;
                    aobg.a(b2, cArr, i6);
                    i = i5;
                    while (true) {
                        i6 = i7;
                        if (i < i4) {
                            byte b3 = byteBuffer.get(i);
                            if (!aobg.a(b3)) {
                                break;
                            }
                            i++;
                            i7 = i6 + 1;
                            aobg.a(b3, cArr, i6);
                        } else {
                            break;
                        }
                    }
                } else if (aobg.b(b2)) {
                    if (i5 < i4) {
                        i7 = i5 + 1;
                        i3 = i6 + 1;
                        aobg.a(b2, byteBuffer.get(i5), cArr, i6);
                        i = i7;
                        i6 = i3;
                    } else {
                        throw anyg.j();
                    }
                } else if (aobg.c(b2)) {
                    if (i5 < i4 - 1) {
                        i7 = i5 + 1;
                        i3 = i7 + 1;
                        int i8 = i6 + 1;
                        aobg.a(b2, byteBuffer.get(i5), byteBuffer.get(i7), cArr, i6);
                        i = i3;
                        i6 = i8;
                    } else {
                        throw anyg.j();
                    }
                } else if (i5 < i4 - 2) {
                    i7 = i5 + 1;
                    i3 = i7 + 1;
                    int i9 = i3 + 1;
                    aobg.a(b2, byteBuffer.get(i5), byteBuffer.get(i7), byteBuffer.get(i3), cArr, i6);
                    i6 += 2;
                    i = i9;
                } else {
                    throw anyg.j();
                }
            }
            return new String(cArr, 0, i6);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    static void b(CharSequence charSequence, ByteBuffer byteBuffer) {
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
                    throw new aobh(i, length);
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
}
