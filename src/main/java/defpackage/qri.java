package defpackage;

import android.util.Base64;

/* renamed from: qri */
public final class qri {
    public static String a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, !z ? 2 : 11);
    }

    public static byte[] a(String str, boolean z) {
        byte[] decode = Base64.decode(str, !z ? 2 : 11);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        String str2 = "Unable to decode ";
        throw new IllegalArgumentException(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
