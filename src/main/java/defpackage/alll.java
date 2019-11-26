package defpackage;

import android.text.TextUtils;

/* renamed from: alll */
public final class alll {
    public final CharSequence a;
    public arwf b;

    public static alll a(CharSequence charSequence, arwf arwf) {
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        alll alll = new alll(charSequence);
        alll.b = arwf;
        return alll;
    }

    private alll(CharSequence charSequence) {
        this.a = charSequence;
    }
}
