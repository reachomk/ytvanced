package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: too */
final class too {
    private static final byte[] a = new byte[]{(byte) 82, (byte) 73, (byte) 70, (byte) 70};
    private static final byte[] b = new byte[]{(byte) 87, (byte) 69, (byte) 66, (byte) 80, (byte) 86, (byte) 80, (byte) 56, (byte) 88};

    static boolean a(ByteBuffer byteBuffer) {
        byteBuffer.position(0);
        if (byteBuffer.limit() < 21) {
            return false;
        }
        byte[] bArr = new byte[21];
        byteBuffer.get(bArr);
        return too.a(bArr);
    }

    static boolean a(InputStream inputStream) {
        byte[] bArr = new byte[21];
        if (inputStream.read(bArr) < 21) {
            return false;
        }
        return too.a(bArr);
    }

    private static boolean a(byte[] bArr) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            if (bArr[i] != a[i]) {
                return false;
            }
        }
        length = 0;
        while (true) {
            byte[] bArr2 = b;
            if (length < bArr2.length) {
                if (bArr[length + 8] != bArr2[length]) {
                    return false;
                }
                length++;
            } else if ((bArr[20] & 2) != 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
