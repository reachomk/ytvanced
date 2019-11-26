package defpackage;

import android.text.TextUtils;

/* renamed from: fpi */
public final class fpi {
    public static CharSequence a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        yx a = yx.a();
        if (a != null) {
            charSequence = a.a(charSequence.toString());
        }
        return charSequence;
    }
}
