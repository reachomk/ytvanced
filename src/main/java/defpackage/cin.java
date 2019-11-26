package defpackage;

import java.nio.ByteBuffer;

/* renamed from: cin */
public final class cin {
    public static void a(ByteBuffer byteBuffer, long j) {
        byteBuffer.putInt((int) j);
    }

    public static void a(ByteBuffer byteBuffer, int i) {
        i &= 16777215;
        cin.b(byteBuffer, i >> 8);
        cin.c(byteBuffer, i);
    }

    public static void b(ByteBuffer byteBuffer, int i) {
        cin.c(byteBuffer, (i >> 8) & 255);
        cin.c(byteBuffer, i & 255);
    }

    public static void c(ByteBuffer byteBuffer, int i) {
        byteBuffer.put((byte) i);
    }

    public static void a(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 65536.0d);
        byteBuffer.put((byte) (i >> 24));
        byteBuffer.put((byte) (i >> 16));
        byteBuffer.put((byte) (i >> 8));
        byteBuffer.put((byte) i);
    }

    public static void b(ByteBuffer byteBuffer, double d) {
        int i = (int) (d * 1.073741824E9d);
        byteBuffer.put((byte) (i >> 24));
        byteBuffer.put((byte) (i >> 16));
        byteBuffer.put((byte) (i >> 8));
        byteBuffer.put((byte) i);
    }

    public static void c(ByteBuffer byteBuffer, double d) {
        short s = (short) ((int) (d * 256.0d));
        byteBuffer.put((byte) (s >> 8));
        byteBuffer.put((byte) s);
    }

    public static void a(ByteBuffer byteBuffer, String str) {
        byteBuffer.put(ciq.a(str));
        cin.c(byteBuffer, 0);
    }
}
