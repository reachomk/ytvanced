package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: xz */
public final class xz {
    public final String a;
    public final CharSequence b;
    public final int c;
    public Bundle d;

    public xz(String str, CharSequence charSequence, int i) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
        } else if (TextUtils.isEmpty(charSequence)) {
            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
        } else if (i != 0) {
            this.a = str;
            this.b = charSequence;
            this.c = i;
        } else {
            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
        }
    }
}
