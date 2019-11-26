package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: raj */
public final class raj {
    public static byte[] a(byte[]... bArr) {
        int length;
        int length2 = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            length = bArr[i].length;
            if (i2 <= Integer.MAX_VALUE - length) {
                i2 += length;
                i++;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr2 = new byte[i2];
        length = 0;
        for (Object obj : bArr) {
            int length3 = obj.length;
            System.arraycopy(obj, 0, bArr2, length, length3);
            length += length3;
        }
        return bArr2;
    }

    public static final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }
}
