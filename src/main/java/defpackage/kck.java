package defpackage;

import android.text.TextUtils;

/* renamed from: kck */
public final class kck {
    public final CharSequence a;
    public final CharSequence b;
    public boolean c;

    public kck(CharSequence charSequence, CharSequence charSequence2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = TextUtils.equals(charSequence, charSequence2);
    }
}
