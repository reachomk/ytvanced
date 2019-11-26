package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: rfc */
public final class rfc {
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] b;

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int a(boolean z) {
        return !z ? 1237 : 1231;
    }

    static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    static boolean a() {
        return false;
    }

    static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static boolean a(byte[] bArr) {
        return rib.a.b(bArr, 0, bArr.length);
    }

    public static String b(byte[] bArr) {
        return new String(bArr, a);
    }

    public static int c(byte[] bArr) {
        int length = bArr.length;
        int a = rfc.a(length, bArr, 0, length);
        return a == 0 ? 1 : a;
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (i = i2; i < i2 + i3; i++) {
            i4 = (i4 * 31) + bArr[i];
        }
        return i4;
    }

    static Object a(Object obj, Object obj2) {
        return ((rgh) obj).i().a((rgh) obj2).e();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        bArr = b;
        rdp.a(bArr, 0, bArr.length);
    }
}
