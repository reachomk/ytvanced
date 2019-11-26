package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: aeky */
public final class aeky {
    public static final boolean a(Uri uri, Uri uri2) {
        if (uri != null && uri2 != null && TextUtils.equals(uri.getAuthority(), uri2.getAuthority()) && TextUtils.equals(uri.getPath(), uri2.getPath())) {
            String str = "signature";
            if (TextUtils.equals(uri.getQueryParameter(str), uri2.getQueryParameter(str))) {
                str = "sig";
                if (TextUtils.equals(uri.getQueryParameter(str), uri2.getQueryParameter(str))) {
                    str = "lsig";
                    if (TextUtils.equals(uri.getQueryParameter(str), uri2.getQueryParameter(str))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
