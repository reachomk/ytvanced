package defpackage;

/* renamed from: dgs */
public final class dgs {
    private static final char[] a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();

    @Deprecated
    public static String a(byte[] bArr) {
        int i;
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        int i2 = ((length + 2) / 3) << 2;
        char[] cArr = a;
        char[] cArr2 = new char[(i2 + (i2 / Integer.MAX_VALUE))];
        int i3 = length - 2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i3) {
            int i7 = (((bArr2[i4] << 24) >>> 8) | ((bArr2[i4 + 1] << 24) >>> 16)) | ((bArr2[i4 + 2] << 24) >>> 24);
            cArr2[i5] = cArr[i7 >>> 18];
            int i8 = i5 + 1;
            cArr2[i8] = cArr[(i7 >>> 12) & 63];
            cArr2[i5 + 2] = cArr[(i7 >>> 6) & 63];
            cArr2[i5 + 3] = cArr[i7 & 63];
            i6 += 4;
            if (i6 == Integer.MAX_VALUE) {
                cArr2[i5 + 4] = 10;
                i5 = i8;
                i6 = 0;
            }
            i4 += 3;
            i5 += 4;
        }
        if (i4 < length) {
            length -= i4;
            i = (length > 2 ? (bArr2[i4 + 2] << 24) >>> 24 : 0) | ((length > 0 ? (bArr2[i4] << 24) >>> 8 : 0) | (length > 1 ? (bArr2[i4 + 1] << 24) >>> 16 : 0));
            if (length == 1) {
                cArr2[i5] = cArr[i >>> 18];
                cArr2[i5 + 1] = cArr[(i >>> 12) & 63];
                cArr2[i5 + 2] = '=';
                cArr2[i5 + 3] = '=';
            } else if (length == 2) {
                cArr2[i5] = cArr[i >>> 18];
                cArr2[i5 + 1] = cArr[(i >>> 12) & 63];
                cArr2[i5 + 2] = cArr[(i >>> 6) & 63];
                cArr2[i5 + 3] = '=';
            } else if (length == 3) {
                cArr2[i5] = cArr[i >>> 18];
                cArr2[i5 + 1] = cArr[(i >>> 12) & 63];
                cArr2[i5 + 2] = cArr[(i >>> 6) & 63];
                cArr2[i5 + 3] = cArr[i & 63];
            }
            if (i6 + 4 == Integer.MAX_VALUE) {
                cArr2[i5 + 4] = 10;
            }
        }
        i = cArr2.length;
        while (i > 0) {
            length = i - 1;
            if (cArr2[length] != '=') {
                break;
            }
            i = length;
        }
        return new String(cArr2, 0, i);
    }

    static {
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    }
}
