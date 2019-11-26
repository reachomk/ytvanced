package defpackage;

import java.nio.ByteBuffer;

/* renamed from: aekk */
public final class aekk {
    public static int a(byte b) {
        return (b & 128) != 0 ? (b & 64) != 0 ? (b & 32) != 0 ? (b & 16) != 0 ? 5 : 4 : 3 : 2 : 1;
    }

    public static Integer a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 0) {
            int a = aekk.a(byteBuffer.get(byteBuffer.position()));
            if (byteBuffer.remaining() >= a) {
                int i = byteBuffer.get() & 255;
                if (a == 1) {
                    return Integer.valueOf(i);
                }
                if (a == 2) {
                    return Integer.valueOf(((byteBuffer.get() & 255) << 6) | (i & 63));
                } else if (a == 3) {
                    return Integer.valueOf(((((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255)) << 5) | (i & 31));
                } else if (a != 4) {
                    return Integer.valueOf(((byteBuffer.get() & 255) << 24) | (((byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8)) | ((byteBuffer.get() & 255) << 16)));
                } else {
                    return Integer.valueOf(((((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8))) << 4) | (i & 15));
                }
            }
        }
        return null;
    }
}
