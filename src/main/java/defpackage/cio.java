package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: cio */
public final class cio {
    private static int a(byte b) {
        return b < (byte) 0 ? b + 256 : b;
    }

    public static long a(ByteBuffer byteBuffer) {
        long j = (long) byteBuffer.getInt();
        return j < 0 ? j + 4294967296L : j;
    }

    public static int b(ByteBuffer byteBuffer) {
        return (cio.c(byteBuffer) << 8) + cio.a(byteBuffer.get());
    }

    public static int c(ByteBuffer byteBuffer) {
        return (cio.a(byteBuffer.get()) << 8) + cio.a(byteBuffer.get());
    }

    public static int d(ByteBuffer byteBuffer) {
        return cio.a(byteBuffer.get());
    }

    public static String e(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte b = byteBuffer.get();
            if (b == (byte) 0) {
                return ciq.a(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(b);
        }
    }

    public static String a(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return ciq.a(bArr);
    }

    public static long f(ByteBuffer byteBuffer) {
        long a = cio.a(byteBuffer) << 32;
        if (a >= 0) {
            return a + cio.a(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }

    public static double g(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = (double) (((((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255));
        Double.isNaN(d);
        return d / 65536.0d;
    }

    public static double h(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        double d = (double) (((((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)) | (bArr[3] & 255));
        Double.isNaN(d);
        return d / 1.073741824E9d;
    }

    public static float i(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        return ((float) ((short) (((short) ((bArr[0] << 8) & 65280)) | (bArr[1] & 255)))) / 256.0f;
    }

    public static String j(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
