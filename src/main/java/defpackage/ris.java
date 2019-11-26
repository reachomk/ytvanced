package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: ris */
public final class ris {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Object b = new Object();

    public static boolean a(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr.length == 0) {
            return iArr2 == null || iArr2.length == 0;
        } else {
            return Arrays.equals(iArr, iArr2);
        }
    }

    public static boolean a(long[] jArr, long[] jArr2) {
        if (jArr == null || jArr.length == 0) {
            return jArr2 == null || jArr2.length == 0;
        } else {
            return Arrays.equals(jArr, jArr2);
        }
    }

    public static boolean a(byte[][] bArr, byte[][] bArr2) {
        int length = bArr != null ? bArr.length : 0;
        int length2 = bArr2 != null ? bArr2.length : 0;
        int i = 0;
        int i2 = 0;
        while (true) {
            Object obj = i < length ? null : 1;
            if (i >= length || bArr[i] != null) {
                while (i2 < length2 && bArr2[i2] == null) {
                    i2++;
                }
                Object obj2 = i2 < length2 ? null : 1;
                if (obj != null && i2 >= length2) {
                    return true;
                }
                if (obj != obj2 || !Arrays.equals(bArr[i], bArr2[i2])) {
                    return false;
                }
                i++;
                i2++;
            } else {
                i++;
            }
        }
        return false;
    }

    public static boolean a(Object[] objArr, Object[] objArr2) {
        int length = objArr != null ? objArr.length : 0;
        int length2 = objArr2 != null ? objArr2.length : 0;
        int i = 0;
        int i2 = 0;
        while (true) {
            Object obj = i < length ? null : 1;
            if (i >= length || objArr[i] != null) {
                while (i2 < length2 && objArr2[i2] == null) {
                    i2++;
                }
                Object obj2 = i2 < length2 ? null : 1;
                if (obj != null && i2 >= length2) {
                    return true;
                }
                if (obj != obj2 || !objArr[i].equals(objArr2[i2])) {
                    return false;
                }
                i++;
                i2++;
            } else {
                i++;
            }
        }
        return false;
    }

    public static int a(int[] iArr) {
        return (iArr == null || iArr.length == 0) ? 0 : Arrays.hashCode(iArr);
    }

    public static int a(long[] jArr) {
        return (jArr == null || jArr.length == 0) ? 0 : Arrays.hashCode(jArr);
    }

    public static int a(byte[][] bArr) {
        int length = bArr != null ? bArr.length : 0;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            byte[] bArr2 = bArr[i2];
            if (bArr2 != null) {
                i = (i * 31) + Arrays.hashCode(bArr2);
            }
        }
        return i;
    }

    public static int a(Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode();
            }
        }
        return i;
    }

    public static void a(rio rio, rio rio2) {
        riq riq = rio.V;
        if (riq != null) {
            rio2.V = (riq) riq.clone();
        }
    }

    static {
        Charset.forName("ISO-8859-1");
    }
}
