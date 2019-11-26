package defpackage;

import android.text.Spanned;

/* renamed from: ykg */
public final class ykg extends yie {
    public ykg(String str, apsu apsu) {
        super(str, apsu);
    }

    public final String getTitle() {
        Spanned a = ajqy.a(((apsu) getEntity()).getTitle().d());
        return a != null ? a.toString() : null;
    }

    public final CharSequence getOwnerKey() {
        return ((apsu) getEntity()).b.k;
    }
}
