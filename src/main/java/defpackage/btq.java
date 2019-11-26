package defpackage;

import android.net.Uri;

/* renamed from: btq */
public final class btq {
    public static boolean a(int i, int i2) {
        return i != aocf.UNSET_ENUM_VALUE && i2 != aocf.UNSET_ENUM_VALUE && i <= 512 && i2 <= 384;
    }

    public static boolean a(Uri uri) {
        if (uri != null) {
            if ("content".equals(uri.getScheme())) {
                if ("media".equals(uri.getAuthority())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
