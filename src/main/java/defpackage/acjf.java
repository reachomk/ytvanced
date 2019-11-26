package defpackage;

import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: acjf */
public final class acjf {
    private static final byte[] a = new byte[]{(byte) -81, (byte) 1};
    private static final byte[] b = new byte[]{(byte) -81, (byte) 0};
    private static final byte[] c = new byte[]{(byte) 39, (byte) 1, (byte) 0, (byte) 0, (byte) 0};
    private static final byte[] d = new byte[]{(byte) 23, (byte) 1, (byte) 0, (byte) 0, (byte) 0};
    private static final byte[] e = new byte[]{(byte) 39, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
    private static final byte[] f = new byte[]{(byte) 23, (byte) 0, (byte) 0, (byte) 0, (byte) 0};

    public static byte a(int i, int i2) {
        return (byte) ((i << 6) | i2);
    }

    public static int a(byte b) {
        return (b >> 6) & 3;
    }

    public static int a(ByteBuffer byteBuffer, int i) {
        return (byteBuffer.get(i + 2) & 255) | (((byteBuffer.get(i) & 255) << 16) | ((byteBuffer.get(i + 1) & 255) << 8));
    }

    public static boolean a() {
        return false;
    }

    public static boolean a(int i) {
        return (i & 16777215) == 16777215 || (i & -16777216) != 0;
    }

    public static int b(byte b) {
        return b & 63;
    }

    public static boolean b() {
        return false;
    }

    public static boolean b(int i) {
        return (i & -16777216) == 0;
    }

    public static int c(byte b) {
        return b + 64;
    }

    public static boolean c() {
        return true;
    }

    public static boolean d() {
        return true;
    }

    public static int c(int i) {
        if (i == 10) {
            return 16;
        }
        StringBuilder stringBuilder = new StringBuilder(36);
        stringBuilder.append("Unsupported audio codec: ");
        stringBuilder.append(i);
        throw new ProtocolException(stringBuilder.toString());
    }

    public static byte[] a(int i, boolean z) {
        if (i != 10) {
            StringBuilder stringBuilder = new StringBuilder(36);
            stringBuilder.append("Unsupported audio codec: ");
            stringBuilder.append(i);
            throw new ProtocolException(stringBuilder.toString());
        } else if (z) {
            return b;
        } else {
            return a;
        }
    }

    public static boolean d(int i) {
        if (i == 10) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder(36);
        stringBuilder.append("Unsupported audio codec: ");
        stringBuilder.append(i);
        throw new ProtocolException(stringBuilder.toString());
    }

    public static byte[] a(int i, boolean z, boolean z2) {
        if (i != 7) {
            StringBuilder stringBuilder = new StringBuilder(36);
            stringBuilder.append("Unsupported video codec: ");
            stringBuilder.append(i);
            throw new ProtocolException(stringBuilder.toString());
        } else if (z) {
            byte[] bArr;
            if (z2) {
                bArr = f;
            } else {
                bArr = e;
            }
            return bArr;
        } else {
            return !z2 ? c : d;
        }
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer.remaining();
        int remaining2 = byteBuffer2.remaining();
        int i = (remaining + 11) + remaining2;
        ByteBuffer allocate = ByteBuffer.allocate(i);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.limit(i);
        allocate.put((byte) 1);
        allocate.put((byte) 100);
        allocate.put((byte) 0);
        allocate.put((byte) 13);
        allocate.put((byte) -1);
        allocate.put((byte) -31);
        allocate.put((byte) (remaining >> 8));
        allocate.put((byte) remaining);
        allocate.put(byteBuffer);
        allocate.put((byte) 1);
        allocate.put((byte) (remaining2 >> 8));
        allocate.put((byte) remaining2);
        allocate.put(byteBuffer2);
        allocate.position(0);
        return allocate;
    }
}
